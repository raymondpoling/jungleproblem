package org.mousehole.jungleproblem.animal;

import org.junit.Test;

import static org.junit.Assert.*;

public class TigerTest {

    @Test
    public void makeNoise() {
        Tiger tiger = new Tiger(80);
        tiger.makeNoise();
        assertEquals("Tiger should lose 3 energy roaring", tiger.getEnergy(), 77);
    }

    @Test
    public void eatMeat() {
        Tiger tiger = new Tiger(90);
        tiger.eat(FoodTypes.MEAT);
        assertEquals("Tiger should gain 5 eating meat", 95, tiger.getEnergy());
    }

    @Test
    public void eatGrain() {
        Tiger tiger = new Tiger(90);
        tiger.eat(FoodTypes.GRAIN);
        assertEquals("Tiger should gain 'nothing' eating grain", 90, tiger.getEnergy());
    }

    @Test
    public void sleep() {
        Tiger tiger = new Tiger(95);
        tiger.sleep();
        assertEquals("Tiger gets 5 energy from sleeping", 100, tiger.getEnergy());
    }

    @Test
    public void getCount() {
        Tiger tiger1 = new Tiger(40);
        int count1 = tiger1.getCount();
        assertNotEquals("Tigers should be greater than zero", 0, count1);
        new Tiger(50);
        int count2 = tiger1.getCount();
        assertTrue("Adding a tiger should increase the number of tigers", count2 > count1);
    }
}