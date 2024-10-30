package com.elif;

import java.util.Scanner;

public class YolculukMaliyeti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Araba yaşını girin: ");
        int arabaYasi = scanner.nextInt();

        System.out.print("Yolculuğun KM'sini girin: ");
        int km = scanner.nextInt();

        System.out.print("Aracın motor tipini girin (L/H): ");
        char motorTipi = scanner.next().charAt(0);

        double toplamMaliyet = 0;

        if (motorTipi == 'L' || motorTipi == 'l') {
            toplamMaliyet = (km / 100.0) * 3.3 * 1.6;
        } else if (motorTipi == 'H' || motorTipi == 'h') {
            toplamMaliyet = (km / 100.0) * 4.2 * 1.6;
        } else {
            System.out.println("Hata: L veya H girin.");
            return;
        }

        if (arabaYasi > 7 && arabaYasi <= 12) {
            toplamMaliyet *= 1.03;
        } else if (arabaYasi > 12) {
            toplamMaliyet *= 1.07;
        }

        System.out.println("Toplam maliyet: " + toplamMaliyet + " ₺");
        scanner.close();
    }
}
