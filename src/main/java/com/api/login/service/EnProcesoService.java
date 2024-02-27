package com.api.login.service;

import com.api.login.dto.EnProcesoDTO;
import com.api.login.pojo.EnProceso;
import com.api.login.pojo.Mision;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EnProcesoService {
    List<EnProcesoDTO> getAllEnProceso();

    Optional<EnProcesoDTO> getEnProcesoById(Integer id);

    EnProcesoDTO createEnProceso(EnProcesoDTO enProcesoDTO);

    EnProcesoDTO updateEnProceso(Integer id, EnProcesoDTO enProcesoDTO);

    void deleteEnProceso(Integer id);
}

