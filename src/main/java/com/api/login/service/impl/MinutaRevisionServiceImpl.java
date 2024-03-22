package com.api.login.service.impl;

import com.api.login.DTO.MinutaRevisionDTO;
import com.api.login.dao.MinutaRevisionDao;
import com.api.login.mapper.MinutaRevisionMapper;
import com.api.login.pojo.MinutaRevision;
import com.api.login.service.MinutaRevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MinutaRevisionServiceImpl implements MinutaRevisionService {

    @Autowired
    private MinutaRevisionDao minutaRevisionDao;

    @Autowired
    private MinutaRevisionMapper mapper;

    @Override
    public List<MinutaRevisionDTO> getAll() {
        List<MinutaRevision> minuta = minutaRevisionDao.findAll();
        return minuta.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
    @Override
    public MinutaRevisionDTO create(MinutaRevisionDTO minutaRevisionDTO) {
        MinutaRevision minuta = mapper.toEntity(minutaRevisionDTO);
        minuta = minutaRevisionDao.save(minuta);
        return mapper.toDTO(minuta);
    }

    @Override
    public MinutaRevisionDTO update(Integer id, MinutaRevisionDTO minutaRevisionDTO) {
        Optional<MinutaRevision> option = minutaRevisionDao.findById(id);

        if (option.isPresent()){
            MinutaRevision minuta = option.get();

            minuta.setCoDocumento(minutaRevisionDTO.getCoDocumento());
            minuta.setFechaEmision(minutaRevisionDTO.getFechaEmision());
            minuta.setFechaRevision(minutaRevisionDTO.getFechaRevision());
            minuta.setNoRevision(minutaRevisionDTO.getNoRevision());

            minuta.setObjetivo(minutaRevisionDTO.getObjetivo());
            minuta.setFecha(minutaRevisionDTO.getFecha());
            minuta.setParticipantes(minutaRevisionDTO.getParticipantes());
            minuta.setAgenda(minutaRevisionDTO.getAgenda());
            minuta.setResultados(minutaRevisionDTO.getResultados());
            minuta.setMejorasEficacia(minutaRevisionDTO.getMejorasEficacia());
            minuta.setMejorasProducto(minutaRevisionDTO.getMejorasProducto());
            minuta.setNecesidades(minutaRevisionDTO.getNecesidades());
            minuta.setNombre(minutaRevisionDTO.getNombre());
            minuta.setPuesto(minutaRevisionDTO.getPuesto());
            minuta.setNomEmpresa(minutaRevisionDTO.getNomEmpresa());

            minuta = minutaRevisionDao.save(minuta);
            return mapper.toDTO(minuta);
        }
        return null;
    }

    @Override
    public void eliminar(Integer id) {
        Optional<MinutaRevision> optional = minutaRevisionDao.findById(id);
        if (optional.isPresent()){
            minutaRevisionDao.deleteById(id);
        }
    }
}
