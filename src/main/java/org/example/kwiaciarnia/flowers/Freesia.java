package org.example.kwiaciarnia.flowers;

import org.example.kwiaciarnia.PriceList;

public class Freesia extends Flower {
    private int amount;
    PriceList priceList;

    public Freesia(int amount) {
        super("frezja", "żółty",amount);
        this.amount = amount;
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
