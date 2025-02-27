package org.example.odevler;

import java.util.ArrayList;
import java.util.Random;

public class Soru_6 {
    public static void main(String[] args) {

        Random random= new Random();

        ArrayList<Integer> sayıDizisi= new ArrayList<>();
        ArrayList<Integer> ciftSayıDizisi= new ArrayList<>();

        for (int i = 0; i <20; i++) {
            int sayi=random.nextInt(50);
            sayıDizisi.add(sayi);
            if (sayi%2==0){
                ciftSayıDizisi.add(sayi);
            }
        }

        System.out.println("Sayılar:\n"+sayıDizisi);
        System.out.println("\n");
        System.out.println("Çift sayılar:\n"+ciftSayıDizisi);

    }
}
