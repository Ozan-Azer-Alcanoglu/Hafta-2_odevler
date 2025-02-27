package org.example.odevler;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Soru_7 {

    public static void main(String[] args) {

        boolean sehirVarmı= false;

        ArrayList<String> sehirler= new ArrayList<>();

        sehirler.add("Kars");
        sehirler.add("Erzurum");
        sehirler.add("Edirne");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");

        Scanner scanner= new Scanner(System.in);

        System.out.println("Şehir ismi girin(büyük harfle başlayın): ");
        String arananSehir= scanner.nextLine();

        for(String sehir:sehirler){
            if(sehir.equals(arananSehir)){
                sehirVarmı=true;
                System.out.println(sehirler.indexOf(sehir)+". indexte aradığınız şehir var");
            }
        }

        if (!sehirVarmı){
            System.out.println("aradığın şehir yok");
        }

    }
}
