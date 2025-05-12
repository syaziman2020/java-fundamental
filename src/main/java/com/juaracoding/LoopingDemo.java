package com.juaracoding;

public class LoopingDemo {

    public static void main(String[] args) {
        int result = 10;
        for (int i = 0; i < result; i++) {
            for (int j = 0; j < result; j++) {
                if(i >= j){
                    System.out.print("* ");
                }

            }
            System.out.println();

        }
    }
}
