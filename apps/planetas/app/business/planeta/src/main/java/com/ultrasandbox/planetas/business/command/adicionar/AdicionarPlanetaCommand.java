package com.ultrasandbox.planetas.business.command.adicionar;

import com.ultrasandbox.planetas.business.command.adicionar.processors.AdicionarMetadataProcessor;
import com.ultrasandbox.planetas.business.command.adicionar.processors.AdicionarPlanetaProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import com.ultrasandbox.planetas.domain.models.Planeta;
import org.springframework.stereotype.Component;

@Component
public record AdicionarPlanetaCommand(
        AdicionarPlanetaProcessor adicionarPlanetaProcessor,
        AdicionarMetadataProcessor adicionarMetadataProcessor) {

    public Planeta process(Planeta planeta) {
        var operation = new AdicionarPlanetaOperation();
        operation.setPlaneta(planeta);

        return Pipeline.of(operation)
                .process(adicionarPlanetaProcessor)
                .process(adicionarMetadataProcessor)
                .getOutput()
                .getPlaneta();
    }

}
