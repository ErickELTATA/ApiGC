package com.api.login.service.impl;

import com.api.login.DTO.MinutaReDireccionDTO;
import com.api.login.dao.MinutaReDireccionDao;
import com.api.login.mapper.MinutaReDireccionMapper;
import com.api.login.pojo.MinutaReDireccion;
import com.api.login.service.MinutaReDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MinutaReDireccionServiceImpl implements MinutaReDireccionService {

    @Autowired
    private MinutaReDireccionDao minutaReDireccionDao;

    @Autowired
    private MinutaReDireccionMapper mapper;

    @Override
    public List<MinutaReDireccionDTO> getAll() {
        List<MinutaReDireccion> minuta = minutaReDireccionDao.findAll();
        return minuta.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MinutaReDireccionDTO create(MinutaReDireccionDTO minutaReDireccionDTO) {
        MinutaReDireccion minuta = mapper.toEntity(minutaReDireccionDTO);
        minuta = minutaReDireccionDao.save(minuta);
        return mapper.toDTO(minuta);
    }

    @Override
    public MinutaReDireccionDTO update(Integer id, MinutaReDireccionDTO minutaReDireccionDTO) {

        Optional<MinutaReDireccion> option = minutaReDireccionDao.findById(id);
        if (option.isPresent()){
            MinutaReDireccion minuta = option.get();

            minuta.setCoDocumento(minutaReDireccionDTO.getCoDocumento());
            minuta.setFechaEmision(minutaReDireccionDTO.getFechaEmision());
            minuta.setFechaRevision(minutaReDireccionDTO.getFechaRevision());

            minuta.setObjetivo(minutaReDireccionDTO.getObjetivo());
            minuta.setFecha(minutaReDireccionDTO.getFecha());
            minuta.setParticipantes(minutaReDireccionDTO.getParticipantes());
            minuta.setAgenda(minutaReDireccionDTO.getAgenda());
            minuta.setResultados(minutaReDireccionDTO.getResultados());
            minuta.setMejorasEficacia(minutaReDireccionDTO.getMejorasEficacia());
            minuta.setMejorasProducto(minutaReDireccionDTO.getMejorasProducto());
            minuta.setNecesidades(minutaReDireccionDTO.getNecesidades());
            minuta.setNombre(minutaReDireccionDTO.getNombre());
            minuta.setPuesto(minutaReDireccionDTO.getPuesto());
            minuta.setNomEmpresa(minutaReDireccionDTO.getNomEmpresa());

            minuta = minutaReDireccionDao.save(minuta);
            return mapper.toDTO(minuta);
        }

        return null;
    }

    @Override
    public void eliminar(Integer id) {
        Optional<MinutaReDireccion> optional = minutaReDireccionDao.findById(id);
        if (optional.isPresent()){
            minutaReDireccionDao.deleteById(id);
        }
    }
}
