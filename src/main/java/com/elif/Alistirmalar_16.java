package com.elif;

import java.util.Scanner;

public class Alistirmalar_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];
        int toplam = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
            toplam += dizi[i];
        }

        double ortalama = (double) toplam / dizi.length;
        System.out.printf("Dizinin ortalaması: %.2f%n", ortalama);
    }
}
