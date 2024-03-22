package com.api.login.mapper;

import com.api.login.DTO.CartaNombramientoDTO;
import com.api.login.pojo.CartaNombramiento;
import org.springframework.stereotype.Component;

@Component
public class CartaNombramientoMapper {

    public CartaNombramientoDTO toDTO(CartaNombramiento cartaNombramiento){
        CartaNombramientoDTO dto = new CartaNombramientoDTO();

        dto.setIdCartaNombramiento(cartaNombramiento.getIdCartaNombramiento());
        dto.setNumeroRevision(cartaNombramiento.getNumeroRevision());
        dto.setCoDocumento(cartaNombramiento.getCoDocumento());
        dto.setFechaRevision(cartaNombramiento.getFechaRevision());
        dto.setFechaEmision(cartaNombramiento.getFechaEmision());
        dto.setNombreRemitente(cartaNombramiento.getNombreRemitente());
        dto.setCiudad(cartaNombramiento.getCiudad());
        dto.setCodigoPostal(cartaNombramiento.getCodigoPostal());
        dto.setFecha(cartaNombramiento.getFecha());
        dto.setNombreDestinatario(cartaNombramiento.getNombreDestinatario());
        dto.setCargoRemitente(cartaNombramiento.getCargoRemitente());
        dto.setCargoDestinatario(cartaNombramiento.getCargoDestinatario());
        dto.setFechaInicio(cartaNombramiento.getFechaInicio());
        dto.setHorarioLaboral(cartaNombramiento.getHorarioLaboral());
        dto.setBeneficiosAdicionales(cartaNombramiento.getBeneficiosAdicionales());
        dto.setPoliticasNormativas(cartaNombramiento.getPoliticasNormativas());
        dto.setCargoDelRemitente(cartaNombramiento.getCargoDelRemitente());

        return dto;
    }

    public CartaNombramiento toEntity(CartaNombramientoDTO dto){

        CartaNombramiento cartaNombramiento = new CartaNombramiento();

        cartaNombramiento.setIdCartaNombramiento(dto.getIdCartaNombramiento());
        cartaNombramiento.setNumeroRevision(dto.getNumeroRevision());
        cartaNombramiento.setCoDocumento(dto.getCoDocumento());
        cartaNombramiento.setFechaRevision(dto.getFechaRevision());
        cartaNombramiento.setFechaEmision(dto.getFechaEmision());
        cartaNombramiento.setNombreRemitente(dto.getNombreRemitente());
        cartaNombramiento.setCiudad(dto.getCiudad());
        cartaNombramiento.setCodigoPostal(dto.getCodigoPostal());
        cartaNombramiento.setFecha(dto.getFecha());
        cartaNombramiento.setNombreDestinatario(dto.getNombreDestinatario());
        cartaNombramiento.setCargoRemitente(dto.getCargoRemitente());
        cartaNombramiento.setCargoDestinatario(dto.getCargoDestinatario());
        cartaNombramiento.setFechaInicio(dto.getFechaInicio());
        cartaNombramiento.setHorarioLaboral(dto.getHorarioLaboral());
        cartaNombramiento.setBeneficiosAdicionales(dto.getBeneficiosAdicionales());
        cartaNombramiento.setPoliticasNormativas(dto.getPoliticasNormativas());
        cartaNombramiento.setCargoDelRemitente(dto.getCargoDelRemitente());

        return cartaNombramiento;
    }
}
