package com.api.login.dao;

import com.api.login.pojo.DistribucionProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistribucionProcesoDao extends JpaRepository<DistribucionProceso, Integer> {

}
