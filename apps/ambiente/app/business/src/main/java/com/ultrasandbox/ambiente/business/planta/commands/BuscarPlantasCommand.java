package com.ultrasandbox.ambiente.business.planta.commands;

import com.ultrasandbox.ambiente.business.planta.models.BuscarPlantasOperation;
import com.ultrasandbox.ambiente.business.planta.processors.BuscarPlantaProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import com.ultrasandbox.ambiente.domain.models.Planta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BuscarPlantasCommand {

    private BuscarPlantaProcessor buscarPlantaProcessor;

    public List<Planta> process() {
        var operation = new BuscarPlantasOperation();

        return Pipeline.of(operation)
                .process(buscarPlantaProcessor)
                .getOutput()
                .getPlantas();
    }

}
