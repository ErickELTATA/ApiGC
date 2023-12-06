package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "Valores.getAllValores", query = "SELECT v FROM Valores v")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "valores")
public class Valores {
    @Id
    @Column(name = "idValores")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idValores;

    @Column(name = "contenido", length = 5000)
    private String contenido;

    @Column(name = "fecha")
    private Date fecha;
}
