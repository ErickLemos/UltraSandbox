package com.ultrasandbox.planetas.business.command;

import com.ultrasandbox.planetas.business.command.operations.AdicionarPlanetaOperation;
import com.ultrasandbox.planetas.business.command.processors.AdicionarPlanetaProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import com.ultrasandbox.planetas.domain.models.Planeta;
import org.springframework.stereotype.Component;

@Component
public record AdicionarPlanetaCommand(
        AdicionarPlanetaProcessor adicionarPlanetaProcessor) {

    public Planeta process(Planeta planeta) {
        var operation = new AdicionarPlanetaOperation();
        operation.setPlaneta(planeta);

        return Pipeline.of(operation)
                .process(adicionarPlanetaProcessor)
                .getOutput()
                .getPlaneta();
    }

}
