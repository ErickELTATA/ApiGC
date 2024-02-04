package com.api.login.dao;

import com.api.login.pojo.DesarrolloProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesarrolloProcesoDao extends JpaRepository<DesarrolloProceso, Integer> {

}
