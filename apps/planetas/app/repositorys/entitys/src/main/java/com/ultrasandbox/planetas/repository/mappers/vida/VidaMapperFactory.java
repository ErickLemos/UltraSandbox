package com.ultrasandbox.planetas.repository.mappers.vida;

import com.ultrasandbox.planetas.core.exceptions.FactoryException;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.Animal;
import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import com.ultrasandbox.planetas.repository.entitys.vida.VidaEntity;

public interface VidaMapperFactory {
    static Vida mapFrom(VidaEntity entity) {
        if (entity.getTipo() == TipoDeVida.ANIMAL) return VidaAnimalEntityMapper.INSTANCE.toDomain(entity);
        if (entity.getTipo() == TipoDeVida.PLANTA) return VidaPlantaEntityMapper.INSTANCE.mapFrom(entity);
        throw new FactoryException();
    }

    static VidaEntity mapFrom(Vida vida) {
        if (vida.getTipo() == TipoDeVida.ANIMAL) return VidaAnimalEntityMapper.INSTANCE.toEntity((Animal) vida);
        if (vida.getTipo() == TipoDeVida.PLANTA) return VidaPlantaEntityMapper.INSTANCE.mapFrom((Planta) vida);
        throw new FactoryException();
    }
}
