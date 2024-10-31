package com.elif;

import java.util.Scanner;

public class Alistirmalar_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin: ");
        double r = scanner.nextDouble();

        double alan = Math.PI * r * r;
        double cevre = 2 * Math.PI * r;

        System.out.printf("Alan: %.2f, Çevre: %.2f%n", alan, cevre);
    }
}
