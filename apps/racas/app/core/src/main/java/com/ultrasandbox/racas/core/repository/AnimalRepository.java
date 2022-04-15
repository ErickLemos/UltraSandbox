package com.ultrasandbox.racas.core.repository;

import com.ultrasandbox.racas.domain.models.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();

    Animal findById(String id);

    Animal save(Animal animal);
}
