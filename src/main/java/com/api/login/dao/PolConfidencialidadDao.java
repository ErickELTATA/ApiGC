package com.api.login.dao;

import com.api.login.pojo.PolConfidencialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolConfidencialidadDao extends JpaRepository<PolConfidencialidad, Integer> {

    List<PolConfidencialidad> getAllPolConfidencialidad();
}
