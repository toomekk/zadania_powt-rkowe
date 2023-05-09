package org.example.kwiaciarnia.flowers;

import org.example.kwiaciarnia.PriceList;

public class Freesia extends Flower {
    private int amount;
    PriceList priceList;

    public Freesia(int amount) {
        super("frezja", "żółty");
        this.amount = amount;
    }

    @Override
    public String toString() {
        return
                super.getName() +
                        " kolor: " + super.getColor() +
                        " ilość " + amount +
//                        " cena " + priceList.get("frezja") +
                        "\n";
    }
}
