package com.ultrasandbox.planetas.repository.mappers.vida;

import com.ultrasandbox.planetas.domain.models.vida.dados.PlantaDados;
import com.ultrasandbox.planetas.repository.entitys.vida.PlantaDadosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VidaPlantaDadosEntityMapper {

    VidaPlantaDadosEntityMapper INSTANCE = Mappers.getMapper(VidaPlantaDadosEntityMapper.class);

    PlantaDados toDomain(PlantaDadosEntity entity);

    PlantaDadosEntity toEntity(PlantaDados domain);

}
