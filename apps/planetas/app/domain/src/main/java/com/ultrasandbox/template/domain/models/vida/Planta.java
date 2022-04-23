package com.ultrasandbox.template.domain.models.vida;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Planta implements Vida {

    private String id;
    private String nome;

}
