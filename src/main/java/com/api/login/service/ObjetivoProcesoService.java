package com.api.login.service;

import com.api.login.dto.ObjetivoProcesoDTO;
import com.api.login.pojo.ObjetivoProceso;

import java.util.List;

public interface ObjetivoProcesoService {

    List<ObjetivoProcesoDTO> getAllObjetivoProceso();

    // ObjetivoProceso createObjetiviProceso( ObjetivoProcesoDTO objetivoProcesoDTO,Integer idEnProceso);

    ObjetivoProceso createObjetiviProceso(ObjetivoProcesoDTO objetivoProcesoDTO);

}
