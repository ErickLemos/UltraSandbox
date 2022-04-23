package com.ultrasandbox.planetas.business.planeta.commands;

import com.ultrasandbox.planetas.business.planeta.operations.AdicionarPlanetaOperation;
import com.ultrasandbox.planetas.business.planeta.processors.AdicionarPlanetaProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarPlanetaCommand {

    private AdicionarPlanetaProcessor adicionarPlanetaProcessor;

    public Planeta process(Planeta planeta) {
        var operation = new AdicionarPlanetaOperation();
        operation.setPlaneta(planeta);

        return Pipeline.of(operation)
                .process(adicionarPlanetaProcessor)
                .getOutput().getPlaneta();
    }

}
