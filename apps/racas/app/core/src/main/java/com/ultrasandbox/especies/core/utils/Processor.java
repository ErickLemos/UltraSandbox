package com.ultrasandbox.racas.core.utils;

@FunctionalInterface
public interface Processor<T, U> {
    U process(T t);
}
