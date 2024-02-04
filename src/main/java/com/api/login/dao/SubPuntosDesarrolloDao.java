package com.api.login.dao;

import com.api.login.pojo.SubPuntosDesarrollo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubPuntosDesarrolloDao extends JpaRepository<SubPuntosDesarrollo,Integer> {
}
