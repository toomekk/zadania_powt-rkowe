package org.example.kwiaciarnia.flowers;

public class Peony extends Flower {
    private int amount;
    public Peony(int amount) {
        super("piwonia", "czerwony");
        this.amount = amount;
    }

    @Override
    public String toString() {
        return
                super.getName() +
                " kolor: " + super.getColor() +
                " ilość " + amount  + "\n";
    }
}
