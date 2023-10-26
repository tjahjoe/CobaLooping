package WRI.prakdasprolatihan;

import java.util.Random;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        boolean penentu = true;
        int yha = ran.nextInt(50);
        System.out.println(yha);
        while(penentu){
            int pilih = sc.nextInt();
            if(yha < pilih){
                System.out.println("angka terlalu besar");
            } else if (yha > pilih){
                System.out.println("angka terlalu kecil");
            } else{
                System.out.println("jawaban anda benar\nangka : " + yha);
                penentu = false;
            }

        }
    }
}
