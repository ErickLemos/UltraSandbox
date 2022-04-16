package com.ultrasandbox.ambiente.core.business.animal;

import com.ultrasandbox.ambiente.domain.models.Animal;

import java.util.List;

public interface AnimalCommands {

    List<Animal> buscarVarios();

    Animal buscarPorId(String id);

    Animal salvar(Animal animal);

    void deletarPorId(String id);

}
