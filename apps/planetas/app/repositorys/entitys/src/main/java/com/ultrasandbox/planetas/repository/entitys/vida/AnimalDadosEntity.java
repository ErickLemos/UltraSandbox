package com.ultrasandbox.planetas.repository.entitys.vida;

import com.ultrasandbox.planetas.repository.entitys.vida.utils.VidaDadosEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vida_dados")
public class AnimalDadosEntity implements VidaDadosEntity {

    @Id
    private String id;

}
