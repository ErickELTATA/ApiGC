package com.api.login.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class EnProcesoDTO {

    private Integer idEnProceso;

    private Date fechaElaboracion;

    private Date fechaEdicion;

    private Integer noRevision;

    private String coDocumento;

    private String nombreProceso;
}
