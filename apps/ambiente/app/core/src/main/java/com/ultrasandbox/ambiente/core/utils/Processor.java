package com.ultrasandbox.ambiente.core.utils;

@FunctionalInterface
public interface Processor<T, U> {
    U process(T t);
}
