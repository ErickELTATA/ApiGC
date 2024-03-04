package com.api.login.rest;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dto.DistribucionProcesoDTO;
import com.api.login.mapper.DistribucionProcesoMapper;
import com.api.login.pojo.AlcanceProceso;
import com.api.login.pojo.DiTortuga;
import com.api.login.pojo.DistribucionProceso;
import com.api.login.service.DistribucionProcesoService;
import com.api.login.util.ResenaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/distribucionproceso")
public class DistribucionProcesoController {

    @Autowired
    private DistribucionProcesoService distribucionProcesoService;

    @Autowired
    private DistribucionProcesoMapper distribucionProcesoMapper;

    @GetMapping
    public ResponseEntity<List<DistribucionProcesoDTO>> listarDistribucionProceso(){
        List<DistribucionProcesoDTO> distribucionProceso = distribucionProcesoService.getAllDistribucionProceso();
        return new ResponseEntity<>(distribucionProceso, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DistribucionProcesoDTO> guardarDistribucionProceso(@RequestBody DistribucionProcesoDTO dto){
        DistribucionProceso distribucionProceso = distribucionProcesoService.createDistribucionProceso(dto);

        if(distribucionProceso == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        DistribucionProcesoDTO dto1 = distribucionProcesoMapper.toDTO(distribucionProceso);
        return new ResponseEntity<>(dto1,HttpStatus.CREATED);
    }

}
