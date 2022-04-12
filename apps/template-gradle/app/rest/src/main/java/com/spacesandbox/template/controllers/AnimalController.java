package com.spacesandbox.template.controllers;

import com.spacesandbox.template.core.repository.AnimalRepository;
import com.spacesandbox.template.domain.models.Animal;
import com.spacesandbox.template.mappers.AnimalDtoMapper;
import com.spacesandbox.template.models.AnimalDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animal")
public record AnimalController(AnimalRepository animalRepository, AnimalDtoMapper mapper) {

    @GetMapping
    public ResponseEntity<List<Animal>> getAll() {
        var animais = animalRepository.findAll();
        return ResponseEntity.ok(animais);
    }

    @GetMapping("{id}")
    public ResponseEntity<Animal> findById(@PathVariable String id) {
        var animal = animalRepository.findById(id);
        return ResponseEntity.ok(animal);
    }

    @PostMapping
    public ResponseEntity<Animal> save(@RequestBody AnimalDto dto) {
        var animal = animalRepository.save(mapper.toDomain(dto));
        return ResponseEntity.ok(animal);
    }

}
