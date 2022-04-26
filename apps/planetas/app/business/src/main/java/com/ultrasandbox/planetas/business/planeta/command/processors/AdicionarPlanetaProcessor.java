package com.ultrasandbox.planetas.business.planeta.command.processors;

import com.ultrasandbox.planetas.business.planeta.command.operations.AdicionarPlanetaOperation;
import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.core.utils.Processor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarPlanetaProcessor implements Processor<AdicionarPlanetaOperation, AdicionarPlanetaOperation> {

    private final PlanetaRepository repository;

    @Override
    public AdicionarPlanetaOperation process(AdicionarPlanetaOperation operation) {
        var planeta = repository.salvar(operation.getPlaneta());
        operation.setPlaneta(planeta);
        return operation;
    }

}
