package com.ultrasandbox.planetas.domain.models.eventos;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeEvento;

public interface Evento {
    String getId();

    TipoDeEvento getTipo();
}
