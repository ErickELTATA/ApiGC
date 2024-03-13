package com.api.login.dto;

import lombok.Data;

@Data
public class DoReferenciaProcesoDTO {

    private Integer idDoReferenciaProceso;

    private String coDocumento;

    private String nombreDocumento;

    private Integer idEnProceso;
}
