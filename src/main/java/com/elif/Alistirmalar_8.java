package com.elif;

import java.util.Scanner;

public class Alistirmalar_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        int dogumYili = scanner.nextInt();
        int yas = 2024 - dogumYili;

        if (yas >= 18) {
            System.out.println("Reşit");
        } else {
            System.out.println("Reşit değil");
        }
    }
}
