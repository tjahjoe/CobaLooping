package WRI.prakdasprolatihan;

import java.util.Scanner;

import WRI.be;
import WRI.bi;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int berat = 0, tambah;
        double biaya = 0;
        double totalBiaya = 0;

        do{
            System.out.println("Masukkan berat : ");
            berat = sc.nextInt();
            biaya = 4500 * berat;
            if (berat>10){
                biaya = biaya*0.05;
            }
            totalBiaya += biaya;
            System.out.println(totalBiaya);
            System.out.print("Ketik 1 jika ingin : ");
            tambah = sc.nextInt();
        }while(tambah == 1);
    }
    
}
