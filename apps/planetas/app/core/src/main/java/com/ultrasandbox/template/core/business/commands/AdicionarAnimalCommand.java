package com.ultrasandbox.template.core.business.commands;

import com.ultrasandbox.template.domain.models.Animal;

public interface AdicionarAnimalCommand {
    Animal execute(Animal animal);
}
