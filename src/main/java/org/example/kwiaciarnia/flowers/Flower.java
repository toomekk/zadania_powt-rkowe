package org.example.kwiaciarnia.flowers;

import org.example.kwiaciarnia.PriceList;

public abstract class Flower {

    private String name;
    private String color;
    private int amount;


    public Flower(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
