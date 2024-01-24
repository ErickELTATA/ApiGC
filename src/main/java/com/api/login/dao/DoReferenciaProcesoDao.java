package com.api.login.dao;


import com.api.login.pojo.DoReferenciaProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoReferenciaProcesoDao extends JpaRepository<DoReferenciaProceso, Integer> {

}
