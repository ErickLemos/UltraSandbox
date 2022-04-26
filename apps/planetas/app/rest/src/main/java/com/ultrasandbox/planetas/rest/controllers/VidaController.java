package com.ultrasandbox.planetas.rest.controllers;

import com.ultrasandbox.planetas.core.business.operations.VidaOperations;
import com.ultrasandbox.planetas.core.utils.Mensagem;
import com.ultrasandbox.planetas.rest.models.vida.VidaDto;
import com.ultrasandbox.planetas.rest.utils.VidaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vida")
@RequiredArgsConstructor
public class VidaController {

    private final VidaOperations operations;
    private final VidaMapper mapper;

    @GetMapping
    public ResponseEntity<List<VidaDto>> buscar() {
        var planetas = operations.buscar();
        var dtos = planetas.stream().map(mapper::toDto).toList();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("{id}")
    public ResponseEntity<VidaDto> buscarPorId(@PathVariable String id) {
        var planeta = operations.buscarPorId(id);
        var dto = mapper.toDto(planeta);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<VidaDto> adicionar(@RequestBody VidaDto dto) {
        return salvar(dto);
    }

    @PutMapping
    public ResponseEntity<VidaDto> atualizar(@RequestBody VidaDto dto) {
        return salvar(dto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Mensagem> deletarPorId(@PathVariable String id) {
        operations.deletarPorId(id);
        return ResponseEntity.ok(new Mensagem("Exclusão", "planeta foi excluido com sucesso"));
    }

    private ResponseEntity<VidaDto> salvar(VidaDto dto) {
        var vida = mapper.toDomain(dto);
        var vidaSalva = operations.salvar(vida);
        var dtoRetorno = mapper.toDto(vidaSalva);
        return ResponseEntity.ok(dtoRetorno);
    }
}
