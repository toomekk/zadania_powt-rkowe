package org.example.poczta;

public class Letter {

    private Address senderAddress;
    private Address recipientAddress;
    private boolean priority;
    private double price;
    private String status;




    public Letter(Address senderAddress, Address recipientAddress) {

        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.status = "Nienadana";
        this.priority = false;
        this.price = checkPrice();
    }

    public double checkPrice() {
        if (priority) {
            price = 8;
        } else
            price = 6;
        return price;
    }

    public Address getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(Address senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Address getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(Address recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "senderAddress=" + senderAddress +
                ", recipientAddress=" + recipientAddress +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
