package org.example.kwiaciarnia;

import org.example.kwiaciarnia.flowers.Flower;

import java.util.LinkedList;
import java.util.List;

public class Box {
    private Customer customer;
    private List<Flower> flowerBoxList;

    public Box(Customer customer) {
        this.customer = customer;
        this.flowerBoxList = new LinkedList<>();
    }


    public List<Flower> getFlowerBoxList() {
        return flowerBoxList;
    }


    @Override
    public String toString() {
        return "Pudełko " +
                "właściciel " +
                customer.getName() + "\n" +
                flowerBoxList;
    }
}
