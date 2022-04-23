package com.ultrasandbox.planetas.business.planeta.operations;

import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.Data;

import java.util.List;

@Data
public class BuscarPlanetasOperation {

    private List<Planeta> planetas;

}
