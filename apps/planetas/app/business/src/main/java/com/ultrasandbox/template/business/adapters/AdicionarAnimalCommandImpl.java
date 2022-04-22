package com.ultrasandbox.template.business.adapters;

import com.ultrasandbox.template.business.processors.AdicionarAnimalProcessor;
import com.ultrasandbox.template.core.business.commands.AdicionarAnimalCommand;
import com.ultrasandbox.template.core.utils.Pipeline;
import com.ultrasandbox.template.domain.models.Animal;
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
