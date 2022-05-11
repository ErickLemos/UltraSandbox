package com.ultrasandbox.planetas.repository.adapters;

import com.ultrasandbox.planetas.core.exceptions.NotFoundException;
import com.ultrasandbox.planetas.core.repository.VidaRepository;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import com.ultrasandbox.planetas.repository.commands.SalvarVidaDadosCommand;
import com.ultrasandbox.planetas.repository.mappers.vida.VidaMapperFactory;
import com.ultrasandbox.planetas.repository.repositorys.VidaMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VidaRepositoryImpl implements VidaRepository {

    private final VidaMongoRepository vidaRepository;
    private final SalvarVidaDadosCommand salvarVidaDadosCommand;


    @Override
    public List<Vida> buscar() {
        var vidas = vidaRepository.findAll();
        return vidas.stream().map(VidaMapperFactory::mapFrom).toList();
    }

    @Override
    public Vida buscarPorId(String id) {
        var vida = vidaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Vida não foi encontrada"));
        return VidaMapperFactory.mapFrom(vida);
    }

    @Override
    public Vida salvar(Vida vida) {
        var vidaEntity = VidaMapperFactory.mapFrom(vida);

        var dadoSalvo = salvarVidaDadosCommand.process(vidaEntity.getDados(), vidaEntity.getTipo());
        vidaEntity.setDados(dadoSalvo);

        var vidaEntitySalva = vidaRepository.save(vidaEntity);
        return VidaMapperFactory.mapFrom(vidaEntitySalva);
    }

    @Override
    public void deletarPorId(String id) {
        if (!vidaRepository.existsById(id)) throw new NotFoundException("Vida não foi encontrada");
        vidaRepository.deleteById(id);
    }

}
