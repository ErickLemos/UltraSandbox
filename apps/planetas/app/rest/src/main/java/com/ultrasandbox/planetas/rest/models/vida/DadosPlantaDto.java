package com.ultrasandbox.planetas.rest.models.vida;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosPlantaDto {

    @JsonProperty("id")
    private String id;

}
