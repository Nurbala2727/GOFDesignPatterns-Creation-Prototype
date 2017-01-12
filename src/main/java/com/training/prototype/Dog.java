package com.training.prototype;

/**
 * Created by adame on 1/11/2017.
 */
public class Dog implements Animal{
    @Override
    public Animal makeClone() {
        Dog dog = new Dog();

        try {
            dog = (Dog)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            //todo logger
        }

        return dog;
    }
}
