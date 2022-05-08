package com.ultrasandbox.planetas.business;

import com.ultrasandbox.planetas.core.business.actions.MetadataActions;
import com.ultrasandbox.planetas.core.repository.MetadataRepository;
import com.ultrasandbox.planetas.domain.models.Metadata;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MetadataActionsImpl implements MetadataActions {

    private final MetadataRepository repository;

    @Override
    public Metadata buscarPorId(String id) {
        return repository.buscarPorId(id);
    }

    @Override
    public Metadata buscarPorPlaneta(Planeta planeta) {
        return repository.buscarPorPlaneta(planeta);
    }

    @Override
    public Metadata salvar(Planeta planeta, Metadata metadata) {
        return repository.salvar(planeta, metadata);
    }

    @Override
    public void deletarPorId(String id) {
        repository.deletarPorId(id);
    }

}
