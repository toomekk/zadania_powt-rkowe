package org.example.poczta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Post {
//    private Package pack;
    List<Package> packagesList = new ArrayList<>();

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
