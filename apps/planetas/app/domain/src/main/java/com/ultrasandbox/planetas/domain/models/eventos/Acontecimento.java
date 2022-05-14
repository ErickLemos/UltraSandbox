package com.ultrasandbox.planetas.domain.models.eventos;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeAcontecimento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Acontecimento {

    private String id;
    private TipoDeAcontecimento tipo;
    private Object dadosExtras;

}
