package com.ultrasandbox.planetas.domain.models;

import com.ultrasandbox.planetas.domain.models.metadata.Metadata;
import com.ultrasandbox.planetas.domain.models.vida.Vida;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Planeta {

    private String id;
    private String nome;
    private Metadata metadata;

    private List<Vida> vida;
    private Geografia geografia;

}
