package com.sandbox.template.core.repository;

import com.sandbox.template.domain.Versao;

public interface VersaoRepository {

    Versao getById(String id);

    Versao save(String versao);

}
