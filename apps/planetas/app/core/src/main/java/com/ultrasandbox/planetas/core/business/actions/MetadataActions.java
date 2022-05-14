package com.ultrasandbox.planetas.core.business.actions;

import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.domain.models.metadata.Metadata;

public interface MetadataActions {

    Metadata buscarPorId(String id);

    Metadata buscarPorPlaneta(Planeta planeta);

    Metadata salvar(Planeta planeta, Metadata metadata);

    void deletarPorId(String id);

}
