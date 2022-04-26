package com.ultrasandbox.planetas.repository.repositorys;

import com.ultrasandbox.planetas.repository.models.vida.VidaDadosEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VidaDadosMongoRepository extends MongoRepository<VidaDadosEntity, String> {
}
