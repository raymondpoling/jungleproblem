package org.mousehole.jungleproblem.jungle;

import org.mousehole.jungleproblem.animal.Animal;
import org.mousehole.jungleproblem.animal.FoodTypes;
import org.mousehole.jungleproblem.animal.Monkey;

import java.util.List;
import java.util.Random;

public class Jungle {

    private List<Animal> animals;
    private Random random = new Random();

    public Jungle(List<Animal> animals) {
        this.animals = animals;
    }

    public void soundOff() {
        for(Animal animal: animals) {
            animal.makeNoise();
            System.out.println("Energy is " + animal.getEnergy());
        }
    }

    // Jungle needs to know too much about monkeys...
    public void randomAct(Monkey monkey) {
        int select = random.nextInt(4);
        switch(select) {
            case 0: monkey.makeNoise();
            case 1: monkey.eat(FoodTypes.getRandomType());
            case 2: monkey.sleep();
            case 3: monkey.play();
        }
    }

    public void randomAct(Animal animal) {
        int select = random.nextInt(3);
        switch(select) {
            case 0: animal.makeNoise();
            case 1: animal.eat(FoodTypes.getRandomType());
            case 2: animal.sleep();
        }
    }
}
