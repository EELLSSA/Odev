package com.elif;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GecerliSayilar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sayilar = new ArrayList<>();
        int toplam = 0;

        while (true) {
            System.out.print("Sayı girin (0-100 arası): ");
            int sayi = scanner.nextInt();

            if (sayi < 0 || sayi > 100) {
                System.out.println("Girilen sayı sınır dışında.");
                continue;
            }

            toplam += sayi;
            sayilar.add(sayi);

            if (toplam > 100) {
                break;
            }
        }

        int max = sayilar.get(0);
        int min = sayilar.get(0);

        for (int s : sayilar) {
            if (s > max) max = s;
            if (s < min) min = s;
        }

        double ortalama = toplam / (double) sayilar.size();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Ort: " + ortalama);

    }
}
