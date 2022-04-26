package com.ultrasandbox.planetas.business.vida.command.processors;

import com.ultrasandbox.planetas.business.vida.command.operations.AdicionarVidaOperation;
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
