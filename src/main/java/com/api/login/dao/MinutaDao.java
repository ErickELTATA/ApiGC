package com.api.login.dao;

import com.api.login.pojo.Minuta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinutaDao extends JpaRepository<Minuta, Integer> {
}
