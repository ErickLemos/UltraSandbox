package com.sandbox.template.repository.adapter;

import com.sandbox.template.core.exceptions.NotFoundException;
import com.sandbox.template.core.repository.VersaoRepository;
import com.sandbox.template.domain.Versao;
import com.sandbox.template.repository.mappers.VersaoMapper;
import com.sandbox.template.repository.repositorys.VersaoRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VersaoRepositoryImpl implements VersaoRepository {

    private final VersaoRepositoryMongo repository;
    private final VersaoMapper mapper;

    @Override
    public Versao getById(String id) throws NotFoundException {
        var entity = repository.findById(id);
        if (entity.isPresent()) return mapper.toDomain(entity.get());
        throw new NotFoundException("valor não foi encontrado");
    }

    @Override
    public Versao save(String versao) {
        var obj = Versao.builder().numeroDaVersao(versao).build();
        var entity = repository.save(mapper.toEntity(obj));
        return mapper.toDomain(entity);
    }

}
