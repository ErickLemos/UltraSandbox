package com.ultrasandbox.planetas.repository.models.vida;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vidas_dados")
public class DadosPlantaEntity implements VidaDadosEntity {

    @Id
    private String id;

}
