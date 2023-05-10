package org.example.kwiaciarnia.flowers;

import org.example.kwiaciarnia.PriceList;

public class Peony extends Flower {
    private int amount;
    public Peony(int amount) {
        super("piwonia", "czerwony",amount);
        this.amount = amount;
    }

    @Override
    public String toString() {
        PriceList pl = PriceList.getInstance();
        return
                super.getName() +
                        " kolor: " + super.getColor() +
                        " ilość " + getAmount() +
                        " cena " + pl.getPrice("piwonia") +
                        "\n";
    }
}
