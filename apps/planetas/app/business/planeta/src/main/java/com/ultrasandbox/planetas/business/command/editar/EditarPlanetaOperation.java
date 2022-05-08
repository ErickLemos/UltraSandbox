package com.ultrasandbox.planetas.business.command.editar;

import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.Data;

@Data
public class EditarPlanetaOperation {

    private Planeta planeta;

}
