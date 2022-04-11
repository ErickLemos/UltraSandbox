package com.sandbox.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class VersaoDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("numeroDaVersao")
    private String numeroDaVersao;

}
