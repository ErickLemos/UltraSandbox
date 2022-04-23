package com.ultrasandbox.planetas.rest.controllers;

import com.ultrasandbox.planetas.rest.models.PlanetaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("planetas")
@RequiredArgsConstructor
public class PlanetaController {

    @GetMapping
    public ResponseEntity<List<PlanetaDto>> buscarTodos() {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @PostMapping
    public ResponseEntity<PlanetaDto> adicionar(@RequestBody PlanetaDto dto) {
        return ResponseEntity.ok(dto);
    }

}
