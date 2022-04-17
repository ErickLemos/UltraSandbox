package com.ultrasandbox.ambiente.business.planta;

import com.ultrasandbox.ambiente.business.planta.commands.BuscarPlantaCommand;
import com.ultrasandbox.ambiente.business.planta.commands.BuscarPlantasCommand;
import com.ultrasandbox.ambiente.business.planta.commands.DeletarPlantaCommand;
import com.ultrasandbox.ambiente.business.planta.commands.SalvarPlantaCommand;
import com.ultrasandbox.ambiente.core.business.animal.PlantaCommands;
import com.ultrasandbox.ambiente.domain.models.Planta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PlantaCommandsImpl implements PlantaCommands {

    private BuscarPlantasCommand buscarPlantasCommand;
    private BuscarPlantaCommand buscarPlantaCommand;
    private SalvarPlantaCommand salvarPlantaCommand;
    private DeletarPlantaCommand deletarPlantaCommand;

    @Override
    public List<Planta> buscarVarios() {
        return buscarPlantasCommand.process();
    }

    @Override
    public Planta buscarPorId(String id) {
        return buscarPlantaCommand.process(id);
    }

    @Override
    public Planta salvar(Planta planta) {
        return salvarPlantaCommand.process(planta);
    }

    @Override
    public void deletarPorId(String id) {
        deletarPlantaCommand.process(id);
    }
}
