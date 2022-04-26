package com.ultrasandbox.planetas.business.planeta;

import com.ultrasandbox.planetas.business.planeta.command.AdicionarPlanetaCommand;
import com.ultrasandbox.planetas.business.planeta.command.DeletarPlanetaPorIdCommand;
import com.ultrasandbox.planetas.business.planeta.querys.BuscarPlanetaPorIdQuery;
import com.ultrasandbox.planetas.business.planeta.querys.BuscarPlanetasQuery;
import com.ultrasandbox.planetas.core.business.operations.PlanetaOperations;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlanetaOperationsImpl implements PlanetaOperations {

    private final BuscarPlanetasQuery buscarPlanetasQuery;
    private final BuscarPlanetaPorIdQuery buscarPlanetaPorIdQuery;

    private final AdicionarPlanetaCommand adicionarPlanetaCommand;
    private final DeletarPlanetaPorIdCommand deletarPlanetaPorIdCommand;

    @Override
    public List<Planeta> buscar() {
        return buscarPlanetasQuery.process();
    }

    @Override
    public Planeta buscarPorId(String id) {
        return buscarPlanetaPorIdQuery.process(id);
    }

    @Override
    public Planeta salvar(Planeta planeta) {
        return adicionarPlanetaCommand.process(planeta);
    }

    @Override
    public void deletarPorId(String id) {
        deletarPlanetaPorIdCommand.process(id);
    }

}
