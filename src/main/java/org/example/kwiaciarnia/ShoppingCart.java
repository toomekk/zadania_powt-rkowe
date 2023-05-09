package org.example.kwiaciarnia;

import org.example.kwiaciarnia.flowers.Flower;

import java.util.List;

public class ShoppingCart {
    Customer customer;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Przed płaceniem Wózek właściciel Janek\n" +
                customer.customerFlowers;
    }
}
