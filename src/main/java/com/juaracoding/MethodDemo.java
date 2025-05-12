package com.juaracoding;

public class MethodDemo {

    public static void main(String[] args) {
        drawBox(5);



        detailProduct("NVIDIA", 10, 15000);
    }

    static void drawBox(int result) {

        for (int i = 0; i < result; i++) {
            for (int j = 0; j < result; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static double subtotal(double price, int setAmount){
        return price * setAmount;

    }


    static void detailProduct(String title, int stock,double price){
        System.out.println("Nama item: "+title);
        if(stock > 100){
            System.out.println("Anda kelebihan stok yaitu "+stock+", tidak bisaa!!!");
        }else{
            System.out.println("Anda membeli barang sebanyak "+stock);
        }

        System.out.println("Subtotal :"+subtotal(price,2));


    }
}
