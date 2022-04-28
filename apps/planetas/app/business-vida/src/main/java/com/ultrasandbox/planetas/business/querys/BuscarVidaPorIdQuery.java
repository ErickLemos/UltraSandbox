package com.ultrasandbox.planetas.business.querys;

import com.ultrasandbox.planetas.core.repository.VidaRepository;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarVidaPorIdQuery {

    private final VidaRepository repository;

    public Vida process(String id) {
        return repository.buscarPorId(id);
    }

}
