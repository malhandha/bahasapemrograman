/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhileganjil;
import java.util.Scanner;
/**
 *
 * @author malfi
 */
public class Dowhileganjil {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menentukan bilangan ganjil menggunakan do while");
        System.out.print("Masukkan Bilangan : ");
        int x = s.nextInt();
        System.out.println("Bilangan ganjilnya adalah : ");
        int counter = 1;
        do{
            System.out.println(counter + " ");
            counter += 2;
        } while (x >= counter);
    }
}
