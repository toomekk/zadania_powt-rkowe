package org.example.kwiaciarnia;


public class ShoppingCart {
    Customer customer;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
//        if (!customer.getShoppingCart().equals(customer.deleteFlower(customer.getCustomerFlowers()))) {
//            return " Wózek własciciel " + customer.getName() + " -- pusto\n";
//        } else {
            return "Wózek właściciel \n" + customer.getName() +
                    customer.customerFlowers;
//        }
    }
}
