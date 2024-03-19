package com.api.login.dao;

import com.api.login.pojo.SolicitudSGC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudSGCDao extends JpaRepository<SolicitudSGC, Integer> {

}
