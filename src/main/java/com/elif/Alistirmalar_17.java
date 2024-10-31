package com.elif;

import java.util.Scanner;

public class Alistirmalar_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }

        int enKucuk = dizi[0];
        int indeks = 0;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
                indeks = i;
            }
        }

        System.out.println("En küçük eleman: " + enKucuk + ", İndeksi: " + indeks);
    }
}
