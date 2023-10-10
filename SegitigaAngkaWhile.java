package com.mycompany.segitigaangkawhile;
import java.util.Scanner;
public class SegitigaAngkaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan Angka : ");
        int i = s.nextInt();
        int x = 1;
        int y = 1;
        do{
            do{
                System.out.print( y +" ");
                y++;
            }while (x >= y);
            System.out.println(" ");
            y = 1;
            x++;
            }while (i>=x);
        }
    }
