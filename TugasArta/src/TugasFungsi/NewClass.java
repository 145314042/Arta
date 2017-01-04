/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasFungsi;

import java.util.Scanner;

/**
 *
 * @author Lycorice
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.print("Masukkan nilai anda : ");
        double nilai = new Scanner(System.in).nextDouble();
        Nilai(nilai);
    }
    
    public static void Nilai(double nilai){
        if (nilai <= 45 && nilai >= 0) {
            System.out.println("Nilai Anda E");
        }
        else if (nilai <= 55 && nilai > 45) {
            System.out.println("Nilai Anda D");
        }
        else if (nilai <= 75 && nilai > 55) {
            System.out.println("Nilai Anda C");
        }
        else if (nilai <= 85 && nilai > 75) {
            System.out.println("Nilai Anda B");
        }
        else if (nilai <= 100 && nilai > 85) {
            System.out.println("Nilai Anda A");
        }
        else System.out.println("Nilai yang anda masukkan salah");
    }
}
