package com.ultrasandbox.ambiente.repository.models.entitys;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PlantaEntity {

    @Id
    private String id;
    private String nome;

}
