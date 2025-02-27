package org.example.odevler;

import java.util.Arrays;

public class Soru_10 {

    public static void main(String[] args) {


        int[] sayilar = {5,2,8,1,3};

        // 1. sort()  diziyi küçükten büyüğe doğru sıralıyoruz
        Arrays.sort(sayilar);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(sayilar)); // [1, 2, 3, 5, 8]

        // 2. fill() dizi elemanlarını verilen değer ile değiştirir
        Arrays.fill(sayilar, 7);
        System.out.println("Doldurulmuş dizi: " + Arrays.toString(sayilar)); // [7, 7, 7, 7, 7]

        // 3. equals() iki diziyi karşılaştırır
        int[] dizi1 = {1,2,3};
        int[] dizi2 = {1,2,3};
        int[] dizi3 = {4,5,6};

        System.out.println("dizi1 ve dizi2 eşit mi? " + Arrays.equals(dizi1, dizi2)); // true cevap döner
        System.out.println("dizi1 ve dizi3 eşit mi? " + Arrays.equals(dizi1, dizi3)); // false döner

        // 4. copyOfRange() Bir dizinin belirli bir aralığını kopyalar dizinin 2. indeksten 4. indexe kadar olan kısmını kopyalar 5 dahil değil
        int[] kopyalananDizi = Arrays.copyOfRange(sayilar, 2, 5);
        System.out.println("Kopyalanan dizi: " + Arrays.toString(kopyalananDizi)); // [7, 7, 7]

        // 5. binarySearch() Sıralı dizide öğe arar diziyi sıralı hale getirdikten sonra ikili arama ile 7 yi arıyoruz

        int indeks = Arrays.binarySearch(sayilar, 7);
        System.out.println("7'nin indeksi: " + indeks); // 2

    }

}
