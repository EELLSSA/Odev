package com.elif;

import java.util.Scanner;

public class Alistirmalar_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.print("Çift sayılar: ");
        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                System.out.print(sayi + " ");
            }
        }
    }
}
