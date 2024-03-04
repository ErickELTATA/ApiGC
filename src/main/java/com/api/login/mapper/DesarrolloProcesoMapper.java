package com.api.login.mapper;

import com.api.login.dao.EnProcesoDao;
import com.api.login.dto.DesarrolloProcesoDTO;
import com.api.login.pojo.DesarrolloProceso;
import com.api.login.pojo.EnProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DesarrolloProcesoMapper {
    @Autowired
    private EnProcesoDao enProcesoDao;

    public DesarrolloProcesoDTO toDTO(DesarrolloProceso desarrolloProceso){
        DesarrolloProcesoDTO desarrolloProcesoDTO = new DesarrolloProcesoDTO();
        desarrolloProcesoDTO.setIdDesarrolloProceso(desarrolloProceso.getIdDesarrolloProceso());
        desarrolloProcesoDTO.setContenido(desarrolloProceso.getContenido());
        desarrolloProcesoDTO.setIdEnProceso(desarrolloProceso.getEnProceso().getIdEnProceso());
        return desarrolloProcesoDTO;
    }

    public DesarrolloProceso toEntity(DesarrolloProcesoDTO desarrolloProcesoDTO){
        DesarrolloProceso desarrolloProceso =  new DesarrolloProceso();
        desarrolloProceso.setIdDesarrolloProceso(desarrolloProcesoDTO.getIdDesarrolloProceso());
        desarrolloProceso.setContenido(desarrolloProcesoDTO.getContenido());

        Optional<EnProceso> enProceso = enProcesoDao.findById(desarrolloProcesoDTO.getIdEnProceso());
        EnProceso enProceso1 = enProceso.get();

        desarrolloProceso.setEnProceso(enProceso1);
        return desarrolloProceso;
    }
}
