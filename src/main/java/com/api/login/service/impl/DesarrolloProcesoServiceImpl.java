package com.api.login.service.impl;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dao.DesarrolloProcesoDao;
import com.api.login.dto.DesarrolloProcesoDTO;
import com.api.login.dto.EnProcesoDTO;
import com.api.login.mapper.DesarrolloProcesoMapper;
import com.api.login.mapper.EnProcesoMapper;
import com.api.login.pojo.DesarrolloProceso;
import com.api.login.pojo.EnProceso;
import com.api.login.pojo.Mision;
import com.api.login.security.jwt.JwtFilter;
import com.api.login.security.jwt.JwtUtil;
import com.api.login.service.DesarrolloProcesoService;
import com.api.login.service.EnProcesoService;
import com.api.login.util.ResenaUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class DesarrolloProcesoServiceImpl implements DesarrolloProcesoService {

    @Autowired
    private DesarrolloProcesoDao desarrolloProcesoDao;

    @Autowired
    private DesarrolloProcesoMapper desarrolloProcesoMapper;

    @Autowired
    private EnProcesoService enProcesoService;

    @Autowired
    private EnProcesoMapper enProcesoMapper;

    @Override
    public List<DesarrolloProcesoDTO> getAllDesarrolloProceso() {
        List<DesarrolloProceso> desarrolloProcesos = desarrolloProcesoDao.findAll();
        return desarrolloProcesos.stream()
                .map(desarrolloProcesoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DesarrolloProceso createDesarrolloProceso(DesarrolloProcesoDTO desarrolloProcesoDTO) {
        /*
        EnProcesoDTO enProcesoDTO = enProcesoService.getEnProcesoById(desarrolloProcesoDTO.getIdEnProceso()).orElse(null);
        if (enProcesoDTO == null){
            return null;
        }
        EnProceso enProceso = enProcesoMapper.toEntity(enProcesoDTO);


         */
        DesarrolloProceso desarrolloProceso = desarrolloProcesoMapper.toEntity(desarrolloProcesoDTO);

        return desarrolloProcesoDao.save(desarrolloProceso);
    }
}
