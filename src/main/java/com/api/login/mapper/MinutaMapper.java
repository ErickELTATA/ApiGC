package com.api.login.mapper;

import com.api.login.DTO.MinutaDTO;
import com.api.login.pojo.Minuta;
import org.springframework.stereotype.Component;

@Component
public class MinutaMapper {

    public MinutaDTO toDTO(Minuta minuta){
        MinutaDTO minutaDTO =  new MinutaDTO();

        minutaDTO.setIdMinuta(minuta.getIdMinuta());
        minutaDTO.setCoDocumento(minuta.getCoDocumento());
        minutaDTO.setTitulo(minuta.getTitulo());
        minutaDTO.setFechaEmision(minuta.getFechaEmision());
        minutaDTO.setFechaRevision(minuta.getFechaRevision());

        minutaDTO.setObjetivo(minuta.getObjetivo());
        minutaDTO.setFecha(minuta.getFecha());
        minutaDTO.setParticipantes(minuta.getParticipantes());
        minutaDTO.setAgenda(minuta.getAgenda());
        minutaDTO.setResultados(minuta.getResultados());
        minutaDTO.setMejorasEficacia(minuta.getMejorasEficacia());
        minutaDTO.setMejorasProducto(minuta.getMejorasProducto());
        minutaDTO.setNecesidades(minuta.getNecesidades());

        minutaDTO.setNombre(minuta.getNombre());
        minutaDTO.setPuesto(minuta.getPuesto());
        minutaDTO.setNomEmpresa(minuta.getNomEmpresa());

        return minutaDTO;
    }

    public Minuta toEntity(MinutaDTO minutaDTO){
        Minuta minuta = new Minuta();

        minuta.setIdMinuta(minutaDTO.getIdMinuta());
        minuta.setCoDocumento(minutaDTO.getCoDocumento());
        minuta.setTitulo(minutaDTO.getTitulo());
        minuta.setFechaEmision(minutaDTO.getFechaEmision());
        minuta.setFechaRevision(minutaDTO.getFechaRevision());

        minuta.setObjetivo(minutaDTO.getObjetivo());
        minuta.setFecha(minutaDTO.getFecha());
        minuta.setParticipantes(minutaDTO.getParticipantes());
        minuta.setAgenda(minutaDTO.getAgenda());
        minuta.setResultados(minutaDTO.getResultados());
        minuta.setMejorasEficacia(minutaDTO.getMejorasEficacia());
        minuta.setMejorasProducto(minutaDTO.getMejorasProducto());
        minuta.setNecesidades(minutaDTO.getNecesidades());
        minuta.setNombre(minutaDTO.getNombre());
        minuta.setPuesto(minutaDTO.getPuesto());
        minuta.setNomEmpresa(minutaDTO.getNomEmpresa());

        return minuta;
    }
}
