package com.elif;

import java.util.Scanner;

public class Alistirmalar_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Çift");
        } else {
            System.out.println("Tek");
        }
    }
}
