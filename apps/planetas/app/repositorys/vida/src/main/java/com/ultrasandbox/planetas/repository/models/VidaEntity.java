package com.ultrasandbox.planetas.repository.models;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.repository.utils.VidaDadosEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vida")
public class VidaEntity {

    @Id
    private String id;
    private String nome;
    private TipoDeVida tipo;

    @DBRef
    private VidaDadosEntity dados;

}
