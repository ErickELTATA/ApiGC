package com.api.login.dao;

import com.api.login.pojo.EnProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnProcesoDao extends JpaRepository<EnProceso, Integer> {
}
