package com.ultrasandbox.planetas.business.adapters;

import com.ultrasandbox.planetas.business.processors.AdicionarAnimalProcessor;
import com.ultrasandbox.template.core.business.commands.AdicionarAnimalCommand;
import com.ultrasandbox.template.core.utils.Pipeline;
import org.springframework.stereotype.Component;

@Component
public record AdicionarAnimalCommandImpl(
        AdicionarAnimalProcessor adicionarAnimalProcessor
) implements AdicionarAnimalCommand {

    @Override
    public Animal execute(Animal obj) {
        return Pipeline.of(obj)
                .process(adicionarAnimalProcessor)
                .getOutput();
    }

}
