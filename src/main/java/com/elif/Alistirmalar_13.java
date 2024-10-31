package com.elif;

import java.util.Scanner;

public class Alistirmalar_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        boolean asal = true;

        if (sayi < 2) {
            asal = false;
        } else {
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }

}
