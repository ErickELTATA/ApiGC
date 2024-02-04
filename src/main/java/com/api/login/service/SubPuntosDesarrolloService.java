package com.api.login.service;

import com.api.login.pojo.DiTortuga;
import com.api.login.pojo.SubPuntosDesarrollo;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface SubPuntosDesarrolloService {
    ResponseEntity<String> register(Map<String, String> requestMap);

    ResponseEntity<String> update(Integer id, Map<String, String> requestMap);

    ResponseEntity<String> delete(Integer id);

    ResponseEntity<List<SubPuntosDesarrollo>> getAll();
}
