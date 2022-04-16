package com.ultrasandbox.ambiente.business.animal.commands;

import com.ultrasandbox.ambiente.business.animal.models.SalvarAnimalOperation;
import com.ultrasandbox.ambiente.business.animal.processors.SalvarAnimalProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import com.ultrasandbox.ambiente.domain.models.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SalvarAnimalCommand {

    private SalvarAnimalProcessor salvarAnimalProcessor;

    public Animal process(Animal animal) {
        var operation = new SalvarAnimalOperation();
        operation.setAnimal(animal);

        return Pipeline.of(operation)
                .process(salvarAnimalProcessor)
                .getOutput()
                .getAnimal();
    }

}
