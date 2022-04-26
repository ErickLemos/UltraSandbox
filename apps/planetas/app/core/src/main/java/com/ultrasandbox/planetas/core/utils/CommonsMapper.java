package com.ultrasandbox.planetas.core.utils;

import com.ultrasandbox.planetas.core.exceptions.MapperException;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CommonsMapper {

    @Named("stringToEnum")
    default TipoDeVida stringToEnum(String valor) {
        return Optional.of(TipoDeVida.valueOf(valor.toUpperCase()))
                .orElseThrow(() -> new MapperException("Não foi possível converter o tipo"));
    }

    @Named("enumToString")
    default String stringToEnum(TipoDeVida valor) {
        return Optional.of(valor.getValor())
                .orElseThrow(() -> new MapperException("Não foi possível converter o tipo"));
    }

    @Named("primeiroDaList")
    default Object primeiroDaLista(List<Object> valor) {
        return valor.get(0);
    }

}
