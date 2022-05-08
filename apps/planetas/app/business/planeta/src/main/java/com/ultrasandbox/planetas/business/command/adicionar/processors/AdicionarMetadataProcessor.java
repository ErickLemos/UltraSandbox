package com.ultrasandbox.planetas.business.command.adicionar.processors;

import com.ultrasandbox.planetas.business.command.adicionar.AdicionarPlanetaOperation;
import com.ultrasandbox.planetas.core.business.actions.MetadataActions;
import com.ultrasandbox.planetas.core.utils.Processor;
import com.ultrasandbox.planetas.domain.models.Metadata;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarMetadataProcessor implements Processor<AdicionarPlanetaOperation, AdicionarPlanetaOperation> {

    private final MetadataActions metadataActions;

    @Override
    public AdicionarPlanetaOperation process(AdicionarPlanetaOperation operation) {
        metadataActions.salvar(operation.getPlaneta(), new Metadata());
        return operation;
    }

}
