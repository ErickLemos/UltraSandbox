package com.ultrasandbox.ambiente.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private String id;
    private String nome;
    private Integer patas;

}
