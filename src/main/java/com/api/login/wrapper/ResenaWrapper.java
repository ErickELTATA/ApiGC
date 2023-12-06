package com.api.login.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResenaWrapper {

    private Integer idResena;

    private Date fecha;

    private String contenido;



}
