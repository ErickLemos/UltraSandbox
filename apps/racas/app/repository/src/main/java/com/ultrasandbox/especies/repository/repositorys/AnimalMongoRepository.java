package com.ultrasandbox.racas.repository.repositorys;

import com.ultrasandbox.racas.repository.models.AnimalEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalMongoRepository extends MongoRepository<AnimalEntity, String> {
}
