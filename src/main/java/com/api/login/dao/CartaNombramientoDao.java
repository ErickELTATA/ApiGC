package com.api.login.dao;

import com.api.login.pojo.CartaNombramiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaNombramientoDao extends JpaRepository<CartaNombramiento, Integer> {

}
