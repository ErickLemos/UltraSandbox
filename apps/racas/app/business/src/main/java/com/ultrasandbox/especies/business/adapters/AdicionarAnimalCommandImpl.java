package com.ultrasandbox.racas.business.adapters;

import com.ultrasandbox.racas.business.processors.AdicionarAnimalProcessor;
import com.ultrasandbox.racas.core.business.commands.AdicionarAnimalCommand;
import com.ultrasandbox.racas.core.utils.Pipeline;
import com.ultrasandbox.racas.domain.models.Animal;
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
