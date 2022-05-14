package com.ultrasandbox.planetas.domain.models.eventos.tipos;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeEvento;
import com.ultrasandbox.planetas.domain.models.eventos.Evento;
import lombok.Data;

@Data
public class EventoAstronomico implements Evento {

    private String id;
    private TipoDeEvento tipo;

}
