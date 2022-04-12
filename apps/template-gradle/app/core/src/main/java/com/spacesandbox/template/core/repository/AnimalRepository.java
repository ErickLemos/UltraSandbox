package com.spacesandbox.template.core.repository;

import com.spacesandbox.template.domain.models.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();
    Animal findById(String id);
    Animal save(Animal animal);
}
