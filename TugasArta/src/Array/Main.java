package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrik matrik = new Matrik();
        Scanner input = new Scanner(System.in);
        double[] angkaInput = new double[4];
        System.out.println("Masukan angka ke 1 ? ");
        angkaInput[0] = input.nextDouble();
        System.out.println("Masukan angka ke 2 ? ");
        angkaInput[1] = input.nextDouble();
        System.out.println("Masukan angka ke 3 ? ");
        angkaInput[2] = input.nextDouble();
        System.out.println("Masukan angka ke 4 ? ");
        angkaInput[3] = input.nextDouble();
        if (matrik.nilaiDeterminan(angkaInput)){
            System.out.println("\nNilai Determinan " + Matrik.nilaiDeterminan + ", maka proses dilanjutkan.");
            matrik.printOutAngkaMatrik(angkaInput);
            matrik.printOutAngkaMatrikInvers(angkaInput);
        }
        else {
            System.out.println("\nNilai Determinan " + Matrik.nilaiDeterminan + ", maka proses dihentikan.");
        }
        
        System.out.println("Nama    : Kazami Yuuji");
        System.out.println("NPM     : 9029");
    }
}
