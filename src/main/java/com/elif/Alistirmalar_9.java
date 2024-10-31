package com.elif;

import java.util.Scanner;

public class Alistirmalar_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        int enBuyuk = Math.max(sayi1, Math.max(sayi2, sayi3));
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}
