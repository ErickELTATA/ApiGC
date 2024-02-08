package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "registrosproceso")
public class RegistrosProceso {
    @Id
    @Column(name = "idRegistrosProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegistrosProceso;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "codigo")
    private String codigo;
}
