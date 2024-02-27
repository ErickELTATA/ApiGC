package com.api.login.mapper;

import com.api.login.dao.EnProcesoDao;
import com.api.login.dto.ObjetivoProcesoDTO;
import com.api.login.pojo.EnProceso;
import com.api.login.pojo.ObjetivoProceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ObjetivoProcesoMapper {
    @Autowired
    private EnProcesoDao enProcesoDao;

    public ObjetivoProcesoDTO toDTO(ObjetivoProceso objetivoProceso){
        ObjetivoProcesoDTO objetivoProcesoDTO =  new ObjetivoProcesoDTO();
        objetivoProcesoDTO.setIdObjetivoProceso(objetivoProceso.getIdObjetivoProceso());
        objetivoProcesoDTO.setContenido(objetivoProceso.getContenido());
        objetivoProcesoDTO.setIdEnProceso(objetivoProceso.getEnProceso().getIdEnProceso());

        return objetivoProcesoDTO;
    }

    public ObjetivoProceso toEntity(ObjetivoProcesoDTO objetivoProcesoDTO){
        ObjetivoProceso objetivoProceso = new ObjetivoProceso();
        objetivoProceso.setIdObjetivoProceso(objetivoProcesoDTO.getIdObjetivoProceso());
        objetivoProceso.setContenido(objetivoProcesoDTO.getContenido());

        //objetivoProceso.setEnProceso(enProceso);

        Optional<EnProceso> enProceso1 = enProcesoDao.findById(objetivoProcesoDTO.getIdEnProceso());
        EnProceso enProceso = enProceso1.get();
        objetivoProceso.setEnProceso(enProceso);

        return objetivoProceso;
    }

    /*
    public ObjetivoProceso toEntity(ObjetivoProcesoDTO objetivoProcesoDTO, EnProceso enProceso){
        ObjetivoProceso objetivoProceso = new ObjetivoProceso();
        objetivoProceso.setIdObjetivoProceso(objetivoProcesoDTO.getIdObjetivoProceso());
        objetivoProceso.setContenido(objetivoProcesoDTO.getContenido());
        objetivoProceso.setEnProceso(enProceso);

        return objetivoProceso;
    }

     */
}
