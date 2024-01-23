package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "EnProceso.getAllEnProceso", query = "SELECT e FROM EnProceso e")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "enproceso")
public class EnProceso {
    @Id
    @Column(name = "idEnProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEnProceso;

    @Column(name = "fechaElaboracion")
    private Date fechaElaboracion;

    @Column(name = "fechaEdicion")
    private Date fechaEdicion;

    @Column(name = "noRevision")
    private Integer noRevision;

    @Column(name = "coDocumento")
    private String coDocumento;


    @Column(name = "nombreProceso")
    private String nombreProceso;

}
