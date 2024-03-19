package com.api.login.rest;

import com.api.login.DTO.SolicitudSGCDTO;
import com.api.login.pojo.SolicitudSGC;
import com.api.login.service.SolicitudSGCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudSGC")
public class SolicitudSGCController {

    @Autowired
    private SolicitudSGCService solicitudSGCService;

    @GetMapping
    public ResponseEntity<List<SolicitudSGCDTO>> listar(){
        List<SolicitudSGCDTO> solicitudSGCDTOS = solicitudSGCService.getAll();
        return new ResponseEntity<>(solicitudSGCDTOS, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SolicitudSGCDTO> guardar(@RequestBody SolicitudSGCDTO solicitudSGCDTO){
        SolicitudSGCDTO create = solicitudSGCService.create(solicitudSGCDTO);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SolicitudSGCDTO> actualizar(@PathVariable Integer id, @RequestBody SolicitudSGCDTO solicitudSGCDTO){
        SolicitudSGCDTO update = solicitudSGCService.update(id,solicitudSGCDTO);
        if (update != null){
            return new ResponseEntity<>(update, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        solicitudSGCService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
