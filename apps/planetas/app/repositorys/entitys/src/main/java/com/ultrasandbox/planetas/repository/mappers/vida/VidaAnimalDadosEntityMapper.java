package com.ultrasandbox.planetas.repository.mappers.vida;

import com.ultrasandbox.planetas.domain.models.vida.dados.AnimalDados;
import com.ultrasandbox.planetas.repository.entitys.vida.AnimalDadosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VidaAnimalDadosEntityMapper {

    VidaAnimalDadosEntityMapper INSTANCE = Mappers.getMapper(VidaAnimalDadosEntityMapper.class);

    @Mapping(target = "alimentacao", ignore = true)
    @Mapping(target = "tipoDeAnimal", ignore = true)
    @Mapping(target = "tipoDeAlimentacao", ignore = true)
    AnimalDados mapFrom(AnimalDadosEntity entity);

    AnimalDadosEntity mapFrom(AnimalDados domain);

}
