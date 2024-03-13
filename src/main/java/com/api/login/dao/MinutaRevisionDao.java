package com.api.login.dao;

import com.api.login.pojo.MinutaRevision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinutaRevisionDao extends JpaRepository<MinutaRevision, Integer> {

}
