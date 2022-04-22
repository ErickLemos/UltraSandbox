package com.ultrasandbox.template.repository.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document
public class AnimalEntity {

    @Id
    private String id;
    private String nome;
    private Integer patas;

}
