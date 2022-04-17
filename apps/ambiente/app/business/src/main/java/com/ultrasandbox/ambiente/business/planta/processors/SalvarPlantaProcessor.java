package com.ultrasandbox.ambiente.business.planta.processors;

import com.ultrasandbox.ambiente.business.planta.models.SalvarPlantaOperation;
import com.ultrasandbox.ambiente.core.repository.PlantaRepository;
import com.ultrasandbox.ambiente.core.utils.Processor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SalvarPlantaProcessor implements Processor<SalvarPlantaOperation, SalvarPlantaOperation> {

    private PlantaRepository repository;

    @Override
    public SalvarPlantaOperation process(SalvarPlantaOperation operation) {
        var plantaSalva = repository.salvar(operation.getPlanta());
        operation.setPlanta(plantaSalva);
        return operation;
    }

}
