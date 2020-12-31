package org.mousehole.jungleproblem.animal;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyTest {

    @Test
    public void makeNoise() {
        Monkey monkey = new Monkey(80);
        monkey.makeNoise();
        assertEquals("Monkey noise reduces by 4", monkey.getEnergy(), 76);
    }

    @Test
    public void eat() {
        Monkey monkey = new Monkey(80);
        monkey.eat(FoodTypes.BUGS);
        assertEquals("Monkey eating adds +2 energy", monkey.getEnergy(), 82);
    }

    @Test
    public void sleep() {
        Monkey monkey = new Monkey(80);
        monkey.sleep();
        assertEquals("Monkey sleeping adds +10 energy", monkey.getEnergy(), 90);
    }

    // The following is for when monkeys can play due to high energy
    @Test
    public void playHard() {
        Monkey monkey = new Monkey(80);
        monkey.play();
        assertEquals("Monkey has the energy to play hard", monkey.getEnergy(), 72);
    }

    // The following test case is for the too tired to play case
    @Test
    public void playCant() {
        Monkey monkey = new Monkey(4);
        monkey.play();
        assertEquals("Monkey should prefer to sleep", monkey.getEnergy(), 4);
    }

    @Test
    public void getTest() {
        Monkey monkey = new Monkey(0);
        int count1 = monkey.getCount();
        assertNotEquals("Should not be zero", count1, 0);
        new Monkey(1);
        int count2 = monkey.getCount();
        assertTrue("New monkeys mean more monkeys", count2 > count1);
    }
}