package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "disproceso")
public class DistribucionProceso {

    @Id
    @Column(name = "idDisProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDisProceso;

    @Column(name = "contenido")
    private String contenido;
}
