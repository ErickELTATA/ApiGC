package com.api.login.DTO;

import lombok.Data;

import java.sql.Date;

@Data
public class CartaNombramientoDTO {

    private Integer idCartaNombramiento;

    //encabezado
    private String numeroRevision;

    private String coDocumento;

    private Date fechaRevision;

    private Date fechaEmision;

    private String nombreRemitente;

    private String ciudad;

    private Integer codigoPostal;

    private Date fecha;

    private String nombreDestinatario;

    private String cargoRemitente;

    private String cargoDestinatario;

    private Date fechaInicio;

    private String horarioLaboral;

    private String beneficiosAdicionales;

    private String politicasNormativas;

    private String cargoDelRemitente;
}
