package com.ultrasandbox.planetas.rest.utils;

import com.ultrasandbox.planetas.core.exceptions.NotFoundException;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.Animal;
import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import com.ultrasandbox.planetas.rest.mappers.AnimalDtoMapper;
import com.ultrasandbox.planetas.rest.mappers.PlantaDtoMapper;
import com.ultrasandbox.planetas.rest.models.vida.VidaDto;
import org.springframework.stereotype.Component;

@Component
public class VidaMapper {

    public Vida toDomain(VidaDto dto) {
        if (dto.getTipo().equalsIgnoreCase("animal")) return AnimalDtoMapper.INSTANCE.toDomain(dto);
        if (dto.getTipo().equalsIgnoreCase("planta")) return PlantaDtoMapper.INSTANCE.toDomain(dto);
        throw new NotFoundException("tipo não foi encontrado");
    }

    public VidaDto toDto(Vida domain) {
        if (domain.getTipo() == TipoDeVida.ANIMAL) return AnimalDtoMapper.INSTANCE.toDto((Animal) domain);
        if (domain.getTipo() == TipoDeVida.PLANTA) return PlantaDtoMapper.INSTANCE.toDto((Planta) domain);
        throw new NotFoundException("tipo não foi encontrado");
    }

}
