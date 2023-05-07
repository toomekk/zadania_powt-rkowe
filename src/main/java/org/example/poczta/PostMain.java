package org.example.poczta;

public class PostMain {
    public static void main(String[] args) {
        final Package package1 = new Package("a", " h", 4190);
//        final Package package2 = new Package();
//        Package package3 = null;
//        System.out.println(package1.getPrice());
//        System.out.println(package2.getWeight());
//        System.out.println(package2.getPrice());
//        package3 = package1;
//        System.out.println("cena paczki 3 to: " + package3.checkPrice());
//
//
//        Package[] packages = new Package[]{package1, package2, package3};
//        System.out.println(packages[0]);


        Package[] packages100 = new Package[100];
        for (int i = 0; i < 100; i++) {
            packages100[i] = new Package();
        }
        double totalCost = 0;
        for (Package p :
                packages100) {
            System.out.println(p);
            totalCost = totalCost + p.getPrice();
        }
        System.out.println("Koszt wysłania wszystkich paczek to: " + String.format("%.2f",totalCost));

        Post post = new Post();
        post.sendThePackage(package1,15);

        Package newPack = post.createPack();
        post.sendThePackage(newPack,15);

        System.out.println(post.lastSendPack());

    }
}
