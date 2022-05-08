package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.entitys.vida.AnimalDadosEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaAnimalDadosMongoRepository extends MongoRepository<AnimalDadosEntity, String> {
}
