package WRI;

import java.util.Scanner;

public class as {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        String b = scStr.nextLine();
        if (b.equals("a")){
        coba();
    }else {
        System.out.println("jalan");
    }
    }

    public static void coba() {
        for (int i = 0; i < 29; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16 || i == 22 || i == 28) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 28) && i != 2 && i != 7 && i != 13 && i != 19 && i != 25)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 58))
                                || (i == 7 && (a == 0 || a == 6 || a == 25 || a == 27 || a == 33 || a == 51))
                                || (i == 13 && (a == 0 || a == 6 || a == 13 || a == 15 || a == 21 || a == 36))
                                || (i == 19 && (a == 0 || a == 6 || a == 27 || a == 29 || a == 35 || a == 42))
                                || (i == 25 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 21) && i != 7 && i != 13 && i != 19 && i != 25)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || (((i >= 23 && i <= 28) && i != 25) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 29) {
                    System.out.print("BERANDA");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("BIODATA");
                } else if (i == 7 && a == 30) {
                    System.out.print("2");
                } else if (i == 7 && a == 35) {
                    System.out.print("PRESENSI");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 8) {
                    System.out.print("KARTU RENCANA STUDI");
                } else if (i == 13 && a == 18) {
                    System.out.print("4");
                } else if (i == 13 && a == 23) {
                    System.out.print("MATA KULIAH");
                } else if (i == 19 && a == 3) {
                    System.out.print("5");
                } else if (i == 19 && a == 8) {
                    System.out.print("NILAI");
                } else if (i == 19 && a == 32) {
                    System.out.print("6");
                } else if (i == 19 && a == 37) {
                    System.out.print("UANG KULIAH TUNGGAL");
                } else if (i == 25 && a == 3) {
                    System.out.print("7");
                } else if (i == 25 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
