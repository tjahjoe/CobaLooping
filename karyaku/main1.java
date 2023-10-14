//package karyaku;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        // login
        String choice[] = new String[3];
        String repeat[] = new String[4];
        String mhs[] = new String[6 + 1];
        String pss[] = new String[6 + 1];
        String username = "", password = "", user = "", pass = "";
        // tambah mahasiswa
        String masMaSis[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" },
                { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        String tamMaSis[][] = new String[100][3];

        do {
            repeat[0] = "";
            System.out.print("Masuk Sebagai : \n1. Dosen\n2. Mahasiswa\n3. Keluar\nKetik angka : ");
            choice[1] = scStr.nextLine();
            if (choice[1].equalsIgnoreCase("1") || choice[1].equalsIgnoreCase("dosen")) {
                do {
                    repeat[1] = "";
                    System.out.print("1. Buat akun\n2. Masuk\n3. Keluar\nKetik angka : ");
                    choice[0] = scStr.nextLine();
                    if (choice[0].equalsIgnoreCase("1") || choice[0].equalsIgnoreCase("Buat akun")) {
                        do {
                            repeat[3] = "";
                            System.out.print("Masukkan username : ");
                            user = scStr.nextLine();
                            System.out.print("Masukkan password : ");
                            pass = scStr.nextLine();
                            System.out.println("Akun berhasil dibuat");
                            do {
                                repeat[2] = "";
                                System.out.print("Masukkan username : ");
                                username = scStr.nextLine();
                                if (user.equals(username)) {
                                    System.out.print("Masukkan password : ");
                                    password = scStr.nextLine();
                                    if (!pass.equals(password)) {
                                        System.out.println("Password tidak valid\nKetik y jika ingin mengulang");
                                        repeat[3] = scStr.nextLine();
                                    }
                                } else {
                                    System.out.print(
                                            "Username yang anda masukkan salah\nKetik y jika ingin mengulang : ");
                                    repeat[2] = scStr.nextLine();
                                }
                            } while (repeat[2].equalsIgnoreCase("y"));
                        } while (repeat[3].equalsIgnoreCase("y"));
                    } else if (choice[0].equalsIgnoreCase("2") || choice[0].equalsIgnoreCase("Masuk")) {
                        do {
                            repeat[3] = "";
                            do {
                                System.out.print("Masukkan username : ");
                                username = scStr.nextLine();
                                repeat[2] = "";
                                if (username.equals("wahyu")) {
                                    System.out.print("Masukkan password : ");
                                    password = scStr.nextLine();
                                    if (!password.equals("aa")) {
                                        System.out.println("Password tidak valid\nKetik y jika ingin mengulang");
                                        repeat[3] = scStr.nextLine();
                                    }
                                } else {
                                    System.out.print(
                                            "Username yang anda masukkan salah\nKetik y jika ingin mengulang : ");
                                    repeat[2] = scStr.nextLine();
                                }
                            } while (repeat[2].equalsIgnoreCase("y"));
                        } while (repeat[3].equalsIgnoreCase("y"));
                    } else if (choice[0].equalsIgnoreCase("3") || choice[0].equalsIgnoreCase("keluar")) {
                        repeat[0] = "y";
                    } else {
                        System.out.println("Tidak valid\nKetik y jika ingin mengulang");
                        repeat[1] = scStr.nextLine();
                    }
                } while (repeat[1].equalsIgnoreCase("y")
                        && (!choice[0].equalsIgnoreCase("3") || !choice[0].equalsIgnoreCase("keluar")));
            } else if (choice[1].equalsIgnoreCase("2") || choice[1].equalsIgnoreCase("mahasiswa")) {
                do {
                    repeat[1] = "";
                    System.out.print("1. Buat akun\n2. Masuk\n3. Keluar\nKetik angka : ");
                    choice[0] = scStr.nextLine();
                    if (choice[0].equalsIgnoreCase("1") || choice[0].equalsIgnoreCase("Buat akun")) {
                        do {
                            repeat[3] = "";
                            System.out.print("Masukkan username : ");
                            user = scStr.nextLine();
                            System.out.print("Masukkan password : ");
                            pass = scStr.nextLine();
                            System.out.println("Akun berhasil dibuat");
                            do {
                                repeat[2] = "";
                                System.out.print("Masukkan username : ");
                                username = scStr.nextLine();
                                if (user.equals(username)) {
                                    System.out.print("Masukkan password : ");
                                    password = scStr.nextLine();
                                    if (!pass.equals(password)) {
                                        System.out.println("Password tidak valid\nKetik y jika ingin mengulang");
                                        repeat[3] = scStr.nextLine();
                                    }
                                } else {
                                    System.out.print(
                                            "Username yang anda masukkan salah\nKetik y jika ingin mengulang : ");
                                    repeat[2] = scStr.nextLine();
                                }
                            } while (repeat[2].equalsIgnoreCase("y"));
                        } while (repeat[3].equalsIgnoreCase("y"));
                    } else if (choice[0].equalsIgnoreCase("2") || choice[0].equalsIgnoreCase("Masuk")) {
                        do {
                            repeat[3] = "";
                            do {
                                System.out.print("Masukkan username : ");
                                username = scStr.nextLine();
                                repeat[2] = "";
                                if (username.equals("wahyu")) {
                                    System.out.print("Masukkan password : ");
                                    password = scStr.nextLine();
                                    if (!password.equals("aa")) {
                                        System.out.println("Password tidak valid\nKetik y jika ingin mengulang");
                                        repeat[3] = scStr.nextLine();
                                    }
                                } else {
                                    System.out.print(
                                            "Username yang anda masukkan salah\nKetik y jika ingin mengulang : ");
                                    repeat[2] = scStr.nextLine();
                                }
                            } while (repeat[2].equalsIgnoreCase("y"));
                        } while (repeat[3].equalsIgnoreCase("y"));
                    } else if (choice[0].equalsIgnoreCase("3") || choice[0].equalsIgnoreCase("keluar")) {
                        repeat[0] = "y";
                    } else {
                        System.out.println("Tidak valid\nKetik y jika ingin mengulang");
                        repeat[1] = scStr.nextLine();
                    }
                } while (repeat[1].equalsIgnoreCase("y")
                        && (!choice[0].equalsIgnoreCase("3") || !choice[0].equalsIgnoreCase("keluar")));
            } else if (choice[1].equalsIgnoreCase("3") || choice[1].equalsIgnoreCase("keluar")) {
                System.out.println("Terimakasih");
            } else {
                System.out.println("Tidak valid\nKetik y jika ingin mengulang");
                repeat[0] = scStr.nextLine();
            }
        } while (repeat[0].equalsIgnoreCase("y")
                && (!choice[1].equalsIgnoreCase("3") || !choice[1].equalsIgnoreCase("keluar"))
                && (choice[0].equalsIgnoreCase("3") || choice[0].equalsIgnoreCase("keluar")));
        //

        if (((choice[1].equalsIgnoreCase("1") || choice[1].equalsIgnoreCase("dosen"))
                && (choice[0].equalsIgnoreCase("1") || choice[0].equalsIgnoreCase("Buat akun")) && user.equals(username)
                && pass.equals(password))
                || ((choice[1].equalsIgnoreCase("1") || choice[1].equalsIgnoreCase("dosen"))
                        && (choice[0].equalsIgnoreCase("2") || choice[0].equalsIgnoreCase("masuk"))
                        && username.equals("wahyu")
                        && password.equals("aa"))) {
            System.out.print("1. Mahasiswa\n2. Mata Kuliah\n3. Keluar\nMasukkan angka : ");
            choice[2] = scStr.nextLine();
            if (choice[2].equalsIgnoreCase("1") || choice[2].equals("Mahasiswa")) {
                System.out.println("1. Tambah mahasiswa\n2. Biodata mahasiswa");

            } else if (choice[2].equalsIgnoreCase("2") || choice[2].equalsIgnoreCase("Mata Kuliah")) {

            } else if (choice[2].equalsIgnoreCase("3") || choice[2].equalsIgnoreCase("keluar")) {
                System.out.println("Terimakasih");
            } else {
                System.out.println("Tidak Valid");
            }

        } else if (mhs.equals(true)) {
            System.out.println("zz");
        }
    }
}
