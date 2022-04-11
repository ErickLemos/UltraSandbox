package com.sandbox.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping
    public String getVersao() {
        return "0.0.1";
    }

}
