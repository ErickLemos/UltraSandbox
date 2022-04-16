package com.ultrasandbox.ambiente.rest.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MensagemDto {

    @JsonProperty("mensagem")
    private String mensagem;

}
