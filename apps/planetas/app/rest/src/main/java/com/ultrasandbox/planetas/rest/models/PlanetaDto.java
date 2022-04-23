package com.ultrasandbox.planetas.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanetaDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

}
