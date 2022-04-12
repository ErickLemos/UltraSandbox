package com.spacesandbox.template.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("patas")
    private Integer patas;

}
