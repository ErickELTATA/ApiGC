package com.api.login.rest;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dto.AlcanceProcesoDTO;
import com.api.login.mapper.AlcanceProcesoMapper;
import com.api.login.pojo.AlcanceProceso;

import com.api.login.service.AlcancePrecesoService;
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
@RequestMapping(path = "/alproceso")
public class AlcanceProcesoController {


    @Autowired
    private AlcancePrecesoService alcancePrecesoService;

    @Autowired
    private AlcanceProcesoMapper alcanceProcesoMapper;

    @GetMapping
    public ResponseEntity<List<AlcanceProcesoDTO>> listaralcanceProceso(){
        List<AlcanceProcesoDTO> alcanceProceso =  alcancePrecesoService.getAllAlcanceProceso();
        return new ResponseEntity<>(alcanceProceso, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AlcanceProcesoDTO> guardarAlcanceProceso(@RequestBody AlcanceProcesoDTO alcanceProcesoDTO){
        AlcanceProceso alcanceProceso = alcancePrecesoService.createAlcanceProceso(alcanceProcesoDTO);

        if(alcanceProceso == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        AlcanceProcesoDTO alcanceProcesoDTO1 = alcanceProcesoMapper.toDTO(alcanceProceso);
        return new ResponseEntity<>(alcanceProcesoDTO1,HttpStatus.CREATED);
    }


}
