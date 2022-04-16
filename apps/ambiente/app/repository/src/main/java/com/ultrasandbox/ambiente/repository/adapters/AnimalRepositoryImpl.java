package com.ultrasandbox.ambiente.repository.adapters;

import com.ultrasandbox.ambiente.core.exceptions.NotFoundException;
import com.ultrasandbox.ambiente.core.repository.AnimalRepository;
import com.ultrasandbox.ambiente.domain.models.Animal;
import com.ultrasandbox.ambiente.repository.mappers.AnimalEntityMapper;
import com.ultrasandbox.ambiente.repository.repositorys.AnimalMongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record AnimalRepositoryImpl(
        AnimalMongoRepository repository,
        AnimalEntityMapper mapper
) implements AnimalRepository {

    @Override
    public List<Animal> buscarVarios() {
        return repository.findAll()
                .stream().map(mapper::toDomain)
                .toList();
    }

    @Override
    public Animal buscarPorId(String id) {
        var animal = repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Animal não pode ser encontrado"));

        return mapper.toDomain(animal);
    }

    @Override
    public Animal salvar(Animal animal) {
        var animalEntity = mapper.toEntity(animal);
        var animalSalvo = repository.save(animalEntity);
        return mapper.toDomain(animalSalvo);
    }

    @Override
    public void deletarPorId(String id) {
       repository.deleteById(id);
    }

}
