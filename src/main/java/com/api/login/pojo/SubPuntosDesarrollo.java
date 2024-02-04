package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "subpuntos")
public class SubPuntosDesarrollo {
    @Id
    @Column(name = "idSubPuntos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSubPuntos;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "proceso")
    private String proceso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "responsable")
    private String responsable;

    @Column(name = "formato")
    private String formato;
}
