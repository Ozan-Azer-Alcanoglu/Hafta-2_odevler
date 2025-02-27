package org.example.odevler;

import java.util.*;

public class Soru_1_2_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] sayıDizi = new int[10];
        int toplam = 0;
        int pozitifAdet = 0, negatifAdet = 0;
        int pozitifToplam =0, negatifToplam=0;
        boolean esSayı = false;
        boolean ellidenBüyük = false;

        System.out.println("Lütfen 10 adet tam sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayıDizi[i] = scanner.nextInt();
            toplam += sayıDizi[i];

            if (sayıDizi[i] > 0) {
                pozitifToplam+=i;
                pozitifAdet++;
            }
            else if (sayıDizi[i] < 0) {
                negatifToplam-=i;
                negatifAdet++;
            }
        }


        double ortalama = (double) toplam / 10;
        System.out.println("Girilen sayıların ortalaması: " + ortalama+"\n");

        System.out.println("50’den büyük olan sayılar:");
        for (int num : sayıDizi) {
            if (num > 50) {
                ellidenBüyük=true;
                System.out.println(num);
            }
        }

        if(!ellidenBüyük){
            System.out.println("50 den büyük sayı yok\n");
        }

        System.out.println("Tekrar eden elemanlar:");

        for (int i = 0; i < sayıDizi.length - 1; i++) {
            if (sayıDizi[i] == sayıDizi[i + 1]) {
                if (i == 0 || sayıDizi[i] != sayıDizi[i - 1]) {
                    System.out.println(sayıDizi[i]);
                    esSayı = true;
                }
                while (i < sayıDizi.length - 1 && sayıDizi[i] == sayıDizi[i + 1]) {
                    i++;
                }
            }
        }

        System.out.println("\n");

        if (!esSayı) {
            System.out.println("Tekrar eden eleman yok.\n");
        }

        System.out.println("Pozitif sayı adedi: " + pozitifAdet + ", Pozitiflerin toplamı: "+pozitifToplam );
        System.out.println("Negatif sayı adedi: " + negatifAdet + ", Negatiflerin toplamı: "+negatifToplam);

    }
}
