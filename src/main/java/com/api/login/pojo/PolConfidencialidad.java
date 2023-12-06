package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "PolConfidencialidad.getAllPolConfidencialidad", query = "SELECT p FROM PolConfidencialidad p")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "polConfidencialidad")
public class PolConfidencialidad {
    @Id
    @Column(name = "idPolConfidencialidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPolConfidencialidad;

    @Column(name = "contenido", length = 5000)
    private String contenido;

    @Column(name = "fecha")
    private Date fecha;
}
