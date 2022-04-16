package com.ultrasandbox.ambiente.repository.adapters;

import com.ultrasandbox.ambiente.core.exceptions.NotFoundException;
import com.ultrasandbox.ambiente.core.repository.PlantaRepository;
import com.ultrasandbox.ambiente.domain.models.Planta;
import com.ultrasandbox.ambiente.repository.mappers.PlantaEntityMapper;
import com.ultrasandbox.ambiente.repository.repositorys.PlantaMongoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PlantaRepositoryImpl implements PlantaRepository {

    private PlantaMongoRepository repository;
    private PlantaEntityMapper mapper;

    @Override
    public List<Planta> buscarVarios() {
        return repository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Planta buscarPorId(String id) {
        var planta = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("planta não pode ser encontrada"));
        return mapper.toDomain(planta);
    }

    @Override
    public Planta salvar(Planta planta) {
        var plantaEntity = mapper.toEntity(planta);
        var plantaSalva = repository.save(plantaEntity);
        return mapper.toDomain(plantaSalva);
    }

    @Override
    public void deletarPorId(String id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw new NotFoundException("planta não pode ser encontrada", e.getCause());
        }
    }

}
