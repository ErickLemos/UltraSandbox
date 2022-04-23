package com.ultrasandbox.planetas.business.planeta.processors;

import com.ultrasandbox.planetas.business.planeta.operations.AdicionarPlanetaOperation;
import com.ultrasandbox.planetas.core.utils.Processor;
import org.springframework.stereotype.Component;

@Component
public class AdicionarPlanetaProcessor implements Processor<AdicionarPlanetaOperation, AdicionarPlanetaOperation> {

    @Override
    public AdicionarPlanetaOperation process(AdicionarPlanetaOperation operation) {
        return operation;
    }

}
