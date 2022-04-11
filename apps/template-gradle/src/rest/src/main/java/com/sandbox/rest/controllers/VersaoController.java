package com.sandbox.rest.controllers;

import com.sandbox.core.repository.VersaoRepository;
import com.sandbox.rest.mappers.VersaoDtoMapper;
import com.sandbox.rest.models.VersaoDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("versao")
public record VersaoController(VersaoRepository versaoRepository, VersaoDtoMapper mapper) {

    @GetMapping("{id}")
    public VersaoDto getById(@PathVariable String id) {
        var domain = versaoRepository.getById(id);
        return mapper.toDto(domain);
    }

    @PostMapping
    public VersaoDto save(@RequestBody VersaoDto dto) {
        var domain = versaoRepository.save(dto.getNumeroDaVersao());
        return mapper.toDto(domain);
    }

}
