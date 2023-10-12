//package karyaku;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        String pem1, ulang1 = "", pem2 = "", ulang2 = "", ulang3 = "", ulang4 = "";
        String username = "", password = "", user = "", pass = "";

        do {
            ulang1 = "";
            System.out.print("Masuk Sebagai : \n1. Dosen\n2. Mahasiswa\n3. Keluar\nKetik angka : ");
            pem1 = scStr.nextLine();
            if (pem1.equalsIgnoreCase("1") || pem1.equalsIgnoreCase("dosen")) {
                do {
                    ulang2 = "";
                    System.out.print("1. Buat akun\n2. Masuk\n3. Keluar\nKetik angka : ");
                    pem2 = scStr.nextLine();
                    if (pem2.equalsIgnoreCase("1") || pem2.equalsIgnoreCase("Buat akun")) {
                        do {
                            ulang4 = "";
                            System.out.print("Masukkan nomor : ");
                            user = scStr.nextLine();
                            System.out.print("Masukkan password : ");
                            pass = scStr.nextLine();
                            System.out.println("Akun berhasil dibuat");
                            do {
                                ulang3 = "";
                                System.out.print("Masukkan nomor : ");
                                username = scStr.nextLine();
                                if (user.equals(username)) {
                                    System.out.print("Masukkan password : ");
                                    password = scStr.nextLine();
                                    if (!pass.equals(password)) {
                                        System.out.println("Password tidak valid\nKetik y jika ingin mengulang");
                                        ulang4 = scStr.nextLine();
                                    }
                                } else {
                                    System.out.print(
                                            "Username yang anda masukkan salah\nKetik y jika ingin mengulang : ");
                                    ulang3 = scStr.nextLine();
                                }
                            } while (ulang3.equalsIgnoreCase("y"));
                        } while (ulang4.equalsIgnoreCase("y"));
                    } else if (pem2.equalsIgnoreCase("2") || pem2.equalsIgnoreCase("Masuk")) {
                        do {
                            ulang4 = "";
                            do {
                                System.out.print("Masukkan nomor : ");
                                username = scStr.nextLine();
                                ulang3 = "";
                                if (username.equals("wahyu")) {
                                    System.out.print("Masukkan password : ");
                                    password = scStr.nextLine();
                                    if (!password.equals("aa")) {
                                        System.out.println("Password tidak valid\nKetik y jika ingin mengulang");
                                        ulang4 = scStr.nextLine();
                                    }
                                } else {
                                    System.out.print(
                                            "Username yang anda masukkan salah\nKetik y jika ingin mengulang : ");
                                    ulang3 = scStr.nextLine();
                                }
                            } while (ulang3.equalsIgnoreCase("y"));
                        } while (ulang4.equalsIgnoreCase("y"));
                    } else if (pem2.equalsIgnoreCase("3") || pem2.equalsIgnoreCase("keluar")) {
                        ulang1 = "y";
                    } else {
                        System.out.println("Tidak valid\nKetik y jika ingin mengulang");
                        ulang2 = scStr.nextLine();
                    }
                } while (ulang2.equalsIgnoreCase("y")
                        && (!pem2.equalsIgnoreCase("3") || !pem2.equalsIgnoreCase("keluar")));
            } else if (pem1.equalsIgnoreCase("2") || pem1.equalsIgnoreCase("mahasiswa")) {

            } else if (pem1.equalsIgnoreCase("3") || pem1.equalsIgnoreCase("keluar")) {
                System.out.println("Terimakasih");
            } else {
                System.out.println("Tidak valid\nKetik y jika ingin mengulang");
                ulang1 = scStr.nextLine();
            }
        } while (ulang1.equalsIgnoreCase("y") && (!pem1.equalsIgnoreCase("3") || !pem1.equalsIgnoreCase("keluar"))
                && (pem2.equalsIgnoreCase("3") || pem2.equalsIgnoreCase("keluar")));

        if (((pem1.equalsIgnoreCase("1") || pem1.equalsIgnoreCase("dosen"))
                && (pem2.equalsIgnoreCase("1") || pem2.equalsIgnoreCase("Buat akun")) && user.equals(username)
                && pass.equals(password))
                || ((pem1.equalsIgnoreCase("1") || pem1.equalsIgnoreCase("dosen"))
                        && (pem2.equalsIgnoreCase("2") || pem2.equalsIgnoreCase("masuk")) && username.equals("wahyu")
                        && password.equals("aa"))) {
            System.out.println("a");
        }
        // user.equals(username) && pass.equals(password)
        // || password.equals("aa"
    }

}
