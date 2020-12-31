package org.mousehole.jungleproblem.animal;

public class Tiger extends Animal {

    private static int count = 0;

    public Tiger(int energy) {
        count += 1;
        this.energy = energy;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("The Tiger roars.");
    }

    @Override
    public void eat(FoodTypes foodType) {
        if(foodType != FoodTypes.GRAIN) {
            super.eat(foodType);
            System.out.println("The Tiger eats.");
        } else {
            System.out.println("The Tiger wants to eat, but it can't eat grains!");
        }
    }

    @Override
    public void sleep() {
        energy += 5;
        System.out.println("The Tiger takes a nap.");
    }

    @Override
    public int getCount() {
        return count;
    }
}
