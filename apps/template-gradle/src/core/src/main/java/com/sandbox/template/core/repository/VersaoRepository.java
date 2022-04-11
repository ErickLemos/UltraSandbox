package com.sandbox.template.core.repository;

import com.sandbox.template.core.exceptions.NotFoundException;
import com.sandbox.template.domain.Versao;

public interface VersaoRepository {
    Versao getById(String id) throws NotFoundException;

    Versao save(String versao);
}
