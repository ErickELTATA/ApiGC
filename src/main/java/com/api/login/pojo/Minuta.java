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
@Table(name = "minuta")
public class Minuta {

    @Id
    @Column(name = "idMinuta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMinuta;

    //encabezado
    private String coDocumento;

    private String titulo;

    private Date fechaEmision;

    private Date fechaRevision;
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
