package com.ultrasandbox.planetas.repository.utils;

import com.ultrasandbox.planetas.core.exceptions.FactoryException;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.Animal;
import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import com.ultrasandbox.planetas.repository.mappers.VidaAnimalEntityMapper;
import com.ultrasandbox.planetas.repository.mappers.VidaPlantaEntityMapper;
import com.ultrasandbox.planetas.repository.models.VidaEntity;

public interface VidaMapperFactory {
    static Vida toDomain(VidaEntity entity) {
        if (entity.getTipo() == TipoDeVida.ANIMAL) return VidaAnimalEntityMapper.INSTANCE.toDomain(entity);
        if (entity.getTipo() == TipoDeVida.PLANTA) return VidaPlantaEntityMapper.INSTANCE.toDomain(entity);
        throw new FactoryException();
    }

    static VidaEntity toEntity(Vida vida) {
        if (vida.getTipo() == TipoDeVida.ANIMAL) return VidaAnimalEntityMapper.INSTANCE.toEntity((Animal) vida);
        if (vida.getTipo() == TipoDeVida.PLANTA) return VidaPlantaEntityMapper.INSTANCE.toEntity((Planta) vida);
        throw new FactoryException();
    }
}
