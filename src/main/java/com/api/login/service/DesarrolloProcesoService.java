package com.api.login.service;

import com.api.login.dto.DesarrolloProcesoDTO;
import com.api.login.pojo.DesarrolloProceso;
import com.api.login.pojo.Mision;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface DesarrolloProcesoService {
    List<DesarrolloProcesoDTO> getAllDesarrolloProceso();

    DesarrolloProceso createDesarrolloProceso(DesarrolloProcesoDTO desarrolloProcesoDTO);
}
