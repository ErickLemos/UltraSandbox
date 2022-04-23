package com.ultrasandbox.planetas.core.utils;

@FunctionalInterface
public interface Processor<T, U> {
    U process(T t);
}
