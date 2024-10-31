package com.elif;

import java.util.Scanner;

public class Alistirmalar_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        int karakterSayisi = cumle.length();
        System.out.println("Karakter Sayısı: " + karakterSayisi);
    }
}
