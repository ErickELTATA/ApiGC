package com.api.login.mapper;

import com.api.login.dao.EnProcesoDao;
import com.api.login.dto.DistribucionProcesoDTO;
import com.api.login.pojo.DistribucionProceso;
import com.api.login.pojo.EnProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DistribucionProcesoMapper {

    @Autowired
    private EnProcesoDao enProcesoDao;

    public DistribucionProcesoDTO toDTO(DistribucionProceso distribucionProceso){
        DistribucionProcesoDTO dto = new DistribucionProcesoDTO();
        dto.setIdDistribucionProceso(distribucionProceso.getIdDisProceso());
        dto.setContenido(distribucionProceso.getContenido());
        dto.setIdEnProceso(distribucionProceso.getEnProceso().getIdEnProceso());

        return dto;
    }

    public DistribucionProceso toEntity(DistribucionProcesoDTO dto){
        DistribucionProceso distribucionProceso = new DistribucionProceso();
        distribucionProceso.setIdDisProceso(dto.getIdDistribucionProceso());
        distribucionProceso.setContenido(dto.getContenido());

        Optional<EnProceso> enProceso = enProcesoDao.findById(dto.getIdEnProceso());
        EnProceso enProceso1 = enProceso.get();

        distribucionProceso.setEnProceso(enProceso1);

        return distribucionProceso;
    }
}
