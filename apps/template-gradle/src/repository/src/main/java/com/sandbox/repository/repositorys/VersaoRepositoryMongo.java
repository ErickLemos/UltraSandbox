package com.sandbox.repository.repositorys;

import com.sandbox.repository.model.VersaoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersaoRepositoryMongo extends MongoRepository<VersaoEntity, String> {
}
