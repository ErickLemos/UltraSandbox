package com.sandbox.template.repository.repositorys;

import com.sandbox.template.repository.model.VersaoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersaoRepositoryMongo extends MongoRepository<VersaoEntity, String> {
}
