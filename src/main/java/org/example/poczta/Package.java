package org.example.poczta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Package {
    private final List<String> NAME_LIST = new ArrayList<>(Arrays.asList("Jan Kowalski", "Marek Nowak", "Karol Król", "Ferdynad Kiepski"));
    private String sender;
    private String recipient;
    private int weight;
    private boolean priority;
    private double price;

    public Package(String sender, String recipient, int weight) {
        if (sender.isEmpty() || recipient.isBlank()) {
            throw new IllegalArgumentException("Podaj adresata lub nadwcę");
        }
        this.sender = sender;
        this.recipient = recipient;
        if (weight <= 0) {
            throw new IllegalArgumentException("Waga paczki musi być dodatnia");
        }
        if (weight > 10000) {
            throw new IllegalArgumentException("Waga paczki nie może przekraczać 1000g");
        }
        this.weight = weight;
        this.priority = false;
        this.price = this.checkPrice();

    }

    public Package() {
        Random random = new Random();
        this.sender = NAME_LIST.get(random.nextInt(NAME_LIST.size()));
        this.recipient = NAME_LIST.get(random.nextInt(NAME_LIST.size()));
        this.weight = random.nextInt(1, 10000);
        this.priority = random.nextBoolean();
        this.price = this.checkPrice();
    }

    public double checkPrice() {
        if (weight < 500) {
            price = 5;
        } else if (weight < 1000) {
            price = 8;
        } else if (weight < 2000) {
            price = 12;
        } else {
            price = 12 + (double) (weight - 2000) / 1000;
        }
        if (priority) {
            price = price * 1.1;
        }
        return price;
    }
    public void replacePackageData(Package package1){
        setSender(package1.getSender());
        setRecipient(package1.getRecipient());
        setWeight(package1.getWeight());
        setPriority(package1.priority);
        this.checkPrice();
    }

    public List<String> getNAME_LIST() {
        return NAME_LIST;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String formattedPrice = String.format("%.2f", price);
        return "Package{" +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                ", price=" + formattedPrice +
                '}';
    }
}
