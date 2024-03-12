package com.api.login.rest;

import com.api.login.DTO.MinutaDTO;
import com.api.login.service.MinutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minuta")
public class MinutaController {

    @Autowired
    private MinutaService minutaService;

    @GetMapping
    public ResponseEntity<List<MinutaDTO>> listar(){
        List<MinutaDTO> minutaDTOS = minutaService.getAllMinunta();
        return new ResponseEntity<>(minutaDTOS, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<MinutaDTO> guardar(@RequestBody MinutaDTO minutaDTO){
        MinutaDTO create = minutaService.createMinuta(minutaDTO);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MinutaDTO> actualizar(@PathVariable Integer id, @RequestBody MinutaDTO minutaDTO){
        MinutaDTO update = minutaService.updateMinuta(id, minutaDTO);
        if (update != null){
            return new ResponseEntity<>(update, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        minutaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
