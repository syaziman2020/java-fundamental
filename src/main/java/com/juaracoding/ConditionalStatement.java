package com.juaracoding;

public class ConditionalStatement {

    public static void main(String[] args) {
        String data1 = "user1@mail.com";
        String data2 = "user2@mail.com";

        String input = "useR1@mail.com";

        if(data1.equalsIgnoreCase(input) || data2.equalsIgnoreCase(input)){

            System.out.println("User Valid Anda sudah masuk");

            if(data1.equalsIgnoreCase(input)){
                System.out.println("User anda sekarang adalah "+data1);
            }else{
                System.out.println("User anda sekarang adalah "+data2);
            }
        }else{
            System.out.println("Anda belum login, so register dulu");
        }

        int[][] test = new int[3][4];
        System.out.println(test.length);
    }






}
