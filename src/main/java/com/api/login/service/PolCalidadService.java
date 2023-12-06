package com.api.login.service;

import com.api.login.pojo.Mision;
import com.api.login.pojo.PolCalidad;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface PolCalidadService {
    ResponseEntity<String> register(Map<String, String> requestMap);

    ResponseEntity<String> update(Integer id, Map<String, String> requestMap);

    ResponseEntity<String> delete(Integer id);

    ResponseEntity<List<PolCalidad>> getAllPolCalidad();
}
