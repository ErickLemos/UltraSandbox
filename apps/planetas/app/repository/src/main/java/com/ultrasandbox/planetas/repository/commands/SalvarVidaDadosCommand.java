package com.ultrasandbox.planetas.repository.commands;

import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.repository.models.vida.AnimalDadosEntity;
import com.ultrasandbox.planetas.repository.models.vida.PlantaDadosEntity;
import com.ultrasandbox.planetas.repository.repositorys.vida.VidaAnimalDadosMongoRepository;
import com.ultrasandbox.planetas.repository.repositorys.vida.VidaPlantaDadosMongoRepository;
import com.ultrasandbox.planetas.repository.utils.VidaDadosEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SalvarVidaDadosCommand {

    private final VidaPlantaDadosMongoRepository dadosPlantaRepository;
    private final VidaAnimalDadosMongoRepository dadosAnimalRepository;

    public VidaDadosEntity process(VidaDadosEntity dados, TipoDeVida tipo) {
        if (tipo == TipoDeVida.ANIMAL) return dadosAnimalRepository.save((AnimalDadosEntity) dados);
        if (tipo == TipoDeVida.PLANTA) return dadosPlantaRepository.save((PlantaDadosEntity) dados);
        throw new RuntimeException();
    }

}
