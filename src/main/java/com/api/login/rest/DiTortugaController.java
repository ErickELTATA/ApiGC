package com.api.login.rest;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.pojo.DiTortuga;
import com.api.login.pojo.DoReferenciaProceso;
import com.api.login.service.DiTortugaService;
import com.api.login.util.ResenaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/ditortuga")
public class DiTortugaController {

    @Autowired
    private DiTortugaService diTortugaService;


    @PostMapping("/register")
    public ResponseEntity<String> registrarEmpresa(@RequestBody(required = true) Map<String,String> requestMap){
        try {
            return diTortugaService.register(requestMap);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return ResenaUtil.getResponseEntity1(UsuarioConstantes.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> actualizarEmpresa(@PathVariable(required = true) Integer id, @RequestBody(required = true)Map<String, String> requestMap){
        try {
            return diTortugaService.update(id,requestMap);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return ResenaUtil.getResponseEntity1(UsuarioConstantes.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/get")
    public ResponseEntity<List<DiTortuga>> listarEmpresas(){
        try {
            return diTortugaService.getAll();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return new ResponseEntity<List<DiTortuga>>(new ArrayList<>(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> borrarEmpresa(@PathVariable Integer id){
        return  diTortugaService.delete(id);
    }
}
