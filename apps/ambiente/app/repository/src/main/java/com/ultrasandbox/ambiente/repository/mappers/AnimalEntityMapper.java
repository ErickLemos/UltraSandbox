package com.ultrasandbox.ambiente.repository.mappers;

import com.ultrasandbox.ambiente.domain.models.Animal;
import com.ultrasandbox.ambiente.repository.models.entitys.AnimalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AnimalEntityMapper {

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    Animal toDomain(AnimalEntity entity);

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    AnimalEntity toEntity(Animal animal);

}
