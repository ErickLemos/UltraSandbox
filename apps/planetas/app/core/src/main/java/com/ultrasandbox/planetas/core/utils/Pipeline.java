package com.ultrasandbox.planetas.core.utils;

import com.ultrasandbox.planetas.core.exceptions.PipelineException;
import lombok.Getter;

public class Pipeline<T> {

    @Getter
    private final T output;

    private Pipeline(T output) {
        this.output = output;
    }

    public static Pipeline<Void> of() {
        return new Pipeline<>(null);
    }

    public static <T2> Pipeline<T2> of(T2 input) {
        return new Pipeline<>(input);
    }

    public <T2> Pipeline<T2> process(Processor<T, T2> processor) {
        try {
            final T2 newOutput = processor.process(output);
            return new Pipeline<>(newOutput);
        } catch (Exception e) {
            throw new PipelineException(processor, e);
        }
    }

}
