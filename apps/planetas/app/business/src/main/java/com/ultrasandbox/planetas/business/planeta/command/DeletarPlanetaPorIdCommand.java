package com.ultrasandbox.planetas.business.planeta.command;

import com.ultrasandbox.planetas.business.planeta.command.operations.DeletarPlanetaPorIdOperation;
import com.ultrasandbox.planetas.business.planeta.command.processors.DeletarPlanetaPorIdProcessor;
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
