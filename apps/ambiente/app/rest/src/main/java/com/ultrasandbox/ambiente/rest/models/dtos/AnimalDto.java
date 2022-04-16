package com.ultrasandbox.ambiente.rest.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AnimalDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

}
