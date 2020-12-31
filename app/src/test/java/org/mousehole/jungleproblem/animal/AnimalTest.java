package org.mousehole.jungleproblem.animal;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void makeNoise() {
        Animal animal = new BasicAnimal(80);
        animal.makeNoise();
        assertEquals("Expect to lose 3 energy making noise",animal.getEnergy(),77);
    }

    @Test
    public void eat() {
        Animal animal = new BasicAnimal(80);
        animal.eat(FoodTypes.getRandomType());
        assertEquals("Expect to gain 5 energy eating",animal.getEnergy(),85);
    }

    @Test
    public void sleep() {
        Animal animal = new BasicAnimal(80);
        animal.sleep();
        assertEquals("Expect to gain 10 energy from sleep",animal.getEnergy(),90);
    }

    @Test
    public void getCount() {
        Animal animal = new BasicAnimal(12);// should guarentee at least one
        assertNotEquals(animal.getCount(),0);
    }
}
