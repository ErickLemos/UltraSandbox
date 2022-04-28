package com.ultrasandbox.planetas.business.command.processors;

import com.ultrasandbox.planetas.business.command.operations.AdicionarVidaOperation;
import com.ultrasandbox.planetas.core.repository.VidaRepository;
import com.ultrasandbox.planetas.core.utils.Processor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarVidaProcessor implements Processor<AdicionarVidaOperation, AdicionarVidaOperation> {

    private final VidaRepository repository;

    @Override
    public AdicionarVidaOperation process(AdicionarVidaOperation operation) {
        var vida = repository.salvar(operation.getVida());
        operation.setVida(vida);
        return operation;
    }

}
