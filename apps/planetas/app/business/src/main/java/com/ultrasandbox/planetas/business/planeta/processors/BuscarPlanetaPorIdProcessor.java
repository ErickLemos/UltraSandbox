package com.ultrasandbox.planetas.business.planeta.processors;

import com.ultrasandbox.planetas.business.planeta.operations.BuscarPlanetaPorIdOperation;
import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.core.utils.Processor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarPlanetaPorIdProcessor implements Processor<BuscarPlanetaPorIdOperation, BuscarPlanetaPorIdOperation> {

    private final PlanetaRepository repository;

    @Override
    public BuscarPlanetaPorIdOperation process(BuscarPlanetaPorIdOperation operation) {
        var planeta = repository.buscarPorId(operation.getPlaneta().getId());
        operation.setPlaneta(planeta);
        return operation;
    }

}
