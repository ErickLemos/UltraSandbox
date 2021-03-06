package com.ultrasandbox.planetas.business.command.deletar;

import com.ultrasandbox.planetas.business.command.deletar.processors.DeletarMetadataProcessor;
import com.ultrasandbox.planetas.business.command.deletar.processors.DeletarPlanetaPorIdProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarPlanetaPorIdCommand {

    private final DeletarPlanetaPorIdProcessor deletarPlanetaPorIdProcessor;
    private final DeletarMetadataProcessor deletarMetadataProcessor;

    public void process(String id) {
        var operation = new DeletarPlanetaPorIdOperation();
        operation.setId(id);

        Pipeline.of(operation)
                .process(deletarMetadataProcessor)
                .process(deletarPlanetaPorIdProcessor);
    }

}
