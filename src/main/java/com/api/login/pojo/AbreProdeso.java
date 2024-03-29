package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "abreproceso")
public class AbreProdeso {
    @Id
    @Column(name = "idAbreProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAbreProceso;

    @Column(name = "abreviaciones")
    private String Abreviaciones;

    @Column(name = "definicion")
    private String Definicion;
}
