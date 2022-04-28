package com.ultrasandbox.planetas.repository.repositorys.vida;

import com.ultrasandbox.planetas.repository.models.vida.PlantaDadosEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaPlantaDadosMongoRepository extends MongoRepository<PlantaDadosEntity, String> {
}
