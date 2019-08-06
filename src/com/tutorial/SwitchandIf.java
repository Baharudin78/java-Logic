package com.tutorial;
import javax.swing.*;

public class SwitchandIf {
    public static void main(String[] args) {

        String pilihan;
        int pilihans;
        boolean cekPilihan = true;

        pilihan = JOptionPane.showInputDialog("1. Ayam Goreng \n2. Nasi Goreng \n3. Soto Babat");

        pilihans = Integer.parseInt(pilihan);

        if (pilihans < 0 || pilihans > 5){
            cekPilihan =false;
        }else {
            cekPilihan = true;
        }

        if ( cekPilihan == true){
            switch (pilihan)
            {
                case "1":
                    JOptionPane.showMessageDialog(null,"anda memilih Ayam Goreng");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"anda memilih Nasi Goreng");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"anda memilih Soto Babat");
                    break;
                default: JOptionPane.showMessageDialog(null,"anda tidak memilih apapun","Error menu ",JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}
