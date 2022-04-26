package com.ultrasandbox.planetas.business.planeta.command.processors;

import com.ultrasandbox.planetas.business.planeta.command.operations.DeletarPlanetaPorIdOperation;
import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.core.utils.Processor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarPlanetaPorIdProcessor implements Processor<DeletarPlanetaPorIdOperation, DeletarPlanetaPorIdOperation> {

    private final PlanetaRepository repository;

    @Override
    public DeletarPlanetaPorIdOperation process(DeletarPlanetaPorIdOperation operation) {
        repository.deletarPorId(operation.getId());
        return operation;
    }

}
