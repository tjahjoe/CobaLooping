package WRI.prakdasprolatihan;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        // Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        int gaji = 0;
        System.out.print("Masukkan jam : ");
        int jam = scInt.nextInt();
        if (jam > 60) {
            gaji = (60 * 5000) + (7500 * (jam - 60));
            System.out.println("Tambahan gaji : " + (7500 * (jam - 60)));
        } else if (jam < 50) {
            gaji = (5000 * jam) - (2500 * jam);
            System.out.println("Pengurangah gaji : " + (2500 * jam));
        } else {
            gaji = jam * 5000;
        }
        System.out.println("Total gaji : " + gaji);
    }
}
