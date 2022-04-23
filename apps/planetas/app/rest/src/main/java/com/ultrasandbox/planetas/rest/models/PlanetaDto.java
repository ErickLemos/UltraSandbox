package com.ultrasandbox.planetas.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanetaDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("dados")
    private Object dados;

}
