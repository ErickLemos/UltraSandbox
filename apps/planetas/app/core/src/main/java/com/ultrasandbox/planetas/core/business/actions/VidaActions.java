package com.ultrasandbox.planetas.core.business.actions;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.Vida;

import java.util.List;

public interface VidaActions {

    List<Vida> buscar();

    Vida buscarPorId(String id);

    Vida buscarPorTipo(TipoDeVida tipo);

    Vida salvar(Vida vida);

    void deletarPorId(String id);

}
