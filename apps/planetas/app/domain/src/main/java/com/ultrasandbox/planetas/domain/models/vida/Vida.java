package com.ultrasandbox.planetas.domain.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.dados.DadosVida;

public interface Vida {

    String getId();

    String getNome();

    TipoDeVida getTipo();

    DadosVida getDados();

}
