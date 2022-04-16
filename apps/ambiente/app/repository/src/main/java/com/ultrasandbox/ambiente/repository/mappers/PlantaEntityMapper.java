package com.ultrasandbox.ambiente.repository.mappers;

import com.ultrasandbox.ambiente.domain.models.Planta;
import com.ultrasandbox.ambiente.repository.models.entitys.PlantaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlantaEntityMapper {

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    Planta toDomain(PlantaEntity entity);

    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "id", source = "id")
    PlantaEntity toEntity(Planta domain);

}
