package com.ultrasandbox.ambiente.core.repository;

import com.ultrasandbox.ambiente.domain.models.Animal;
import com.ultrasandbox.ambiente.domain.models.Planta;

import java.util.List;

public interface PlantaRepository {

    List<Planta> buscarVarios();

    Planta buscarPorId(String id);

    Planta salvar(Animal animal);

    void deletarPorId(String id);

}
