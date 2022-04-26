package com.ultrasandbox.planetas.rest.models.vida;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VidaDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("dados")
    private Object dados;

}
