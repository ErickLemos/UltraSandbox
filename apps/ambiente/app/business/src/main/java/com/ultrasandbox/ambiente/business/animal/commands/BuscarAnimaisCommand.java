package com.ultrasandbox.ambiente.business.animal.commands;

import com.ultrasandbox.ambiente.business.animal.models.BuscarAnimalOperation;
import com.ultrasandbox.ambiente.business.animal.processors.BuscarAnimalProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import com.ultrasandbox.ambiente.domain.models.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BuscarAnimaisCommand {

    private BuscarAnimalProcessor buscarAnimalProcessor;

    public List<Animal> process() {
        var operation = new BuscarAnimalOperation();

        return Pipeline.of(operation)
                .process(buscarAnimalProcessor)
                .getOutput()
                .getAnimais();
    }

}
