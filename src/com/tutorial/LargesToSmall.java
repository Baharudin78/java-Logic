package com.tutorial;
import java.util.*;
public class LargesToSmall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 2,Small = 0, Large = 0;

        System.out.print("Num 1 :");
        int a = s.nextInt();
        Small = a;
        Large = a;
        while ( i <= 10){
            System.out.print("Num " + i +" :");
            int b = s.nextInt();
            if (b <Small){
                Small = b;
            }
            if (b > Large){
                Large = b;
            }
            i++;
        }
        System.out.println("Largest : " + Large + " Smallest :  "  + Small);
    }
}
