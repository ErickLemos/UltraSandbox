package com.ultrasandbox.planetas.business.command.adicionar.processors;

import com.ultrasandbox.planetas.business.command.adicionar.AdicionarPlanetaOperation;
import com.ultrasandbox.planetas.core.repository.MetadataRepository;
import com.ultrasandbox.planetas.core.utils.Processor;
import com.ultrasandbox.planetas.domain.models.Metadata;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarMetadataProcessor implements Processor<AdicionarPlanetaOperation, AdicionarPlanetaOperation> {

    private final MetadataRepository repository;

    @Override
    public AdicionarPlanetaOperation process(AdicionarPlanetaOperation operation) {
        repository.salvar(operation.getPlaneta(), new Metadata());
        return operation;
    }

}
