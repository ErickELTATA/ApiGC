package com.api.login.rest;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dto.DesarrolloProcesoDTO;
import com.api.login.mapper.DesarrolloProcesoMapper;
import com.api.login.pojo.DesarrolloProceso;
import com.api.login.pojo.Mision;
import com.api.login.service.DesarrolloProcesoService;
import com.api.login.util.ResenaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/desarrolloproceso")
public class DesarrolloProcesoController {

    @Autowired
    private DesarrolloProcesoService desarrolloProcesoService;

    @Autowired
    private DesarrolloProcesoMapper desarrolloProcesoMapper;

    @GetMapping
    public ResponseEntity<List<DesarrolloProcesoDTO>> listarDesarrolloProceso(){
        List<DesarrolloProcesoDTO> desarrolloProceso = desarrolloProcesoService.getAllDesarrolloProceso();
        return new ResponseEntity<>(desarrolloProceso,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DesarrolloProcesoDTO> guardarDesarrolloProceso(@RequestBody DesarrolloProcesoDTO desarrolloProcesoDTO){
        DesarrolloProceso desarrolloProceso = desarrolloProcesoService.createDesarrolloProceso(desarrolloProcesoDTO);
        if(desarrolloProceso == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        DesarrolloProcesoDTO desarrolloProcesoDTO1 = desarrolloProcesoMapper.toDTO(desarrolloProceso);
        return new ResponseEntity<>(desarrolloProcesoDTO1,HttpStatus.CREATED);
    }

}
