package com.ultrasandbox.ambiente.core.repository;

import com.ultrasandbox.ambiente.domain.models.Planta;

import java.util.List;

public interface PlantaRepository {

    List<Planta> buscarVarios();

    Planta buscarPorId(String id);

    Planta salvar(Planta planta);

    void deletarPorId(String id);

}
