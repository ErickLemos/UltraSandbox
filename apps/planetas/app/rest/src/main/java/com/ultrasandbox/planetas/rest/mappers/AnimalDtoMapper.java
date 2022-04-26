package com.ultrasandbox.planetas.rest.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ultrasandbox.planetas.core.utils.CommonsMapper;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeAnimal;
import com.ultrasandbox.planetas.domain.models.vida.Animal;
import com.ultrasandbox.planetas.domain.models.vida.dados.DadosAnimal;
import com.ultrasandbox.planetas.rest.models.vida.DadosAnimalDto;
import com.ultrasandbox.planetas.rest.models.vida.VidaDto;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CommonsMapper.class})
public interface AnimalDtoMapper {

    AnimalDtoMapper INSTANCE = Mappers.getMapper(AnimalDtoMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo", qualifiedByName = "stringToEnum")
    @Mapping(target = "dados", ignore = true)
    Animal toDomain(VidaDto dto);

    @AfterMapping
    default void toDomain(@MappingTarget Animal animal, VidaDto dto) {
        ObjectMapper objectMapper = new ObjectMapper();
        var dadosDto = objectMapper.convertValue(dto.getDados(), DadosAnimalDto.class);

        animal.setDados(new DadosAnimal());
        animal.getDados().setTipoDeAnimal(TipoDeAnimal.valueOf(dadosDto.getTipoDeAnimal()));
    }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo", qualifiedByName = "enumToString")
    @Mapping(target = "dados", ignore = true)
    VidaDto toDto(Animal domain);

}
