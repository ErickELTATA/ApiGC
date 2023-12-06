package com.api.login.dao;

import com.api.login.pojo.Mision;
import com.api.login.pojo.PolCalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolCalidadDao extends JpaRepository<PolCalidad, Integer> {
    List<PolCalidad> getAllPolCalidad();
}
