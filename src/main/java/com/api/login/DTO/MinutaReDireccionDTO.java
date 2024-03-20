package com.api.login.DTO;

import lombok.Data;

import java.sql.Date;
@Data
public class MinutaReDireccionDTO {
    private Integer idMinutaReDireccion;

    //encabezado
    private String coDocumento;

    private Date fechaEmision;

    private Date fechaRevision;

    private String noRevision;
    // Contenido

    private String objetivo;

    private Date fecha;

    private String participantes;

    private String agenda;

    private String resultados;

    private String mejorasEficacia;

    private String mejorasProducto;

    private String necesidades;

    //pie de paguina
    private String nombre;

    private String puesto;

    private String nomEmpresa;
}
