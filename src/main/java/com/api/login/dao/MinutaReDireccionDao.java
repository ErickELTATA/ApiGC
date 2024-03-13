package com.api.login.dao;

import com.api.login.pojo.MinutaReDireccion;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinutaReDireccionDao extends JpaRepository<MinutaReDireccion, Integer> {

}
