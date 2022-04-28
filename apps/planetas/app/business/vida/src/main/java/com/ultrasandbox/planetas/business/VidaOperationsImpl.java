package com.ultrasandbox.planetas.business;

import com.ultrasandbox.planetas.business.command.AdicionarVidaCommand;
import com.ultrasandbox.planetas.business.command.DeletarVidaPorIdCommand;
import com.ultrasandbox.planetas.business.querys.BuscarVidaPorIdQuery;
import com.ultrasandbox.planetas.business.querys.BuscarVidasQuery;
import com.ultrasandbox.planetas.core.business.operations.VidaOperations;
import com.ultrasandbox.planetas.domain.models.enums.TipoDeVida;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VidaOperationsImpl implements VidaOperations {

    private final BuscarVidasQuery buscarVidasQuery;
    private final BuscarVidaPorIdQuery buscarVidaPorIdQuery;

    private final AdicionarVidaCommand adicionarVidaCommand;
    private final DeletarVidaPorIdCommand deletarVidaPorIdCommand;

    @Override
    public List<Vida> buscar() {
        return buscarVidasQuery.process();
    }

    @Override
    public Vida buscarPorId(String id) {
        return buscarVidaPorIdQuery.process(id);
    }

    @Override
    public Vida buscarPorTipo(TipoDeVida tipo) {
        return null;
    }

    @Override
    public Vida salvar(Vida vida) {
        return adicionarVidaCommand.process(vida);
    }

    @Override
    public void deletarPorId(String id) {
        deletarVidaPorIdCommand.process(id);
    }

}
