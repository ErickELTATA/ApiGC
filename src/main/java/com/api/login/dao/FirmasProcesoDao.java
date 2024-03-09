package com.api.login.dao;

import com.api.login.pojo.FirmasProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmasProcesoDao extends JpaRepository<FirmasProceso, Integer> {

}
