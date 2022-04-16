package com.ultrasandbox.ambiente.business.animal.commands;

import com.ultrasandbox.ambiente.business.animal.models.BuscarAnimalOperation;
import com.ultrasandbox.ambiente.business.animal.processors.BuscarAnimalProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import com.ultrasandbox.ambiente.domain.models.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BuscarAnimalCommand {

    private BuscarAnimalProcessor buscarAnimalProcessor;

    public Animal process(String id) {
        var operation = new BuscarAnimalOperation();
        operation.setId(id);

        return Pipeline.of(operation)
                .process(buscarAnimalProcessor)
                .getOutput()
                .getAnimais()
                .get(0);
    }

}
