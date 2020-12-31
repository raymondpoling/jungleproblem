package org.mousehole.jungleproblem.animal;

public class Snake extends Animal {

    private static int count = 0;

    public Snake(int energy) {
        count += 1;
        this.energy = energy;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("The snake goes hiss, and has energy " + energy);
    }

    @Override
    public void eat(FoodTypes foodType) {
        super.eat(foodType);
        System.out.println("The Snake eats, and has energy " + energy);
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("The snake takes a nap, and has energy " + energy);
    }

    @Override
    public int getCount() {
        return count;
    }
}
