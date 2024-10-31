package com.elif;

public class Alistirmalar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci tam sayıyı girin: ");
        int a = scanner.nextInt();
        System.out.print("İkinci tam sayıyı girin: ");
        int b = scanner.nextInt();

        int toplam = a + b;
        int fark = a - b;
        int carpim = a * b;
        double bolum = b != 0 ? (double) a / b : Double.NaN;

        System.out.println("Toplam: " + toplam + ", Fark: " + fark + ", Çarpım: " + carpim + ", Bölüm: " + bolum);
    }
}

