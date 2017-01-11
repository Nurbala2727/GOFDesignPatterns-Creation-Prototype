package com.training.prototype;

public class Client {
    public static void main(String[] args) {
        CloneFactory cloneAnimals = new CloneFactory();

        Sheep dolly = new Sheep();

        Sheep clonedDolly = (Sheep)cloneAnimals.getClone(dolly);

        System.out.println("Dolly hash: " + dolly.hashCode());
        System.out.println("Cloned hash: " + clonedDolly.hashCode());
    }
}