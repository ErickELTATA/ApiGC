package com.api.login.pojo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FirmasProceso")
public class FirmasProceso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFirmasProceso")
    private Integer idFirmasProceso;

    private String elavorado;

    private String revisado;

    private String aprovado;

}
