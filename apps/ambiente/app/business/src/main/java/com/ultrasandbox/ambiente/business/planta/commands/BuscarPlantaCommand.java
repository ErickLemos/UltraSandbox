package com.ultrasandbox.ambiente.business.planta.commands;

import com.ultrasandbox.ambiente.business.planta.models.BuscarPlantasOperation;
import com.ultrasandbox.ambiente.business.planta.processors.BuscarPlantaProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import com.ultrasandbox.ambiente.domain.models.Planta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BuscarPlantaCommand {

    private BuscarPlantaProcessor buscarPlantaProcessor;

    public Planta process(String id) {
        var operation = new BuscarPlantasOperation();
        operation.setId(id);

        return Pipeline.of(operation)
                .process(buscarPlantaProcessor)
                .getOutput()
                .getPlantas()
                .get(0);
    }
}
