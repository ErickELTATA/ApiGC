package com.api.login.dao;

import com.api.login.pojo.DiTortuga;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiTortugaDao extends JpaRepository<DiTortuga, Integer> {
}
