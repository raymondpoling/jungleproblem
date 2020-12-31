package org.mousehole.jungleproblem.animal;

public class BasicAnimal extends Animal {
    private static int count = 0;

    public BasicAnimal(int energy) {
        this.energy = energy;
        count += 1;
    }

    @Override
    public int getCount() {
        return count;
    }
}

