package com.ultrasandbox.planetas.repository.adapters;

import com.ultrasandbox.planetas.core.exceptions.NotFoundException;
import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.repository.mappers.planeta.PlanetaEntityMapper;
import com.ultrasandbox.planetas.repository.repositorys.PlanetaMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlanetaRepositoryImpl implements PlanetaRepository {

    private final PlanetaMongoRepository repository;

    @Override
    public List<Planeta> buscar() {
        var entidades = repository.findAll();
        return entidades.stream()
                .map(PlanetaEntityMapper.INSTANCE::mapFrom)
                .toList();
    }

    @Override
    public Planeta buscarPorId(String id) {
        var entidade = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Planeta não foi encontrado"));
        return PlanetaEntityMapper.INSTANCE.mapFrom(entidade);
    }

    @Override
    public Planeta salvar(Planeta planeta) {
        var entidade = PlanetaEntityMapper.INSTANCE.mapFrom(planeta);
        var entidadeSalva = repository.save(entidade);
        return PlanetaEntityMapper.INSTANCE.mapFrom(entidadeSalva);
    }

    @Override
    public void deletarPorId(String id) {
        if (!repository.existsById(id)) throw new NotFoundException("Planeta não foi encontrado");
        repository.deleteById(id);
    }

}
