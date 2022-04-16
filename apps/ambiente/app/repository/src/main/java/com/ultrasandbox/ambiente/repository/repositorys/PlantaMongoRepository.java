package com.ultrasandbox.ambiente.repository.repositorys;

import com.ultrasandbox.ambiente.repository.models.entitys.PlantaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaMongoRepository extends MongoRepository<PlantaEntity, String> {
}
