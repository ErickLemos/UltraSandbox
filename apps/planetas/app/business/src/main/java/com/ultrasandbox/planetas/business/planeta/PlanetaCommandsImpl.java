package com.ultrasandbox.planetas.business.planeta;

import com.ultrasandbox.planetas.business.planeta.commands.AdicionarPlanetaCommand;
import com.ultrasandbox.planetas.core.business.commands.PlanetaCommands;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlanetaCommandsImpl implements PlanetaCommands {

    private AdicionarPlanetaCommand adicionarPlanetaCommand;

    @Override
    public List<Planeta> buscar() {
        return null;
    }

    @Override
    public Planeta buscarPorId(String id) {
        return null;
    }

    @Override
    public Planeta salvar(Planeta planeta) {
        return adicionarPlanetaCommand.process(planeta);
    }

    @Override
    public void deletarPorId(String id) {
        // TODO document why this method is empty
    }

}
