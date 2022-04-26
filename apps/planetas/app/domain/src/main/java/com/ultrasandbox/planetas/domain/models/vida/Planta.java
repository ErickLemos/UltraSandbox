package com.ultrasandbox.planetas.domain.models.vida;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.dados.DadosPlanta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Planta implements Vida {

    private String id;
    private String nome;
    private TipoDeVida tipo = TipoDeVida.PLANTA;
    private DadosPlanta dados;

}
