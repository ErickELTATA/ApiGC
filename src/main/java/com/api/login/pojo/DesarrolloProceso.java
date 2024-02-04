package com.api.login.pojo;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "desarrolloProceso")
public class DesarrolloProceso {
    @Id
    @Column(name = "idDesarrolloProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDesarrolloProceso;

    @Column(name = "contenido", length = 5000)
    private String contenido;
}
