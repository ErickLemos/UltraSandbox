package com.sandbox.template;

import com.sandbox.template.core.constants.ApplicationConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersaoController {

    @GetMapping
    public String getVersao() {
        return ApplicationConstants.VERSAO;
    }

}
