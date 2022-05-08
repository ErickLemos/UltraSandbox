package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.entitys.metadata.MetadataEntity;
import com.ultrasandbox.planetas.repository.entitys.planeta.PlanetaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MetadataMongoRepository extends MongoRepository<MetadataEntity, String> {
    Optional<MetadataEntity> findByPlaneta(PlanetaEntity planeta);
}
