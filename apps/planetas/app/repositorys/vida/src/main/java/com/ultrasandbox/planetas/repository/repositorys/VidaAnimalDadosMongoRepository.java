package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.models.AnimalDadosEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaAnimalDadosMongoRepository extends MongoRepository<AnimalDadosEntity, String> {
}
