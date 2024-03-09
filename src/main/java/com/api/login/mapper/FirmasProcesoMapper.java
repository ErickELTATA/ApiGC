package com.api.login.mapper;

import com.api.login.DTO.FirmasProcesoDTO;
import com.api.login.pojo.FirmasProceso;
import org.springframework.stereotype.Component;

@Component
public class FirmasProcesoMapper {

    public FirmasProcesoDTO toDTO(FirmasProceso firmasProceso){
        FirmasProcesoDTO DTO = new FirmasProcesoDTO();

        DTO.setIdFirmasProceso(firmasProceso.getIdFirmasProceso());
        DTO.setElavorado(firmasProceso.getElavorado());
        DTO.setRevisado(firmasProceso.getRevisado());
        DTO.setAprovado(firmasProceso.getAprovado());
        return DTO;
    }

    public FirmasProceso toEntity(FirmasProcesoDTO firmasProcesoDTO){
        FirmasProceso firmasProceso =  new FirmasProceso();

        firmasProceso.setIdFirmasProceso(firmasProcesoDTO.getIdFirmasProceso());
        firmasProceso.setElavorado(firmasProcesoDTO.getElavorado());
        firmasProceso.setRevisado(firmasProcesoDTO.getRevisado());
        firmasProceso.setAprovado(firmasProcesoDTO.getAprovado());

        return firmasProceso;
    }
}
