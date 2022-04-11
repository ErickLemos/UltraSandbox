package com.sandbox.template.repository.mappers;

import com.sandbox.template.domain.Versao;
import com.sandbox.template.repository.model.VersaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface VersaoMapper {
    Versao toDomain(VersaoEntity entity);

    VersaoEntity toEntity(Versao domain);
}
