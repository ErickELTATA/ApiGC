package com.api.login.mapper;

import com.api.login.DTO.SolicitudSGCDTO;
import com.api.login.pojo.SolicitudSGC;
import org.springframework.stereotype.Component;

@Component
public class SolicitudSGCMapper {

    public SolicitudSGCDTO toDTO(SolicitudSGC solicitudSGC){
        SolicitudSGCDTO dto = new SolicitudSGCDTO();

        dto.setIdSolicitudSGC(solicitudSGC.getIdSolicitudSGC());
        dto.setCoDocumento(solicitudSGC.getCoDocumento());
        dto.setNumeroRevision(solicitudSGC.getNumeroRevision());
        dto.setFechaEmision(solicitudSGC.getFechaEmision());
        dto.setFechaRevision(solicitudSGC.getFechaRevision());
        dto.setFecha(solicitudSGC.getFecha());
        dto.setDocumento(solicitudSGC.getDocumento());
        dto.setMotivoCambio(solicitudSGC.getMotivoCambio());
        dto.setPuntosAfectaran(solicitudSGC.getPuntosAfectaran());
        dto.setNuevaRevision(solicitudSGC.getNuevaRevision());
        dto.setFechaEdicion(solicitudSGC.getFechaEdicion());
        dto.setNuevaFechaEdicion(solicitudSGC.getNuevaFechaEdicion());
        dto.setObservaciones(solicitudSGC.getObservaciones());
        dto.setSolicita(solicitudSGC.getSolicita());
        dto.setAutoriza(solicitudSGC.getAutoriza());
        return dto;
    }

    public SolicitudSGC toEntity(SolicitudSGCDTO dto){
        SolicitudSGC solicitudSGC = new SolicitudSGC();
        solicitudSGC.setIdSolicitudSGC(dto.getIdSolicitudSGC());
        solicitudSGC.setCoDocumento(dto.getCoDocumento());
        solicitudSGC.setNumeroRevision(dto.getNumeroRevision());
        solicitudSGC.setFechaEmision(dto.getFechaEmision());
        solicitudSGC.setFechaRevision(dto.getFechaRevision());

        solicitudSGC.setFecha(dto.getFecha());
        solicitudSGC.setDocumento(dto.getDocumento());
        solicitudSGC.setMotivoCambio(dto.getMotivoCambio());
        solicitudSGC.setPuntosAfectaran(dto.getPuntosAfectaran());
        solicitudSGC.setNuevaRevision(dto.getNuevaRevision());
        solicitudSGC.setFechaEdicion(dto.getFechaEdicion());
        solicitudSGC.setNuevaFechaEdicion(dto.getNuevaFechaEdicion());
        solicitudSGC.setObservaciones(dto.getObservaciones());
        solicitudSGC.setSolicita(dto.getSolicita());
        solicitudSGC.setAutoriza(dto.getAutoriza());
        return solicitudSGC;
    }
}
