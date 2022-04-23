package com.ultrasandbox.planetas.business.planeta.commands;

import com.ultrasandbox.planetas.business.planeta.operations.BuscarPlanetaPorIdOperation;
import com.ultrasandbox.planetas.business.planeta.processors.BuscarPlanetaPorIdProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import com.ultrasandbox.planetas.domain.models.Planeta;
import org.springframework.stereotype.Component;

@Component
public record BuscarPlanetaPorIdCommand(
        BuscarPlanetaPorIdProcessor buscarPlanetaPorIdProcessor) {

    public Planeta process(String id) {
        var operation = new BuscarPlanetaPorIdOperation();

        var planeta = new Planeta();
        planeta.setId(id);
        operation.setPlaneta(planeta);

        return Pipeline.of(operation)
                .process(buscarPlanetaPorIdProcessor)
                .getOutput()
                .getPlaneta();
    }

}
