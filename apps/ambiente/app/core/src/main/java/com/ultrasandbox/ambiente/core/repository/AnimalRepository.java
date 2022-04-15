package com.ultrasandbox.ambiente.core.repository;

import com.ultrasandbox.ambiente.domain.models.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();
    Animal findById(String id);
    Animal save(Animal animal);
}
