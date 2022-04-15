package com.ultrasandbox.ambiente.core.business.commands;

import com.ultrasandbox.ambiente.domain.models.Animal;

public interface AdicionarAnimalCommand {
    Animal execute(Animal animal);
}
