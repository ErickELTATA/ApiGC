package com.api.login.rest;

import com.api.login.DTO.FirmasProcesoDTO;
import com.api.login.service.FirmasProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/firmasproceso")
public class FirmasProcesoController {

    @Autowired
    private FirmasProcesoService firmasProcesoService;


    @GetMapping
    public ResponseEntity<List<FirmasProcesoDTO>> listarFirmas(){
        List<FirmasProcesoDTO> firmasProcesoDTOS = firmasProcesoService.getAllFirmas();
        return new ResponseEntity<>(firmasProcesoDTOS, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FirmasProcesoDTO> guardar(@RequestBody FirmasProcesoDTO firmasProcesoDTO){
        FirmasProcesoDTO create = firmasProcesoService.createFirmarProceos(firmasProcesoDTO);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
}
