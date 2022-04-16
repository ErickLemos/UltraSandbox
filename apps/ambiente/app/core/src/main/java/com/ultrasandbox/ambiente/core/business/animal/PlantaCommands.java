package com.ultrasandbox.ambiente.core.business.animal;

import com.ultrasandbox.ambiente.domain.models.Planta;

import java.util.List;

public interface PlantaCommands {

    List<Planta> buscarVarios();

    Planta buscarPorId(String id);

    Planta salvar(Planta animal);

    void deletarPorId(String id);

}
