package com.api.login.service;

import com.api.login.pojo.Mision;
import com.api.login.pojo.ObjetivoProceso;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ObjetivoProcesoService {
    ResponseEntity<String> register(Map<String, String> requestMap);

    ResponseEntity<String> update(Integer id, Map<String, String> requestMap);

    ResponseEntity<String> delete(Integer id);

    ResponseEntity<List<ObjetivoProceso>> getAllObjetivo();
}
