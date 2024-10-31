package com.elif;

import java.util.HashSet;
import java.util.Scanner;

public class Alistirmalar_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];
        HashSet<Integer> tekrarEdenler = new HashSet<>();

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.print("Tekrar eden elemanlar: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrarEdenler.add(dizi[i]);
                }
            }
        }

        for (int eleman : tekrarEdenler) {
            System.out.print(eleman + " ");
        }
    }
}
