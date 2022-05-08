package com.ultrasandbox.planetas.repository.adapters;

import com.ultrasandbox.planetas.core.exceptions.NotFoundException;
import com.ultrasandbox.planetas.core.repository.MetadataRepository;
import com.ultrasandbox.planetas.domain.models.Metadata;
import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.repository.mappers.metadata.MetadataEntityMapper;
import com.ultrasandbox.planetas.repository.mappers.planeta.PlanetaEntityMapper;
import com.ultrasandbox.planetas.repository.repositorys.MetadataMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MetadataRepositoryImpl implements MetadataRepository {

    private final MetadataMongoRepository repository;

    @Override
    public Metadata buscarPorId(String id) {
        var entity = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("metadata não foi encontrada"));

        return MetadataEntityMapper.INSTANCE.toDomain(entity);
    }

    @Override
    public Metadata buscarPorPlaneta(Planeta planeta) {
        var planetaEntity = PlanetaEntityMapper.INSTANCE.toEntity(planeta);

        var entity = repository.findByPlaneta(planetaEntity)
                .orElseThrow(() -> new NotFoundException("metadata não foi encontrada"));

        return MetadataEntityMapper.INSTANCE.toDomain(entity);
    }

    @Override
    public Metadata salvar(Metadata metadata) {
        var entity = MetadataEntityMapper.INSTANCE.toEntity(metadata);
        var entitySalva = repository.save(entity);
        return MetadataEntityMapper.INSTANCE.toDomain(entitySalva);
    }

}
