package com.api.login.rest;

import com.api.login.DTO.MinutaReDireccionDTO;
import com.api.login.DTO.MinutaRevisionDTO;
import com.api.login.service.MinutaRevisionService;
import com.api.login.service.impl.MinutaRevisionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minutare")
public class MinutaRevisionController {

    @Autowired
    private MinutaRevisionService service;

    @GetMapping
    public ResponseEntity<List<MinutaRevisionDTO>> listar(){
        List<MinutaRevisionDTO> minutaDTOS = service.getAll();
        return new ResponseEntity<>(minutaDTOS, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<MinutaRevisionDTO> guardar(@RequestBody MinutaRevisionDTO minutaDTO){
        MinutaRevisionDTO create = service.create(minutaDTO);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MinutaRevisionDTO> actualizar(@PathVariable Integer id, @RequestBody MinutaRevisionDTO minutaDTO){
        MinutaRevisionDTO update = service.update(id, minutaDTO);
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
