package com.ultrasandbox.ambiente.core.repository;

import com.ultrasandbox.ambiente.domain.models.Animal;

import java.util.List;

public interface AnimalRepository {

    List<Animal> buscarVarios();

    Animal buscarPorId(String id);

    Animal salvar(Animal animal);

    void deletarPorId(String id);

}