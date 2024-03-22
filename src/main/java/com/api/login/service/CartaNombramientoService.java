package com.api.login.service;

import com.api.login.DTO.CartaNombramientoDTO;
import com.api.login.DTO.MinutaDTO;

import java.util.List;

public interface CartaNombramientoService {
    List<CartaNombramientoDTO> getAll();

    CartaNombramientoDTO create(CartaNombramientoDTO cartaNombramientoDTO);

    CartaNombramientoDTO update( Integer id, CartaNombramientoDTO cartaNombramientoDTO);

    void eliminar(Integer id);
}
