package com.api.login.service.impl;

import com.api.login.constantes.UsuarioConstantes;
import com.api.login.dao.AlcanceProcesoDao;
import com.api.login.dto.AlcanceProcesoDTO;
import com.api.login.dto.EnProcesoDTO;
import com.api.login.mapper.AlcanceProcesoMapper;
import com.api.login.mapper.EnProcesoMapper;
import com.api.login.pojo.AlcanceProceso;
import com.api.login.pojo.EnProceso;
import com.api.login.pojo.ObjetivoProceso;

import com.api.login.service.AlcancePrecesoService;
import com.api.login.service.EnProcesoService;
import com.api.login.util.ResenaUtil;
import lombok.extern.java.Log;
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
public class AlcanceProcesoServiceImpl implements AlcancePrecesoService {

    @Autowired
    private AlcanceProcesoDao alcanceProcesoDao;

    @Autowired
    private AlcanceProcesoMapper alcanceProcesoMapper;

    @Autowired
    private EnProcesoService enProcesoService;

    @Autowired
    private EnProcesoMapper enProcesoMapper;


    @Override
    public List<AlcanceProcesoDTO> getAllAlcanceProceso() {
        List<AlcanceProceso> alcanceProceso = alcanceProcesoDao.findAll();
        return alcanceProceso.stream()
                .map(alcanceProcesoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AlcanceProceso createAlcanceProceso(AlcanceProcesoDTO alcanceProcesoDTO) {
        EnProcesoDTO enProcesoDTO = enProcesoService.getEnProcesoById(alcanceProcesoDTO.getIdEnProceso()).orElse(null);
        if (enProcesoDTO == null){
            return null;
        }
        EnProceso enProceso = enProcesoMapper.toEntity(enProcesoDTO);

        AlcanceProceso alcanceProceso = alcanceProcesoMapper.toEntity(alcanceProcesoDTO);
        return alcanceProcesoDao.save(alcanceProceso);
    }
}
