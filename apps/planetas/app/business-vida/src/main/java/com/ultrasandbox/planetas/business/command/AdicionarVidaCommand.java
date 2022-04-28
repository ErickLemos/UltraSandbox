package com.ultrasandbox.planetas.business.command;

import com.ultrasandbox.planetas.business.command.operations.AdicionarVidaOperation;
import com.ultrasandbox.planetas.business.command.processors.AdicionarVidaProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarVidaCommand {

    private final AdicionarVidaProcessor adicionarVidaProcessor;

    public Vida process(Vida vida) {
        var operation = new AdicionarVidaOperation();
        operation.setVida(vida);

        return Pipeline.of(operation)
                .process(adicionarVidaProcessor)
                .getOutput()
                .getVida();
    }

}
