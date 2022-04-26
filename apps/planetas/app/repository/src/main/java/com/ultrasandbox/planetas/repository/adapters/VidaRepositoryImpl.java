package com.ultrasandbox.planetas.repository.adapters;

import com.ultrasandbox.planetas.core.exceptions.NotFoundException;
import com.ultrasandbox.planetas.core.repository.VidaRepository;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import com.ultrasandbox.planetas.repository.mappers.VidaMapperFactory;
import com.ultrasandbox.planetas.repository.repositorys.VidaDadosMongoRepository;
import com.ultrasandbox.planetas.repository.repositorys.VidaMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VidaRepositoryImpl implements VidaRepository {

    private final VidaMongoRepository vidaRepository;
    private final VidaDadosMongoRepository dadosRepository;

    @Override
    public List<Vida> buscar() {
        var entitys = vidaRepository.findAll();
        return entitys.stream().map(VidaMapperFactory::toDomain).toList();
    }

    @Override
    public Vida buscarPorId(String id) {
        var entity = vidaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Vida não foi encontrada"));
        return VidaMapperFactory.toDomain(entity);
    }

    @Override
    public Vida salvar(Vida vida) {
        var entity = VidaMapperFactory.toEntity(vida);

        var entityDadosSalvo = dadosRepository.save(entity.getDados());
        entity.setDadosEntity(entityDadosSalvo);

        var entitySalva = vidaRepository.save(entity);
        return VidaMapperFactory.toDomain(entitySalva);
    }

    @Override
    public void deletarPorId(String id) {
        if (vidaRepository.existsById(id)) throw new NotFoundException("Vida não foi encontrada");
        vidaRepository.deleteById(id);
    }

}
