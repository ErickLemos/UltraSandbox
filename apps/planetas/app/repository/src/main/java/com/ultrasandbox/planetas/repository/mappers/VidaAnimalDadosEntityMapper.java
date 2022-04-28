package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.domain.models.vida.dados.AnimalDados;
import com.ultrasandbox.planetas.repository.models.vida.AnimalDadosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VidaAnimalDadosEntityMapper {

    VidaAnimalDadosEntityMapper INSTANCE = Mappers.getMapper(VidaAnimalDadosEntityMapper.class);

    @Mapping(target = "tipoDeAnimal", ignore = true)
    @Mapping(target = "tipoDeAlimentacao", ignore = true)
    AnimalDados toDomain(AnimalDadosEntity entity);

    AnimalDadosEntity toEntity(AnimalDados domain);

}
