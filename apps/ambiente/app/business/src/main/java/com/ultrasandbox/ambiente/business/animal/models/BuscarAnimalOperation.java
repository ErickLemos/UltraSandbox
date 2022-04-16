package com.ultrasandbox.ambiente.business.animal.models;

import com.ultrasandbox.ambiente.domain.models.Animal;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BuscarAnimalOperation {
    private String id;
    private List<Animal> animais;
}
