package org.mousehole.jungleproblem.animal;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {

    @Test
    public void makeNoise() {
        Snake snake = new Snake(80);
        snake.makeNoise();
        assertEquals("Expect to lose 3 energy making noise",snake.getEnergy(),77);
    }

    @Test
    public void eat() {
        Snake snake = new Snake(80);
        snake.eat(FoodTypes.MEAT);
        assertEquals("Expect to gain 5 energy eating",snake.getEnergy(),85);
    }

    @Test
    public void sleep() {
        Snake snake = new Snake(80);
        snake.sleep();
        assertEquals("Expect to gain 10 energy from sleep",snake.getEnergy(),90);
    }

    @Test
    public void getCount() {
        Snake snake1 = new Snake(40);
        int count1 = snake1.getCount();
        assertNotEquals("Snakes should be greater than zero", 0, count1);
        new Snake(50);
        int count2 = snake1.getCount();
        assertTrue("Adding a snake should increase the number of snakes", count2 > count1);
    }
}
