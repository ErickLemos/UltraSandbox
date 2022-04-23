package com.ultrasandbox.template.domain.models;

import com.ultrasandbox.template.domain.models.geografia.Composicao;
import com.ultrasandbox.template.domain.models.geografia.Regiao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geografia {

    private String id;
    private Composicao composicao;
    private List<Regiao> regioes;

}
