package com.sandbox.rest.mappers;

import com.sandbox.domain.Versao;
import com.sandbox.rest.models.VersaoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VersaoDtoMapper {

    Versao toDomain(VersaoDto dto);

    VersaoDto toDto(Versao domain);

}
