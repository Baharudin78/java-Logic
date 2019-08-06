package com.tutorial;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int a = sc.nextInt();
        boolean primeNumber = true;

        for (int i = 2; i < a/2; i++){
            if ( a % i ==0){
                primeNumber = false;
                break;
            }
        }
        if (primeNumber){
            System.out.println("YES");
        }else {
            System.out.println("NOT");
        }
    }
}
