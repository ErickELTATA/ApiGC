package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table(name = "objetivoproceso")
public class ObjetivoProceso {
    @Id
    @Column(name = "idObjetivoProceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idObjetivoProceso;

    @Column(name = "contenido", length = 5000)
    private String contenido;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "enproceso_id", referencedColumnName = "idEnProceso")
    private EnProceso enProceso;
}
