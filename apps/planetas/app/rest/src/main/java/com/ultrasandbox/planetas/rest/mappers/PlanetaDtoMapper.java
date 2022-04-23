package com.ultrasandbox.planetas.rest.mappers;

import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.rest.models.PlanetaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlanetaDtoMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "vida", ignore = true)
    @Mapping(target = "metadata", ignore = true)
    @Mapping(target = "geografia", ignore = true)
    Planeta toDomain(PlanetaDto dto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    PlanetaDto toDto(Planeta domain);

}
