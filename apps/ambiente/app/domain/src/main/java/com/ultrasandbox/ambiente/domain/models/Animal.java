package com.ultrasandbox.ambiente.domain.models;

import com.ultrasandbox.ambiente.domain.interfaces.SerVivo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal implements SerVivo {

    private String id;
    private String nome;

}