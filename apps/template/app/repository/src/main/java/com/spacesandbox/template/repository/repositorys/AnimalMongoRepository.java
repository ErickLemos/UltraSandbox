package com.spacesandbox.template.repository.repositorys;

import com.spacesandbox.template.repository.models.AnimalEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalMongoRepository extends MongoRepository<AnimalEntity, String> {
}
