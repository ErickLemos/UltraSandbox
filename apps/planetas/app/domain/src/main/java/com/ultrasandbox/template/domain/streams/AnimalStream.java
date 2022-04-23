package com.ultrasandbox.template.domain.streams;

import com.ultrasandbox.template.domain.utils.StreamPersonalizada;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public class AnimalStream implements StreamPersonalizada<Animal> {

    Stream<Animal> stream;

    public static AnimalStream of(Animal animal) {
        return new AnimalStream(Stream.of(animal));
    }

}
