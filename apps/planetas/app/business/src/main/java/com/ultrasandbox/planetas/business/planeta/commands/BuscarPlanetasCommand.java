package com.ultrasandbox.planetas.business.planeta.commands;

import com.ultrasandbox.planetas.business.planeta.operations.BuscarPlanetasOperation;
import com.ultrasandbox.planetas.business.planeta.processors.BuscarPlanetasProcessor;
import com.ultrasandbox.planetas.core.utils.Pipeline;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarPlanetasCommand {

    private final BuscarPlanetasProcessor buscarPlanetasProcessor;

    public List<Planeta> process() {
        var operation = new BuscarPlanetasOperation();

        return Pipeline.of(operation)
                .process(buscarPlanetasProcessor)
                .getOutput()
                .getPlanetas();
    }

}
