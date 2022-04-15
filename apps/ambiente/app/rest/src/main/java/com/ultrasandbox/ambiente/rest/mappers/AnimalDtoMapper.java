package com.ultrasandbox.ambiente.rest.mappers;

import com.ultrasandbox.ambiente.domain.models.Animal;
import com.ultrasandbox.ambiente.rest.models.AnimalDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AnimalDtoMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "patas", source = "patas")
    Animal toDomain(AnimalDto dto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "patas", source = "patas")
    AnimalDto toDto(Animal domain);

}
