package com.sandbox.template.repository.adapter;

import com.sandbox.template.core.repository.VersaoRepository;
import com.sandbox.template.repository.repositorys.VersaoRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VersaoRepositoryImpl implements VersaoRepository {

    private final VersaoRepositoryMongo repository;

    @Override
    public String getById(String id) {
        return null;
    }

    @Override
    public String save(String versao) {
        return null;
    }

}
