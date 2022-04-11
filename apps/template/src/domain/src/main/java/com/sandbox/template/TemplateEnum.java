package com.sandbox.template;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public enum TemplateEnum {
    EXEMPLO_UM("exemplo_um"),
    EXEMPLO_DOIS("exemplo_dois");

    private String valor;
}
