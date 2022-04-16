package com.ultrasandbox.ambiente.rest.mappers;

import com.ultrasandbox.ambiente.domain.models.Planta;
import com.ultrasandbox.ambiente.rest.models.dtos.PlantaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlantaDtoMapper {

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    Planta toDomain(PlantaDto dto);

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    PlantaDto toDto(Planta domain);

}
