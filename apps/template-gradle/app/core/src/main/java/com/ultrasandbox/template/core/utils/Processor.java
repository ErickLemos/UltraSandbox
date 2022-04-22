package com.ultrasandbox.template.core.utils;

@FunctionalInterface
public interface Processor<T, U> {
    U process(T t);
}
