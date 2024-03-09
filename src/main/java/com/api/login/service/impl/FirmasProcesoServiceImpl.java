package com.api.login.service.impl;

import com.api.login.DTO.FirmasProcesoDTO;
import com.api.login.dao.FirmasProcesoDao;
import com.api.login.mapper.FirmasProcesoMapper;
import com.api.login.pojo.FirmasProceso;
import com.api.login.service.FirmasProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FirmasProcesoServiceImpl implements FirmasProcesoService {

    @Autowired
    private FirmasProcesoDao firmasProcesoDao;

    @Autowired
    private FirmasProcesoMapper firmasProcesoMapper;

    @Override
    public List<FirmasProcesoDTO> getAllFirmas() {
        List<FirmasProceso> firmasProcesos = firmasProcesoDao.findAll();
        return firmasProcesos.stream()
                .map(firmasProcesoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public FirmasProcesoDTO createFirmarProceos(FirmasProcesoDTO firmasProcesoDTO) {
        FirmasProceso firmasProceso = firmasProcesoMapper.toEntity(firmasProcesoDTO);
        firmasProceso = firmasProcesoDao.save(firmasProceso);
        return firmasProcesoMapper.toDTO(firmasProceso);
    }
}
