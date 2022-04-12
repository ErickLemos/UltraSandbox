package com.spacesandbox.template.domain.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Animal {

    private String id;
    private String nome;
    private Integer patas;

}
