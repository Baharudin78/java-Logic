package com.tutorial;
import java.util.*;
public class numberTable {
    public static void main(String[] args) {
        System.out.println("membuat tabel angka");
        for (int a = 1,b = 10,c = 11,d= 20,e = 21,f =30;a <= 10; a++,b--,c++,d--,e++,f--){
            System.out.println( a + " " + b + " " + c + " "+ e + " "+ f + " ");
        }

        System.out.println();
        System.out.println(" membuat colom dan baris");
        Scanner sc = new Scanner(System.in);
        System.out.print(" masukkan rows :");
        int rows = sc.nextInt();
        System.out.print(" masukkan cols :");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows;i++){
            for (int j= 1; j <= cols;j++){
                System.out.print(" @ ");
            }
            System.out.println();
        }
    }
}
