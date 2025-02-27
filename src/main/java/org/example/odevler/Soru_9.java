package org.example.odevler;

import java.util.ArrayList;

public class Soru_9 {

    public static void main(String[] args) {


        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Izmir");
        sehirler.add("Bursa");

        // 1. get(index) verilen indexteki elemanı getirir

        System.out.println("2. indeksindeki şehir: " + sehirler.get(2)); // İzmir

        // 2. set(index, element) - ilk parametre işlem yapılacak elemanın indexsi 2. ise yerine gelecek elemandır

        sehirler.set(1, "Antalya");
        System.out.println("Güncellenmiş şehirler: " + sehirler); // [Ankara, Antalya, Izmir, Bursa]

        // 3. remove(index) verilen indeksteki öğeyi kaldırır
        String silinenSehir = sehirler.remove(3);
        System.out.println("Silinen şehir: " + silinenSehir); // Bursa
        System.out.println("Güncellenmiş şehirler: " + sehirler); // [Ankara, Antalya, Izmir]

        // 4. clear()  Listeyi temizler,elemanlarını siler
        sehirler.clear();
        System.out.println("Liste temizlendi: " + sehirler); // []

        // 5. size() Listedeki eleman sayısını verir
        sehirler.add("Konya");
        sehirler.add("Samsun");
        int sehirSayisi = sehirler.size();
        System.out.println("Şehir sayısı: " + sehirSayisi); // 2
    }
}
