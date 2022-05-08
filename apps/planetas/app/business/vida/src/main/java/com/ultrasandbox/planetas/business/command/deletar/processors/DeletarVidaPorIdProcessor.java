package com.ultrasandbox.planetas.business.command.deletar.processors;

import com.ultrasandbox.planetas.business.command.deletar.operations.DeletarVidaPorIdOperation;
import com.ultrasandbox.planetas.core.repository.VidaRepository;
import com.ultrasandbox.planetas.core.utils.Processor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarVidaPorIdProcessor implements Processor<DeletarVidaPorIdOperation, DeletarVidaPorIdOperation> {

    private final VidaRepository repository;

    @Override
    public DeletarVidaPorIdOperation process(DeletarVidaPorIdOperation operation) {
        repository.deletarPorId(operation.getId());
        return operation;
    }

}
