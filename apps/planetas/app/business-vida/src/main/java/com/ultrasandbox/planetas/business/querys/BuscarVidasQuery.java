package com.ultrasandbox.planetas.business.querys;

import com.ultrasandbox.planetas.core.repository.VidaRepository;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarVidasQuery {

    private final VidaRepository repository;

    public List<Vida> process() {
        return repository.buscar();
    }

}
