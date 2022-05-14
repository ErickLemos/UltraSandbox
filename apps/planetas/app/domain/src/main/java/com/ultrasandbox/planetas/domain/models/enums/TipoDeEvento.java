package com.ultrasandbox.planetas.domain.models.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoDeEvento {
    CLIMATICO("CLIMATICO"),
    CATASTROFE("CATASTROFE"),
    ASTRONOMICO("ASTRONOMICO"),
    BIOLOGICO("BIOLOGICO");

    private final String valor;
}
