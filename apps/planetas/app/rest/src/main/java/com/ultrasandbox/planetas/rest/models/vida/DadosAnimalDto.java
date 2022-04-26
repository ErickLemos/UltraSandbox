package com.ultrasandbox.planetas.rest.models.vida;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosAnimalDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("tipo_de_animal")
    private String tipoDeAnimal;

    @JsonProperty("tipo_de_alimentacao")
    private List<String> tipoDeAlimentacao;

}
