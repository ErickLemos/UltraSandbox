package com.ultrasandbox.ambiente.repository.repositorys;

import com.ultrasandbox.ambiente.repository.models.entitys.AnimalEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimalMongoRepository extends MongoRepository<AnimalEntity, String> {
}
