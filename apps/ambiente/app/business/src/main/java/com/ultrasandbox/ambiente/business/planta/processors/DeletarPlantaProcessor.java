package com.ultrasandbox.ambiente.business.planta.processors;

import com.ultrasandbox.ambiente.business.planta.models.DeletarPlantaOperation;
import com.ultrasandbox.ambiente.core.repository.PlantaRepository;
import com.ultrasandbox.ambiente.core.utils.Processor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeletarPlantaProcessor implements Processor<DeletarPlantaOperation, DeletarPlantaOperation> {

    private PlantaRepository repository;

    @Override
    public DeletarPlantaOperation process(DeletarPlantaOperation operation) {
        repository.deletarPorId(operation.getId());
        return operation;
    }

}
