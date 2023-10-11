/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forganjil;
import java.util.Scanner;
/**
 *
 * @author malfi
 */
public class ForGanjil {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menentukan bilangan ganjil menggunakan for");
        System.out.print("Masukkan bilangan : ");
        int x = s.nextByte();
        System.out.println("Angka ganjilnya adalah: ");
        for (int y = 1; y<=x; y+=2){
            System.out.println(y + "");
        }
    }
}
