package com.elif;

import java.util.Scanner;

public class Alistirmalar_12 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();
            long faktoriyel = 1;

            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }

            System.out.println(sayi + "! = " + faktoriyel);
        }
}
