package com.tutorial;
import java.util.*;
public class Exponent {
    public static void main(String[] args) {

//        System.out.println("BASE DAN EXPONENT");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Base : ");
//        int base = sc.nextInt();
//        System.out.print("Exponent : ");
//        int exponent = sc.nextInt();
//
//        int result = 1, i = 1;
//
//        do {
//            result = result * base;
//            i++;
//        }while (i <= exponent);
//        System.out.println(result);

        System.out.println();
        System.out.println("MULTIPLY NUMBER");

        int even =  0 ,add = 1;
        for (int i = 1;i <= 20;i+=2){
            add = add* i;
        }
        for (int i = 2; i <= 100; i+=2){
            even = even + i;
        }
        System.out.println(" even " + even + " add " + add);


    }
}
