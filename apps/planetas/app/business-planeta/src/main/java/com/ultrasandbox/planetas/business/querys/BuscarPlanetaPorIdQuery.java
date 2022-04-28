package com.ultrasandbox.planetas.business.querys;

import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarPlanetaPorIdQuery {

    private final PlanetaRepository repository;

    public Planeta process(String id) {
        return repository.buscarPorId(id);
    }

}
