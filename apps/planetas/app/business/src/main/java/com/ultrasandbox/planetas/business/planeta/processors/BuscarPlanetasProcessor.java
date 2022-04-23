package com.ultrasandbox.planetas.business.planeta.processors;

import com.ultrasandbox.planetas.business.planeta.operations.BuscarPlanetasOperation;
import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.core.utils.Processor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarPlanetasProcessor implements Processor<BuscarPlanetasOperation, BuscarPlanetasOperation> {

    private final PlanetaRepository repository;

    @Override
    public BuscarPlanetasOperation process(BuscarPlanetasOperation operation) {
        var planetas = repository.buscar();
        operation.setPlanetas(planetas);
        return operation;
    }

}
