package com.ultrasandbox.planetas.repository.mappers.planeta;

import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.repository.entitys.planeta.PlanetaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlanetaEntityMapper {

    PlanetaEntityMapper INSTANCE = Mappers.getMapper(PlanetaEntityMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "vida", ignore = true)
    @Mapping(target = "metadata", ignore = true)
    @Mapping(target = "geografia", ignore = true)
    Planeta mapFrom(PlanetaEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    PlanetaEntity mapFrom(Planeta domain);

}
