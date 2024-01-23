package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "alcanceproceso")
public class AlcanceProceso {

    @Id
    @Column(name = "idAlcanceProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlcanceProceso;

    @Column(name = "contenido", length = 5000)
    private String contenido;
}
