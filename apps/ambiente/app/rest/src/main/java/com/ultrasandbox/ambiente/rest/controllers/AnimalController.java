package com.ultrasandbox.ambiente.rest.controllers;

import com.ultrasandbox.ambiente.core.business.animal.AnimalCommands;
import com.ultrasandbox.ambiente.rest.mappers.AnimalDtoMapper;
import com.ultrasandbox.ambiente.rest.models.dtos.AnimalDto;
import com.ultrasandbox.ambiente.rest.models.dtos.MensagemDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animais")
@AllArgsConstructor
public class AnimalController {

    private AnimalCommands commands;
    private AnimalDtoMapper mapper;

    @GetMapping
    public ResponseEntity<List<AnimalDto>> buscar() {
        var animais = commands.buscarVarios();
        var animaisDtos = animais.stream().map(mapper::toDto).toList();
        return ResponseEntity.ok(animaisDtos);
    }

    @GetMapping("{id}")
    public ResponseEntity<AnimalDto> buscarPorId(@PathVariable String id) {
        var animal = commands.buscarPorId(id);
        var animalDto = mapper.toDto(animal);
        return ResponseEntity.ok(animalDto);
    }

    @PostMapping
    public ResponseEntity<AnimalDto> salvar(@RequestBody AnimalDto dto) {
        var animal = mapper.toDomain(dto);
        var animalSalvo = commands.salvar(animal);
        var animalDto = mapper.toDto(animalSalvo);
        return ResponseEntity.ok(animalDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<MensagemDto> deletePorId(@PathVariable String id) {
        commands.deletarPorId(id);
        return ResponseEntity.ok(new MensagemDto("animal foi deletado com sucesso"));
    }

}
