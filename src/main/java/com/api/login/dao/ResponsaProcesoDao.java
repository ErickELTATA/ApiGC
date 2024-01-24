package com.api.login.dao;

import com.api.login.pojo.ResponsaProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsaProcesoDao extends JpaRepository<ResponsaProceso, Integer> {
}
