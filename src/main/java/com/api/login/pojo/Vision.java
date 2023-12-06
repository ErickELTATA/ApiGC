package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "Vision.getAllVision", query = "SELECT v FROM Vision v")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "vision")
public class Vision {
    @Id
    @Column(name = "idVision")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVision;

    @Column(name = "contenido", length = 5000)
    private String contenido;

    @Column(name = "fecha")
    private Date fecha;
}
