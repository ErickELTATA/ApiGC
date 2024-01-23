package com.api.login.dao;

import com.api.login.pojo.AlcanceProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlcanceProcesoDao extends JpaRepository<AlcanceProceso, Integer> {
}
