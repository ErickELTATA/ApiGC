package com.api.login.rest;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dto.EnProcesoDTO;
import com.api.login.pojo.EnProceso;
import com.api.login.service.EnProcesoService;
import com.api.login.util.ResenaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/enproceso")
public class EnProcesoController {

    @Autowired
    private EnProcesoService enProcesoService;


    @GetMapping
    public ResponseEntity<List<EnProcesoDTO>> listarEnProceso(){
        List<EnProcesoDTO> enProcesoDTOS = enProcesoService.getAllEnProceso();
        return new ResponseEntity<>(enProcesoDTOS, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<EnProcesoDTO> ListarPorId(@PathVariable Integer id){
        return enProcesoService.getEnProcesoById(id)
                .map(enProcesoDTO -> new ResponseEntity<>(enProcesoDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<EnProcesoDTO> guardar(@RequestBody EnProcesoDTO enProcesoDTO){
        EnProcesoDTO createdEnProcesoDTO = enProcesoService.createEnProceso(enProcesoDTO);
        return new ResponseEntity<>(createdEnProcesoDTO,HttpStatus.OK);
    }

}
