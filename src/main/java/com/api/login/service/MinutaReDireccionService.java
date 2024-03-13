package com.api.login.service;

import com.api.login.DTO.MinutaReDireccionDTO;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface MinutaReDireccionService {

    List<MinutaReDireccionDTO> getAll();

    MinutaReDireccionDTO create(MinutaReDireccionDTO minutaReDireccionDTO);

    MinutaReDireccionDTO update(Integer id, MinutaReDireccionDTO minutaReDireccionDTO);

    void eliminar(Integer id);
}
