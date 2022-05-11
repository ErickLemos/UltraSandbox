package com.ultrasandbox.planetas.repository.mappers.vida;

import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.repository.entitys.vida.PlantaDadosEntity;
import com.ultrasandbox.planetas.repository.entitys.vida.VidaEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {VidaPlantaDadosEntityMapper.class})
public interface VidaPlantaEntityMapper {

    VidaPlantaEntityMapper INSTANCE = Mappers.getMapper(VidaPlantaEntityMapper.class);

    @Mapping(target = "dados", ignore = true)
    Planta mapFrom(VidaEntity entity);

    VidaEntity mapFrom(Planta domain);

    @AfterMapping
    default void mapFrom(@MappingTarget Planta domain, VidaEntity entity) {
        domain.setDados(VidaPlantaDadosEntityMapper.INSTANCE.mapFrom((PlantaDadosEntity) entity.getDados()));
    }

}
