package com.api.login.service;

import com.api.login.dto.AlcanceProcesoDTO;
import com.api.login.pojo.AlcanceProceso;
import com.api.login.pojo.ObjetivoProceso;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface AlcancePrecesoService {

    List<AlcanceProcesoDTO> getAllAlcanceProceso();

    AlcanceProceso createAlcanceProceso(AlcanceProcesoDTO alcanceProcesoDTO);
}
