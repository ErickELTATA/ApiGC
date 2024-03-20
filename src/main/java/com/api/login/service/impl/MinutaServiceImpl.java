package com.api.login.service.impl;

import com.api.login.DTO.MinutaDTO;
import com.api.login.dao.MinutaDao;
import com.api.login.mapper.MinutaMapper;
import com.api.login.pojo.Minuta;
import com.api.login.service.MinutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    @Override
    public MinutaDTO updateMinuta(Integer idMinuta, MinutaDTO minutaDTO) {

        Optional<Minuta> optionalMinuta = minutaDao.findById(idMinuta);
        if(optionalMinuta.isPresent()){
            Minuta minuta = optionalMinuta.get();
            minuta.setCoDocumento(minutaDTO.getCoDocumento());
            minuta.setFechaEmision(minutaDTO.getFechaEmision());
            minuta.setFechaRevision(minutaDTO.getFechaRevision());
            minuta.setNoRevision(minutaDTO.getNoRevision());

            minuta.setObjetivo(minutaDTO.getObjetivo());
            minuta.setFecha(minutaDTO.getFecha());
            minuta.setParticipantes(minutaDTO.getParticipantes());
            minuta.setAgenda(minutaDTO.getAgenda());
            minuta.setResultados(minutaDTO.getResultados());
            minuta.setMejorasEficacia(minutaDTO.getMejorasEficacia());
            minuta.setMejorasProducto(minutaDTO.getMejorasProducto());
            minuta.setNecesidades(minutaDTO.getNecesidades());
            minuta.setNombre(minutaDTO.getNombre());
            minuta.setPuesto(minutaDTO.getPuesto());
            minuta.setNomEmpresa(minutaDTO.getNomEmpresa());

            minuta = minutaDao.save(minuta);
            return  minutaMapper.toDTO(minuta);
        }
        return null;
    }

    @Override
    public void eliminar(Integer idMinuta) {
        Optional<Minuta> optionalMinuta = minutaDao.findById(idMinuta);
        if (optionalMinuta.isPresent()){
            minutaDao.deleteById(idMinuta);
        }

    }
}
