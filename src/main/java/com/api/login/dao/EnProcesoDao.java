package com.api.login.dao;

import com.api.login.pojo.EnProceso;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnProcesoDao extends JpaRepository<EnProceso, Integer> {

    List<EnProceso> getAllEnProceso();
}
