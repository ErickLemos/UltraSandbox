package com.ultrasandbox.planetas.repository.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeAlimentacao;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeAnimal;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "vidas_dados")
public class DadosAnimalEntity implements VidaDadosEntity {

    @Id
    private String id;

    @Field("tipo_de_animal")
    private TipoDeAnimal tipoDeAnimal;

    @Field("tipo_de_alimentacao")
    private List<TipoDeAlimentacao> tipoDeAlimentacao;

}
