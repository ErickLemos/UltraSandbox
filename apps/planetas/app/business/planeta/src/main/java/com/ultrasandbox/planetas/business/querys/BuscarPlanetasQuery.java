package com.ultrasandbox.planetas.business.querys;

import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.domain.models.Planeta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarPlanetasQuery {

    private final PlanetaRepository repository;

    public List<Planeta> process() {
        return repository.buscar();
    }

}
