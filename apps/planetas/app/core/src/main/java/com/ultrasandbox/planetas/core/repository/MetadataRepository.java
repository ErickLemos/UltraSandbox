package com.ultrasandbox.planetas.core.repository;

import com.ultrasandbox.planetas.domain.models.Metadata;
import com.ultrasandbox.planetas.domain.models.Planeta;

public interface MetadataRepository {

    Metadata buscarPorId(String id);

    Metadata buscarPorPlaneta(Planeta planeta);

    Planeta salvar(Planeta planeta);

}
