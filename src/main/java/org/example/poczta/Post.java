package org.example.poczta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Post {
    //    private Package pack;
    List<Package> packagesList = new ArrayList<>();
    Letter[] letters = new Letter[10];

    public void sendThePackage(Package package1, double price) {
        if (price >= package1.getPrice()) {
            package1.setStatus("nadana");
            System.out.println("Paczka wysłana, reszta to: "
                    + String.format("%.2f zł", (price - package1.getPrice())));
            packagesList.add(package1);
        } else {
            System.out.println("Niewystarczająca kwota, wysłanie tej paczki kosztuje: "
                    + String.format("%.2f zł", package1.getPrice()));
        }

    }

    public void sendTheLetter(Letter letter, double price) {


        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == null) {
                if (price >= letter.getPrice()) {
                    System.out.println("List wysłany, reszta to: "
                            + String.format("%.2f zł", (price - letter.getPrice())));
                    letter.setStatus("nadany");
                    letters[i] = letter;
                    break;
                } else {
                    System.out.println("Niewystarczająca kwota, wysłanie tego listu kosztuje: "
                            + String.format("%.2f zł", letter.getPrice()));
                    break;
                }
            } else if(i==letters.length-1) {
                System.out.println("brak miejsca wysłano dziś już 10 listów");
            }

        }
    }

    public void sendThePostman(){
        Arrays.fill(letters, null);
        System.out.println("Listonosz zabrał listy i poszedł w misto! można znów nadawać listy");
    }


    public Package createPack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię nadawcy");
        String sender = scanner.nextLine();
        System.out.println("Podaj imię adresata");
        String recipient = scanner.nextLine();
        System.out.println("Podaj wagę paczki");
        int weight = scanner.nextInt();
        return new Package(sender, recipient, weight);
    }

    public Package lastSendPack() {
        int listSize = packagesList.size();
        System.out.println("Dane ostatniej paczki to:");
        return packagesList.get(listSize - 1);

    }
}
