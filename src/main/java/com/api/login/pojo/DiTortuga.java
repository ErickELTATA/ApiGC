package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "ditortuga")
public class DiTortuga {
    @Id
    @Column(name = "idDiTortuga")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDiTortuga;

   @Column(name = "nombreproceso")
    private String nombreproceso;

    @Column(name = "descripcion")
    private String descripcion;

}
