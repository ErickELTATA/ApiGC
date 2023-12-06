package com.api.login.dao;

import com.api.login.pojo.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PuestoDao extends JpaRepository<Puesto,Integer> {
    List<Puesto> getAllPuesto();
}
