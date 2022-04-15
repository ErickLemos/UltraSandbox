package com.ultrasandbox.especies.domain.models;

import com.ultrasandbox.especies.domain.interfaces.Raca;
import lombok.Data;

@Data
public class RacaInteligente implements Raca {
    private String nome;
}
