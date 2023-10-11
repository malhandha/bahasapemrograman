/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileganjil;
import java.util.Scanner;
/**
 *
 * @author malfi
 */
public class WhileGanjil {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menentukan bilangan ganjil menggunakan while");
        System.out.print("Masukkan Bilangan: ");
        int x = s.nextByte();
        System.out.println("Angaka Ganjilnya adalah: ");
        int counter = 1;
        while (x >= counter){
            System.out.println(counter + " ");
            counter += 2;
        }
    }
}
