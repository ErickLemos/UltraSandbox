package com.ultrasandbox.planetas.repository.models.vida;

import com.ultrasandbox.planetas.repository.utils.VidaDadosEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vida_dados")
public class PlantaDadosEntity implements VidaDadosEntity {

    @Id
    private String id;

}
