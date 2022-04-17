package com.ultrasandbox.ambiente.business.planta.commands;

import com.ultrasandbox.ambiente.business.planta.models.DeletarPlantaOperation;
import com.ultrasandbox.ambiente.business.planta.processors.DeletarPlantaProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeletarPlantaCommand {

    private DeletarPlantaProcessor deletarPlantaProcessor;

    public void process(String id) {
        var operation = new DeletarPlantaOperation();
        operation.setId(id);

        Pipeline.of(operation).process(deletarPlantaProcessor);
    }

}
