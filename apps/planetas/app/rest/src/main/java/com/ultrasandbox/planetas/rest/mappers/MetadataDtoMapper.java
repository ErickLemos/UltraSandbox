package com.ultrasandbox.planetas.rest.mappers;

import com.ultrasandbox.planetas.domain.models.Metadata;
import com.ultrasandbox.planetas.rest.models.MetadataDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MetadataDtoMapper {

    MetadataDtoMapper INSTANCE = Mappers.getMapper(MetadataDtoMapper.class);

    @Mapping(target = "id", source = "id")
    Metadata mapFrom(MetadataDto dto);

    @Mapping(target = "id", source = "id")
    MetadataDto mapFrom(Metadata domain);

}
