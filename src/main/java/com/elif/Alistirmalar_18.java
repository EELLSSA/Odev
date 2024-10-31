package com.elif;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirmalar_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(dizi));
    }
}
