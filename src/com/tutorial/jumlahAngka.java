package com.tutorial;
import java.util.*;
public class jumlahAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka");
        int user = sc.nextInt();
        int result = 1;
        int q = user/10;

        while (q != 0){
            q = q/10;
            result++;
        }
        System.out.println(result);
    }
}
