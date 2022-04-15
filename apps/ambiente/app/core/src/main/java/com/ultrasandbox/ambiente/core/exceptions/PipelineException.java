package com.ultrasandbox.ambiente.core.exceptions;

import com.ultrasandbox.ambiente.core.utils.Processor;
import lombok.Getter;

public class PipelineException extends RuntimeException {

    @Getter
    private final transient Processor<?, ?> processor;

    public PipelineException(Processor<?, ?> processor, Throwable cause) {
        super(cause);
        this.processor = processor;
    }

}
