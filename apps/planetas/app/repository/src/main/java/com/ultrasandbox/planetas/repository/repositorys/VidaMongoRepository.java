package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.models.vida.VidaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaMongoRepository extends MongoRepository<VidaEntity, String> {
}
