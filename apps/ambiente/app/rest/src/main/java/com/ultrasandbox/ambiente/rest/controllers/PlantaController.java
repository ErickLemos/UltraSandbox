package com.ultrasandbox.ambiente.rest.controllers;

import com.ultrasandbox.ambiente.core.business.animal.PlantaCommands;
import com.ultrasandbox.ambiente.rest.mappers.PlantaDtoMapper;
import com.ultrasandbox.ambiente.rest.models.dtos.MensagemDto;
import com.ultrasandbox.ambiente.rest.models.dtos.PlantaDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("plantas")
@AllArgsConstructor
public class PlantaController {

    private PlantaCommands commands;
    private PlantaDtoMapper mapper;

    @GetMapping
    public ResponseEntity<List<PlantaDto>> buscar() {
        var plantas = commands.buscarVarios();
        var plantasDtos = plantas.stream().map(mapper::toDto).toList();
        return ResponseEntity.ok(plantasDtos);
    }

    @GetMapping("{id}")
    public ResponseEntity<PlantaDto> buscarPorId(@PathVariable String id) {
        var planta = commands.buscarPorId(id);
        var plantaDto = mapper.toDto(planta);
        return ResponseEntity.ok(plantaDto);
    }

    @PostMapping
    public ResponseEntity<PlantaDto> salvar(@RequestBody PlantaDto dto) {
        var planta = mapper.toDomain(dto);
        var plantaSalva = commands.salvar(planta);
        var plantaDto = mapper.toDto(plantaSalva);
        return ResponseEntity.ok(plantaDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<MensagemDto> deletarPorId(@PathVariable String id) {
        commands.deletarPorId(id);
        return ResponseEntity.ok(new MensagemDto("planta foi deletada com sucesso"));
    }

}
