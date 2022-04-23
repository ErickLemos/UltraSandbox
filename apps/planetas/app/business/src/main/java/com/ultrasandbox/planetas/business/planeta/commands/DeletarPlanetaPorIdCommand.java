package com.ultrasandbox.planetas.business.planeta.commands;

import com.ultrasandbox.planetas.business.planeta.operations.DeletarPlanetaPorIdOperation;
import com.ultrasandbox.planetas.business.planeta.processors.DeletarPlanetaPorIdProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarPlanetaPorIdCommand {

    private final DeletarPlanetaPorIdProcessor deletarPlanetaPorIdProcessor;

    public void process(String id) {
        var operation = new DeletarPlanetaPorIdOperation();
        operation.setId(id);

        Pipeline.of(operation)
                .process(deletarPlanetaPorIdProcessor);
    }

}
