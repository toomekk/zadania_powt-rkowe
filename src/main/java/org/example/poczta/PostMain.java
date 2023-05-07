package org.example.poczta;

public class PostMain {
    public static void main(String[] args) {
        final Package package1 = new Package("a", " h", 4190);
        final Package package2 = new Package();
        Package package3 = null;
        System.out.println(package1.getPrice());
        System.out.println(package2.getWeight());
        System.out.println(package2.getPrice());
        package3 = package1;
        System.out.println("cena paczki 3 to: " + package3.checkPrice());
        System.out.println(package2);

    }
}
