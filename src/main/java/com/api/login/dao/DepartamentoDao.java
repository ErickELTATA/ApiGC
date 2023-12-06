package com.api.login.dao;

import com.api.login.pojo.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoDao extends JpaRepository<Departamento, Integer> {

    List<Departamento> getAllDepartamento();
}
