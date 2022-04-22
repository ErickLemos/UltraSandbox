package com.ultrasandbox.template.core.exceptions;

import com.ultrasandbox.template.core.utils.Processor;
import lombok.Getter;

public class PipelineException extends RuntimeException {

    @Getter
    private final transient Processor<?, ?> processor;

    public PipelineException(Processor<?, ?> processor, Throwable cause) {
        super(cause);
        this.processor = processor;
    }

}
