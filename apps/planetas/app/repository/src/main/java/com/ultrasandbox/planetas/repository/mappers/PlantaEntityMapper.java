package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.repository.models.vida.PlantaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlantaEntityMapper {

    PlantaEntityMapper INSTANCE = Mappers.getMapper(PlantaEntityMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo")
    @Mapping(target = "dados", ignore = true)
    Planta toDomain(PlantaEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo")
    @Mapping(target = "dados", ignore = true)
    PlantaEntity toEntity(Planta domain);

}
