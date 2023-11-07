import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ar {
    public static void main(String[] args) {
        // Scanner scStr = new Scanner(System.in);
        // Scanner scInt = new Scanner(System.in);
        // Random rnInt = new Random();

        // int a = scInt.nextInt();
        // int c = rnInt.nextInt(a);

        // String [] nilai = {"uts", "uas", "kuis", "tugas"};
        // String[] kota = new String[c + 1];
        // System.out.println(Arrays.toString(kota));

        // for (int d = 0; d < kota.length; d++) {
        // System.out.println(nilai[d]);
        // kota[d] = scStr.nextLine();
        // }
        // System.out.println(kota[0]);
        // System.out.println(Arrays.toString(kota));

        // int togomas[][] = {
        // { 8, 9, 5, 2 },
        // { 7, 5, 10, 3 },
        // { 4, 6, 6, 5 }
        // };
        // int total = 0;
        // for (int i = 0; i < togomas[0].length; i++) {
        // for (int j = 0; j < togomas.length; j++) {
        // total += togomas[j][i];
        // }System.out.println(total);
        // total = 0;
        // }

        // int togomas[][] = {
        // { 8, 9, 5, 2 },
        // { 7, 5, 10, 3 },
        // { 4, 6, 6, 5 }
        // };
        // int total[] = new int[togomas[0].length];
        // int keseluruhan = 0;
        // for (int i = 0; i < togomas[0].length; i++) {
        // for (int j = 0; j < togomas.length; j++) {
        // total[i] += togomas[j][i];
        // }
        // if (i == 0){
        // total[i] *= 40000;
        // System.out.println(total[i]);
        // } else if (i == 1){
        // total[i] *= 28000;
        // System.out.println(total[i]);
        // } else if (i == 2){
        // total[i] *= 60000;
        // System.out.println(total[i]);
        // } else if (i == 3){
        // total[i] *= 75000;
        // System.out.println(total[i]);
        // }
        // keseluruhan += total[i];
        // }
        // System.out.println(keseluruhan);

        // int togomas[][] = {
        // { 8, 9, 5, 2 },
        // { 7, 5, 10, 3 },
        // { 4, 6, 6, 5 }
        // };
        // String cabang[] = {"Dieng", "Soehat", "Sengkaling"};
        // int total[] = new int[togomas.length];
        // for (int i = 0; i < togomas.length; i++) {
        // for (int j = 0; j < togomas[i].length; j++) {
        // total[i] += togomas[i][j];
        // }
        // }
        // for (int i = 0; i < togomas.length; i++) {
        // System.out.printf("Cabang %s buku yang terjual sebanyak %d\n", cabang[i],
        // total[i]);
        // }

        int togomas[][] = {
                { 8, 9, 5, 2 },
                { 7, 5, 10, 3 },
                { 4, 6, 6, 5 }
        };
        String cabang[] = { "Dieng", "Soehat", "Sengkaling" };
        int total[][] = new int[togomas.length][togomas[0].length];
        int keseluruhan[] = new int[togomas.length];
        for (int i = 0; i < togomas.length; i++) {
            for (int j = 0; j < togomas[i].length; j++) {
                if (j == 0) {
                    togomas[i][j] *= 40000;
                    System.out.println(togomas[i][j]);
                } else if (j == 1) {
                    togomas[i][j] *= 28000;
                    System.out.println(togomas[i][j]);
                } else if (j == 2) {
                    togomas[i][j] *= 60000;
                    System.out.println(togomas[i][j]);
                } else if (j == 3) {
                    togomas[i][j] *= 75000;
                    System.out.println(togomas[i][j]);
                }keseluruhan[i] += togomas[i][j];
            }

            
        }
        for (int i = 0; i < togomas.length; i++) {
            System.out.printf("Cabang %s menghasilkan %d\n", cabang[i], keseluruhan[i]);
        }
    }

}