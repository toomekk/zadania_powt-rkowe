package org.example.kwiaciarnia.flowers;

import org.example.kwiaciarnia.PriceList;

public class Lilac extends Flower {
    private int amount;

    public Lilac(int amount) {
        super("bez", "biały",amount);
        this.amount = amount;
    }
    @Override
    public String toString() {
        PriceList pl = PriceList.getInstance();
        return
                super.getName() +
                        " kolor: " + super.getColor() +
                        " ilość " + getAmount() +
                        " cena " + pl.getPrice("bez") +
                        "\n";
    }
}
