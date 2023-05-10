package org.example.kwiaciarnia;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PriceList {
private Map<String, Double> mapPriceList;
    private static PriceList instance;
    private PriceList() {
        mapPriceList = new HashMap<>();
    }

    public static PriceList getInstance() {
        if (instance == null) {
            instance = new PriceList();
        }
        return instance;
    }


    public void put(String flower, Double price) {
        mapPriceList.put(flower, price);
    }

    public Double getPrice(String flower) {
        return mapPriceList.get(flower);
    }
    public boolean containsKey(String item) {
        return mapPriceList.containsKey(item);
    }

    @Override
    public String toString() {
        return "PriceList{" +
                "mapPriceList=" + mapPriceList +
                '}';
    }
}
