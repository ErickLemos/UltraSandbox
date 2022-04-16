package com.ultrasandbox.ambiente.business.animal.commands;

import com.ultrasandbox.ambiente.business.animal.models.DeletarAnimalOperation;
import com.ultrasandbox.ambiente.business.animal.processors.DeletarAnimalProcessor;
import com.ultrasandbox.ambiente.core.utils.Pipeline;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeletarAnimalCommand {

    private DeletarAnimalProcessor deletarAnimalProcessor;

    public void process(String id) {
        var operation = new DeletarAnimalOperation();
        operation.setId(id);

        Pipeline.of(operation)
                .process(deletarAnimalProcessor);
    }


}
