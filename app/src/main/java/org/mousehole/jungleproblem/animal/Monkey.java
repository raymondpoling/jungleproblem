package org.mousehole.jungleproblem.animal;

public class Monkey extends Animal {

    private static int count = 0;

    public Monkey(int energy) {
        count += 1;
        this.energy = energy;
    }

    @Override
    public void makeNoise() {
        energy -= 4;
        System.out.println("The Monkey ooks.");
    }

    @Override
    public void eat(FoodTypes foodType) {
        energy += 2;
        System.out.println("The Monkey eats.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("The Monkey takes a nap.");
    }

    @Override
    public int getCount() {
        return count;
    }

    public void play() {
        if(energy >= 8) {
            energy -= 8;
            System.out.println("Oooo Oooo Oooo");
        } else {
            System.out.println("The monkey is too tired");
        }
    }
}
