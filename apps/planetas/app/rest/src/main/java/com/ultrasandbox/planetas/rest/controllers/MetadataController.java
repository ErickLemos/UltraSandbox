package com.ultrasandbox.planetas.rest.controllers;

import com.ultrasandbox.planetas.core.business.actions.MetadataActions;
import com.ultrasandbox.planetas.domain.models.Metadata;
import com.ultrasandbox.planetas.domain.models.Planeta;
import com.ultrasandbox.planetas.rest.mappers.MetadataDtoMapper;
import com.ultrasandbox.planetas.rest.models.MetadataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("planetas/{idPlaneta}/metadata")
@RequiredArgsConstructor
public class MetadataController {

    private final MetadataActions actions;

    @GetMapping
    public ResponseEntity<Metadata> buscarMetadata(@PathVariable String idPlaneta) {
        var resultado = actions.buscarPorPlaneta(Planeta.builder().id(idPlaneta).build());
        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<Metadata> salvar(@PathVariable String idPlaneta, @RequestBody MetadataDto dto) {
        var domain = MetadataDtoMapper.INSTANCE.mapFrom(dto);
        var resultado = actions.salvar(Planeta.builder().id(idPlaneta).build(), domain);
        return ResponseEntity.ok(resultado);
    }

}
