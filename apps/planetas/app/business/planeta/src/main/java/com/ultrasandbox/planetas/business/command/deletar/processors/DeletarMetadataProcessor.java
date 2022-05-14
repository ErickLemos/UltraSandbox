package com.ultrasandbox.planetas.business.command.deletar.processors;

import com.ultrasandbox.planetas.business.command.deletar.DeletarPlanetaPorIdOperation;
import com.ultrasandbox.planetas.core.business.actions.MetadataActions;
import com.ultrasandbox.planetas.core.utils.Processor;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarMetadataProcessor implements Processor<DeletarPlanetaPorIdOperation, DeletarPlanetaPorIdOperation> {

    private final MetadataActions metadataActions;

    @Override
    public DeletarPlanetaPorIdOperation process(DeletarPlanetaPorIdOperation operation) {
        var metadata = metadataActions.buscarPorPlaneta(Planeta.builder().id(operation.getId()).build());
        metadataActions.deletarPorId(metadata.getId());
        return operation;
    }

}
