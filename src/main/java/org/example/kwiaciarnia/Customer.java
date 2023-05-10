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
        this.customerFlowers = new ArrayList<>();
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

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double pay() {
        double toPay = 0;
        PriceList pl = PriceList.getInstance();
        deleteFlower(customerFlowers);
        for (Flower f : customerFlowers) {
            if (pl.containsKey(f.getName()) && (cash - pl.getPrice(f.getName()) * (f.getAmount())) >= 0) {
                toPay = toPay + pl.getPrice(f.getName()) * (f.getAmount());
                setCash(cash - pl.getPrice(f.getName()) * (f.getAmount()));
            }//todo napisać implementację usuwania z listy kwiatków na które nie ma pieniędzy
        }
//        System.out.println("to pay wynosi " + toPay);
        return toPay;
    }


    public List<Flower> deleteFlower(List<Flower> customerFlowers) {
        PriceList pl = PriceList.getInstance();
        for (Flower f : customerFlowers) {
            if (!pl.containsKey(f.getName())) {
                customerFlowers.remove(f);
            }
        }
        return customerFlowers;
    }


    public void pack(Box customerBox) {
        for (Flower f : customerFlowers) {
            customerBox.getFlowerBoxList().add(f);
        }
        customerFlowers.clear();
//        System.out.println("!!!!!!!!!!!!!!!!" + customerFlowers);
    }
}
