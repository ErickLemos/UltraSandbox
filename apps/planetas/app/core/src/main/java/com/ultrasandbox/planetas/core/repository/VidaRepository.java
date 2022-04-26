package com.ultrasandbox.planetas.core.repository;

import com.ultrasandbox.planetas.domain.models.vida.Vida;

import java.util.List;

public interface VidaRepository {

    List<Vida> buscar();

    Vida buscarPorId(String id);

    Vida salvar(Vida vida);

    void deletarPorId(String id);

}
