package org.example.odevler;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> kelimeler = new ArrayList<>();
        ArrayList<String> sıralıKelimeler = new ArrayList<>();

        System.out.println("Lütfen 10 kelime girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Kelime " + (i + 1) + ": ");
            kelimeler.add(scanner.nextLine());
        }

        for (int i = 0; i < kelimeler.size() - 1; i++) {
            for (int j = i + 1; j < kelimeler.size(); j++) {
                if (kelimeler.get(i).compareTo(kelimeler.get(j)) > 0) {

                    String temp = kelimeler.get(i);
                    kelimeler.set(i, kelimeler.get(j));
                    kelimeler.set(j, temp);
                }
            }
        }

        System.out.println("\nAlfabetik sırayla sıralanmış kelimeler:");
        for (String kelime : kelimeler) {
            sıralıKelimeler.add(kelime);
        }

        System.out.println(sıralıKelimeler);


    }
}
