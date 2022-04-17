package com.ultrasandbox.ambiente.business.planta.processors;

import com.ultrasandbox.ambiente.business.planta.models.BuscarPlantasOperation;
import com.ultrasandbox.ambiente.core.repository.PlantaRepository;
import com.ultrasandbox.ambiente.core.utils.Processor;
import com.ultrasandbox.ambiente.domain.models.Planta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@AllArgsConstructor
public class BuscarPlantaProcessor implements Processor<BuscarPlantasOperation, BuscarPlantasOperation> {

    private PlantaRepository repository;

    @Override
    public BuscarPlantasOperation process(BuscarPlantasOperation operation) {
        var plantas = buscarTodosOuPorId(operation.getId());
        operation.setPlantas(plantas);
        return null;
    }

    private List<Planta> buscarTodosOuPorId(String id) {
        return Objects.nonNull(id) ?
                List.of(repository.buscarPorId(id)) :
                repository.buscarVarios();
    }

}
