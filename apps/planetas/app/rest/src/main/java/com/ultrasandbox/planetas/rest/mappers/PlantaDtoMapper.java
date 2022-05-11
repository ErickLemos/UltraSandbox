package com.ultrasandbox.planetas.rest.mappers;

import com.ultrasandbox.planetas.core.utils.CommonsMapper;
import com.ultrasandbox.planetas.domain.models.vida.Planta;
import com.ultrasandbox.planetas.rest.models.vida.VidaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CommonsMapper.class})
public interface PlantaDtoMapper {

    PlantaDtoMapper INSTANCE = Mappers.getMapper(PlantaDtoMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo", qualifiedByName = "stringToEnum")
    @Mapping(target = "dados", ignore = true)
    Planta mapFrom(VidaDto dto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "tipo", source = "tipo", qualifiedByName = "enumToString")
    @Mapping(target = "dados", ignore = true)
    VidaDto mapFrom(Planta planta);

}
