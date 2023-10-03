package WRI;

import java.net.Socket;
import java.util.Scanner;

public class ag {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        String back = "y";
        int c, b;

        String[][] n = new String[8][16];
        do {
            int plh = scInt.nextInt();
            switch (plh) {
                case 1:
                    for (int i = 0; i < 35; i++) {
                        for (int a = 0; a < 65; a++) {
                            if (i == 0 || i == 4 || i == 10 || i == 16 || i == 22 || i == 28 || i == 34) {
                                System.out.print("=");
                            } else if ((((i >= 1 && i <= 34) && i != 2 && i != 7 && i != 8 && i != 13 && i != 14
                                    && i != 19
                                    && i != 20 && i != 25 && i != 26 && i != 31 && i != 32)
                                    && (a == 0 || a == 64))
                                    || ((i == 2 && (a == 0 || a == 54))
                                            || (i == 7
                                                    && (a == 0 || a == 6 || a == 16 || a == 18 || a == 24 || a == 29))
                                            || (i == 8
                                                    && (a == 0 || a == 6 || a == 31 || a == 33 || a == 39 || a == 50))
                                            || (i == 13
                                                    && (a == 0 || a == 6 || a == 15 || a == 17 || a == 23 || a == 28))
                                            || (i == 14
                                                    && (a == 0 || a == 6 || a == 31 || a == 33 || a == 39 || a == 60))
                                            || (i == 19
                                                    && (a == 0 || a == 6 || a == 16 || a == 18 || a == 24 || a == 34))
                                            || (i == 20
                                                    && (a == 0 || a == 6 || a == 23 || a == 25 || a == 31 || a == 56))
                                            || (i == 25
                                                    && (a == 0 || a == 6 || a == 23 || a == 25 || a == 31 || a == 42))
                                            || (i == 26
                                                    && (a == 0 || a == 6 || a == 31 || a == 33 || a == 39 || a == 54))
                                            || (i == 31
                                                    && (a == 0 || a == 6 || a == 17 || a == 19 || a == 24 || a == 44))
                                            || (i == 32
                                                    && (a == 0 || a == 6 || a == 24 || a == 26 || a == 32 || a == 57)))
                                    || (((i >= 4 && i <= 34) && i != 7 && i != 8 && i != 13 && i != 14 && i != 19
                                            && i != 20
                                            && i != 25
                                            && i != 26 && i != 31 && i != 32)
                                            && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))) {
                                System.out.print("|");
                            } else if (i == 2 && a == 27) {
                                System.out.print("MATA KULIAH");
                            } else if (i == 7 && a == 3) {
                                System.out.print("1");
                            } else if (i == 7 && a == 8) {
                                System.out.print("BAHASA INGGRIS 1");
                            } else if (i == 7 && a == 21) {
                                System.out.print("2");
                            } else if (i == 7 && a == 26) {
                                System.out.print("CRITICAL THINKING AND");
                            } else if (i == 8 && a == 41) {
                                System.out.print("PROBLEM SOLVING");
                            } else if (i == 13 && a == 3) {
                                System.out.print("3");
                            } else if (i == 13 && a == 8) {
                                System.out.print("DASAR PEMROGRAMAN");
                            } else if (i == 13 && a == 20) {
                                System.out.print("4");
                            } else if (i == 13 && a == 25) {
                                System.out.print("KESELAMATAN KESEHATAN");
                            } else if (i == 14 && a == 41) {
                                System.out.print("KERJA");
                            } else if (i == 19 && a == 3) {
                                System.out.print("5");
                            } else if (i == 19 && a == 8) {
                                System.out.print("KONSEP TEKNOLOGI");
                            } else if (i == 20 && a == 8) {
                                System.out.print("INFORMASI");
                            } else if (i == 19 && a == 21) {
                                System.out.print("6");
                            } else if (i == 19 && a == 26) {
                                System.out.print("MATEMATIKA DASAR");
                            } else if (i == 25 && a == 3) {
                                System.out.print("7");
                            } else if (i == 25 && a == 8) {
                                System.out.print("PANCASILA");
                            } else if (i == 25 && a == 28) {
                                System.out.print("8");
                            } else if (i == 25 && a == 33) {
                                System.out.print("PRAKTIKUM DASAR");
                            } else if (i == 26 && a == 41) {
                                System.out.print("PEMROGRAMAN");
                            } else if (i == 31 && a == 3) {
                                System.out.print("9");
                            } else if (i == 31 && a == 8) {
                                System.out.print("INDEKS PRESTASI");
                            } else if (i == 32 && a == 8) {
                                System.out.print("SEMESTER");
                            } else if (i == 31 && a == 22) {
                                System.out.print("10");
                            } else if (i == 31 && a == 26) {
                                System.out.print("KELUAR");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    c = scInt.nextInt();
                    System.out.println("Pertemuan");
                    b = scInt.nextInt();
                    System.out.println("keterangan");

                    try {
                        n[c][b] = scStr.nextLine();
                    } catch (Exception e) {
                        System.out.println("Angka yang kamu masukkan tidak valid\nUlangi kembali");
                    }

                    System.out.println("!!Teliti Kembali!!\nKetik y jika ingin keluar");
                    back = scStr.nextLine();
                    break;
                case 2:
                    for (int i = 0; i < 35; i++) {
                        for (int a = 0; a < 65; a++) {
                            if (i == 0 || i == 4 || i == 10 || i == 16 || i == 22 || i == 28 || i == 34) {
                                System.out.print("=");
                            } else if ((((i >= 1 && i <= 34) && i != 2 && i != 7 && i != 8 && i != 13 && i != 14
                                    && i != 19
                                    && i != 20 && i != 25 && i != 26 && i != 31 && i != 32)
                                    && (a == 0 || a == 64))
                                    || ((i == 2 && (a == 0 || a == 54))
                                            || (i == 7
                                                    && (a == 0 || a == 6 || a == 16 || a == 18 || a == 24 || a == 29))
                                            || (i == 8
                                                    && (a == 0 || a == 6 || a == 31 || a == 33 || a == 39 || a == 50))
                                            || (i == 13
                                                    && (a == 0 || a == 6 || a == 15 || a == 17 || a == 23 || a == 28))
                                            || (i == 14
                                                    && (a == 0 || a == 6 || a == 31 || a == 33 || a == 39 || a == 60))
                                            || (i == 19
                                                    && (a == 0 || a == 6 || a == 16 || a == 18 || a == 24 || a == 34))
                                            || (i == 20
                                                    && (a == 0 || a == 6 || a == 23 || a == 25 || a == 31 || a == 56))
                                            || (i == 25
                                                    && (a == 0 || a == 6 || a == 23 || a == 25 || a == 31 || a == 42))
                                            || (i == 26
                                                    && (a == 0 || a == 6 || a == 31 || a == 33 || a == 39 || a == 54))
                                            || (i == 31
                                                    && (a == 0 || a == 6 || a == 17 || a == 19 || a == 24 || a == 44))
                                            || (i == 32
                                                    && (a == 0 || a == 6 || a == 24 || a == 26 || a == 32 || a == 57)))
                                    || (((i >= 4 && i <= 34) && i != 7 && i != 8 && i != 13 && i != 14 && i != 19
                                            && i != 20
                                            && i != 25
                                            && i != 26 && i != 31 && i != 32)
                                            && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))) {
                                System.out.print("|");
                            } else if (i == 2 && a == 27) {
                                System.out.print("MATA KULIAH");
                            } else if (i == 7 && a == 3) {
                                System.out.print("1");
                            } else if (i == 7 && a == 8) {
                                System.out.print("BAHASA INGGRIS 1");
                            } else if (i == 7 && a == 21) {
                                System.out.print("2");
                            } else if (i == 7 && a == 26) {
                                System.out.print("CRITICAL THINKING AND");
                            } else if (i == 8 && a == 41) {
                                System.out.print("PROBLEM SOLVING");
                            } else if (i == 13 && a == 3) {
                                System.out.print("3");
                            } else if (i == 13 && a == 8) {
                                System.out.print("DASAR PEMROGRAMAN");
                            } else if (i == 13 && a == 20) {
                                System.out.print("4");
                            } else if (i == 13 && a == 25) {
                                System.out.print("KESELAMATAN KESEHATAN");
                            } else if (i == 14 && a == 41) {
                                System.out.print("KERJA");
                            } else if (i == 19 && a == 3) {
                                System.out.print("5");
                            } else if (i == 19 && a == 8) {
                                System.out.print("KONSEP TEKNOLOGI");
                            } else if (i == 20 && a == 8) {
                                System.out.print("INFORMASI");
                            } else if (i == 19 && a == 21) {
                                System.out.print("6");
                            } else if (i == 19 && a == 26) {
                                System.out.print("MATEMATIKA DASAR");
                            } else if (i == 25 && a == 3) {
                                System.out.print("7");
                            } else if (i == 25 && a == 8) {
                                System.out.print("PANCASILA");
                            } else if (i == 25 && a == 28) {
                                System.out.print("8");
                            } else if (i == 25 && a == 33) {
                                System.out.print("PRAKTIKUM DASAR");
                            } else if (i == 26 && a == 41) {
                                System.out.print("PEMROGRAMAN");
                            } else if (i == 31 && a == 3) {
                                System.out.print("9");
                            } else if (i == 31 && a == 8) {
                                System.out.print("INDEKS PRESTASI");
                            } else if (i == 32 && a == 8) {
                                System.out.print("SEMESTER");
                            } else if (i == 31 && a == 22) {
                                System.out.print("10");
                            } else if (i == 31 && a == 26) {
                                System.out.print("KELUAR");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    c = scInt.nextInt();
                    System.out.println("Pertemuan");
                    b = scInt.nextInt();
                    try {
                        System.out.println(n[c][b]);
                    } catch (Exception e) {
                        System.out.println("Angka yang kamu masukkan tidak valid\nUlangi kembali");
                    }

                    System.out.println("Ketik y jika ingin keluar");
                    back = scStr.nextLine();
            }
        } while (back.equalsIgnoreCase("y"));
    }
}

 // float[] nBing1 = new float[4];
        // float[] nCTPS = new float[4];
        // float[] nDaspro = new float[4];
        // float[] nK3 = new float[4];
        // float[] nKTI = new float[4];
        // float[] nMatdas = new float[4];
        // float[] nPancasila = new float[4];
        // float[] nPrakDaspro = new float[4];
        // n[0] = nBing1;
        // n[1] = nCTPS;
        // n[2] = nDaspro;
        // n[3] = nK3;
        // n[4] = nKTI;
        // n[5] = nMatdas;
        // n[6] = nPancasila;
        // n[7] = nPrakDaspro;
