package com.api.login.service;

import com.api.login.DTO.FirmasProcesoDTO;
import com.api.login.pojo.FirmasProceso;

import java.util.List;

public interface FirmasProcesoService {

    List<FirmasProcesoDTO> getAllFirmas();

    FirmasProcesoDTO createFirmarProceos(FirmasProcesoDTO firmasProcesoDTO);
}
