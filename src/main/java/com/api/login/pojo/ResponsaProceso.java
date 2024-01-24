package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "responsaproceso")
public class ResponsaProceso {
    @Id
    @Column(name = "idDoReferenciaProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoReferenciaProceso;

    @Column(name = "responsable")
    private String responsable;

    @Column(name = "responsabilidades")
    private String responsabilidades;
}
