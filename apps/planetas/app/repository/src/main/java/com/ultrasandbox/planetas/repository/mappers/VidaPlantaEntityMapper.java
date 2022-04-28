package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.repository.models.vida.PlantaDadosEntity;
import com.ultrasandbox.planetas.repository.models.vida.VidaEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {VidaPlantaDadosEntityMapper.class})
public interface VidaPlantaEntityMapper {

    VidaPlantaEntityMapper INSTANCE = Mappers.getMapper(VidaPlantaEntityMapper.class);

    @Mapping(target = "dados", ignore = true)
    Planta toDomain(VidaEntity entity);

    VidaEntity toEntity(Planta domain);

    @AfterMapping
    default void toDomain(@MappingTarget Planta domain, VidaEntity entity) {
        domain.setDados(VidaPlantaDadosEntityMapper.INSTANCE.toDomain((PlantaDadosEntity) entity.getDados()));
    }

}
