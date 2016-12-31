/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

import java.util.Scanner;

/**
 *
 * @author Lycorice
 */
public class NewClass {
    public static void main(String[] args) {
        int data=0,count=0,sigma=0;
        double mean=0;
        do {
            System.out.print("masukkan nilai(terakhir 9999) : ");
            data = new Scanner(System.in).nextInt();
            if (data==9999)break;
            sigma+=data;
            count++;
            mean=sigma/count;
        } while (data<9999);
        System.out.println(mean);
    }
}
