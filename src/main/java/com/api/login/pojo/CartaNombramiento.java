package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "CartaNombramiento")
public class CartaNombramiento {
    @Id
    @Column(name = "idCartaNombramiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
