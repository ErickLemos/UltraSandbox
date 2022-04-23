package com.ultrasandbox.planetas.repository.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PlanetaEntity {

    @Id
    private String id;
    private String nome;

}
