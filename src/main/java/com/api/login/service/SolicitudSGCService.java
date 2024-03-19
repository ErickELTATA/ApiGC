package com.api.login.service;

import com.api.login.DTO.MinutaDTO;
import com.api.login.DTO.SolicitudSGCDTO;
import com.api.login.pojo.Mision;
import com.api.login.pojo.SolicitudSGC;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface SolicitudSGCService {
    List<SolicitudSGCDTO> getAll();

    SolicitudSGCDTO create(SolicitudSGCDTO dto);

    SolicitudSGCDTO update(Integer id, SolicitudSGCDTO solicitudSGCDTO);

    void eliminar(Integer id);
}
