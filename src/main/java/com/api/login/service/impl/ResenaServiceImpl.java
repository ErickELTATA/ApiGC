package com.api.login.service.impl;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dao.ResenaDao;
import com.api.login.pojo.Resena;
import com.api.login.security.jwt.JwtFilter;
import com.api.login.security.jwt.JwtUtil;
import com.api.login.service.ResenaService;
import com.api.login.util.ResenaUtil;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@Slf4j
@Service
public class ResenaServiceImpl implements ResenaService {

    @Autowired
    private ResenaDao resenaDao;

    @Autowired
    private JwtFilter jwtFilter;

    @Autowired
    private JwtUtil jwtUtil;
    @Override
    public ResponseEntity<String> register(Map<String, String> requestMap) {
        log.info("Registro interno de una empresa {}", requestMap);
        try {
            if (validateRegister(requestMap)){
                resenaDao.save(getResenaFromMap(requestMap));
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
                Optional<Resena> optionalUser = resenaDao.findById(id);

                if (!optionalUser.isEmpty()) {
                    // Obtén el usuario de la base de datos
                    Resena resena = optionalUser.get();

                    // Actualiza los campos del usuario con los valores proporcionados en el mapa

                    resena.setFecha(Date.valueOf(requestMap.get("fecha").toString()));
                    resena.setContenido(requestMap.get("contenido"));


                    // Actualiza el usuario en la base de datos
                    resenaDao.save(resena);

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
                Optional<Resena> optionalUser = resenaDao.findById(userId);

                if (optionalUser.isPresent()) {
                    // Elimina al usuario de la base de datos
                    resenaDao.deleteById(userId);

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
    public ResponseEntity<List<Resena>> getAllResena() {
        try{
            return new ResponseEntity<>(resenaDao.getAllResena(),HttpStatus.OK);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


    private boolean validateRegister(Map<String,String> requestMap){
        if (requestMap.containsKey("fecha") &&
                requestMap.containsKey("contenido")){
            return true;
        }
        return false;
    }

    private Resena getResenaFromMap(Map<String, String> requestMap){
        Resena resena = new Resena();
        resena.setFecha(Date.valueOf(requestMap.get("fecha")));
        resena.setContenido(requestMap.get("contenido"));
        return resena;
    }

    private void insertar(Map<String,String> requestMap){
        try {
            Resena resena=new Resena();
            resena.setFecha(Date.valueOf((requestMap.get("fecha").toString())));
            resena.setContenido((String) requestMap.get("contenido"));


        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
