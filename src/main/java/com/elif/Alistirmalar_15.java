package com.elif;

public class Alistirmalar_15 {
    public static void main(String[] args) {
        System.out.println("3 ve 5 ile bölünebilen sayılar:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}