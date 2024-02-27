package com.api.login.service.impl;

import com.api.login.dao.EnProcesoDao;
import com.api.login.dao.ObjetivoProcesoDao;
import com.api.login.dto.EnProcesoDTO;
import com.api.login.mapper.EnProcesoMapper;
import com.api.login.pojo.EnProceso;
import com.api.login.service.EnProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class EnProcesoServiceImpl implements EnProcesoService {

    @Autowired
    private EnProcesoDao enProcesoDao;

    @Autowired
    private EnProcesoMapper enProcesoMapper;

    @Autowired
    private ObjetivoProcesoDao objetivoProcesoDao;

    @Override
    public List<EnProcesoDTO> getAllEnProceso() {

        List<EnProceso> enProceso= enProcesoDao.findAll();
        return enProceso.stream()
                .map(enProcesoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EnProcesoDTO> getEnProcesoById(Integer id) {
        Optional<EnProceso> optionalEnProceso = enProcesoDao.findById(id);
        return optionalEnProceso.map(enProcesoMapper::toDTO);
    }

    @Override
    public EnProcesoDTO createEnProceso(EnProcesoDTO enProcesoDTO) {
        EnProceso enProceso = enProcesoMapper.toEntity(enProcesoDTO);
        enProceso = enProcesoDao.save(enProceso);

        return enProcesoMapper.toDTO(enProceso);
    }

    @Override
    public EnProcesoDTO updateEnProceso(Integer id, EnProcesoDTO enProcesoDTO) {
        Optional<EnProceso> optionalEnProceso = enProcesoDao.findById(id);
        if (optionalEnProceso.isPresent()){
            EnProceso enProceso = optionalEnProceso.get();
            enProceso.setFechaElaboracion(enProcesoDTO.getFechaElaboracion());
            enProceso.setFechaEdicion(enProcesoDTO.getFechaEdicion());
            enProceso.setNoRevision(enProcesoDTO.getNoRevision());
            enProceso.setCoDocumento(enProcesoDTO.getCoDocumento());
            enProceso.setNombreProceso(enProcesoDTO.getNombreProceso());

            enProceso = enProcesoDao.save(enProceso);
            return enProcesoMapper.toDTO(enProceso);
        }
        return null;
    }

    @Override
    public void deleteEnProceso(Integer id) {
        Optional<EnProceso> optionalEnProceso = enProcesoDao.findById(id);
        if (optionalEnProceso.isPresent()){
            EnProceso enProceso = optionalEnProceso.get();

            //for(ObjetivoProceso objetivoProceso : enProceso.getObjetivoProceso()){

            // }

            enProcesoDao.deleteById(id);
        }
    }
}
