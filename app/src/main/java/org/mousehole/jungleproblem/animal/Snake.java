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
        System.out.println("The snake goes hiss.");
    }

    @Override
    public void eat(FoodTypes foodType) {
        super.eat(foodType);
        System.out.println("The Snake eats.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("The snake takes a nap.");
    }

    @Override
    public int getCount() {
        return count;
    }
}
