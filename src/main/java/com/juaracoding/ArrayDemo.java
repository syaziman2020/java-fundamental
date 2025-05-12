package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Mencetak array menggunakan toString()
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah item");
        int jumlah = scan.nextInt();

        int[] harga = new int[jumlah];

        int totalPrice = 0;

        for (int i = 0; i < harga.length; i++) {
            System.out.println("Masukkan harga: ");
            harga[i] = scan.nextInt();
            totalPrice += harga[i];
        }

        System.out.println("total harga: " + totalPrice);
    }
}
