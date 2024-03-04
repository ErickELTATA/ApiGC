package com.api.login.service.impl;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dao.DistribucionProcesoDao;
import com.api.login.dto.DistribucionProcesoDTO;
import com.api.login.mapper.DistribucionProcesoMapper;
import com.api.login.mapper.EnProcesoMapper;
import com.api.login.pojo.DiTortuga;
import com.api.login.pojo.DistribucionProceso;
import com.api.login.security.jwt.JwtFilter;
import com.api.login.security.jwt.JwtUtil;
import com.api.login.service.DistribucionProcesoService;
import com.api.login.service.EnProcesoService;
import com.api.login.util.ResenaUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



@Service
public class DistribucionProcesoServiceImpl implements DistribucionProcesoService {

    @Autowired
    private DistribucionProcesoDao distribucionProcesoDao;

    @Autowired
    private DistribucionProcesoMapper distribucionProcesoMapper;

    @Override
    public List<DistribucionProcesoDTO> getAllDistribucionProceso() {
        List<DistribucionProceso> distribucionProcesos = distribucionProcesoDao.findAll();
        return distribucionProcesos.stream()
                .map(distribucionProcesoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DistribucionProceso createDistribucionProceso(DistribucionProcesoDTO dto) {
        DistribucionProceso distribucionProceso = distribucionProcesoMapper.toEntity(dto);
        return distribucionProcesoDao.save(distribucionProceso);
    }
}
