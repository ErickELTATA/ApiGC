package com.api.login.service;

import com.api.login.DTO.MinutaRevisionDTO;

import java.util.List;

public interface MinutaRevisionService {

    List<MinutaRevisionDTO> getAll();

    MinutaRevisionDTO create(MinutaRevisionDTO minutaRevisionDTO);

    MinutaRevisionDTO update(Integer id, MinutaRevisionDTO minutaRevisionDTO);

    void eliminar(Integer id);
}
