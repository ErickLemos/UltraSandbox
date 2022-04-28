package com.ultrasandbox.planetas.domain.models.vida.dados;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeAlimentacao;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeAnimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalDados implements VidaDados {

    private String id;
    private TipoDeAnimal tipoDeAnimal;
    private List<TipoDeAlimentacao> tipoDeAlimentacao;

}
