package com.ultrasandbox.planetas.domain.models.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoDeAnimal {
    MAMIFERO("MAMIFERO"),
    PEIXE("PEIXE"),
    AVE("AVE"),
    REPTIL("REPTIL"),
    MOLUSCO("MOLUSCO"),
    ANFIBIO("ANFIBIO");

    private final String valor;
}
