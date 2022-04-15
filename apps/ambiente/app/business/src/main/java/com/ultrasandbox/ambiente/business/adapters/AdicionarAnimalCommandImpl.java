package com.ultrasandbox.ambiente.business.adapters;

import com.ultrasandbox.ambiente.business.processors.AdicionarAnimalProcessor;
import com.ultrasandbox.ambiente.core.business.commands.AdicionarAnimalCommand;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import com.ultrasandbox.ambiente.domain.models.Animal;
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
