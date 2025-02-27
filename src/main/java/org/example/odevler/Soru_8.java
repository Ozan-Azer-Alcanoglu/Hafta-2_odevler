package org.example.odevler;

import java.util.ArrayList;

public class Soru_8 {

    public static void main(String[] args) {

        ArrayList<Integer> sayılar = new ArrayList<>();

        sayılar.add(1);
        sayılar.add(-1123);
        sayılar.add(1251);
        sayılar.add(113131);
        sayılar.add(134636);
        sayılar.add(1452652);
        sayılar.add(122);
        sayılar.add(14351);
        sayılar.add(11451);
        sayılar.add(111523);


        int min=sayılar.get(0);
        int max=sayılar.get(0);

        for (int i = 1; i < sayılar.size(); i++) {
            int sayı = sayılar.get(i);

            if (sayı < min) {
                min = sayı;
            }

            if (sayı > max) {
                max = sayı;
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}
