package com.sandbox.template.repository.mappers;

import com.sandbox.template.domain.Versao;
import com.sandbox.template.repository.model.VersaoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VersaoMapper {

    Versao toDomain(VersaoEntity entity);

    VersaoEntity toEntity(Versao domain);

}
