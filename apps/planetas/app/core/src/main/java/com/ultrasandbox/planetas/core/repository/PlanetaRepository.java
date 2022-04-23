package com.ultrasandbox.planetas.core.repository;

import com.ultrasandbox.planetas.domain.models.Planeta;

import java.util.List;

public interface PlanetaRepository {

    List<Planeta> buscar();

    Planeta buscarPorId(String id);

    Planeta salvar(Planeta planeta);

    void deletarPorId(String id);

}
