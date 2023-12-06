package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@NamedQuery(name = "Departamento.getAllDepartamento", query = "SELECT d FROM Departamento d")
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "departamento")
public class Departamento {
    @Id
    @Column(name = "idDepartamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepartamento;

    @Column(name = "nombreDepartamento")
    private String nombreDepartamento;

    @Column(name = "descripcion", length = 5000)
    private String descripcion;
}
