package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.domain.models.vida.Animal;
import com.ultrasandbox.planetas.repository.models.AnimalDadosEntity;
import com.ultrasandbox.planetas.repository.models.VidaEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VidaAnimalEntityMapper {

    VidaAnimalEntityMapper INSTANCE = Mappers.getMapper(VidaAnimalEntityMapper.class);

    @Mapping(target = "dados", ignore = true)
    Animal toDomain(VidaEntity entity);

    @Mapping(target = "dados", ignore = true)
    VidaEntity toEntity(Animal domain);

    @AfterMapping
    default void toDomain(@MappingTarget Animal domain, VidaEntity entity) {
        domain.setDados(VidaAnimalDadosEntityMapper.INSTANCE.toDomain((AnimalDadosEntity) entity.getDados()));
    }

    @AfterMapping
    default void toEntity(@MappingTarget VidaEntity entity, Animal domain) {
        entity.setDados(VidaAnimalDadosEntityMapper.INSTANCE.toEntity(domain.getDados()));
    }

}
