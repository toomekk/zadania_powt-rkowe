package org.example.kwiaciarnia;

import org.example.kwiaciarnia.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double cash;
    List<Flower> customerFlowers;

    public List<Flower> getCustomerFlowers() {
        return customerFlowers;
    }


    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.customerFlowers= new ArrayList<>();
    }

    public void add(Flower flower) {
        customerFlowers.add(flower);
    }

    public String getName() {
        return name;
    }


    public double getCash() {
        return cash;
    }


    public ShoppingCart getShoppingCart() {
        ShoppingCart wozek = new ShoppingCart(this);
        return wozek;
    }

    @Override
    public String toString() {
        return "Cart "
               + getCustomerFlowers();

    }

    public void pay() {
    }
}
