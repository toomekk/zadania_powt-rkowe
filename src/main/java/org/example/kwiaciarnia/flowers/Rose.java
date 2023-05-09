package org.example.kwiaciarnia.flowers;

import org.example.kwiaciarnia.PriceList;

public class Rose extends Flower {
    private int amount;
    private double price;
    private PriceList priceList;
    public Rose(int amount) {
        super("róża", "czerwony");
        this.amount = amount;
//        this.price = priceList.get("róża");
    }

    @Override
    public String toString() {
        return
                super.getName() +
                        " kolor: " + super.getColor() +
                        " ilość " + amount +
//                        " cena " + priceList.get("róża") +
                        "\n";
    }
}
