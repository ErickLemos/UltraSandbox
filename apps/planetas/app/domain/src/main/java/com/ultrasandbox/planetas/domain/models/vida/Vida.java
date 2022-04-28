package com.ultrasandbox.planetas.domain.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.dados.VidaDados;

public interface Vida {

    String getId();

    String getNome();

    TipoDeVida getTipo();

    VidaDados getDados();

    void setDados(VidaDados dados);

}
