package com.ultrasandbox.ambiente.business.animal.models;

import com.ultrasandbox.ambiente.domain.models.Animal;
import lombok.Data;

import java.util.List;

@Data
public class BuscarAnimalOperation {

    private String id;
    private List<Animal> animais;

}
