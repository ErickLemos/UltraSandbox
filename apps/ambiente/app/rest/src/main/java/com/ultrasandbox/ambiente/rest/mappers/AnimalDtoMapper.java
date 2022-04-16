package com.ultrasandbox.ambiente.rest.mappers;

import com.ultrasandbox.ambiente.domain.models.Animal;
import com.ultrasandbox.ambiente.rest.models.dtos.AnimalDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AnimalDtoMapper {

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    Animal toDomain(AnimalDto dto);

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    AnimalDto toDto(Animal domain);

}
