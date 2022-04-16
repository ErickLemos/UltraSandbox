package com.ultrasandbox.ambiente.business.animal;

import com.ultrasandbox.ambiente.business.animal.commands.BuscarAnimaisCommand;
import com.ultrasandbox.ambiente.business.animal.commands.BuscarAnimalCommand;
import com.ultrasandbox.ambiente.business.animal.commands.DeletarAnimalCommand;
import com.ultrasandbox.ambiente.business.animal.commands.SalvarAnimalCommand;
import com.ultrasandbox.ambiente.core.business.animal.AnimalCommands;
import com.ultrasandbox.ambiente.domain.models.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AnimalCommandsImpl implements AnimalCommands {

    private BuscarAnimaisCommand buscarAnimaisCommand;
    private BuscarAnimalCommand buscarAnimalCommand;
    private SalvarAnimalCommand salvarAnimalCommand;
    private DeletarAnimalCommand deletarAnimalCommand;

    @Override
    public List<Animal> buscarVarios() {
        return buscarAnimaisCommand.process();
    }

    @Override
    public Animal buscarPorId(String id) {
        return buscarAnimalCommand.process(id);
    }

    @Override
    public Animal salvar(Animal animal) {
        return salvarAnimalCommand.process(animal);
    }

    @Override
    public void deletarPorId(String id) {
        deletarAnimalCommand.process(id);
    }

}
