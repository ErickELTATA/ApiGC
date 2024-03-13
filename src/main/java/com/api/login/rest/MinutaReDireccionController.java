package com.api.login.rest;

import com.api.login.DTO.MinutaDTO;
import com.api.login.DTO.MinutaReDireccionDTO;
import com.api.login.service.MinutaReDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minutaredi")
public class MinutaReDireccionController {

    @Autowired
    private MinutaReDireccionService service;

    @GetMapping
    public ResponseEntity<List<MinutaReDireccionDTO>> listar(){
        List<MinutaReDireccionDTO> minutaDTOS = service.getAll();
        return new ResponseEntity<>(minutaDTOS, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<MinutaReDireccionDTO> guardar(@RequestBody MinutaReDireccionDTO minutaDTO){
        MinutaReDireccionDTO create = service.create(minutaDTO);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MinutaReDireccionDTO> actualizar(@PathVariable Integer id, @RequestBody MinutaReDireccionDTO minutaDTO){
        MinutaReDireccionDTO update = service.update(id, minutaDTO);
        if (update != null){
            return new ResponseEntity<>(update, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
