package com.ultrasandbox.ambiente.repository.repositorys;

import com.ultrasandbox.ambiente.repository.models.AnimalEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalMongoRepository extends MongoRepository<AnimalEntity, String> {
}
