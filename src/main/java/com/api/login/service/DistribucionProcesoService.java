package com.api.login.service;

import com.api.login.dto.DistribucionProcesoDTO;
import com.api.login.pojo.DiTortuga;
import com.api.login.pojo.DistribucionProceso;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface DistribucionProcesoService {
    List<DistribucionProcesoDTO> getAllDistribucionProceso();

    DistribucionProceso createDistribucionProceso(DistribucionProcesoDTO dto);
}
