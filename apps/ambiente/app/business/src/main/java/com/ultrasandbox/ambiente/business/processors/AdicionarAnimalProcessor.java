package com.ultrasandbox.ambiente.business.processors;

import com.ultrasandbox.ambiente.core.repository.AnimalRepository;
import com.ultrasandbox.ambiente.core.utils.Processor;
import com.ultrasandbox.ambiente.domain.models.Animal;
import org.springframework.stereotype.Component;

@Component
public record AdicionarAnimalProcessor(
        AnimalRepository animalRepository
) implements Processor<Animal, Animal> {

    @Override
    public Animal process(Animal animal) {
        return animalRepository.save(animal);
    }

}
