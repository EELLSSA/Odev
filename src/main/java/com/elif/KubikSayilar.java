package com.elif;

import java.util.Scanner;

public class KubikSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = sayi; i >= 1; i--) {
            System.out.println("Sayı " + (sayi - i + 1) + ": " + (i * i * i));
        }
    }
}
