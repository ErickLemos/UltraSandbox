package com.sandbox.template.services;

import com.sandbox.template.core.constants.ApplicationConstants;
import com.sandbox.template.core.services.TemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemplateServiceImpl implements TemplateService {

    @Override
    public String getVersao() {
        return ApplicationConstants.VERSAO;
    }

}
