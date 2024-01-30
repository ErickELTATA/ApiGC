package com.api.login.service.impl;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dao.DoReferenciaProcesoDao;
import com.api.login.pojo.DoReferenciaProceso;
import com.api.login.pojo.PolCalidad;
import com.api.login.security.jwt.JwtFilter;
import com.api.login.security.jwt.JwtUtil;
import com.api.login.service.DoReferenciaProcesoService;
import com.api.login.util.ResenaUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class DoReferenciaProcesoServiceImpl implements DoReferenciaProcesoService {

    @Autowired
    private DoReferenciaProcesoDao doReferenciaProcesoDao;


    @Autowired
    private JwtFilter jwtFilter;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public ResponseEntity<String> register(Map<String, String> requestMap) {
        log.info("Registro interno de una empresa {}", requestMap);
        try {
            if (validateRegister(requestMap)){
                doReferenciaProcesoDao.save(getPolCalidadFromMap(requestMap));
                return ResenaUtil.getResponseEntity1("Empresa registrada con exito", HttpStatus.CREATED);
            }else {
                return ResenaUtil.getResponseEntity1(UsuarioConstantes.INVALID_DATA, HttpStatus.BAD_REQUEST);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return ResenaUtil.getResponseEntity1(UsuarioConstantes.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> update(Integer id,Map<String, String> requestMap ) {
        try {
            // Obtén el ID del usuario de la solicitud y trata de encontrarlo en la base de datos
            Optional<DoReferenciaProceso> optionalUser = doReferenciaProcesoDao.findById(id);

            if (!optionalUser.isEmpty()) {
                // Obtén el usuario de la base de datos
                DoReferenciaProceso doReferenciaProceso = optionalUser.get();

                // Actualiza los campos del usuario con los valores proporcionados en el mapa

                doReferenciaProceso.setCoDocumento(requestMap.get("coDocumento"));
                doReferenciaProceso.setNombreDocumento(requestMap.get("nombreDocumento"));


                // Actualiza el usuario en la base de datos
                doReferenciaProcesoDao.save(doReferenciaProceso);

                // Retorna una respuesta con un mensaje exitoso y el código de estado 200 (OK)
                return ResenaUtil.getResponseEntity1("Datos del usuario actualizados", HttpStatus.OK);
            } else {
                // Retorna una respuesta con un mensaje indicando que el usuario no existe y el código de estado 404 (Not Found)
                return ResenaUtil.getResponseEntity1("Este usuario no existe", HttpStatus.NOT_FOUND);
            }
        } catch (Exception exception) {
            // Imprime la traza de la excepción en caso de un error inesperado
            exception.printStackTrace();
        }

        // Retorna una respuesta con un mensaje de error genérico y el código de estado 500 (Internal Server Error)
        return ResenaUtil.getResponseEntity1(UsuarioConstantes.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> delete(Integer userId) {
        try {
            // Trata de encontrar al usuario en la base de datos utilizando el ID proporcionado
            Optional<DoReferenciaProceso> optionalUser = doReferenciaProcesoDao.findById(userId);

            if (optionalUser.isPresent()) {
                // Elimina al usuario de la base de datos
                doReferenciaProcesoDao.deleteById(userId);

                // Retorna una respuesta con un mensaje exitoso y el código de estado 200 (OK)
                return ResenaUtil.getResponseEntity1("Resena eliminada exitosamente", HttpStatus.OK);
            } else {
                // Retorna una respuesta con un mensaje indicando que el usuario no existe y el código de estado 404 (Not Found)
                return ResenaUtil.getResponseEntity1("Esta resena no existe", HttpStatus.NOT_FOUND);
            }
        } catch (Exception exception) {
            // Imprime la traza de la excepción en caso de un error inesperado
            exception.printStackTrace();
        }

        // Retorna una respuesta con un mensaje de error genérico y el código de estado 500 (Internal Server Error)
        return ResenaUtil.getResponseEntity1(UsuarioConstantes.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<List<DoReferenciaProceso>> getAllReferencia() {
        try{
            return new ResponseEntity<>(doReferenciaProcesoDao.findAll(),HttpStatus.OK);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


    private boolean validateRegister(Map<String,String> requestMap){
        if (requestMap.containsKey("coDocumento") &&
                requestMap.containsKey("nombreDocumento")){
            return true;
        }
        return false;
    }

    private DoReferenciaProceso getPolCalidadFromMap(Map<String, String> requestMap){
        DoReferenciaProceso doReferenciaProceso = new DoReferenciaProceso();
        doReferenciaProceso.setCoDocumento((String) requestMap.get("coDocumento"));
        doReferenciaProceso.setNombreDocumento((String) requestMap.get("nombreDocumento"));
        return doReferenciaProceso;
    }

    private void insertar(Map<String,String> requestMap){
        try {
            DoReferenciaProceso doReferenciaProceso = new DoReferenciaProceso();
            doReferenciaProceso.setCoDocumento((String) requestMap.get("coDocumento"));
            doReferenciaProceso.setNombreDocumento((String) requestMap.get("nombreDocumento"));

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
