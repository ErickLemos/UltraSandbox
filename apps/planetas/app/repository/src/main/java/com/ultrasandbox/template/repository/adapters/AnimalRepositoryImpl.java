package com.ultrasandbox.template.repository.adapters;

import com.ultrasandbox.template.core.exceptions.NotFoundException;
import com.ultrasandbox.template.core.repository.AnimalRepository;
import com.ultrasandbox.template.repository.mappers.AnimalEntityMapper;
import com.ultrasandbox.template.repository.repositorys.AnimalMongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record AnimalRepositoryImpl(AnimalMongoRepository repository,
                                   AnimalEntityMapper mapper) implements AnimalRepository {

    @Override
    public List<Animal> findAll() {
        return repository.findAll()
                .stream().map(mapper::toDomain)
                .toList();
    }

    @Override
    public Animal findById(String id) {
        var entity = repository.findById(id);
        return entity.map(mapper::toDomain).orElseThrow(() -> new NotFoundException("animal não encontrado"));
    }

    @Override
    public Animal save(Animal animal) {
        var entity = repository.save(mapper.toEntity(animal));
        return mapper.toDomain(entity);
    }

}
