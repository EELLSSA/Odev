package com.elif;

import java.util.Scanner;

public class Alistirmalar_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu girin: ");
        double vize = scanner.nextDouble();
        System.out.print("Final notunu girin: ");
        double finalNotu = scanner.nextDouble();

        double ortalama = (vize * 0.4) + (finalNotu * 0.6);
        System.out.printf("Ortalama: %.2f%n", ortalama);
    }
}
