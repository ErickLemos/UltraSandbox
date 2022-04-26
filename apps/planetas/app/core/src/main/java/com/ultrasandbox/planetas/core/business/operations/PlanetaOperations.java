package com.ultrasandbox.planetas.core.business.operations;

import com.ultrasandbox.planetas.domain.models.Planeta;

import java.util.List;

public interface PlanetaOperations {

    List<Planeta> buscar();

    Planeta buscarPorId(String id);

    Planeta salvar(Planeta planeta);

    void deletarPorId(String id);

}
