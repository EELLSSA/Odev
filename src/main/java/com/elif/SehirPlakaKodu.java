package com.elif;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SehirPlakaKodu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Şehir ve plaka kodlarını içeren bir harita oluştur
        Map<String, String> sehirPlaka = new HashMap<>();
        sehirPlaka.put("Adana", "01");
        sehirPlaka.put("Adıyaman", "02");
        sehirPlaka.put("Afyon", "03");
        sehirPlaka.put("Balıkesir", "10");
        sehirPlaka.put("Bilecik", "11");
        sehirPlaka.put("Bingöl", "12");
        sehirPlaka.put("Bitlis", "13");
        sehirPlaka.put("Denizli", "20");

        System.out.print("Şehir adını giriniz: ");
        String sehir = scanner.nextLine().trim();

        // Şehri kontrol et ve plaka kodunu yazdır
        String plaka = sehirPlaka.get(sehir.substring(0, 1).toUpperCase() + sehir.substring(1).toLowerCase());
        if (plaka != null) {
            System.out.println("Plaka: " + plaka);
        } else {
            System.out.println("Şehir bulunamadı.");
        }

    }
}
