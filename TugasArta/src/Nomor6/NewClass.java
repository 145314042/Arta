/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor6;

import java.util.Scanner;

/**
 *
 * @author Lycorice
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.print("masukkan waktu (hh:mm:ss): ");
        String timeRightNow = new Scanner(System.in).next();
        System.out.print("menit pengurang (menit): ");
        int p = new Scanner(System.in).nextInt();
        String[] timeSplit = timeRightNow.split(":");
        int timeS=Integer.parseInt(timeSplit[2]);
        int timeM=Integer.parseInt(timeSplit[1])*60;
        int timeH=Integer.parseInt(timeSplit[0])*3600;
        int time = timeH+timeM+timeS;
        int timeEnd=time-(p*60);
        int timeEndH=timeEnd/3600;
        int timeEndM=(timeEnd-(3600*timeEndH))/60;
        int timeEndS=(timeEnd-(3600*timeEndH))-(60*timeEndM);
        System.out.println("waktu terakhir = "+timeEndH+":"+timeEndM+":"+timeEndS);
    }
}
