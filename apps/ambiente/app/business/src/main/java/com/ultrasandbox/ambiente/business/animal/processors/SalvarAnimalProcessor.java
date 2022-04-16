package com.ultrasandbox.ambiente.business.animal.processors;

import com.ultrasandbox.ambiente.business.animal.models.SalvarAnimalOperation;
import com.ultrasandbox.ambiente.core.repository.AnimalRepository;
import com.ultrasandbox.ambiente.core.utils.Processor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SalvarAnimalProcessor implements Processor<SalvarAnimalOperation, SalvarAnimalOperation> {

    private AnimalRepository repository;

    @Override
    public SalvarAnimalOperation process(SalvarAnimalOperation operation) {
        var animalSalvo = repository.salvar(operation.getAnimal());
        operation.setAnimal(animalSalvo);
        return operation;
    }

}
