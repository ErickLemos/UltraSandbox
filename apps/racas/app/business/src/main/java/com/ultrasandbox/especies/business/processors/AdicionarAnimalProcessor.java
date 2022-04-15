package com.ultrasandbox.racas.business.processors;

import com.ultrasandbox.racas.core.repository.AnimalRepository;
import com.ultrasandbox.racas.core.utils.Processor;
import com.ultrasandbox.racas.domain.models.Animal;
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
