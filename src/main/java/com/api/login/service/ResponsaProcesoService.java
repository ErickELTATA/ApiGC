package com.api.login.service;

import com.api.login.pojo.ObjetivoProceso;
import com.api.login.pojo.ResponsaProceso;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ResponsaProcesoService {
    ResponseEntity<String> register(Map<String, String> requestMap);

    ResponseEntity<String> update(Integer id, Map<String, String> requestMap);

    ResponseEntity<String> delete(Integer id);

    ResponseEntity<List<ResponsaProceso>> getAllResponsa();
}
