package com.api.login.service.impl;

import com.api.login.DTO.MinutaDTO;
import com.api.login.dao.MinutaDao;
import com.api.login.mapper.MinutaMapper;
import com.api.login.pojo.Minuta;
import com.api.login.service.MinutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MinutaServiceImpl implements MinutaService {

    @Autowired
    private MinutaDao minutaDao;

    @Autowired
    private MinutaMapper minutaMapper;
    @Override
    public List<MinutaDTO> getAllMinunta() {
        List<Minuta> minutas= minutaDao.findAll();
        return minutas.stream()
                .map(minutaMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MinutaDTO createMinuta(MinutaDTO minutaDTO) {
        Minuta minuta = minutaMapper.toEntity(minutaDTO);
        minuta = minutaDao.save(minuta);
        return minutaMapper.toDTO(minuta);
    }
}
