package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.entitys.vida.VidaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaMongoRepository extends MongoRepository<VidaEntity, String> {
}
