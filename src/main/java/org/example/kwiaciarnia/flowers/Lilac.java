package org.example.kwiaciarnia.flowers;

public class Lilac extends Flower {
    private int amount;

    public Lilac(int amount) {
        super("bez", "biały");
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
