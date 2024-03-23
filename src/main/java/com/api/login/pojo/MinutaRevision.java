package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "minutarevision")
public class MinutaRevision {

    @Id
    @Column(name = "idMinutaRevision")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMinutaRevision;

    //encabezado
    private String coDocumento;

    private Date fechaEmision;

    private Date fechaRevision;

    private String noRevision;

    // Contenido

    @Column(length = 500)
    private String objetivo;

    private Date fecha;

    @Column(length = 500)
    private String participantes;

    @Column(length = 1000)
    private String agenda;

    @Column(length = 500)
    private String resultados;

    @Column(length = 500)
    private String mejorasEficacia;

    @Column(length = 500)
    private String mejorasProducto;

    @Column(length = 500)
    private String necesidades;

    //pie de paguina
    private String nombre;

    private String puesto;

    private String nomEmpresa;
}
