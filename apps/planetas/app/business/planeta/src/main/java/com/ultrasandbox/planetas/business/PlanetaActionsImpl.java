package com.ultrasandbox.planetas.business;

import com.ultrasandbox.planetas.business.command.adicionar.AdicionarPlanetaCommand;
import com.ultrasandbox.planetas.business.command.deletar.DeletarPlanetaPorIdCommand;
import com.ultrasandbox.planetas.business.command.editar.EditarPlanetaCommand;
import com.ultrasandbox.planetas.business.querys.BuscarPlanetaPorIdQuery;
import com.ultrasandbox.planetas.business.querys.BuscarPlanetasQuery;
import com.ultrasandbox.planetas.core.business.actions.PlanetaActions;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class PlanetaActionsImpl implements PlanetaActions {

    private final BuscarPlanetasQuery buscarPlanetasQuery;
    private final BuscarPlanetaPorIdQuery buscarPlanetaPorIdQuery;

    private final AdicionarPlanetaCommand adicionarPlanetaCommand;
    private final EditarPlanetaCommand editarPlanetaCommand;
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
        return Objects.isNull(planeta.getId()) ?
                adicionarPlanetaCommand.process(planeta) :
                editarPlanetaCommand.process(planeta);
    }

    @Override
    public void deletarPorId(String id) {
        deletarPlanetaPorIdCommand.process(id);
    }

}
