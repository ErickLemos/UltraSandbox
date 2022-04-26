package com.ultrasandbox.planetas.repository.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;

public interface VidaEntity {

    String getId();

    String getNome();

    TipoDeVida getTipo();

    VidaDadosEntity getDados();

    void setDadosEntity(VidaDadosEntity dados);

}
