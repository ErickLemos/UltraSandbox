package com.ultrasandbox.racas.core.business.commands;

import com.ultrasandbox.racas.domain.models.Animal;

public interface AdicionarAnimalCommand {
    Animal execute(Animal animal);
}
