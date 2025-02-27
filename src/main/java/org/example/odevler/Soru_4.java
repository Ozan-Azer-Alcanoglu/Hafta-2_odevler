package org.example.odevler;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayıDizi = new ArrayList<>();
        ArrayList<Integer> sıralıDizi = new ArrayList<>();


        System.out.println("Lütfen 10 sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            int sayı = scanner.nextInt();
            sayıDizi.add(sayı);
        }

        for (int i = 0; i < sayıDizi.size() - 1; i++) {
            for (int j = i + 1; j < sayıDizi.size(); j++) {
                if (sayıDizi.get(i) < sayıDizi.get(j)) {

                    int temp = sayıDizi.get(i);
                    sayıDizi.set(i, sayıDizi.get(j));
                    sayıDizi.set(j, temp);
                }
            }
        }


        System.out.println("\nBüyükten küçüğe sıralanmış sayılar:");
        for (int num : sayıDizi) {
            sıralıDizi.add(num);
        }
        System.out.println(sıralıDizi);




    }
}
