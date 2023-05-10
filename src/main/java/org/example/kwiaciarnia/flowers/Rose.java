package org.example.kwiaciarnia.flowers;

import org.example.kwiaciarnia.PriceList;

public class Rose extends Flower {
//    private int amount;

//    public int getAmount() {
//        return amount;
//    }

    private double price;
    private PriceList priceList;
    public Rose(int amount) {
        super("róża", "czerwony",amount);

//        this.price = priceList.get("róża");
    }

    @Override
    public String toString() {
        PriceList pl = PriceList.getInstance();
        return
                super.getName() +
                        " kolor: " + super.getColor() +
                        " ilość " + getAmount() +
                        " cena " + pl.getPrice("róża") +
                        "\n";
    }
}
