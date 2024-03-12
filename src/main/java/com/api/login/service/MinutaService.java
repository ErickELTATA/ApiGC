package com.api.login.service;

import com.api.login.DTO.MinutaDTO;
import com.api.login.pojo.Minuta;

import java.util.List;

public interface MinutaService {

    List<MinutaDTO> getAllMinunta();

    MinutaDTO createMinuta(MinutaDTO minutaDTO);

    MinutaDTO updateMinuta( Integer idMinuta, MinutaDTO minutaDTO);

    void eliminar(Integer idMinuta);
}
