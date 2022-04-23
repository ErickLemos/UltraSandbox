package com.ultrasandbox.planetas.domain.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoDeVida {
    ANIMAL("ANIMAL"),
    PLANTA("PLANTA");

    private final String valor;
}
