package org.example.kwiaciarnia;

import org.example.kwiaciarnia.Box;
import org.example.kwiaciarnia.Customer;
import org.example.kwiaciarnia.ShoppingCart;
import org.example.kwiaciarnia.flowers.Lilac;
import org.example.kwiaciarnia.flowers.Freesia;
import org.example.kwiaciarnia.flowers.Peony;
import org.example.kwiaciarnia.PriceList;
import org.example.kwiaciarnia.flowers.Rose;

public class FloristsTest {
    // definicja metody sumowania wartosci kwiatów o podanym kolorze
    static int valueOf(Box box, String color) {
        /*<- tu trzeba wpisac kod metody */
        return 1;
    }

    public static void main(String[] args) {
        // Kwiaciarnia samoobsługowa
        // ustalenie cennika
        PriceList pl = PriceList.getInstance();
        pl.put("róża", 10.0);
        pl.put("bez", 12.0);
        pl.put("piwonia", 8.0);

        // Przychodzi klient janek. Ma 200 zł
        Customer janek = new Customer("Janek", 200);

        // Bierze różne kwiaty: 5 róż, 5 piwonii, 3 frezje, 3 bzy
        janek.add(new Rose(5));
        janek.add(new Peony(5));
        janek.add(new Freesia(3));
        janek.add(new Lilac(3));

        // Pewnie je umieścił na wózku sklepowyem
        // Zobaczmy co tam ma
        ShoppingCart wozekJanka = janek.getShoppingCart();
        System.out.println("Przed płaceniem " + wozekJanka);
//
//        // Teraz za to zapłaci...
//        janek.pay();
//
//        // Czy przypadkiem przy płaceniu nie okazało się,
//        // że w koszu są kwiaty na które nie ustalono jeszcze ceny?
//        // W takim arzie zostałyby usunięte z wózka i Janek nie płaciłby za nie
//        // Również może mu zabraknąc pieniędzy, wtedy też kwaity są odkładane.
//
//        System.out.println("Po zapłaceniu " + janek.getShoppingCart());
//
//        // Ile Jankowi zostało pieniędzy?
//        System.out.println("Jankowi zostało : " + janek.getCash() + " zł");
//
//        // Teraz jakos zapakuje kwiaty (może do pudełka)
//        Box pudelkoJanka = new Box(janek);
//        janek.pack(pudelkoJanka);
//
//        // Co jest teraz w wózku Janka...
//        // (nie powinno już nic być)
//        System.out.println("Po zapakowaniu do pudełka " + janek.getShoppingCart());
//
//        // a co w pudełku
//        System.out.println(pudelkoJanka);
//
//        // Zobaczmy jaka jest wartość czerwonych kwiatów w pudełku Janka
//        System.out.println("Czerwone kwiaty w pudełku Janka kosztowały: "
//                + valueOf(pudelkoJanka, "czerwony"));
//
//        // Teraz przychodzi Stefan
//        // ma tylko 60 zł
//        Customer stefan = new Customer("Stefan", 60);
//
//        // Ale nabrał kwiatów nieco za dużo jak na tę sumę
//        stefan.add(new Lilac(3));
//        stefan.add(new Rose(5));
//
//        // co ma w wózku
//        System.out.println(stefan.getShoppingCart());
//
//        // płaci i pakuje do pudełka
//        stefan.pay();
//        Box pudelkoStefana = new Box(stefan);
//        stefan.pack(pudelkoStefana);
//
//        // co ostatecznie udało mu się kupić
//        System.out.println(pudelkoStefana);
//        // ... i ile zostało mu pieniędzy
//        System.out.println("Stefanowi zostało : " + stefan.getCash() + " zł");
    }
}
