package com.elif;

import java.util.Scanner;

public class Alistirmalar_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println("Çift sayılar:");
        for (int i = 2; i <= sayi; i += 2) {
            System.out.print(i + " ");
        }
    }

}
