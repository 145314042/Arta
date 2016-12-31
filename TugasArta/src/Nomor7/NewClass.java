/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor7;

import java.util.Scanner;

/**
 *
 * @author Lycorice
 */
public class NewClass {
    public static void main(String[] args) {
        String[] days={"Minggu","Senin","Selasa","Rabu","Kamis","Jumat","Sabtu"};
        System.out.print("Hari sekarang = ");
        String today=new Scanner(System.in).next();
        int todayIndex = 0, dayNext;
        for (int i = 0; i < days.length; i++) {
            if (today.equals(days[i])) todayIndex=i;
        }
        if (todayIndex!=6) dayNext=todayIndex+1;
        else dayNext=0;
        System.out.println("Jika hari ini \""+days[todayIndex]+"\", maka besok adalah \""+days[dayNext]+"\"");
    }
}
