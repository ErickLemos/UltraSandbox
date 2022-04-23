package com.ultrasandbox.planetas.domain.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;

public interface Vida {

    String getId();

    String getNome();

    TipoDeVida getTipo();

}
