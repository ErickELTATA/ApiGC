package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@Data
@Entity
@Table(name = "solicitudSGC")
public class SolicitudSGC {

    @Id
    @Column(name = "idSolicitudSGC")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
