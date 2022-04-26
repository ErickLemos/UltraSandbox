package com.ultrasandbox.planetas.repository.mappers;

import com.ultrasandbox.planetas.domain.models.vida.Animal;
import com.ultrasandbox.planetas.repository.models.vida.AnimalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimalEntityMapper {

    AnimalEntityMapper INSTANCE = Mappers.getMapper(AnimalEntityMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo")
    @Mapping(target = "dados.id", source = "dados.id")
    @Mapping(target = "dados.tipoDeAnimal", source = "dados.tipoDeAnimal")
    @Mapping(target = "dados.tipoDeAlimentacao", source = "dados.tipoDeAlimentacao")
    Animal toDomain(AnimalEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo")
    @Mapping(target = "dados.id", source = "dados.id")
    @Mapping(target = "dados.tipoDeAnimal", source = "dados.tipoDeAnimal")
    @Mapping(target = "dados.tipoDeAlimentacao", source = "dados.tipoDeAlimentacao")
    AnimalEntity toEntity(Animal domain);

}
