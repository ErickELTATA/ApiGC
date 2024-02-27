package com.api.login.mapper;

import com.api.login.dto.EnProcesoDTO;
import com.api.login.pojo.EnProceso;
import org.springframework.stereotype.Component;

@Component
public class EnProcesoMapper {

    public EnProcesoDTO toDTO(EnProceso enProceso){

        EnProcesoDTO enProcesoDTO = new EnProcesoDTO();

        enProcesoDTO.setIdEnProceso(enProceso.getIdEnProceso());
        enProcesoDTO.setFechaElaboracion(enProceso.getFechaElaboracion());
        enProcesoDTO.setFechaEdicion(enProceso.getFechaEdicion());
        enProcesoDTO.setNoRevision(enProceso.getNoRevision());
        enProcesoDTO.setCoDocumento(enProceso.getCoDocumento());
        enProcesoDTO.setNombreProceso(enProceso.getNombreProceso());

        return enProcesoDTO;
    }


    public EnProceso toEntity(EnProcesoDTO enProcesoDTO){
        EnProceso enProceso = new EnProceso();

        enProceso.setIdEnProceso(enProcesoDTO.getIdEnProceso());
        enProceso.setFechaElaboracion(enProcesoDTO.getFechaElaboracion());
        enProceso.setFechaEdicion(enProcesoDTO.getFechaEdicion());
        enProceso.setNoRevision(enProcesoDTO.getNoRevision());
        enProceso.setCoDocumento(enProcesoDTO.getCoDocumento());
        enProceso.setNombreProceso(enProcesoDTO.getNombreProceso());

        return enProceso;
    }

}
