package org.example.kosci;

import java.util.Random;

public class Dice {
    private int sides;
    private int value;
    Random random = new Random();

    public Dice(int sides) {
        this.sides = sides;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void throwDice(){

       setValue(random.nextInt(1,sides + 1));
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "sides=" + sides +
                ", value=" + value +
                '}';
    }
}
