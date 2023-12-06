package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "PolCalidad.getAllPolCalidad", query = "SELECT p FROM PolCalidad p")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "polCalidad")
public class PolCalidad {
    @Id
    @Column(name = "idPolCalidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPolCalidad;

    @Column(name = "contenido", length = 5000)
    private String contenido;

    @Column(name = "fecha")
    private Date fecha;
}
