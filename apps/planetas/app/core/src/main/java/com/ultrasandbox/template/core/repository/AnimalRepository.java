package com.ultrasandbox.template.core.repository;

import com.ultrasandbox.template.domain.models.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();
    Animal findById(String id);
    Animal save(Animal animal);
}
