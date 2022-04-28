package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.models.PlanetaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetaMongoRepository extends MongoRepository<PlanetaEntity, String> {
}
