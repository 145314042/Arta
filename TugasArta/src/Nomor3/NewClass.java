/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

import java.util.Scanner;

/**
 *
 * @author Lycorice
 */
public class NewClass {
    public static void main(String[] args) {
        int data=0;
        int min=Integer.MAX_VALUE;
        do {
            System.out.print("masukkan nilai(terakhir 9999) : ");
            data = new Scanner(System.in).nextInt();
            if (data<min)min=data;
            if (data==9999)break;
        } while (data<9999);
        System.out.println(min);
    }
}
