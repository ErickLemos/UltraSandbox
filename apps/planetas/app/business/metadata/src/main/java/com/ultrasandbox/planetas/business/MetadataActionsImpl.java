package com.ultrasandbox.planetas.business;

import com.ultrasandbox.planetas.core.business.actions.MetadataActions;
import com.ultrasandbox.planetas.domain.models.Metadata;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MetadataActionsImpl implements MetadataActions {

    @Override
    public Metadata buscarPorId(String id) {
        return null;
    }

    @Override
    public Metadata buscarPorPlaneta(Planeta planeta) {
        return null;
    }

    @Override
    public Metadata salvar(Planeta planeta, Metadata metadata) {
        return null;
    }

    @Override
    public void deletarPorId(String id) {

    }

}
