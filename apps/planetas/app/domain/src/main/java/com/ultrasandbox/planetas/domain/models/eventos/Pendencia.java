package com.ultrasandbox.planetas.domain.models.eventos;


import com.ultrasandbox.planetas.domain.models.enums.TipoDePendencia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pendencia {

    private String id;
    private TipoDePendencia tipo;
    private Object dadosExtras;

}
