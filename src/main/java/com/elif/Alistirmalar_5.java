package com.elif;

import java.util.Scanner;

public class Alistirmalar_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün fiyatını girin: ");
        double fiyat = scanner.nextDouble();

        double kdvliFiyat = fiyat * 1.18;
        System.out.printf("KDV'li fiyat: %.2f%n", kdvliFiyat);
    }
}
