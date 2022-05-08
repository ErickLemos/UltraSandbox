package com.ultrasandbox.planetas.repository.commands;

import com.ultrasandbox.planetas.core.exceptions.FactoryException;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.repository.repositorys.VidaAnimalDadosMongoRepository;
import com.ultrasandbox.planetas.repository.repositorys.VidaPlantaDadosMongoRepository;
import com.ultrasandbox.planetas.repository.entitys.vida.utils.VidaDadosEntity;
import com.ultrasandbox.planetas.repository.entitys.vida.AnimalDadosEntity;
import com.ultrasandbox.planetas.repository.entitys.vida.PlantaDadosEntity;
import org.springframework.stereotype.Component;

@Component
public record SalvarVidaDadosCommand(
        VidaPlantaDadosMongoRepository dadosPlantaRepository,
        VidaAnimalDadosMongoRepository dadosAnimalRepository) {

    public VidaDadosEntity process(VidaDadosEntity dados, TipoDeVida tipo) {
        if (tipo == TipoDeVida.ANIMAL) return dadosAnimalRepository.save((AnimalDadosEntity) dados);
        if (tipo == TipoDeVida.PLANTA) return dadosPlantaRepository.save((PlantaDadosEntity) dados);
        throw new FactoryException();
    }

}
