package com.ultrasandbox.ambiente.business.planta.commands;

import com.ultrasandbox.ambiente.business.planta.models.SalvarPlantaOperation;
import com.ultrasandbox.ambiente.business.planta.processors.SalvarPlantaProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import com.ultrasandbox.ambiente.domain.models.Planta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SalvarPlantaCommand {

    private SalvarPlantaProcessor salvarPlantaProcessor;

    public Planta process(Planta planta) {
        var operation = new SalvarPlantaOperation();
        operation.setPlanta(planta);

        return Pipeline.of(operation)
                .process(salvarPlantaProcessor)
                .getOutput()
                .getPlanta();
    }

}
