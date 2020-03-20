package com.nrc7.adapter2.model;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public DataSource() {
    }

    public List<Dog> getDogs() {
        List<Dog> dogs = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Dog dog = new Dog();
            dog.setName("Dog " + i);
            dog.setBreed("Breed " + i);
            dogs.add(dog);
        }
        return dogs;
    }
}
