package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.repository.models.PlanetaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlanetaEntityMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "vida", ignore = true)
    @Mapping(target = "metadata", ignore = true)
    @Mapping(target = "geografia", ignore = true)
    Planeta toDomain(PlanetaEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    PlanetaEntity toEntity(Planeta domain);

}
