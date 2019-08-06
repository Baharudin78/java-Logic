package com.tutorial;

import java.nio.file.spi.FileSystemProvider;

public class Main {

    public static void main(String[] args) {
        System.out.println("pola looping ");
        for (int i = 1 ; i <= 6; i++){
            for (int j = 1; j <= i;j++){
                System.out.print(j);
            }
            for (int k = 6; k > i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1 ;i <= 6;i++){
            for (int j = 1;j<= i;j++){
                System.out.print(j);
            }
            for (int k = 6;k>i;k-- ){
                System.out.print("&");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("@");
        for (int i = 6; i >=1;i--){
            System.out.print("@");
            for (int j = 6 ; j >= i;j--){
                System.out.print(j);
            }
            System.out.println("@");
        }
        for (int j=5; j>0;j--){
            System.out.print("@ ");
        }
        System.out.println();
        System.out.print("\n");
        for (int i = 6;i >=0;i--){
            System.out.println();
            for (int j = 6;j>= i;j--){
                System.out.print("@");
            }
        }

        System.out.println("TRIANGLE OF DOLLAR");

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("TRIANGLE OF EMTY MIDDLE");

        for (int i = 6; i >= 1;i--){
            for (int j = 1; j < i;j++){
                System.out.print(" ");
            }
            System.out.print("#");
            for (int k = 6; k >= i;k--){
                System.out.print(" ");
            }
            for (int k = 6; k >= i;k--){
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();

        }
        for (int k = 8; k >= 1;k--){
            System.out.print("# ");
        }
        System.out.println();
        System.out.println("BELAH KETUPAT");

        for (int i = 6; i >= 1;i--){
            for (int j = 1; j < i;j++){
                System.out.print(" ");
            }
            System.out.print("@");
            for (int k = 6; k >= i;k--){
                System.out.print(" ");
            }
            for (int k = 6; k >= i;k--){
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();

        }
        for (int i = 6; i >= 1;i--){
            for (int j = 6; j > i;j--){
                System.out.print(" ");
            }
            System.out.print("@");
            for (int k = 1; k < i;k++){
                System.out.print(" ");
            }
            for (int k = 1; k < i;k++){
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();

        }

    }

}