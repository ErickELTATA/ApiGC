package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "doreferenciaproceso")
public class DoReferenciaProceso {

    @Id
    @Column(name = "idDoReferenciaProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoReferenciaProceso;

    @Column(name = "coDocumento")
    private String coDocumento;

    @Column(name = "NombreDocumento")
    private String NombreDocumento;
}
