package Array;

import java.util.Scanner;

public class MainArray {
    Scanner input = new Scanner(System.in);
    static double[] angkaInput = new double[4];
    static double nilaiDeterminan;
    public void main(String[] args) {
        System.out.println("Masukan angka ke 1 ? ");
        angkaInput[0] = input.nextDouble();
        System.out.println("Masukan angka ke 2 ? ");
        angkaInput[1] = input.nextDouble();
        System.out.println("Masukan angka ke 3 ? ");
        angkaInput[2] = input.nextDouble();
        System.out.println("Masukan angka ke 4 ? ");
        angkaInput[3] = input.nextDouble();
        
        if (nilaiDeterminan(angkaInput)){
            System.out.println("\nNilai Determinan " + nilaiDeterminan + ", maka proses dilanjutkan.");
            printOutAngkaMatrik(angkaInput);
            printOutAngkaMatrikInvers(angkaInput);
        }
        else {
            System.out.println("\nNilai Determinan " + nilaiDeterminan + ", maka proses dihentikan.");
        }
        
        System.out.println("Nama    : Kazami Yuuji");
        System.out.println("NPM     : 9029");
    }
    
    public boolean nilaiDeterminan (double[] angkaInput){
        nilaiDeterminan = (angkaInput[0] * angkaInput[3]) - (angkaInput[1] * angkaInput[2]);
        if (nilaiDeterminan == 0) return false;
        else return true;
    }
    
    public void printOutAngkaMatrik(double[] angkaInput){
        for (int i = 0; i < angkaInput.length; i++) {
            if (i == 1) System.out.println(angkaInput[i] + "\t");
            else System.out.print(angkaInput[i] + "\t");
        }
        System.out.println("\n");
    }
    
    public void printOutAngkaMatrikInvers(double[] angkaInput){
        for (int i = 0; i < angkaInput.length; i++) {
            if (i == 1) System.out.println(angkaInput[i] / nilaiDeterminan + "\t");
            else System.out.print(angkaInput[i] / nilaiDeterminan + "\t");
        }
        System.out.println("\n");
    }
}
