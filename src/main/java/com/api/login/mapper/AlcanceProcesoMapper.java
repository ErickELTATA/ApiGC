package com.api.login.mapper;

import com.api.login.dao.AlcanceProcesoDao;
import com.api.login.dao.EnProcesoDao;
import com.api.login.dto.AlcanceProcesoDTO;
import com.api.login.pojo.AlcanceProceso;
import com.api.login.pojo.EnProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AlcanceProcesoMapper {

    @Autowired
    private EnProcesoDao enProcesoDao;

    public AlcanceProcesoDTO toDTO(AlcanceProceso alcanceProceso){
        AlcanceProcesoDTO alcanceProcesoDTO = new AlcanceProcesoDTO();
        alcanceProcesoDTO.setIdAlcanceProceso(alcanceProceso.getIdAlcanceProceso());
        alcanceProcesoDTO.setContenido(alcanceProceso.getContenido());
        alcanceProcesoDTO.setIdEnProceso(alcanceProceso.getEnProceso().getIdEnProceso());
        return alcanceProcesoDTO;
    }

    public AlcanceProceso toEntity(AlcanceProcesoDTO alcanceProcesoDTO){
        AlcanceProceso alcanceProceso = new AlcanceProceso();
        alcanceProceso.setIdAlcanceProceso(alcanceProcesoDTO.getIdAlcanceProceso());
        alcanceProceso.setContenido(alcanceProcesoDTO.getContenido());

        Optional<EnProceso> enProceso = enProcesoDao.findById(alcanceProcesoDTO.getIdEnProceso());
        EnProceso enProceso1 = enProceso.get();

        alcanceProceso.setEnProceso(enProceso1);

        return alcanceProceso;
    }
}
