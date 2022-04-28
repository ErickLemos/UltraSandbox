package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.domain.models.vida.dados.PlantaDados;
import com.ultrasandbox.planetas.repository.models.vida.PlantaDadosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VidaPlantaDadosEntityMapper {

    VidaPlantaDadosEntityMapper INSTANCE = Mappers.getMapper(VidaPlantaDadosEntityMapper.class);

    PlantaDados toDomain(PlantaDadosEntity entity);

    PlantaDadosEntity toEntity(PlantaDados domain);

}
