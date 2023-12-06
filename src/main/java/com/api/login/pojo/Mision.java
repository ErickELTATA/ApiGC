package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "Mision.getAllMision", query = "SELECT m FROM Mision m")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "mision")
public class Mision {
    //idPolCalidad
    @Id
    @Column(name = "idMision")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMision;

    @Column(name = "contenido", length = 5000)
    private String contenido;

    @Column(name = "fecha")
    private Date fecha;
}
