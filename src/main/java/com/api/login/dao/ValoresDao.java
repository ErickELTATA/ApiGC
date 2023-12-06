package com.api.login.dao;

import com.api.login.pojo.Mision;
import com.api.login.pojo.Valores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValoresDao extends JpaRepository<Valores, Integer> {
    List<Valores> getAllValores();
}
