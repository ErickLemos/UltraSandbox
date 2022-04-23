package com.ultrasandbox.planetas.rest.controllers;

import com.ultrasandbox.planetas.core.business.commands.PlanetaCommands;
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

    private final PlanetaCommands planetaCommands;
    private final PlanetaDtoMapper mapper;

    @GetMapping
    public ResponseEntity<List<PlanetaDto>> buscarTodos() {
        var planetas = planetaCommands.buscar();
        var dtos = planetas.stream().map(mapper::toDto).toList();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("{id}")
    public ResponseEntity<PlanetaDto> buscarPorId(@PathVariable String id) {
        var planeta = planetaCommands.buscarPorId(id);
        var dto = mapper.toDto(planeta);
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
        planetaCommands.deletarPorId(id);
        return ResponseEntity.ok(new Mensagem("Exclusão", "planeta foi excluido com sucesso"));
    }

    private ResponseEntity<PlanetaDto> salvar(PlanetaDto dto) {
        var planeta = mapper.toDomain(dto);
        var planetaSalvo = planetaCommands.salvar(planeta);
        var dtoRetorno = mapper.toDto(planetaSalvo);
        return ResponseEntity.ok(dtoRetorno);
    }

}
