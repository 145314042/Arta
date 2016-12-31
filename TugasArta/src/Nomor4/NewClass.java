/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor4;

import java.util.Scanner;

/**
 *
 * @author Lycorice
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double f,a,i,n,temp=0;
        System.out.print("Masukkan nominal uang yang akan ditabung : ");
        a=sc.nextDouble();
        System.out.print("Masukkan persen bunga (%) : ");
        i=sc.nextDouble();
        System.out.print("Masukkan jumlah tahun : ");
        n=sc.nextDouble();
        for (int j = 1; j <= n; j++) {
            temp=+Math.pow((1+(i/100)),j);
        }
        f=a*temp;
        System.out.println("Jumlah uang di akhir tahun : "+f);
    }
}
