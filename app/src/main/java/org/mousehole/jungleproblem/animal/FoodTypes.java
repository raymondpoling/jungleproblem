package org.mousehole.jungleproblem.animal;

import java.util.Random;

public enum FoodTypes {
    MEAT, FISH, BUGS, GRAIN;

    private static Random random = new Random();

    public static FoodTypes getRandomType() {
        return FoodTypes.values()[random.nextInt(FoodTypes.values().length)];
    }
}
