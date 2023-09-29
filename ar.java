import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ar {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Random rnInt = new Random();

        int a = scInt.nextInt();
        int c = rnInt.nextInt(a);

        String [] nilai = {"uts", "uas", "kuis", "tugas"};
        String[] kota = new String[c + 1];
        System.out.println(Arrays.toString(kota));

        for (int d = 0; d < kota.length; d++) {
            System.out.println(nilai[d]);
            kota[d] = scStr.nextLine();
        }
        System.out.println(kota[0]);
        System.out.println(Arrays.toString(kota));
    }
}