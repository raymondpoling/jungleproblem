package org.mousehole.jungleproblem.animal;

import java.util.Random;

// might want to switch to a context for animal counting, instead of static.
public abstract class Animal {

    protected int energy;

    protected Random rand = new Random();

    public void makeNoise() {
        energy = energy - 3;
    }

    public void eat(FoodTypes foodTypes) {
        energy = energy + 5;
    }

    public void sleep() {
        energy = energy + 10;
    }
    
    public int getEnergy() {
        return energy;
    }

    public abstract int getCount();
}
