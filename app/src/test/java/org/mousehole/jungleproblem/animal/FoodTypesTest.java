package org.mousehole.jungleproblem.animal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FoodTypesTest {

    @Test
    public void getRandomType() {
        List<FoodTypes> series = new ArrayList<>(100);
        for(int i = 0; i < 100; i++) {
            series.add(i,FoodTypes.getRandomType());
        }
        assertTrue(series.contains(FoodTypes.BUGS));
        assertTrue(series.contains(FoodTypes.MEAT));
        assertTrue(series.contains(FoodTypes.FISH));
        assertTrue(series.contains(FoodTypes.GRAIN));
    }
}