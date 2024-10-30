package com.elif;

import java.util.Scanner;

public class OkulDonemi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrencilik sürenizi (yıl olarak) girin: ");
        int gradle = scanner.nextInt();

        if (gradle < 0) {
            System.out.println("NONE");
        } else if (gradle < 5) {
            System.out.println("Elementary School");
        } else if (gradle < 8) {
            System.out.println("Junior School");
        } else if (gradle < 10) {
            System.out.println("High School");
        } else {
            System.out.println("College");
        }

    }
}
