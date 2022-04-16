package com.ultrasandbox.ambiente.rest;

import com.ultrasandbox.ambiente.core.business.animal.AnimalCommands;
import com.ultrasandbox.ambiente.domain.models.Animal;
import com.ultrasandbox.ambiente.rest.mappers.AnimalDtoMapper;
import com.ultrasandbox.ambiente.rest.models.dtos.AnimalDto;
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
    public ResponseEntity<List<Animal>> buscar() {
        var animais = commands.buscarVarios();
        return ResponseEntity.ok(animais);
    }

    @PostMapping
    public ResponseEntity<Animal> salvar(@RequestBody AnimalDto dto) {
        var animal = mapper.toDomain(dto);
        var animalSalvo = commands.salvar(animal);
        return ResponseEntity.ok(animalSalvo);
    }

}
