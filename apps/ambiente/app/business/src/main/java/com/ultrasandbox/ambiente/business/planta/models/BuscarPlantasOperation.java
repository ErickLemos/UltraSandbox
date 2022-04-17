package com.ultrasandbox.ambiente.business.planta.models;

import com.ultrasandbox.ambiente.domain.models.Planta;
import lombok.Data;

import java.util.List;

@Data
public class BuscarPlantasOperation {

    private String id;
    private List<Planta> plantas;

}
