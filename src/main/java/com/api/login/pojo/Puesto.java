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
    @Column(name = "idPuesto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPuesto;

    @Column(name = "nombrePuesto")
    private String nombrePuesto;

    @Column(name = "descripcion", length = 5000)
    private String descripcion;
}
