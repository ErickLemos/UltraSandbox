package com.ultrasandbox.planetas.business.planeta;

import com.ultrasandbox.planetas.business.planeta.commands.AdicionarPlanetaCommand;
import com.ultrasandbox.planetas.business.planeta.commands.BuscarPlanetaPorIdCommand;
import com.ultrasandbox.planetas.business.planeta.commands.BuscarPlanetasCommand;
import com.ultrasandbox.planetas.business.planeta.commands.DeletarPlanetaPorIdCommand;
import com.ultrasandbox.planetas.core.business.commands.PlanetaCommands;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlanetaCommandsImpl implements PlanetaCommands {

    private final AdicionarPlanetaCommand adicionarPlanetaCommand;
    private final BuscarPlanetaPorIdCommand buscarPlanetaPorIdCommand;
    private final BuscarPlanetasCommand buscarPlanetasCommand;
    private final DeletarPlanetaPorIdCommand deletarPlanetaPorIdCommand;

    @Override
    public List<Planeta> buscar() {
        return buscarPlanetasCommand.process();
    }

    @Override
    public Planeta buscarPorId(String id) {
        return buscarPlanetaPorIdCommand.process(id);
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
