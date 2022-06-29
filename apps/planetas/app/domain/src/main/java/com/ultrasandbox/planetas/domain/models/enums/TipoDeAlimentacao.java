package com.ultrasandbox.planetas.domain.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum TipoDeAlimentacao {
    CARNIVORO("CARNIVORO"),
    ONIVORO("ONIVORO"),
    HERBIVOROS("HERBIVOROS"),
    FOTOSINTESE("FOTOSINTESE");

    private final String valor;

    public static TipoDeAlimentacao entryOf(String valor) {
        return Arrays.stream(TipoDeAlimentacao.values())
                .filter(tipo -> tipo.getValor().equals(valor))
                .findFirst()
                .orElse(null);
    }

    public static boolean exists(String valor) {
        return Arrays.stream(TipoDeAlimentacao.values())
                .anyMatch(tipo -> tipo.getValor().equals(valor));
    }
}
