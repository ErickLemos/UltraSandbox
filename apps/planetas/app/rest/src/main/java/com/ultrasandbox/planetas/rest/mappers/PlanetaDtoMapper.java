package com.ultrasandbox.planetas.rest.mappers;

import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.rest.models.PlanetaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlanetaDtoMapper {

    PlanetaDtoMapper INSTANCE = Mappers.getMapper(PlanetaDtoMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "vida", ignore = true)
    @Mapping(target = "metadata", ignore = true)
    @Mapping(target = "geografia", ignore = true)
    Planeta mapFrom(PlanetaDto dto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    PlanetaDto mapFrom(Planeta domain);

}
