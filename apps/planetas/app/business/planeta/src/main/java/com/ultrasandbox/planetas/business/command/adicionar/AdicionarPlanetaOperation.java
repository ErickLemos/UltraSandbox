package com.ultrasandbox.planetas.business.command.adicionar;

import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.Data;

@Data
public class AdicionarPlanetaOperation {

    private Planeta planeta;

}
