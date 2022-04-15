package com.spacesandbox.template.business.adapters;

import com.spacesandbox.template.business.processors.AdicionarAnimalProcessor;
import com.spacesandbox.template.core.business.commands.AdicionarAnimalCommand;
import com.spacesandbox.template.core.utils.Pipeline;
import com.spacesandbox.template.domain.models.Animal;
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
