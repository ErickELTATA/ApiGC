package com.api.login.mapper;

import com.api.login.DTO.MinutaReDireccionDTO;
import com.api.login.pojo.MinutaReDireccion;
import org.springframework.stereotype.Component;

@Component
public class MinutaReDireccionMapper {

    public MinutaReDireccionDTO toDTO(MinutaReDireccion minutaReDireccion){
        MinutaReDireccionDTO dto = new MinutaReDireccionDTO();

        dto.setIdMinutaReDireccion(minutaReDireccion.getIdMinutaReDireccion());
        dto.setCoDocumento(minutaReDireccion.getCoDocumento());
        dto.setFechaEmision(minutaReDireccion.getFechaEmision());
        dto.setFechaRevision(minutaReDireccion.getFechaRevision());
        dto.setNoRevision(minutaReDireccion.getNoRevision());

        dto.setObjetivo(minutaReDireccion.getObjetivo());
        dto.setFecha(minutaReDireccion.getFecha());
        dto.setParticipantes(minutaReDireccion.getParticipantes());
        dto.setAgenda(minutaReDireccion.getAgenda());
        dto.setResultados(minutaReDireccion.getResultados());
        dto.setMejorasEficacia(minutaReDireccion.getMejorasEficacia());
        dto.setMejorasProducto(minutaReDireccion.getMejorasProducto());
        dto.setNecesidades(minutaReDireccion.getNecesidades());
        dto.setNombre(minutaReDireccion.getNombre());
        dto.setPuesto(minutaReDireccion.getPuesto());
        dto.setNomEmpresa(minutaReDireccion.getNomEmpresa());
        return dto;
    }

    public MinutaReDireccion toEntity(MinutaReDireccionDTO dto){
        MinutaReDireccion minuta = new MinutaReDireccion();

        minuta.setIdMinutaReDireccion(dto.getIdMinutaReDireccion());
        minuta.setCoDocumento(dto.getCoDocumento());
        minuta.setFechaEmision(dto.getFechaEmision());
        minuta.setFechaRevision(dto.getFechaRevision());
        minuta.setNoRevision(dto.getNoRevision());

        minuta.setObjetivo(dto.getObjetivo());
        minuta.setFecha(dto.getFecha());
        minuta.setParticipantes(dto.getParticipantes());
        minuta.setAgenda(dto.getAgenda());
        minuta.setResultados(dto.getResultados());
        minuta.setMejorasEficacia(dto.getMejorasEficacia());
        minuta.setMejorasProducto(dto.getMejorasProducto());
        minuta.setNecesidades(dto.getNecesidades());
        minuta.setNombre(dto.getNombre());
        minuta.setPuesto(dto.getPuesto());
        minuta.setNomEmpresa(dto.getNomEmpresa());
        return minuta;
    }
}
