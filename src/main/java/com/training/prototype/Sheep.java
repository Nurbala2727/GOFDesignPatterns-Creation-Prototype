package com.training.prototype;

public class Sheep implements Animal {

    @Override
    public Animal makeClone() {
        Sheep sheep = new Sheep();

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            //todo use logger.
        }

        return sheep;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}