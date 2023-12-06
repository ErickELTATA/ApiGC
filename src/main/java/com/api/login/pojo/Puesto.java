package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@NamedQuery(name = "Puesto.getAllPuesto", query = "SELECT p FROM Puesto p")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "puesto")
public class Puesto {
    @Id
    @Column(name = "idPosition")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPuesto;

    @Column(name = "namePosition")
    private String namePosition;

    @Column(name = "deparmentPosition")
    private String deparmentPosition;


    @Column(name = "funtionsPosition", length = 5000)
    private String funtionsPosition;
}
