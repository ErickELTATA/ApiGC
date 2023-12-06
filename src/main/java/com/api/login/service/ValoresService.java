package com.api.login.service;

import com.api.login.pojo.Mision;
import com.api.login.pojo.Valores;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ValoresService {
    ResponseEntity<String> register(Map<String, String> requestMap);

    ResponseEntity<String> update(Integer id, Map<String, String> requestMap);

    ResponseEntity<String> delete(Integer id);

    ResponseEntity<List<Valores>> getAllValores();
}
