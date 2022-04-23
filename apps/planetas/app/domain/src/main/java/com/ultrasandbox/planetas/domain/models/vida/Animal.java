package com.ultrasandbox.planetas.domain.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal implements Vida {

    private String id;
    private String nome;
    private TipoDeVida tipo = TipoDeVida.ANIMAL;

}
