package com.api.login.rest;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dao.ResenaDao;
import com.api.login.pojo.Resena;

import com.api.login.service.ResenaService;
import com.api.login.util.ResenaUtil;
import com.itextpdf.text.DocumentException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "/resena")
public class ResenaController {

    @Autowired
    private ResenaService resenaService;
    @Autowired
    private ResenaDao resenaDao;

    @PostMapping("/register")
    public ResponseEntity<String> registrarEmpresa(@RequestBody(required = true)Map<String,String> requestMap){
        try {
            return resenaService.register(requestMap);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return ResenaUtil.getResponseEntity1(UsuarioConstantes.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> actualizarEmpresa(@PathVariable(required = true) Integer id, @RequestBody(required = true)Map<String, String> requestMap){
        try {
            return resenaService.update(id,requestMap);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return ResenaUtil.getResponseEntity1(UsuarioConstantes.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Resena>> listarEmpresas(){
        try {
            return resenaService.getAllResena();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return new ResponseEntity<List<Resena>>(new ArrayList<>(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> borrarEmpresa(@PathVariable Integer id){
        return  resenaService.delete(id);
    }



}
