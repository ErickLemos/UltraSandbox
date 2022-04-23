package com.ultrasandbox.planetas.business.processors;

import com.ultrasandbox.template.core.repository.AnimalRepository;
import com.ultrasandbox.template.core.utils.Processor;
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
