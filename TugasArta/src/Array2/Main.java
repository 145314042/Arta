package Array2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        System.out.print("Jumlah n = ");
        int n = sc.nextInt();
        System.out.println("Nama : Kazami Yuuji");
        System.out.println("No   : 9029");
        if (0 < n && n <= 30) {
            array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Maukan nilai array ke-" + i + " : ");
                int temp = sc.nextInt();
                if (temp <= 70) {
                    array[i] = temp;
                }
            }
            System.out.print("Array yang telah dimasukkan :");
            for (int i = 0; i < n; i++) {
                System.out.print(" " + array[i]);
            }
            System.out.print("\nCari : ");
            int cari = sc.nextInt();
            int index = 0;
            boolean cek = false;
            for (int i = 0; i < n; i++) {
                if (cari == array[i]) {
                    cek = true;
                    index = i;
                }
            }
            if (cek == true) {
                System.out.println("Data " + cari + " ada di index array ke-" + index);
            } else {
                System.out.println("Data " + cari + " tidak ditemukan");
            }
        }
    }
}
