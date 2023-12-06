package com.api.login.dao;

import com.api.login.pojo.Mision;
import com.api.login.pojo.Vision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisionDao extends JpaRepository<Vision, Integer> {
    List<Vision> getAllVision();
}
