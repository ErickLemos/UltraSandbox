package com.sandbox.repository.mappers;

import com.sandbox.domain.Versao;
import com.sandbox.repository.model.VersaoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VersaoMapper {

    Versao toDomain(VersaoEntity entity);

    VersaoEntity toEntity(Versao domain);

}
