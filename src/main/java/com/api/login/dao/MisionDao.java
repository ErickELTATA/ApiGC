package com.api.login.dao;

import com.api.login.pojo.Mision;
import com.api.login.pojo.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MisionDao extends JpaRepository<Mision, Integer> {
    List<Mision> getAllMision();
}
