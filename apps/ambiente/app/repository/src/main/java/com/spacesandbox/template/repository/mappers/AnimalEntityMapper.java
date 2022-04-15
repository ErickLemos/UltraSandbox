package com.spacesandbox.template.repository.mappers;

import com.spacesandbox.template.domain.models.Animal;
import com.spacesandbox.template.repository.models.AnimalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AnimalEntityMapper {


    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "patas", source = "patas")
    Animal toDomain(AnimalEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "patas", source = "patas")
    AnimalEntity toEntity(Animal domain);

}
