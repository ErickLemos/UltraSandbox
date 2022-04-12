package com.spacesandbox.template.business.processors;

import com.spacesandbox.template.core.repository.AnimalRepository;
import com.spacesandbox.template.core.utils.Processor;
import com.spacesandbox.template.domain.models.Animal;
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
