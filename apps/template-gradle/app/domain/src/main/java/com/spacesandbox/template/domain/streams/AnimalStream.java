package com.spacesandbox.template.domain.streams;

import com.spacesandbox.template.domain.models.Animal;
import com.spacesandbox.template.domain.utils.StreamPersonalizada;
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

    public Stream<Animal> bipedes() {
        return stream.filter(animal -> animal.getPatas().equals(2));
    }

}
