package com.api.login.mapper;

import com.api.login.dao.EnProcesoDao;
import com.api.login.dto.DoReferenciaProcesoDTO;
import com.api.login.pojo.DoReferenciaProceso;
import com.api.login.pojo.EnProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DoReferenciaProcesoMapper {

    @Autowired
    private EnProcesoDao enProcesoDao;

    public DoReferenciaProcesoDTO toDTO(DoReferenciaProceso doReferenciaProceso){
        DoReferenciaProcesoDTO dto = new DoReferenciaProcesoDTO();

        dto.setIdDoReferenciaProceso(doReferenciaProceso.getIdDoReferenciaProceso());
        dto.setCoDocumento(doReferenciaProceso.getCoDocumento());
        dto.setNombreDocumento(doReferenciaProceso.getNombreDocumento());
        dto.setIdEnProceso(doReferenciaProceso.getEnProceso().getIdEnProceso());

        return dto;
    }

    public DoReferenciaProceso toEntity(DoReferenciaProcesoDTO dto){

        DoReferenciaProceso doReferenciaProceso = new DoReferenciaProceso();

        doReferenciaProceso.setIdDoReferenciaProceso(dto.getIdDoReferenciaProceso());
        doReferenciaProceso.setCoDocumento(dto.getCoDocumento());
        doReferenciaProceso.setNombreDocumento(dto.getNombreDocumento());

        Optional<EnProceso> enProceso= enProcesoDao.findById(dto.getIdEnProceso());
        EnProceso enProceso1 = enProceso.get();
        doReferenciaProceso.setEnProceso(enProceso1);

        return doReferenciaProceso;
    }
}
