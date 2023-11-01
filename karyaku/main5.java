import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main5 {

    // package karyaku;

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        // login
        String choice[] = new String[3];
        String repeat[] = new String[4];

        String username = "", password = "", password2 = "", user = "", pass = "";
        int yahaa = 0;
        String yahoo = "", pilih = "";

        // tambah dosen
        String masDos[][] = { { "Zanuar", "12" }, { "Zaki", "23" } };
        String tamDos[][] = new String[100][2];
        int u = 0;
        for (int r = 0; r < tamDos.length; r++) {
            for (int l = 0; l < tamDos[0].length; l++) {
                tamDos[r][l] = "~";
            }
        }
        for (int r = 0; r < masDos.length; r++) {
            for (int l = 0; l < masDos[0].length; l++) {
                tamDos[r][l] = masDos[r][l];
            }
        }

        // tambah mahasiswa
        String back = "";
        String masMaSis[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" },
                { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        String tamMaSis[][] = new String[100][3];
        String bio[] = { "Nama", "NIM", "kelas" };
        int m = 0;
        int n = 0;
        String taa = "";
        for (int r = 0; r < tamMaSis.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                tamMaSis[r][l] = "~";
            }
        }
        for (int r = 0; r < masMaSis.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                tamMaSis[r][l] = masMaSis[r][l];
            }
        }

        // tambah mata kuliah
        String masMatKul[] = { "Bahasa Inggris 1", "Critical Thinking and Problem Solving", "Dasar Pemrograman",
                "Keselamtan Kesehatan Kerja", "Konsep Teknologi Informasi", "Matematika Dasar", "Pancasila",
                "Praktikum Dasar Pemrograman" };
        String tamMatKul[] = new String[100];
        String o;
        int g = 0;
        for (int k = 0; k < tamMatKul.length; k++) {
            tamMatKul[k] = "~";
        }
        for (int k = 0; k < masMatKul.length; k++) {
            tamMatKul[k] = masMatKul[k];
        }
        // tambah nilai
        String pilihNama = "";
        String PilihMatkul = "";
        String asa = "";
        String ada = "";
        String ana = "";
        String ava = "";
        String kembali = "";
        String kembali1 = "";
        int i4 = 0;
        int i3 = 0;
        int yahuu = 0;
        int yahii = 0;
        double tam = 0;
        int za = 0;
        int zi = 0;
        double gl = 0;
        String bagian[] = { "Tugas", "Kuis", "UTS", "UAS", "Akhir" };
        double masNil[][][] = { { { 100, 98, 100, 89 }, { 85, 83, 89, 81 } },
                { { 88, 87, 89, 82 }, { 90, 82, 84, 88 } },
                { { 90, 91, 89, 88 }, { 93, 85, 83, 89 } },
                { { 99, 86, 98, 85 }, { 88, 86, 86, 83 } } };
        double tamNil[][][] = new double[100][100][5];
        for (int k = 0; k < tamNil.length; k++) {
            for (int c = 0; c < tamNil[0].length; c++) {
                for (int z = 0; z < tamNil[0][0].length; z++) {
                    tamNil[k][c][z] = 0;
                }
            }
        }
        for (int k = 0; k < masNil.length; k++) {
            for (int c = 0; c < masNil[0].length; c++) {
                for (int z = 0; z < masNil[0][0].length; z++) {
                    tamNil[k][c][z] = masNil[k][c][z];
                }
            }
        }

        do {
            choice[2] = "";
            repeat[1] = "";
            System.out.print("1. Masuk\n2. Tambah akun\n3. Keluar\nKetik angka : ");
            choice[0] = scStr.nextLine();
            if (choice[0].equalsIgnoreCase("1") || choice[0].equalsIgnoreCase("Masuk")) {
                do {
                    repeat[3] = "";
                    do {
                        System.out.print("Masukkan Username : ");
                        username = scStr.nextLine();
                        for (int i = 0; i < tamMaSis.length; i++) {
                            if (username.equals(tamMaSis[i][0]) || username.equals(tamDos[i][0])) {
                                yahaa = i;
                            }
                        }
                        repeat[2] = "";
                        if (username.equals(tamMaSis[yahaa][0]) || username.equals(tamDos[yahaa][0])) {
                            System.out.print("Masukkan password : ");
                            password = scStr.nextLine();
                            if (!password.equals(tamMaSis[yahaa][0]) && !password.equals(tamDos[yahaa][1])) {
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
            } else if (choice[0].equalsIgnoreCase("2") || choice[0].equalsIgnoreCase("buat akun")) {
                System.out.println("Masukkan password : ");
                password2 = scStr.nextLine();
                if (password2.equalsIgnoreCase("WzyRoKa")) {
                    do {
                        repeat[3] = "";
                        u++;// jangan menggunakan (int m) karena membuat nilai m = 1
                        System.out.print("Masukkan username : ");
                        tamDos[masDos.length + u - 1][0] = scStr.nextLine();
                        System.out.print("Masukkan password : ");
                        tamDos[masDos.length + u - 1][1] = scStr.nextLine();
                        System.out.println("Akun berhasil dibuat");
                        do {
                            repeat[2] = "";
                            System.out.print("Masukkan username : ");
                            username = scStr.nextLine();
                            for (int i = 0; i < tamDos.length; i++) {
                                if (username.equals(tamDos[i][0])) {
                                    yahoo = tamDos[i][0];
                                    yahaa = i;
                                }
                            }
                            if (username.equals(yahoo)) {
                                System.out.print("Masukkan password : ");
                                password = scStr.nextLine();
                                if (!password.equals(tamDos[yahaa][1])) {
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
                } else {
                    System.out.println("password salah");
                    System.out.println("Ketik y jika ingin kembali");
                    repeat[1] = scStr.nextLine();
                }
            } else if (choice[0].equalsIgnoreCase("3") || choice[0].equalsIgnoreCase("keluar")) {
                repeat[0] = "y";
            } else {
                System.out.println("Tidak valid\nKetik y jika ingin mengulang");
                repeat[1] = scStr.nextLine();
            }
            if (username.equals(tamDos[yahaa][0]) && password.equals(tamDos[yahaa][1])
                    && !choice[0].equalsIgnoreCase("3") && !repeat[1].equalsIgnoreCase("y")) {
                do {
                    pilih = "";
                    System.out.print("1. Mahasiswa\n2. Mata Kuliah\n3. Nilai\n4. Keluar\nMasukkan angka : ");
                    choice[2] = scStr.nextLine();
                    if (choice[2].equalsIgnoreCase("1") || choice[2].equals("Mahasiswa")) {
                        do {
                            back = "";
                            System.out.println(
                                    "1. Tambah Mahasiswa\n2. Kurangi Mahasiswa\n3. Ubah Biodata\n4. Biodata Mahasiswa\n5. Keluar");
                            pilih = scStr.nextLine();
                            if (pilih.equalsIgnoreCase("1")) {
                                for (int j = 0; j < bio.length; j++) {
                                    System.out.printf("Masukkan %s : ", bio[j]);
                                    tamMaSis[masMaSis.length + m][j] = scStr.nextLine();
                                }
                                System.out.println(tamMaSis[masMaSis.length + m][0]);
                                m++;
                                String parMaSis[][] = new String[masMaSis.length + m][3];
                                String parMatKul[] = new String[masMatKul.length + g];
                                for (int a = 0; a < parMaSis.length; a++) {
                                    for (int b = 0; b < parMaSis.length; b++)
                                        if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                            for (int v = 0; v < bio.length; v++) {
                                                taa = tamMaSis[a][v];
                                                tamMaSis[a][v] = tamMaSis[b][v];
                                                tamMaSis[b][v] = taa;
                                            }
                                            for (int vv = 0; vv < parMatKul.length; vv++) {
                                                for (int z = 0; z < bagian.length; z++) {
                                                    tam = tamNil[a][vv][z];
                                                    tamNil[a][vv][z] = tamNil[b][vv][z];
                                                    tamNil[b][vv][z] = tam;
                                                }
                                            } // ini harus dikembangkan
                                        }
                                }
                                for (int q = 0; q < parMaSis.length; q++) {
                                    System.out.printf("%-3d|.\t|", q + 1);
                                    for (int t = 0; t < bio.length; t++) {
                                        System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                    }
                                    System.out.println("");
                                }
                                System.out.println("ketik t jika ingin keluar");
                                back = scStr.nextLine();
                            } else if (pilih.equalsIgnoreCase("2")) {
                                if (masMaSis.length - 1 + m == -1) {
                                    System.out.println("Biodata tidak tersedia");
                                } else {
                                    String parMaSis[][] = new String[masMaSis.length + m][3];
                                    String parMatKul[] = new String[masMatKul.length + g];
                                    for (int a = 0; a < parMaSis.length; a++) {
                                        for (int b = 0; b < parMaSis.length; b++)
                                            if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                for (int v = 0; v < bio.length; v++) {
                                                    taa = tamMaSis[a][v];
                                                    tamMaSis[a][v] = tamMaSis[b][v];
                                                    tamMaSis[b][v] = taa;
                                                }
                                                for (int vv = 0; vv < parMatKul.length; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tam = tamNil[a][vv][z];
                                                        tamNil[a][vv][z] = tamNil[b][vv][z];
                                                        tamNil[b][vv][z] = tam;
                                                    }
                                                }
                                            }
                                    }
                                    for (int a = 0; a < parMaSis.length - 1; a++) {
                                        for (int b = 0; b < parMaSis.length - 1; b++) {
                                            if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                for (int v = 0; v < bio.length; v++) {
                                                    taa = tamMaSis[a][v];
                                                    tamMaSis[a][v] = tamMaSis[b][v];
                                                    tamMaSis[b][v] = taa;
                                                }
                                            }
                                        }
                                    }
                                    for (int q = 0; q < parMaSis.length - 1; q++) {
                                        System.out.printf("%-3d|.\t|", q + 1);
                                        for (int t = 0; t < bio.length; t++) {
                                            System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                        }
                                        System.out.println("");
                                    }
                                    m--;
                                    for (int xo = 0; xo < bio.length; xo++) {
                                        tamMaSis[masMaSis.length + m][xo] = "~";
                                    }
                                    for (int vv = 0; vv < parMatKul.length; vv++) {
                                        for (int z = 0; z < bagian.length; z++) {
                                            tamNil[masMaSis.length + m][vv][z] = 0;
                                        }
                                    }
                                }

                                System.out.println("ketik t jika ingin keluar");
                                back = scStr.nextLine();
                            } else if (pilih.equalsIgnoreCase("3")) {
                                if (masMaSis.length + m == 0) {
                                    System.out.println("Biodata tidak tersedia");
                                } else {
                                    System.out.println(m);
                                    String parMaSis[][] = new String[masMaSis.length + m][3];
                                    String parMatKul[] = new String[masMatKul.length + g];
                                    for (int a = 0; a < parMaSis.length; a++) {
                                        for (int b = 0; b < parMaSis.length; b++)
                                            if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                for (int v = 0; v < bio.length; v++) {
                                                    taa = tamMaSis[a][v];
                                                    tamMaSis[a][v] = tamMaSis[b][v];
                                                    tamMaSis[b][v] = taa;
                                                }
                                                for (int vv = 0; vv < parMatKul.length; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tam = tamNil[a][vv][z];
                                                        tamNil[a][vv][z] = tamNil[b][vv][z];
                                                        tamNil[b][vv][z] = tam;
                                                    }
                                                }
                                            }
                                    }
                                    for (int q = 0; q < parMaSis.length; q++) {
                                        System.out.printf("%-3d|.\t|", q + 1);
                                        for (int t = 0; t < bio.length; t++) {
                                            System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                        }
                                        System.out.println("");
                                    }
                                    System.out.print("Masukkan angka : ");
                                    n = scInt.nextInt();
                                    n -= 1;

                                    if (n <= -2 || masMaSis.length + m < n + 1) {
                                        System.out.println("tidak valid");
                                    } else {
                                        for (int vv = 0; vv < parMatKul.length; vv++) {
                                            for (int z = 0; z < bagian.length; z++) {
                                                tamNil[n][vv][z] = 0;
                                            }
                                        }
                                        for (int j = 0; j < bio.length; j++) {
                                            System.out.printf("Masukkan %s : ", bio[j]);
                                            tamMaSis[n][j] = scStr.nextLine();
                                        }
                                        for (int a = 0; a < parMaSis.length; a++) {
                                            for (int b = 0; b < parMaSis.length; b++)
                                                if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                    for (int v = 0; v < bio.length; v++) {
                                                        taa = tamMaSis[a][v];
                                                        tamMaSis[a][v] = tamMaSis[b][v];
                                                        tamMaSis[b][v] = taa;
                                                    }
                                                    for (int vv = 0; vv < parMatKul.length; vv++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tam = tamNil[a][vv][z];
                                                            tamNil[a][vv][z] = tamNil[b][vv][z];
                                                            tamNil[b][vv][z] = tam;
                                                        }
                                                    }
                                                }
                                        }

                                        for (int q = 0; q < parMaSis.length; q++) {
                                            System.out.printf("%-3d|.\t|", q + 1);
                                            for (int t = 0; t < bio.length; t++) {
                                                System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                            }
                                            System.out.println("");
                                        }
                                    }
                                }
                                System.out.print("ketik t jika ingin keluar : ");
                                back = scStr.nextLine();

                            } else if (pilih.equalsIgnoreCase("4")) {
                                if (masMaSis.length + m == 0) {
                                    System.out.println("Biodata tidak tersedia");
                                } else {
                                    String parMaSis[][] = new String[masMaSis.length + m][3];
                                    String parMatKul[] = new String[masMatKul.length + g];
                                    for (int a = 0; a < parMaSis.length; a++) {
                                        for (int b = 0; b < parMaSis.length; b++)
                                            if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                for (int v = 0; v < bio.length; v++) {
                                                    taa = tamMaSis[a][v];
                                                    tamMaSis[a][v] = tamMaSis[b][v];
                                                    tamMaSis[b][v] = taa;
                                                }
                                                for (int vv = 0; vv < parMatKul.length; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tam = tamNil[a][vv][z];
                                                        tamNil[a][vv][z] = tamNil[b][vv][z];
                                                        tamNil[b][vv][z] = tam;
                                                    }
                                                }
                                            }
                                    }
                                    for (int q = 0; q < parMaSis.length; q++) {
                                        System.out.printf("%-3d|.\t|", q + 1);
                                        for (int t = 0; t < bio.length; t++) {
                                            System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                        }
                                        System.out.println("");
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar : ");
                                back = scStr.nextLine();
                            }
                        } while (back.equalsIgnoreCase("t")
                                && !(pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("2")
                                        || pilih.equalsIgnoreCase("3") || pilih.equalsIgnoreCase("4"))
                                || !pilih.equals("5"));
                    } else if (choice[2].equalsIgnoreCase("2") || choice[2].equalsIgnoreCase("Mata Kuliah")) {
                        do {
                            back = "";
                            System.out.println(
                                    "1. Tambah Mata Kuliah\n2. Kurangi Mata Kuliah\n3. Ubah Mata Kuliah\n4. Mata Kuliah\n5. Keluar");
                            pilih = scStr.nextLine();
                            if (pilih.equalsIgnoreCase("1")) {
                                System.out.print("Masukkan Mata Kuliah : ");
                                tamMatKul[masMatKul.length + g] = scStr.nextLine();// nilai 8, karena indeks dimulai dari 0
                                g++;
                                String parMaSis[][] = new String[masMaSis.length + m][3];
                                String parMatKul[] = new String[masMatKul.length + g];
                                for (int a = 0; a < parMatKul.length; a++) { // disini menggunakan parmatkul karena operator relasi <
                                    for (int b = 0; b < parMatKul.length; b++) {// udah ada penjekasan di atas
                                        if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                            o = tamMatKul[a];
                                            tamMatKul[a] = tamMatKul[b];
                                            tamMatKul[b] = o;

                                            for (int vv = 0; vv < parMaSis.length; vv++) {
                                                for (int z = 0; z < bagian.length; z++) {
                                                    tam = tamNil[vv][a][z];
                                                    tamNil[vv][a][z] = tamNil[vv][b][z];
                                                    tamNil[vv][b][z] = tam;
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int t = 0; t < parMatKul.length; t++) {
                                    System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                }
                                System.out.println("ketik t jika ingin keluar");
                                back = scStr.nextLine();
                            } else if (pilih.equalsIgnoreCase("2")) {
                                if (masMatKul.length - 1 + g == -1) {
                                    System.out.println("Mata Kulih tidak tersedia");
                                } else {
                                    String parMaSis[][] = new String[masMaSis.length + m][3];
                                    String parMatKul[] = new String[masMatKul.length + g];
                                    for (int a = 0; a < parMatKul.length; a++) {
                                        for (int b = 0; b < parMatKul.length; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                o = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = o;
                                                
                                                for (int vv = 0; vv < parMaSis.length; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tam = tamNil[vv][a][z];
                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                        tamNil[vv][b][z] = tam;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    //untuk memanggil output saja ->
                                    for (int a = 0; a < parMatKul.length - 1; a++) {
                                        for (int b = 0; b < parMatKul.length - 1; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                o = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = o;
                                            }
                                        }
                                    }
                                    for (int t = 0; t < parMatKul.length - 1; t++) {
                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                    }
                                    // <-
                                    g--;
                                    // generalisasi ->
                                    tamMatKul[masMatKul.length + g] = "~";
                                    for (int vv = 0; vv < parMatKul.length; vv++) {
                                        for (int z = 0; z < bagian.length; z++) {
                                            tamNil[masMatKul.length + g][vv][z] = 0;
                                        }
                                    }
                                }
                                // <-
                                System.out.println("ketik t jika ingin keluar");
                                back = scStr.nextLine();
                            } else if (pilih.equalsIgnoreCase("3")) {
                                if (masMatKul.length + g == 0) {//jik tidak dikasih ini akan terjadi bound length....
                                    System.out.println("Mata Kuliah tidak tersedia");
                                } else {
                                    String parMaSis[][] = new String[masMaSis.length + m][3];
                                    String parMatKul[] = new String[masMatKul.length + g];
                                    // untuk mengurtukan, agar nilai sesuai dengan mata kuliah ->
                                    for (int a = 0; a < parMatKul.length; a++) {
                                        for (int b = 0; b < parMatKul.length; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                o = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = o;

                                                for (int vv = 0; vv < parMaSis.length; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tam = tamNil[vv][a][z];
                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                        tamNil[vv][b][z] = tam;
                                                    }
                                                }
                                            }
                                        }
                                    }// <-
                                    for (int t = 0; t < parMatKul.length; t++) {
                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                    }
                                    System.out.println("Masukkan angka");
                                    n = scInt.nextInt();
                                    n -= 1;

                                    if (n <= -2 || masMatKul.length + g < n + 1) {// validasi, jika menginputkan n dengan nilai kurang dari 0 dan mengitputkan nilai lebih dari banyaknya matkul
                                        System.out.println("tidak valid");
                                    } else {
                                        // generalsisasi nilai jika mengubah mata kuliah ->
                                        for (int vv = 0; vv < parMaSis.length; vv++) {
                                            for (int z = 0; z < bagian.length; z++) {
                                                tamNil[vv][n][z] = 0;
                                            }
                                        }
                                        // <-
                                        System.out.print("Masukkan Mata Kuliah : ");
                                        tamMatKul[n] = scStr.nextLine();
                                        // mengurutkan dan menyesuaikan mata kuliah dan nilai yang telah diubah ->
                                        for (int a = 0; a < parMatKul.length; a++) {
                                            for (int b = 0; b < parMatKul.length; b++) {
                                                if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                    o = tamMatKul[a];
                                                    tamMatKul[a] = tamMatKul[b];
                                                    tamMatKul[b] = o;

                                                    for (int vv = 0; vv < parMaSis.length; vv++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tam = tamNil[vv][a][z];
                                                            tamNil[vv][a][z] = tamNil[vv][b][z];
                                                            tamNil[vv][b][z] = tam;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        // <-
                                        for (int t = 0; t < parMatKul.length; t++) {
                                            System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                        }
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar");
                                back = scStr.nextLine();
                            } else if (pilih.equalsIgnoreCase("4")) {
                                if (masMatKul.length + g == 0) {
                                    System.out.println("!!!Input eror!!!");
                                    System.out.println("Mata Kuliah tidak tersedia");
                                } else {
                                    String parMaSis[][] = new String[masMaSis.length + m][3];
                                    String parMatKul[] = new String[masMatKul.length + g];
                                    for (int a = 0; a < parMatKul.length; a++) {
                                        for (int b = 0; b < parMatKul.length; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                o = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = o;

                                                for (int vv = 0; vv < parMaSis.length; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tam = tamNil[vv][a][z];
                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                        tamNil[vv][b][z] = tam;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    for (int t = 0; t < parMatKul.length; t++) {
                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar");
                                back = scStr.nextLine();
                            }
                        } while (back.equalsIgnoreCase("t")
                                && !(pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("2")
                                        || pilih.equalsIgnoreCase("3") || pilih.equalsIgnoreCase("4"))
                                || !pilih.equals("5"));
                    } else if (choice[2].equalsIgnoreCase("3") || choice[2].equalsIgnoreCase("Nilai")) {
                        do {
                            za = 0;
                            kembali1 = "";
                            System.out.println("1. Masukkan nilai\n2. Lihat nilai\n3. Lihat ranking\n4. Keluar");
                            pilih = scStr.nextLine();
                            if (pilih.equalsIgnoreCase("1")) {
                                do {
                                    zi = 0;
                                    PilihMatkul = "";
                                    if (masMaSis.length + m == 0) {
                                        System.out.println("Biodata tidak tersedia");
                                        String parMaSis[][] = new String[masMaSis.length + m][3];
                                        za = parMaSis.length + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        pilihNama = scStr.nextLine();
                                    } else {
                                        String parMaSis[][] = new String[masMaSis.length + m][3];
                                        String parMatKul[] = new String[masMatKul.length + g];
                                        for (int a = 0; a < parMaSis.length; a++) {
                                            for (int b = 0; b < parMaSis.length; b++)
                                                if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                    for (int v = 0; v < bio.length; v++) {
                                                        taa = tamMaSis[a][v];
                                                        tamMaSis[a][v] = tamMaSis[b][v];
                                                        tamMaSis[b][v] = taa;
                                                    }
                                                    for (int v = 0; v < parMatKul.length; v++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tam = tamNil[a][v][z];
                                                            tamNil[a][v][z] = tamNil[b][v][z];
                                                            tamNil[b][v][z] = tam;
                                                        }
                                                    }
                                                }
                                        }
                                        for (int s = 0; s < parMaSis.length; s++) {
                                            System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                                        }
                                        za = parMaSis.length + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        pilihNama = scStr.nextLine();
                                        for (i4 = 0; i4 < parMaSis.length; i4++) {
                                            if (pilihNama.equals(parMaSis[i4][0])) {
                                                yahuu = i4;
                                            } else if (pilihNama.equalsIgnoreCase(ada = String.valueOf(i4 + 1))) {
                                                yahuu = i4;
                                            }
                                        }
                                        System.out.println(yahuu);
                                        if (pilihNama.equalsIgnoreCase(tamMaSis[yahuu][0])
                                                || pilihNama.equalsIgnoreCase(ada = String.valueOf(yahuu + 1))) {
                                            do {
                                                kembali = "";
                                                if (masMatKul.length + g == 0) {
                                                    System.out.println("Biodata tidak tersedia");
                                                    zi = parMatKul.length + 1;
                                                    System.out
                                                            .println(zi + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    PilihMatkul = scStr.nextLine();
                                                } else {
                                                    for (int x = 0; x < parMatKul.length; x++) {
                                                        parMatKul[x] = tamMatKul[x];
                                                    }
                                                    parMatKul[n] = tamMatKul[n];
                                                    for (int a = 0; a < parMatKul.length; a++) {
                                                        for (int b = 0; b < parMatKul.length; b++) {
                                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                                o = tamMatKul[a];
                                                                tamMatKul[a] = tamMatKul[b];
                                                                tamMatKul[b] = o;

                                                                for (int vv = 0; vv < parMaSis.length; vv++) {
                                                                    for (int z = 0; z < bagian.length; z++) {
                                                                        tam = tamNil[vv][a][z];
                                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                                        tamNil[vv][b][z] = tam;
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                    for (int t = 0; t < parMatKul.length; t++) {
                                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                                    }
                                                    zi = parMatKul.length + 1;
                                                    System.out.println(zi + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    PilihMatkul = scStr.nextLine();
                                                    for (i3 = 0; i3 < parMatKul.length; i3++) {
                                                        if (PilihMatkul.equals(tamMatKul[i3])) {
                                                            yahii = i3;
                                                        } else if (PilihMatkul
                                                                .equalsIgnoreCase(asa = String.valueOf(i3 + 1))) {
                                                            yahii = i3;
                                                        }
                                                    }
                                                    System.out.println(yahii);
                                                    if (PilihMatkul.equalsIgnoreCase(tamMatKul[yahii])
                                                            || PilihMatkul
                                                                    .equalsIgnoreCase(
                                                                            asa = String.valueOf(yahii + 1))) {
                                                        for (int z = 0; z < bagian.length - 1; z++) {
                                                            System.out.printf("Masukkan Nilai %s : ", bagian[z]);
                                                            tamNil[yahuu][yahii][z] = scInt.nextInt();
                                                            tamNil[yahuu][yahii][4] += tamNil[yahuu][yahii][z];
                                                        }
                                                        System.out.printf("Nilai %s : %f\n", bagian[4],
                                                                tamNil[yahuu][yahii][4] / (bagian.length - 1));
                                                        tamNil[yahuu][yahii][4] = 0;
                                                        System.out.println("Ketik t jika ingin kembali");
                                                        kembali = scStr.nextLine();
                                                    }
                                                }
                                            } while (kembali.equalsIgnoreCase("t") && !(PilihMatkul
                                                    .equalsIgnoreCase(tamMatKul[yahii])
                                                    || PilihMatkul
                                                            .equalsIgnoreCase(asa = String.valueOf(yahii + 1)))
                                                    || !PilihMatkul.equalsIgnoreCase(ava = String.valueOf(zi)));
                                        }
                                    }
                                } while (PilihMatkul.equalsIgnoreCase(ava = String.valueOf(zi))
                                        && !(pilihNama.equalsIgnoreCase(tamMaSis[yahuu][0])
                                                || pilihNama.equalsIgnoreCase(ada = String.valueOf(yahuu + 1)))
                                        || !pilihNama.equalsIgnoreCase(ana = String.valueOf(za)));
                            } else if (pilih.equalsIgnoreCase("2")) {
                                do {
                                    zi = 0;
                                    PilihMatkul = "";
                                    if (masMaSis.length + m == 0) {
                                        System.out.println("Biodata tidak tersedia");
                                        String parMaSis[][] = new String[masMaSis.length + m][3];
                                        za = parMaSis.length + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        pilihNama = scStr.nextLine();
                                    } else {
                                        String parMaSis[][] = new String[masMaSis.length + m][3];
                                        String parMatKul[] = new String[masMatKul.length + g];
                                        for (int a = 0; a < parMaSis.length; a++) {
                                            for (int b = 0; b < parMaSis.length; b++)
                                                if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                    for (int v = 0; v < bio.length; v++) {
                                                        taa = tamMaSis[a][v];
                                                        tamMaSis[a][v] = tamMaSis[b][v];
                                                        tamMaSis[b][v] = taa;
                                                    }
                                                    for (int vv = 0; vv < parMatKul.length; vv++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tam = tamNil[a][vv][z];
                                                            tamNil[a][vv][z] = tamNil[b][vv][z];
                                                            tamNil[b][vv][z] = tam;
                                                        }
                                                    }
                                                }
                                        }
                                        for (int s = 0; s < parMaSis.length; s++) {
                                            System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                                        }
                                        za = parMaSis.length + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        pilihNama = scStr.nextLine();
                                        for (i4 = 0; i4 < parMaSis.length; i4++) {
                                            if (pilihNama.equals(tamMaSis[i4][0])) {
                                                yahuu = i4;
                                            } else if (pilihNama.equalsIgnoreCase(ada = String.valueOf(i4 + 1))) {
                                                yahuu = i4;
                                            }
                                        }
                                        System.out.println(yahuu);
                                        if (pilihNama.equalsIgnoreCase(tamMaSis[yahuu][0])
                                                || pilihNama.equalsIgnoreCase(ada = String.valueOf(yahuu + 1))) {
                                            do {
                                                kembali = "";
                                                if (masMatKul.length + g == 0) {
                                                    System.out.println("Biodata tidak tersedia");
                                                    zi = parMatKul.length;
                                                    System.out
                                                            .println(zi + 1 + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    PilihMatkul = scStr.nextLine();
                                                } else {
                                                    for (int x = 0; x < parMatKul.length; x++) {
                                                        parMatKul[x] = tamMatKul[x];
                                                    }
                                                    parMatKul[n] = tamMatKul[n];
                                                    for (int a = 0; a < parMatKul.length; a++) {
                                                        for (int b = 0; b < parMatKul.length; b++) {
                                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                                o = tamMatKul[a];
                                                                tamMatKul[a] = tamMatKul[b];
                                                                tamMatKul[b] = o;

                                                                for (int vv = 0; vv < parMaSis.length; vv++) {
                                                                    for (int z = 0; z < bagian.length; z++) {
                                                                        tam = tamNil[vv][a][z];
                                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                                        tamNil[vv][b][z] = tam;
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                    for (int t = 0; t < parMatKul.length; t++) {
                                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                                    }
                                                    zi = parMatKul.length + 1;
                                                    System.out.println(zi + ".\t: IPS");
                                                    System.out
                                                            .println(zi + 1 + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    PilihMatkul = scStr.nextLine();
                                                    for (i3 = 0; i3 < parMatKul.length; i3++) {
                                                        if (PilihMatkul.equals(tamMatKul[i3])) {
                                                            yahii = i3;
                                                        } else if (PilihMatkul
                                                                .equalsIgnoreCase(asa = String.valueOf(i3 + 1))) {
                                                            yahii = i3;
                                                        }
                                                    }
                                                    System.out.println(yahii);
                                                    if (PilihMatkul.equalsIgnoreCase(tamMatKul[yahii])
                                                            || PilihMatkul
                                                                    .equalsIgnoreCase(
                                                                            asa = String.valueOf(yahii + 1))) {
                                                        for (int z = 0; z < bagian.length - 1; z++) {
                                                            System.out.printf("Nilai %s %s : %f\n", bagian[z],
                                                                    tamMatKul[yahii],
                                                                    tamNil[yahuu][yahii][z]);
                                                            tamNil[yahuu][yahii][4] += tamNil[yahuu][yahii][z];
                                                        }
                                                        System.out.printf("Nilai %s %s: %f\n", bagian[4],
                                                                tamMatKul[yahii],
                                                                tamNil[yahuu][yahii][4] / (bagian.length - 1));
                                                        tamNil[yahuu][yahii][4] = 0;
                                                        System.out.println("Ketik t jika ingin kembali");
                                                        kembali = scStr.nextLine();
                                                    } else if (PilihMatkul.equalsIgnoreCase(asa = String.valueOf(zi))
                                                            || PilihMatkul.equalsIgnoreCase("ips")) {

                                                        for (int zz = 0; zz < parMatKul.length; zz++) {
                                                            for (int z = 0; z < bagian.length - 1; z++) {
                                                                tamNil[yahuu][zz][4] += tamNil[yahuu][zz][z];
                                                            }
                                                            System.out.printf("Nilai %s %s: %f\n", bagian[4],
                                                                    tamMatKul[zz],
                                                                    tamNil[yahuu][zz][4] / (bagian.length - 1));
                                                            tamNil[yahuu][zi][0] += (tamNil[yahuu][zz][4]
                                                                    / (bagian.length - 1));
                                                        }
                                                        System.out.println(
                                                                tamNil[yahuu][zi][0] / (parMatKul.length * 25));
                                                        tamNil[yahuu][yahii][4] = 0;
                                                        tamNil[yahuu][zi][0] = 0;

                                                        System.out.println("Ketik t jika ingin kembali");
                                                        kembali = scStr.nextLine();
                                                    } else if (PilihMatkul
                                                            .equalsIgnoreCase(ava = String.valueOf(zi + 1))) {
                                                        tamNil[yahuu][yahii][4] = 0;
                                                        tamNil[yahuu][zi][0] = 0;
                                                    }
                                                }
                                            } while (kembali.equalsIgnoreCase("t") && !(PilihMatkul
                                                    .equalsIgnoreCase(tamMatKul[yahii])
                                                    || PilihMatkul
                                                            .equalsIgnoreCase(asa = String.valueOf(yahii + 1)))
                                                    &&
                                                    !(PilihMatkul.equalsIgnoreCase(asa = String.valueOf(zi))
                                                            || PilihMatkul.equalsIgnoreCase("ips"))
                                                    || !PilihMatkul.equalsIgnoreCase(ava = String.valueOf(zi + 1)));
                                        }
                                    }
                                } while (PilihMatkul.equalsIgnoreCase(ava = String.valueOf(zi + 1))
                                        && !(pilihNama.equalsIgnoreCase(tamMaSis[yahuu][0])
                                                || pilihNama.equalsIgnoreCase(ada = String.valueOf(yahuu + 1)))
                                        || !pilihNama.equalsIgnoreCase(ana = String.valueOf(za)));
                            } else if (pilih.equalsIgnoreCase("3")) {
                                System.out.println("Ranking");

                                String parMaSis[][] = new String[masMaSis.length + m][3];
                                String parMatKul[] = new String[masMatKul.length + g];
                                double parNil[][][] = new double[parMaSis.length][parMatKul.length + 2][bagian.length];
                                zi = parMatKul.length + 1;
                                for (int zzz = 0; zzz < parMaSis.length; zzz++) {
                                    for (int zz = 0; zz < parMatKul.length; zz++) {
                                        for (int z = 0; z < bagian.length - 1; z++) {
                                            parNil[zzz][zz][z] = tamNil[zzz][zz][z];
                                        }
                                    }
                                }
                                for (int zzz = 0; zzz < parMaSis.length; zzz++) {
                                    for (int zz = 0; zz < parMatKul.length; zz++) {
                                        for (int z = 0; z < bagian.length - 1; z++) {
                                            parNil[zzz][zz][4] += parNil[zzz][zz][z];
                                        }
                                        parNil[zzz][zi][0] += (parNil[zzz][zz][4]
                                                / (bagian.length - 1));
                                    }
                                    parNil[zzz][zi][0] /= (parMatKul.length * 25);
                                }
                                for (int r = 0; r < parMaSis.length; r++) {
                                    for (int l = 0; l < bio.length; l++) {
                                        parMaSis[r][l] = tamMaSis[r][l];
                                    }
                                }

                                for (int a = 0; a < parMaSis.length; a++) {
                                    for (int b = 0; b < parMaSis.length; b++) {
                                        if (parNil[a][zi][0] > parNil[b][zi][0]) {
                                            gl = parNil[a][zi][0];
                                            parNil[a][zi][0] = parNil[b][zi][0];
                                            parNil[b][zi][0] = gl;

                                            taa = parMaSis[a][0];
                                            parMaSis[a][0] = parMaSis[b][0];
                                            parMaSis[b][0] = taa;
                                        } else if (parNil[a][zi][0] > parNil[b][zi][0]) {
                                            if (parMaSis[a][0].compareTo(parMaSis[b][0]) < 0) {
                                                gl = parNil[a][zi][0];
                                                parNil[a][zi][0] = parNil[b][zi][0];
                                                parNil[b][zi][0] = gl;

                                                taa = parMaSis[a][0];
                                                parMaSis[a][0] = parMaSis[b][0];
                                                parMaSis[b][0] = taa;
                                            }
                                        }

                                    }
                                }
                                for (int i = 0; i < parMaSis.length; i++) {
                                    System.out.printf(i + 1 + ". %s : %f\n", parMaSis[i][0], parNil[i][zi][0]);
                                }
                                // for (int zzz = 0; zzz < parMaSis.length; zzz++) {
                                // for (int zz = 0; zz < parMatKul.length; zz++) {
                                // tamNil[zzz][zz][4] = 0;
                                // }
                                // tamNil[zzz][zi][0] = 0;
                                // }
                                System.out.println("Ketik t jika ingin kembali");
                                kembali1 = scStr.nextLine();
                            }
                        } while (pilihNama.equalsIgnoreCase(ana = String.valueOf(za))
                                && kembali1.equalsIgnoreCase("t")
                                && !(pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("2")
                                        || pilih.equalsIgnoreCase("3"))
                                || !pilih.equalsIgnoreCase("4"));
                    } else if (choice[2].equalsIgnoreCase("4") || choice[2].equalsIgnoreCase("Keluar")) {
                        System.out.println("Terimakasih");
                    } else {
                        System.out.println("Tidak Valid");
                    }
                } while ((pilih.equalsIgnoreCase("5") || pilih.equalsIgnoreCase("4"))
                        && !((choice[2].equalsIgnoreCase("1") || choice[2].equals("Mahasiswa"))
                                || !(choice[2].equalsIgnoreCase("2") || choice[2].equalsIgnoreCase("Mata Kuliah"))
                                || !(choice[2].equalsIgnoreCase("3") || choice[2].equalsIgnoreCase("Nilai")))
                        || !(choice[2].equalsIgnoreCase("4") || choice[2].equalsIgnoreCase("Keluar")));
            } else if (username.equals(tamMaSis[yahaa][0]) && password.equalsIgnoreCase(tamMaSis[yahaa][0])
                    && !choice[0].equalsIgnoreCase("3") && !repeat[1].equalsIgnoreCase("y")) {
                System.out.println("1. Biodata\n2. Nilai\n3. Cetak KHS\n4. Keluar");
                choice[2] = scStr.nextLine();
                if (choice[2].equalsIgnoreCase("1") || choice[2].equals("Mahasiswa")) {
                    for (int i = 0; i < bio.length; i++) {
                        System.out.println(tamMaSis[yahaa][i]);
                    }
                }
            }
        } while (choice[2].equalsIgnoreCase("4") || !choice[0].equalsIgnoreCase("3")
                || repeat[1].equalsIgnoreCase("y"));
    }
}

// kembali ke main4
