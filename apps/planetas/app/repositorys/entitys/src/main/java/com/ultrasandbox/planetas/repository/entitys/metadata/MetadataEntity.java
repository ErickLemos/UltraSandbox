package com.ultrasandbox.planetas.repository.entitys.metadata;

import com.ultrasandbox.planetas.repository.entitys.planeta.PlanetaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class MetadataEntity {

    @Id
    private String id;

    @DBRef
    private PlanetaEntity planeta;

}

