package com.api.login.rest;


import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dto.ObjetivoProcesoDTO;
import com.api.login.mapper.ObjetivoProcesoMapper;
import com.api.login.pojo.Mision;
import com.api.login.pojo.ObjetivoProceso;
import com.api.login.service.EnProcesoService;
import com.api.login.service.ObjetivoProcesoService;
import com.api.login.util.ResenaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/obproceso")
public class ObjetivoProcesoController {


    @Autowired
    private ObjetivoProcesoService objetivoProcesoService;

    @Autowired
    private EnProcesoService enProcesoService;

    @Autowired
    private ObjetivoProcesoMapper objetivoProcesoMapper;

    @GetMapping
    public ResponseEntity<List<ObjetivoProcesoDTO>> ListarObjetivoProceso(){
        List<ObjetivoProcesoDTO> objetivoProceso = objetivoProcesoService.getAllObjetivoProceso();
        return new ResponseEntity<>(objetivoProceso, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ObjetivoProcesoDTO> guardarObjetivoProceso(@RequestBody ObjetivoProcesoDTO objetivoProcesoDTO){

        ObjetivoProceso newObjetivoProceso = objetivoProcesoService.createObjetiviProceso(objetivoProcesoDTO);

        if (newObjetivoProceso == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        ObjetivoProcesoDTO newObjetivoProcesoDTO = objetivoProcesoMapper.toDTO(newObjetivoProceso);
        return new ResponseEntity<>(newObjetivoProcesoDTO, HttpStatus.CREATED);
    }
    /*
    @PostMapping("/{idEnProceso}")
    public ResponseEntity<ObjetivoProcesoDTO> guardarObjetivoProceso(@RequestBody ObjetivoProcesoDTO objetivoProcesoDTO, @PathVariable Integer idEnProceso){

        ObjetivoProceso newObjetivoProceso = objetivoProcesoService.createObjetiviProceso(objetivoProcesoDTO,idEnProceso);

        if (newObjetivoProceso == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        ObjetivoProcesoDTO newObjetivoProcesoDTO = objetivoProcesoMapper.toDTO(newObjetivoProceso);
        return new ResponseEntity<>(newObjetivoProcesoDTO, HttpStatus.CREATED);

    }

     */

}
