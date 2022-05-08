package com.ultrasandbox.planetas.business.command.editar;

import com.ultrasandbox.planetas.business.command.adicionar.AdicionarPlanetaOperation;
import com.ultrasandbox.planetas.business.command.editar.processors.EditarPlanetaProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import com.ultrasandbox.planetas.domain.models.Planeta;
import org.springframework.stereotype.Component;

@Component
public record EditarPlanetaCommand(
        EditarPlanetaProcessor editarPlanetaProcessor) {

    public Planeta process(Planeta planeta) {
        var operation = new AdicionarPlanetaOperation();
        operation.setPlaneta(planeta);

        return Pipeline.of(operation)
                .process(editarPlanetaProcessor)
                .getOutput()
                .getPlaneta();
    }

}
