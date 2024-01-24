package com.api.login.dao;

import com.api.login.pojo.AbreProdeso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbreProcesoDao extends JpaRepository<AbreProdeso, Integer> {
}
