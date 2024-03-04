package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@Data
@Entity
@Table(name = "enproceso")
@NoArgsConstructor
@AllArgsConstructor
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

    @OneToOne(mappedBy = "enProceso")
    private ObjetivoProceso objetivoProceso;

    @OneToOne(mappedBy = "enProceso")
    private AlcanceProceso alcanceProceso;

    @OneToOne(mappedBy = "enProceso")
    private DesarrolloProceso desarrolloProceso;
}
