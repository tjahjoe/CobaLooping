//package karyaku;

import java.util.Scanner;

import WRI.ba;

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
        int login = 0, oo = 0;

        // tambah mahasiswa

        String ab[] = new String[3]; // tools tambahan
        String back = "";
        String masMaSis[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" },
                { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        String tamMaSis[][] = new String[100][3];
        String bio[] = { "Nama", "NIM", "kelas" };
        int masNil[] = { 100, 98, 100, 89 };
        int tamNil[] = new int[100];
        int m = 0;
        int n = 0, c;
        for (int r = 0; r < masMaSis.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                tamMaSis[r][l] = masMaSis[r][l];
            }
        }
        for (int k = 0; k < masNil.length; k++) {
            tamNil[k] = masNil[k];
        }
        // tambah mata kuliah
        String masMatKul[] = { "Bahasa Inggris 1", "Critical Thinking and Problem Solving", "Dasar Pemrograman",
                "Keselamtan Kesehatan Kerja", "Konsep Teknologi Informasi", "Matematika Dasar", "Pancasila",
                "Praktikum Dasar Pemrograman" };
        String tamMatKul[] = new String[100];
        String o;
        for (int k = 0; k < masMatKul.length; k++) {
            tamMatKul[k] = masMatKul[k];
        }

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
                    System.out.print("1. Masuk\n2. Keluar\nKetik angka : ");
                    choice[0] = scStr.nextLine();
                    if (choice[0].equalsIgnoreCase("1") || choice[0].equalsIgnoreCase("Buat akun")) {
                        do {
                            repeat[3] = "";
                            do {
                                System.out.print("Masukkan Absen : ");
                                login = scInt.nextInt();
                                oo = login - 1;
                                System.out.print("Masukkan Username : ");
                                username = scStr.nextLine();
                                repeat[2] = "";
                                if (username.equals(tamMaSis[oo][0])) {
                                    System.out.print("Masukkan password : ");
                                    password = scStr.nextLine();
                                    if (!password.equals(tamMaSis[oo][0])) {
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
                    } else if (choice[0].equalsIgnoreCase("2") || choice[0].equalsIgnoreCase("keluar")) {
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
                choice[0] = "2";
            }
        } while (repeat[0].equalsIgnoreCase("y")
                && (!choice[1].equalsIgnoreCase("3") || !choice[1].equalsIgnoreCase("keluar"))
                && (choice[0].equalsIgnoreCase("2") || choice[0].equalsIgnoreCase("3")));
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
                do {
                    System.out.println("1. Tambah mahasiswa\n2. Ubah Biodata\n3. Biodata mahasiswa");
                    String pilih = scStr.nextLine();
                    if (pilih.equalsIgnoreCase("1")) {
                        m++;
                        String parMaSis[][] = new String[masMaSis.length + m][3];

                        int parNil[] = new int[masNil.length + m];

                        for (int x = 0; x < parMaSis.length; x++) {
                            parNil[x] = 0;
                            for (int w = 0; w < bio.length; w++) {
                                parMaSis[x][w] = "null";
                            }
                        }
                        do {
                            for (int r = 0; r < parMaSis.length; r++) {// masMasis diganti ParMasis
                                for (int l = 0; l < bio.length; l++) {
                                    parMaSis[r][l] = tamMaSis[r][l];
                                    parMaSis[n][l] = tamMaSis[n][l];
                                }
                            }
                            for (int k = 0; k < parNil.length; k++) {
                                parNil[k] = tamNil[k];
                            }
                            parNil[n] = tamNil[n];
                            for (int s = 0; s < parMaSis.length; s++) {
                                System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                            }
                            System.out.println("Masukkan angka");
                            n = scInt.nextInt();
                            n -= 1;
                            for (int j = 0; j < bio.length; j++) {
                                System.out.printf("Masukkan %s : ", bio[j]);
                                tamMaSis[n][j] = scStr.nextLine();
                                parMaSis[n][j] = tamMaSis[n][j];
                            }
                            System.out.print("Masukkan nilai : ");
                            tamNil[n] = scInt.nextInt();
                            parNil[n] = tamNil[n];
                            for (int a = 0; a < parMaSis.length; a++) {
                                for (int b = 0; b < parMaSis.length; b++) {
                                    if (parNil[a] > parNil[b]) {
                                        c = parNil[a];
                                        parNil[a] = parNil[b];
                                        parNil[b] = c;

                                        for (int v = 0; v < bio.length; v++) {
                                            ab[v] = parMaSis[a][v];
                                            parMaSis[a][v] = parMaSis[b][v];
                                            parMaSis[b][v] = ab[v];
                                        }
                                    } else if (parNil[a] == parNil[b]) {
                                        if (parMaSis[a][0].compareTo(parMaSis[b][0]) < 0) {
                                            c = parNil[a];
                                            parNil[a] = parNil[b];
                                            parNil[b] = c;

                                            for (int v = 0; v < bio.length; v++) {
                                                ab[v] = parMaSis[a][v];
                                                parMaSis[a][v] = parMaSis[b][v];
                                                parMaSis[b][v] = ab[v];
                                            }
                                        }
                                    }
                                }
                            }

                            for (int q = 0; q < parMaSis.length; q++) {
                                System.out.printf("%-3d|.\t|", q + 1);
                                for (int t = 0; t < bio.length; t++) {
                                    System.out.printf(" %-6s|%-10s|", bio[t], parMaSis[q][t]);
                                }
                                System.out.printf("\t%d\n", parNil[q]);
                            }
                            for (int s = 0; s < parMaSis.length; s++) {
                                System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                            }
                            System.out.println("ketik t jika ingin keluar");
                            back = scStr.nextLine();
                        } while (back.equalsIgnoreCase("y"));
                    } else if (pilih.equalsIgnoreCase("2")) {
                        String parMaSis[][] = new String[masMaSis.length + m][3];

                        int parNil[] = new int[masNil.length + m];

                        for (int x = 0; x < parMaSis.length; x++) {
                            parNil[x] = 0;
                            for (int w = 0; w < bio.length; w++) {
                                parMaSis[x][w] = "null";
                            }
                        }
                        for (int r = 0; r < parMaSis.length; r++) {
                            for (int l = 0; l < bio.length; l++) {
                                parMaSis[r][l] = tamMaSis[r][l];
                                parMaSis[n][l] = tamMaSis[n][l];
                            }
                        }
                        for (int k = 0; k < parNil.length; k++) {
                            parNil[k] = tamNil[k];
                        }
                        parNil[n] = tamNil[n];
                        for (int s = 0; s < parMaSis.length; s++) {
                            System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                        }
                        System.out.println("Masukkan angka");
                        n = scInt.nextInt();
                        n -= 1;
                        for (int j = 0; j < bio.length; j++) {
                            System.out.printf("Masukkan %s : ", bio[j]);
                            tamMaSis[n][j] = scStr.nextLine();
                            parMaSis[n][j] = tamMaSis[n][j];
                        }
                        System.out.print("Masukkan nilai : ");
                        tamNil[n] = scInt.nextInt();
                        parNil[n] = tamNil[n];
                        for (int a = 0; a < parMaSis.length; a++) {
                            for (int b = 0; b < parMaSis.length; b++) {
                                if (parNil[a] > parNil[b]) {
                                    c = parNil[a];
                                    parNil[a] = parNil[b];
                                    parNil[b] = c;

                                    for (int v = 0; v < bio.length; v++) {
                                        ab[v] = parMaSis[a][v];
                                        parMaSis[a][v] = parMaSis[b][v];
                                        parMaSis[b][v] = ab[v];
                                    }
                                } else if (parNil[a] == parNil[b]) {
                                    if (parMaSis[a][0].compareTo(parMaSis[b][0]) < 0) {
                                        c = parNil[a];
                                        parNil[a] = parNil[b];
                                        parNil[b] = c;

                                        for (int v = 0; v < bio.length; v++) {
                                            ab[v] = parMaSis[a][v];
                                            parMaSis[a][v] = parMaSis[b][v];
                                            parMaSis[b][v] = ab[v];
                                        }
                                    }
                                }
                            }
                        }

                        for (int q = 0; q < parMaSis.length; q++) {
                            System.out.printf("%-3d|.\t|", q + 1);
                            for (int t = 0; t < bio.length; t++) {
                                System.out.printf(" %-6s|%-10s|", bio[t], parMaSis[q][t]);
                            }
                            System.out.printf("\t%d\n", parNil[q]);
                        }
                        for (int s = 0; s < parMaSis.length; s++) {
                            System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                        }
                        System.out.print("ketik t jika ingin keluar : ");
                        back = scStr.nextLine();
                    } else if (pilih.equalsIgnoreCase("3")) {
                        String parMaSis[][] = new String[masMaSis.length + m][3];
                        int parNil[] = new int[masNil.length + m];

                        for (int x = 0; x < parMaSis.length; x++) {
                            parNil[x] = 0;
                            for (int w = 0; w < bio.length; w++) {
                                parMaSis[x][w] = "null";
                            }
                        }
                        for (int r = 0; r < parMaSis.length; r++) {
                            for (int l = 0; l < bio.length; l++) {
                                parMaSis[r][l] = tamMaSis[r][l];
                                parMaSis[n][l] = tamMaSis[n][l];
                            }
                        }
                        // for (int r = masMaSis.length; r < parMaSis.length; r++) {
                        // for (int l = 0; l < bio.length; l++) {
                        // parMaSis[r][l] = tamMaSis[r][l];
                        // parMaSis[n][l] = tamMaSis[n][l];
                        // }
                        // }
                        for (int k = 0; k < parNil.length; k++) {
                            parNil[k] = tamNil[k];
                        }
                        // for (int k = masNil.length; k < parNil.length; k++) {
                        // parNil[k] = tamNil[k];
                        // }
                        parNil[n] = tamNil[n];

                        for (int s = 0; s < parMaSis.length; s++) {
                            System.out.printf("%d.\t: %s\n", s + 1, parMaSis[s][0]);
                        }
                        System.out.println("ketik t jika ingin keluar : ");
                        back = scStr.nextLine();
                    }
                } while (back.equalsIgnoreCase("t"));
            } else if (choice[2].equalsIgnoreCase("2") || choice[2].equalsIgnoreCase("Mata Kuliah")) {
                do{
                System.out.println("1. Tambah Mata Kuliah\n2. Ubah Mata Kuliah\n3. Mata Kuliah");
                String pilih = scStr.nextLine();
                if (pilih.equalsIgnoreCase("1")) {
                    m++;
                    String parMatKul[] = new String[masMatKul.length + m];
                    for (int x = 0; x < parMatKul.length; x++) {
                        parMatKul[x] = "null";
                    }
                    for (int k = 0; k < parMatKul.length; k++) {
                        parMatKul[k] = tamMatKul[k];
                    }
                    parMatKul[n] = tamMatKul[n];
                    for (int t = 0; t < parMatKul.length; t++) {
                        System.out.printf("%d.\t: %s\n", t + 1, parMatKul[t]);
                    }
                    System.out.println("Masukkan angka");
                    n = scInt.nextInt();
                    n -= 1;
                    System.out.print("Masukkan Mata Kuliah : ");
                    tamMatKul[n] = scStr.nextLine();
                    parMatKul[n] = tamMatKul[n];
                    for (int a = 0; a < parMatKul.length; a++) {
                        for (int b = 0; b < parMatKul.length; b++) {
                            if (parMatKul[a].compareTo(parMatKul[b]) < 0) {
                                o = parMatKul[a];
                                parMatKul[a] = parMatKul[b];
                                parMatKul[b] = o;
                            }
                        }
                    }
                    System.out.println("ketik t jika ingin keluar");
                    back = scStr.nextLine();

                } else if (pilih.equalsIgnoreCase("2")) {
                    String parMatKul[] = new String[masMatKul.length + m];

                    for (int x = 0; x < parMatKul.length; x++) {
                        parMatKul[x] = "null";
                    }
                    for (int k = 0; k < parMatKul.length; k++) {
                        parMatKul[k] = tamMatKul[k];
                    }
                    parMatKul[n] = tamMatKul[n];
                    for (int t = 0; t < parMatKul.length; t++) {
                        System.out.printf("%d.\t: %s\n", t + 1, parMatKul[t]);
                    }
                    System.out.println("Masukkan angka");
                    n = scInt.nextInt();
                    n -= 1;
                    System.out.print("Masukkan Mata Kuliah : ");
                    tamMatKul[n] = scStr.nextLine();
                    parMatKul[n] = tamMatKul[n];
                    for (int a = 0; a < parMatKul.length; a++) {
                        for (int b = 0; b < parMatKul.length; b++) {
                            if (parMatKul[a].compareTo(parMatKul[b]) < 0) {
                                o = parMatKul[a];
                                parMatKul[a] = parMatKul[b];
                                parMatKul[b] = o;
                            }
                        }
                    }
                    for (int t = 0; t < parMatKul.length; t++) {
                        System.out.printf("%d.\t: %s\n", t + 1, parMatKul[t]);
                    }
                    System.out.println("ketik t jika ingin keluar");
                    back = scStr.nextLine();
                } else if (pilih.equalsIgnoreCase("3")) {
                    String parMatKul[] = new String[masMatKul.length + m];

                    for (int x = 0; x < parMatKul.length; x++) {
                        parMatKul[x] = "null";
                    }
                    for (int k = 0; k < parMatKul.length; k++) {
                        parMatKul[k] = tamMatKul[k];
                    }
                    parMatKul[n] = tamMatKul[n];
                    for (int a = 0; a < parMatKul.length; a++) {
                        for (int b = 0; b < parMatKul.length; b++) {
                            if (parMatKul[a].compareTo(parMatKul[b]) < 0) {
                                o = parMatKul[a];
                                parMatKul[a] = parMatKul[b];
                                parMatKul[b] = o;
                            }
                        }
                    }
                    for (int t = 0; t < parMatKul.length; t++) {
                        System.out.printf("%d.\t: %s\n", t + 1, parMatKul[t]);
                    }
                    System.out.println("ketik t jika ingin keluar");
                    back = scStr.nextLine();
                }
            }while(back.equalsIgnoreCase("t"));
            } else if (choice[2].equalsIgnoreCase("3") || choice[2].equalsIgnoreCase("keluar")) {
                System.out.println("Terimakasih");
            } else {
                System.out.println("Tidak Valid");
            }
        } else if (username.equals(tamMaSis[oo][0]) && password.equalsIgnoreCase(tamMaSis[oo][0])) {
            System.out.println("1. Biodata\n2. Nilai\n3. Cetak KHS\n4. Keluar");
        }
    }
}
