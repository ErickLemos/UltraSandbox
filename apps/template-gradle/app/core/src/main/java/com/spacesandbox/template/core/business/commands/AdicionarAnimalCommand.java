package com.spacesandbox.template.core.business.commands;

import com.spacesandbox.template.domain.models.Animal;

public interface AdicionarAnimalCommand {
    Animal execute(Animal animal);
}
