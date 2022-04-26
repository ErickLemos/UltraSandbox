package com.ultrasandbox.planetas.domain.models.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoDeAlimentacao {
    CARNIVORO("CARNIVORO"),
    ONIVORO("ONIVORO"),
    HERBIVOROS("HERBIVOROS");

    private final String valor;
}
