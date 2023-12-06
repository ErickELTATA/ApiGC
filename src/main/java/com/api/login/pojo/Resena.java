package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "Resena.getAllResena", query = "SELECT r FROM Resena r")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "resena")
public class Resena {

    //idPolCalidad
    @Id
    @Column(name = "idResena")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idResena;

    @Column(name = "contenido", length = 5000)
    private String contenido;

    @Column(name = "fecha")
    private Date fecha;

}
