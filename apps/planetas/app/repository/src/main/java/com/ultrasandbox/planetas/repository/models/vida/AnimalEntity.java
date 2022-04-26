package com.ultrasandbox.planetas.repository.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "vidas")
public class AnimalEntity implements VidaEntity {

    @Id
    private String id;

    @Field("nome")
    private String nome;

    @Field("tipo")
    private TipoDeVida tipo;

    @DBRef
    private DadosAnimalEntity dados;

    @Override
    public void setDadosEntity(VidaDadosEntity dados) {
        this.dados = (DadosAnimalEntity) dados;
    }

}
