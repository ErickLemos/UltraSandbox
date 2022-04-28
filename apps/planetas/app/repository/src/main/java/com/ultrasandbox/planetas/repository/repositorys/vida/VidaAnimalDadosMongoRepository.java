package com.ultrasandbox.planetas.repository.repositorys.vida;

import com.ultrasandbox.planetas.repository.models.vida.AnimalDadosEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaAnimalDadosMongoRepository extends MongoRepository<AnimalDadosEntity, String> {
}
