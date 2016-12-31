/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

import java.util.Scanner;

/**
 *
 * @author Lycorice
 */
public class NewClass {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int jumlah=0;
        for (double a = 0; a <= 10; a++) {
            if (a%2==0) jumlah++;
        }
        System.out.println(jumlah);
    }
}
