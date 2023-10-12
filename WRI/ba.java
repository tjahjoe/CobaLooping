package WRI;

import java.util.Scanner;

public class ba {
    public static void main(String[] args) {
        Scanner input29Str = new Scanner(System.in);
        Scanner input29Int = new Scanner(System.in);
        Scanner input29Dbl = new Scanner(System.in);
        // int tahun = input29.nextInt();
        // if ((tahun % 4) == 0) {
        // if ((tahun % 100) != 0) {
        // System.out.println("tahun kabisat");
        // } else if ((tahun % 100) == 0) {
        // if ((tahun % 400) == 0) {
        // System.out.println("tahun kabisat");
        // }else{
        // System.out.println("bukan tahun kabisat");
        // }
        // }
        // } else {
        // System.out.println("bukan tahun kabisat");
        // }

        // int tahun = input29.nextInt();
        // if ((tahun % 4) == 0) {
        // if ((tahun % 100) != 0) {
        // System.out.println("tahun kabisat");
        // }else{
        // System.out.println("bukan tahun kabisat");
        // }
        // } else {
        // System.out.println("bukan tahun kabisat");
        // }

        // int tahun = input29.nextInt();
        // if ((tahun % 4) == 0) {
        // if ((tahun % 100) != 0) {
        // System.out.println("tahun kabisat");
        // }
        // } else {
        // System.out.println("bukan tahun kabisat");
        // }

        // float sudut1, sudut2, sudut3, totalSudut;
        // sudut1 = input29.nextInt();
        // sudut2 = input29.nextInt();
        // sudut3 = input29.nextInt();
        // totalSudut = sudut1 + sudut2 + sudut3;
        // if (totalSudut == 180){
        // if(sudut1 == 90 || sudut2 == 90 || sudut3 == 90){
        // System.out.println("segitiga siku siku");
        // }else if (sudut1 == sudut2 || sudut2==sudut3 || sudut3==sudut1){
        // System.out.println("segitiga sama kaki");
        // }else {
        // System.out.println("segitiga sembarang");
        // }

        // }else{
        // System.out.println("bukan segitiga");
        // }

        // float sudut1, sudut2, sudut3, totalSudut;
        // sudut1 = input29.nextInt();
        // sudut2 = input29.nextInt();
        // sudut3 = input29.nextInt();
        // totalSudut = sudut1 + sudut2 + sudut3;
        // if (totalSudut == 180) {
        // if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
        // System.out.println("segitiga siku siku");
        // }
        // } else {
        // System.out.println("bukan segitiga");
        // }

        String kategori;
        double pajak;
        int gajiBersih, pengahilan;
        System.out.println("kategori");
        kategori = input29Str.nextLine();
        System.out.println("penghasilan");
        pengahilan = input29Int.nextInt();
        if (kategori.equals("pekerja")) {
            if (pengahilan <= 2000000) {
                pajak = 0.1;
            } else if (pengahilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (pengahilan - (pengahilan * pajak));
            System.out.println(gajiBersih);

        } else if (kategori.equals("pebisnis")) {
            if (pengahilan <= 2500000) {
                pajak = 0.15;
            } else if (pengahilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 2.5;
            }
            gajiBersih = (int) (pengahilan - (pengahilan * pajak));
            System.out.println(gajiBersih);

        } else {
            System.out.println("kategori salah");
        }

    }

}