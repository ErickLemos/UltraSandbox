package com.ultrasandbox.ambiente.business.animal.processors;

import com.ultrasandbox.ambiente.business.animal.models.DeletarAnimalOperation;
import com.ultrasandbox.ambiente.core.repository.AnimalRepository;
import com.ultrasandbox.ambiente.core.utils.Processor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeletarAnimalProcessor implements Processor<DeletarAnimalOperation, DeletarAnimalOperation> {

    private AnimalRepository repository;

    @Override
    public DeletarAnimalOperation process(DeletarAnimalOperation operation) {
        repository.deletarPorId(operation.getId());
        return operation;
    }

}
