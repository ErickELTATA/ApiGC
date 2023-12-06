package com.api.login.dao;

import com.api.login.pojo.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResenaDao extends JpaRepository<Resena, Integer> {

    List<Resena> getAllResena();



}
