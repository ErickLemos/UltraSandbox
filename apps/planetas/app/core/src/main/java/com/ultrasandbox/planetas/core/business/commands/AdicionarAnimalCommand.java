package com.ultrasandbox.planetas.core.business.commands;

import com.ultrasandbox.planetas.domain.models.vida.Animal;

public interface AdicionarAnimalCommand {
    Animal execute(Animal animal);
}
