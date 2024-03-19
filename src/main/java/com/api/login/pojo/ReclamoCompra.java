package com.api.login.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@Data
@Entity
@Table(name = "reclamoCompra")
public class ReclamoCompra {
    @Id
    @Column(name = "reclamoCompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reclamoCompra;

    //encabezado
    private String coDocumento;

    private String numeroRevision;

    private Date fechaEmision;

    private Date fechaRevision;

    //contenido
    private Date fecha;

    private String proveedor;

    //nombre de quien atiende la reclamacion
    private String nomAtiReclamo;

    private String casua;

    private String accionTomada;

    private Date fechaCierre;

    private String elaboro;

    private String autorizo;
}
