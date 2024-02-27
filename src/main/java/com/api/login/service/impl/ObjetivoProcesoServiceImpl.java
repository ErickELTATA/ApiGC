package com.api.login.service.impl;

import com.api.login.dao.ObjetivoProcesoDao;
import com.api.login.dto.EnProcesoDTO;
import com.api.login.dto.ObjetivoProcesoDTO;
import com.api.login.mapper.EnProcesoMapper;
import com.api.login.mapper.ObjetivoProcesoMapper;
import com.api.login.pojo.EnProceso;
import com.api.login.pojo.ObjetivoProceso;

import com.api.login.service.EnProcesoService;
import com.api.login.service.ObjetivoProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ObjetivoProcesoServiceImpl implements ObjetivoProcesoService {
    @Autowired
    private ObjetivoProcesoDao objetivoProcesoDao;

    @Autowired
    private EnProcesoMapper enProcesoMapper;

    @Autowired
    private ObjetivoProcesoMapper objetivoProcesoMapper;

    @Autowired
    private EnProcesoService enProcesoService;


    @Override
    public List<ObjetivoProcesoDTO> getAllObjetivoProceso() {
        List<ObjetivoProceso> objetivoProcesos = objetivoProcesoDao.findAll();
        return objetivoProcesos.stream()
                .map(objetivoProcesoMapper::toDTO)
                .collect(Collectors.toList());
    }

    /*
    @Override
    public ObjetivoProceso createObjetiviProceso(ObjetivoProcesoDTO objetivoProcesoDTO,Integer idEnProceso) {
        EnProcesoDTO enProcesoDTO = enProcesoService.getEnProcesoById(idEnProceso).orElse(null);
        if (enProcesoDTO == null){
            return null;
        }
        EnProceso enProceso = enProcesoMapper.toEntity(enProcesoDTO);
        ObjetivoProceso objetivoProceso = objetivoProcesoMapper.toEntity(objetivoProcesoDTO, enProceso);

        return objetivoProcesoDao.save(objetivoProceso);

    }

     */
    @Override
    public ObjetivoProceso createObjetiviProceso(ObjetivoProcesoDTO objetivoProcesoDTO) {


        EnProcesoDTO enProcesoDTO = enProcesoService.getEnProcesoById(objetivoProcesoDTO.getIdEnProceso()).orElse(null);
        if (enProcesoDTO == null){
            return null;
        }
        EnProceso enProceso = enProcesoMapper.toEntity(enProcesoDTO);
        ObjetivoProceso objetivoProceso = objetivoProcesoMapper.toEntity(objetivoProcesoDTO);

        return objetivoProcesoDao.save(objetivoProceso);

    }


}
