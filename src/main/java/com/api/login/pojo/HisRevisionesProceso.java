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
@Table(name = "historialRevisionProceso")
public class HisRevisionesProceso {
    @Id
    @Column(name = "idHisRevisionProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHisRevisionProceso;

    @Column(name = "numeroRevision")
    private Integer numeroRevision;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "seccionAfectada")
    private String seccionAfectada;

    @Column(name = "efectuadoPor")
    private String efectuadoPor;

    @Column(name = "fechaEjecucion")
    private Date fechaEjecucion;
}
