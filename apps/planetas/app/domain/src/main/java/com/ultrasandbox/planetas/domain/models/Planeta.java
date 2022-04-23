package com.ultrasandbox.planetas.domain.models;

import com.ultrasandbox.planetas.domain.models.vida.Vida;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Planeta {

    private String id;
    private String nome;
    private String metadata;

    private List<Vida> vida;
    private Geografia geografia;

}
