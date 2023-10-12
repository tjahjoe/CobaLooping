package WRI;

import java.util.Scanner;

public class bd {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        System.out.print("kata kata hari ini : ");
        int w = 0;
        String absen = scStr.nextLine();
        byte[] c = absen.getBytes();
        for (int i = 0; i < absen.length(); i++) {
            w = c[i] - (97 / absen.length());
        }
        String n[] = new String[1000];
        System.out.println(w);

    }
}
