package com.api.login.mapper;

import com.api.login.DTO.MinutaRevisionDTO;
import com.api.login.pojo.MinutaRevision;
import org.springframework.stereotype.Component;

@Component
public class MinutaRevisionMapper {

    public MinutaRevisionDTO toDTO(MinutaRevision minutaRevision){
        MinutaRevisionDTO minutaDTO = new MinutaRevisionDTO();

        minutaDTO.setIdMinutaRevision(minutaRevision.getIdMinutaRevision());
        minutaDTO.setCoDocumento(minutaRevision.getCoDocumento());
        minutaDTO.setFechaEmision(minutaRevision.getFechaEmision());
        minutaDTO.setFechaRevision(minutaRevision.getFechaRevision());
        minutaDTO.setNoRevision(minutaRevision.getNoRevision());

        minutaDTO.setObjetivo(minutaRevision.getObjetivo());
        minutaDTO.setFecha(minutaRevision.getFecha());
        minutaDTO.setParticipantes(minutaRevision.getParticipantes());
        minutaDTO.setAgenda(minutaRevision.getAgenda());
        minutaDTO.setResultados(minutaRevision.getResultados());
        minutaDTO.setMejorasEficacia(minutaRevision.getMejorasEficacia());
        minutaDTO.setMejorasProducto(minutaRevision.getMejorasProducto());
        minutaDTO.setNecesidades(minutaRevision.getNecesidades());
        minutaDTO.setNombre(minutaRevision.getNombre());
        minutaDTO.setPuesto(minutaRevision.getPuesto());
        minutaDTO.setNomEmpresa(minutaRevision.getNomEmpresa());

        return minutaDTO;
    }

    public MinutaRevision toEntity(MinutaRevisionDTO dto){
        MinutaRevision minutaRevision = new MinutaRevision();

        minutaRevision.setIdMinutaRevision(dto.getIdMinutaRevision());
        minutaRevision.setCoDocumento(dto.getCoDocumento());
        minutaRevision.setFechaEmision(dto.getFechaEmision());
        minutaRevision.setFechaRevision(dto.getFechaRevision());
        minutaRevision.setNoRevision(dto.getNoRevision());

        minutaRevision.setObjetivo(dto.getObjetivo());
        minutaRevision.setFecha(dto.getFecha());
        minutaRevision.setParticipantes(dto.getParticipantes());
        minutaRevision.setAgenda(dto.getAgenda());
        minutaRevision.setResultados(dto.getResultados());
        minutaRevision.setMejorasEficacia(dto.getMejorasEficacia());
        minutaRevision.setMejorasProducto(dto.getMejorasProducto());
        minutaRevision.setNecesidades(dto.getNecesidades());
        minutaRevision.setNombre(dto.getNombre());
        minutaRevision.setPuesto(dto.getPuesto());
        minutaRevision.setNomEmpresa(dto.getNomEmpresa());

        return minutaRevision;

    }
}
