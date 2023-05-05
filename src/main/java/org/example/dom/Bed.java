package org.example.dom;

public class Bed {
    private int countDays;

    public Bed(int countDays) {
        this.countDays = countDays;
    }

    public int getCountDays() {
        return countDays;
    }

    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }

    @Override
    public String toString() {
        return
                "Pościel nie była przebierana od " + countDays + " dni";

    }
}
