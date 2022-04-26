package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.core.exceptions.FactoryException;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.Animal;
import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import com.ultrasandbox.planetas.repository.models.vida.AnimalEntity;
import com.ultrasandbox.planetas.repository.models.vida.PlantaEntity;
import com.ultrasandbox.planetas.repository.models.vida.VidaEntity;

public interface VidaMapperFactory {
    static Vida toDomain(VidaEntity entity) {
        if (entity.getTipo() == TipoDeVida.ANIMAL) {
            return AnimalEntityMapper.INSTANCE.toDomain((AnimalEntity) entity);
        }

        if (entity.getTipo() == TipoDeVida.PLANTA) {
            return PlantaEntityMapper.INSTANCE.toDomain((PlantaEntity) entity);
        }

        throw new FactoryException("não foi possível encontrar o tipo");
    }

    static VidaEntity toEntity(Vida domain) {
        if (domain.getTipo() == TipoDeVida.ANIMAL) {
            return AnimalEntityMapper.INSTANCE.toEntity((Animal) domain);
        }

        if (domain.getTipo() == TipoDeVida.PLANTA) {
            return PlantaEntityMapper.INSTANCE.toEntity((Planta) domain);
        }

        throw new FactoryException("não foi possível encontrar o tipo");
    }
}
