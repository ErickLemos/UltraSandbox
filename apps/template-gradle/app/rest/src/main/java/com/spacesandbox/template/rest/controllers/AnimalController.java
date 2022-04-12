package com.spacesandbox.template.rest.controllers;

import com.spacesandbox.template.core.business.commands.AdicionarAnimalCommand;
import com.spacesandbox.template.core.repository.AnimalRepository;
import com.spacesandbox.template.rest.mappers.AnimalDtoMapper;
import com.spacesandbox.template.rest.models.AnimalDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animal")
public record AnimalController(AnimalRepository animalRepository, AnimalDtoMapper mapper,
                               AdicionarAnimalCommand adicionarAnimalCommand) {


    @GetMapping
    public ResponseEntity<List<AnimalDto>> getAll() {
        var animais = animalRepository.findAll();
        return ResponseEntity.ok(animais.stream().map(mapper::toDto).toList());
    }

    @GetMapping("{id}")
    public ResponseEntity<AnimalDto> findById(@PathVariable String id) {
        var animal = animalRepository.findById(id);
        return ResponseEntity.ok(mapper.toDto(animal));
    }

    @PostMapping
    public ResponseEntity<AnimalDto> save(@RequestBody AnimalDto dto) {
        var animal = adicionarAnimalCommand.execute(mapper.toDomain(dto));
        return ResponseEntity.ok(mapper.toDto(animal));
    }

}
