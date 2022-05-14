package com.ultrasandbox.planetas.rest.controllers;

import com.ultrasandbox.planetas.core.business.actions.PlanetaActions;
import com.ultrasandbox.planetas.core.utils.Mensagem;
import com.ultrasandbox.planetas.rest.mappers.PlanetaDtoMapper;
import com.ultrasandbox.planetas.rest.models.PlanetaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("planetas")
@RequiredArgsConstructor
public class PlanetaController {

    private final PlanetaActions operations;

    @GetMapping
    public ResponseEntity<List<PlanetaDto>> buscarTodos() {
        var planetas = operations.buscar();
        var dtos = planetas.stream().map(PlanetaDtoMapper.INSTANCE::mapFrom).toList();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("{id}")
    public ResponseEntity<PlanetaDto> buscarPorId(@PathVariable String id) {
        var planeta = operations.buscarPorId(id);
        var dto = PlanetaDtoMapper.INSTANCE.mapFrom(planeta);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<PlanetaDto> adicionar(@RequestBody PlanetaDto dto) {
        return salvar(dto);
    }

    @PutMapping
    public ResponseEntity<PlanetaDto> atualizar(@RequestBody PlanetaDto dto) {
        return salvar(dto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Mensagem> deletarPorId(@PathVariable String id) {
        operations.deletarPorId(id);
        return ResponseEntity.ok(new Mensagem("Exclusão", "planeta foi excluido com sucesso"));
    }

    private ResponseEntity<PlanetaDto> salvar(PlanetaDto dto) {
        var planeta = PlanetaDtoMapper.INSTANCE.mapFrom(dto);
        var planetaSalvo = operations.salvar(planeta);
        var dtoRetorno = PlanetaDtoMapper.INSTANCE.mapFrom(planetaSalvo);
        return ResponseEntity.ok(dtoRetorno);
    }

}
