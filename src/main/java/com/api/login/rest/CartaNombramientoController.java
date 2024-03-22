package com.api.login.rest;

import com.api.login.DTO.CartaNombramientoDTO;
import com.api.login.DTO.MinutaDTO;
import com.api.login.service.CartaNombramientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartanombra")
public class CartaNombramientoController {

    @Autowired
    private CartaNombramientoService service;

    @GetMapping
    public ResponseEntity<List<CartaNombramientoDTO>> listar(){
        List<CartaNombramientoDTO> DTOS = service.getAll();
        return new ResponseEntity<>(DTOS, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<CartaNombramientoDTO> guardar(@RequestBody CartaNombramientoDTO DTO){
        CartaNombramientoDTO create = service.create(DTO);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartaNombramientoDTO> actualizar(@PathVariable Integer id, @RequestBody CartaNombramientoDTO DTO){
        CartaNombramientoDTO update = service.update(id, DTO);
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
