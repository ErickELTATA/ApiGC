package com.api.login.DTO;

import lombok.Data;

import java.sql.Date;

@Data
public class SolicitudSGCDTO {

    private Integer idSolicitudSGC;

    //encabezado
    private String coDocumento;

    private String numeroRevision;

    private Date fechaEmision;

    private Date fechaRevision;

    //contenido

    private Date fecha;

    private String documento;

    private String motivoCambio;

    private String puntosAfectaran;

    private String nuevaRevision;

    private Date fechaEdicion;

    private Date nuevaFechaEdicion;

    private String observaciones;

    private String solicita;

    private String autoriza;
}
