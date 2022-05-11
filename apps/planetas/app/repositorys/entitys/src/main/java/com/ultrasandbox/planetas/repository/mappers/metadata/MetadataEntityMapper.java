package com.ultrasandbox.planetas.repository.mappers.metadata;

import com.ultrasandbox.planetas.domain.models.Metadata;
import com.ultrasandbox.planetas.repository.entitys.metadata.MetadataEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MetadataEntityMapper {

    MetadataEntityMapper INSTANCE = Mappers.getMapper(MetadataEntityMapper.class);

    @Mapping(target = "id", source = "id")
    Metadata mapFrom(MetadataEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "planeta", ignore = true)
    MetadataEntity mapFrom(Metadata domain);

}
