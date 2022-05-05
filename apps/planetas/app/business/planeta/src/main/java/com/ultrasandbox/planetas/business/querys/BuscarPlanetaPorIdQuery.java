package com.ultrasandbox.planetas.business.querys;

import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.domain.models.Planeta;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public record BuscarPlanetaPorIdQuery(PlanetaRepository repository) {

    public Planeta process(String id) {
        if (!StringUtils.hasText(id) || StringUtils.containsWhitespace(id))
            throw new IllegalArgumentException("id não é válido");

        return repository.buscarPorId(id);
    }

}
