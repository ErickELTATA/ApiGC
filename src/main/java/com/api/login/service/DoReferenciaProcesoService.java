package com.api.login.service;

import com.api.login.pojo.DoReferenciaProceso;
import com.api.login.pojo.ObjetivoProceso;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface DoReferenciaProcesoService {
    ResponseEntity<String> register(Map<String, String> requestMap);

    ResponseEntity<String> update(Integer id, Map<String, String> requestMap);

    ResponseEntity<String> delete(Integer id);

    ResponseEntity<List<DoReferenciaProceso>> getAllReferencia();
}
