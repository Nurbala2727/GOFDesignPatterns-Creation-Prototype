package com.training.prototype;

public class CloneFactory {
    public Animal getClone(Animal baseAnimal) {
        return baseAnimal.makeClone();
    }
}