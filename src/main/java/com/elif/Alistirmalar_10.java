package com.elif;

import java.util.Scanner;

public class Alistirmalar_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ay ismi girin: ");
        String ay = scanner.nextLine().toLowerCase();

        int gunSayisi;
        switch (ay) {
            case "ocak": case "mart": case "mayıs": case "temmuz": case "ağustos": case "ekim": case "aralık":
                gunSayisi = 31;
                break;
            case "nisan": case "haziran": case "eylül": case "kasım":
                gunSayisi = 30;
                break;
            case "şubat":
                gunSayisi = 28;
                break;
            default:
                gunSayisi = -1; // Geçersiz ay
        }

        if (gunSayisi != -1) {
            System.out.println(ay + " ayı " + gunSayisi + " gün çeker.");
        } else {
            System.out.println("Geçersiz ay ismi.");
        }
    }
}
