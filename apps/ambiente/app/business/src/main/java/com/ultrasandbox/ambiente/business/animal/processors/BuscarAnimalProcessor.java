package com.ultrasandbox.ambiente.business.animal.processors;

import com.ultrasandbox.ambiente.business.animal.models.BuscarAnimalOperation;
import com.ultrasandbox.ambiente.core.repository.AnimalRepository;
import com.ultrasandbox.ambiente.core.utils.Processor;
import com.ultrasandbox.ambiente.domain.models.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@AllArgsConstructor
public class BuscarAnimalProcessor implements Processor<BuscarAnimalOperation, BuscarAnimalOperation> {

    private AnimalRepository repository;

    @Override
    public BuscarAnimalOperation process(BuscarAnimalOperation operation) {
        var animais = buscarTodosOuPorId(operation.getId());
        operation.setAnimais(animais);
        return operation;
    }

    private List<Animal> buscarTodosOuPorId(String id) {
        return Objects.nonNull(id) ?
                List.of(repository.buscarPorId(id)) :
                repository.buscarVarios();
    }

}
