package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.entitys.vida.PlantaDadosEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaPlantaDadosMongoRepository extends MongoRepository<PlantaDadosEntity, String> {
}
