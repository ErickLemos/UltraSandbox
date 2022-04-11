package com.sandbox.core.repository;

import com.sandbox.domain.Versao;

public interface VersaoRepository {

    Versao getById(String id);

    Versao save(String versao);

}
