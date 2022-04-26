package com.ultrasandbox.planetas.business.vida.command;

import com.ultrasandbox.planetas.business.vida.command.operations.DeletarVidaPorIdOperation;
import com.ultrasandbox.planetas.business.vida.command.processors.DeletarVidaPorIdProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarVidaPorIdCommand {

    private final DeletarVidaPorIdProcessor deletarVidaPorIdProcessor;

    public void process(String id) {
        var operation = new DeletarVidaPorIdOperation();
        operation.setId(id);

        Pipeline.of(operation)
                .process(deletarVidaPorIdProcessor);
    }

}
