import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main7 {

    // package karyaku;

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        // login
        String choice[] = new String[6];
        String repeat[] = new String[7];
        String login[][] = new String[2][2];
        int ambilAngka[] = new int[3];
        String intToStr[] = new String[4];
        int menambahRuang[] = new int[3];
        String tempMatkul = "";
        String tempMhs = "";
        double tempNilai = 0;

        // tambah dosen
        String masDos[][] = { { "Zanuar", "12" }, { "Zaki", "23" } };
        String tamDos[][] = new String[100][2];
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
        String masMaSis[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" },
                { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        String tamMaSis[][] = new String[100][3];
        String bio[] = { "Nama", "NIM", "kelas" };
        int penguranganInput = 0;

        int tampilanData[] = new int[2];
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

        for (int k = 0; k < tamMatKul.length; k++) {
            tamMatKul[k] = "~";
        }
        for (int k = 0; k < masMatKul.length; k++) {
            tamMatKul[k] = masMatKul[k];
        }
        // tambah nilai
        int i4 = 0;
        int i3 = 0;
        int za = 0;
        int zi = 0;
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
                        login[0][0] = scStr.nextLine();
                        for (int i = 0; i < tamMaSis.length; i++) {
                            if (login[0][0].equals(tamMaSis[i][0]) || login[0][0].equals(tamDos[i][0])) {
                                ambilAngka[0] = i;
                            }
                        }
                        repeat[2] = "";
                        if (login[0][0].equals(tamMaSis[ambilAngka[0]][0])
                                || login[0][0].equals(tamDos[ambilAngka[0]][0])) {
                            System.out.print("Masukkan password : ");
                            login[1][0] = scStr.nextLine();
                            if (!login[1][0].equals(tamMaSis[ambilAngka[0]][0])
                                    && !login[1][0].equals(tamDos[ambilAngka[0]][1])) {
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
                login[1][1] = scStr.nextLine();
                if (login[1][1].equalsIgnoreCase("WzyRoKa")) {
                    do {
                        repeat[3] = "";
                        menambahRuang[0]++;
                        System.out.print("Masukkan username : ");
                        tamDos[masDos.length + menambahRuang[0] - 1][0] = scStr.nextLine();
                        System.out.print("Masukkan password : ");
                        tamDos[masDos.length + menambahRuang[0] - 1][1] = scStr.nextLine();
                        System.out.println("Akun berhasil dibuat");
                        do {
                            repeat[2] = "";
                            System.out.print("Masukkan username : ");
                            login[0][0] = scStr.nextLine();
                            for (int i = 0; i < tamDos.length; i++) {
                                if (login[0][0].equals(tamDos[i][0])) {
                                    ambilAngka[0] = i;
                                }
                            }
                            if (login[0][0].equals(tamDos[ambilAngka[0]][0])) {
                                System.out.print("Masukkan password : ");
                                login[1][0] = scStr.nextLine();
                                if (!login[1][0].equals(tamDos[ambilAngka[0]][1])) {
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
                    System.out.println("Ketik y jika ingin repeat[5]");
                    repeat[1] = scStr.nextLine();
                }
            } else if (choice[0].equalsIgnoreCase("3") || choice[0].equalsIgnoreCase("keluar")) {
                repeat[0] = "y";
            } else {
                System.out.println("Tidak valid\nKetik y jika ingin mengulang");
                repeat[1] = scStr.nextLine();
            }
            if (login[0][0].equals(tamDos[ambilAngka[0]][0]) && login[1][0].equals(tamDos[ambilAngka[0]][1])
                    && !choice[0].equalsIgnoreCase("3") && !repeat[1].equalsIgnoreCase("y")) {
                do {
                    choice[5] = "";
                    System.out.print("1. Mahasiswa\n2. Mata Kuliah\n3. Nilai\n4. Keluar\nMasukkan angka : ");
                    choice[2] = scStr.nextLine();
                    if (choice[2].equalsIgnoreCase("1") || choice[2].equals("Mahasiswa")) {
                        do {
                            repeat[6] = "";
                            System.out.println(
                                    "1. Tambah Mahasiswa\n2. Kurangi Mahasiswa\n3. Ubah Biodata\n4. Biodata Mahasiswa\n5. Keluar");
                            choice[5] = scStr.nextLine();
                            if (choice[5].equalsIgnoreCase("1")) {
                                for (int j = 0; j < bio.length; j++) {
                                    System.out.printf("Masukkan %s : ", bio[j]);
                                    tamMaSis[masMaSis.length + menambahRuang[1]][j] = scStr.nextLine();
                                }
                                System.out.println(tamMaSis[masMaSis.length + menambahRuang[1]][0]);
                                menambahRuang[1]++;
                                tampilanData[0] = masMaSis.length + menambahRuang[1];
                                tampilanData[1] = masMatKul.length + menambahRuang[2];
                                for (int a = 0; a < tampilanData[0]; a++) {
                                    for (int b = 0; b < tampilanData[0]; b++)
                                        if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                            for (int v = 0; v < bio.length; v++) {
                                                tempMhs = tamMaSis[a][v];
                                                tamMaSis[a][v] = tamMaSis[b][v];
                                                tamMaSis[b][v] = tempMhs;
                                            }
                                            for (int vv = 0; vv < tampilanData[1]; vv++) {
                                                for (int z = 0; z < bagian.length; z++) {
                                                    tempNilai = tamNil[a][vv][z];
                                                    tamNil[a][vv][z] = tamNil[b][vv][z];
                                                    tamNil[b][vv][z] = tempNilai;
                                                }
                                            }
                                        }
                                }
                                for (int q = 0; q < tampilanData[0]; q++) {
                                    System.out.printf("%-3d|.\t|", q + 1);
                                    for (int t = 0; t < bio.length; t++) {
                                        System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                    }
                                    System.out.println("");
                                }
                                System.out.println("ketik t jika ingin keluar");
                                repeat[6] = scStr.nextLine();
                            } else if (choice[5].equalsIgnoreCase("2")) {
                                if (masMaSis.length - 1 + menambahRuang[1] == -1) {
                                    System.out.println("Biodata tidak tersedia");
                                } else {
                                    tampilanData[0] = masMaSis.length + menambahRuang[1];
                                    tampilanData[1] = masMatKul.length + menambahRuang[2];
                                    for (int a = 0; a < tampilanData[0]; a++) {
                                        for (int b = 0; b < tampilanData[0]; b++)
                                            if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                for (int v = 0; v < bio.length; v++) {
                                                    tempMhs = tamMaSis[a][v];
                                                    tamMaSis[a][v] = tamMaSis[b][v];
                                                    tamMaSis[b][v] = tempMhs;
                                                }
                                                for (int vv = 0; vv < tampilanData[1]; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tempNilai = tamNil[a][vv][z];
                                                        tamNil[a][vv][z] = tamNil[b][vv][z];
                                                        tamNil[b][vv][z] = tempNilai;
                                                    }
                                                }
                                            }
                                    }
                                    for (int q = 0; q < tampilanData[0]; q++) {
                                        System.out.printf("%-3d|.\t|", q + 1);
                                        for (int t = 0; t < bio.length; t++) {
                                            System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                        }
                                        System.out.println("");
                                    }
                                    System.out.print("Masukkan angka : ");
                                    penguranganInput = scInt.nextInt();
                                    penguranganInput -= 1;

                                    if (penguranganInput <= -2
                                            || masMaSis.length + menambahRuang[1] < penguranganInput + 1) {
                                        System.out.println("tidak valid");
                                    } else {
                                        for (int vv = 0; vv < tampilanData[1]; vv++) {
                                            for (int z = 0; z < bagian.length; z++) {
                                                tamNil[penguranganInput][vv][z] = 0;
                                            }
                                        }
                                        for (int xo = 0; xo < bio.length; xo++) {
                                            tamMaSis[penguranganInput][xo] = "~";
                                        }
                                        for (int a = 0; a < tampilanData[0]; a++) {
                                            for (int b = 0; b < tampilanData[0]; b++)
                                                if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                    for (int v = 0; v < bio.length; v++) {
                                                        tempMhs = tamMaSis[a][v];
                                                        tamMaSis[a][v] = tamMaSis[b][v];
                                                        tamMaSis[b][v] = tempMhs;
                                                    }
                                                    for (int vv = 0; vv < tampilanData[1]; vv++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tempNilai = tamNil[a][vv][z];
                                                            tamNil[a][vv][z] = tamNil[b][vv][z];
                                                            tamNil[b][vv][z] = tempNilai;
                                                        }
                                                    }
                                                }
                                        }
                                        for (int q = 0; q < tampilanData[0] - 1; q++) {
                                            System.out.printf("%-3d|.\t|", q + 1);
                                            for (int t = 0; t < bio.length; t++) {
                                                System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                            }
                                            System.out.println("");
                                        }
                                        menambahRuang[1]--;
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar");
                                repeat[6] = scStr.nextLine();
                            } else if (choice[5].equalsIgnoreCase("3")) {
                                if (masMaSis.length + menambahRuang[1] == 0) {
                                    System.out.println("Biodata tidak tersedia");
                                } else {
                                    tampilanData[0] = masMaSis.length + menambahRuang[1];
                                    tampilanData[1] = masMatKul.length + menambahRuang[2];
                                    for (int a = 0; a < tampilanData[0]; a++) {
                                        for (int b = 0; b < tampilanData[0]; b++)
                                            if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                for (int v = 0; v < bio.length; v++) {
                                                    tempMhs = tamMaSis[a][v];
                                                    tamMaSis[a][v] = tamMaSis[b][v];
                                                    tamMaSis[b][v] = tempMhs;
                                                }
                                                for (int vv = 0; vv < tampilanData[1]; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tempNilai = tamNil[a][vv][z];
                                                        tamNil[a][vv][z] = tamNil[b][vv][z];
                                                        tamNil[b][vv][z] = tempNilai;
                                                    }
                                                }
                                            }
                                    }
                                    for (int q = 0; q < tampilanData[0]; q++) {
                                        System.out.printf("%-3d|.\t|", q + 1);
                                        for (int t = 0; t < bio.length; t++) {
                                            System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                        }
                                        System.out.println("");
                                    }
                                    System.out.print("Masukkan angka : ");
                                    penguranganInput = scInt.nextInt();
                                    penguranganInput -= 1;
                                    if (penguranganInput <= -2
                                            || masMaSis.length + menambahRuang[1] < penguranganInput + 1) {
                                        System.out.println("tidak valid");
                                    } else {
                                        for (int vv = 0; vv < tampilanData[1]; vv++) {
                                            for (int z = 0; z < bagian.length; z++) {
                                                tamNil[penguranganInput][vv][z] = 0;
                                            }
                                        }
                                        for (int j = 0; j < bio.length; j++) {
                                            System.out.printf("Masukkan %s : ", bio[j]);
                                            tamMaSis[penguranganInput][j] = scStr.nextLine();
                                        }
                                        for (int a = 0; a < tampilanData[0]; a++) {
                                            for (int b = 0; b < tampilanData[0]; b++)
                                                if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                    for (int v = 0; v < bio.length; v++) {
                                                        tempMhs = tamMaSis[a][v];
                                                        tamMaSis[a][v] = tamMaSis[b][v];
                                                        tamMaSis[b][v] = tempMhs;
                                                    }
                                                    for (int vv = 0; vv < tampilanData[1]; vv++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tempNilai = tamNil[a][vv][z];
                                                            tamNil[a][vv][z] = tamNil[b][vv][z];
                                                            tamNil[b][vv][z] = tempNilai;
                                                        }
                                                    }
                                                }
                                        }
                                        for (int q = 0; q < tampilanData[0]; q++) {
                                            System.out.printf("%-3d|.\t|", q + 1);
                                            for (int t = 0; t < bio.length; t++) {
                                                System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                            }
                                            System.out.println("");
                                        }
                                    }
                                }
                                System.out.print("ketik t jika ingin keluar : ");
                                repeat[6] = scStr.nextLine();

                            } else if (choice[5].equalsIgnoreCase("4")) {
                                if (masMaSis.length + menambahRuang[1] == 0) {
                                    System.out.println("Biodata tidak tersedia");
                                } else {
                                    tampilanData[0] = masMaSis.length + menambahRuang[1];
                                    tampilanData[1] = masMatKul.length + menambahRuang[2];
                                    for (int a = 0; a < tampilanData[0]; a++) {
                                        for (int b = 0; b < tampilanData[0]; b++)
                                            if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                for (int v = 0; v < bio.length; v++) {
                                                    tempMhs = tamMaSis[a][v];
                                                    tamMaSis[a][v] = tamMaSis[b][v];
                                                    tamMaSis[b][v] = tempMhs;
                                                }
                                                for (int vv = 0; vv < tampilanData[1]; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tempNilai = tamNil[a][vv][z];
                                                        tamNil[a][vv][z] = tamNil[b][vv][z];
                                                        tamNil[b][vv][z] = tempNilai;
                                                    }
                                                }
                                            }
                                    }
                                    for (int q = 0; q < tampilanData[0]; q++) {
                                        System.out.printf("%-3d|.\t|", q + 1);
                                        for (int t = 0; t < bio.length; t++) {
                                            System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                                        }
                                        System.out.println("");
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar : ");
                                repeat[6] = scStr.nextLine();
                            }
                        } while (repeat[6].equalsIgnoreCase("t")
                                && !(choice[5].equalsIgnoreCase("1") || choice[5].equalsIgnoreCase("2")
                                        || choice[5].equalsIgnoreCase("3") || choice[5].equalsIgnoreCase("4"))
                                || !choice[5].equals("5"));
                    } else if (choice[2].equalsIgnoreCase("2") || choice[2].equalsIgnoreCase("Mata Kuliah")) {
                        do {
                            repeat[6] = "";
                            System.out.println(
                                    "1. Tambah Mata Kuliah\n2. Kurangi Mata Kuliah\n3. Ubah Mata Kuliah\n4. Mata Kuliah\n5. Keluar");
                            choice[5] = scStr.nextLine();
                            if (choice[5].equalsIgnoreCase("1")) {
                                System.out.print("Masukkan Mata Kuliah : ");
                                tamMatKul[masMatKul.length + menambahRuang[2]] = scStr.nextLine();
                                menambahRuang[2]++;
                                tampilanData[0] = masMaSis.length + menambahRuang[1];
                                tampilanData[1] = masMatKul.length + menambahRuang[2];
                                for (int a = 0; a < tampilanData[1]; a++) {
                                    for (int b = 0; b < tampilanData[1]; b++) {
                                        if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                            tempMatkul = tamMatKul[a];
                                            tamMatKul[a] = tamMatKul[b];
                                            tamMatKul[b] = tempMatkul;

                                            for (int vv = 0; vv < tampilanData[0]; vv++) {
                                                for (int z = 0; z < bagian.length; z++) {
                                                    tempNilai = tamNil[vv][a][z];
                                                    tamNil[vv][a][z] = tamNil[vv][b][z];
                                                    tamNil[vv][b][z] = tempNilai;
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int t = 0; t < tampilanData[1]; t++) {
                                    System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                }
                                System.out.println("ketik t jika ingin keluar");
                                repeat[6] = scStr.nextLine();
                            } else if (choice[5].equalsIgnoreCase("2")) {
                                if (masMatKul.length - 1 + menambahRuang[2] == -1) {
                                    System.out.println("Mata Kulih tidak tersedia");
                                } else {
                                    tampilanData[0] = masMaSis.length + menambahRuang[1];
                                    tampilanData[1] = masMatKul.length + menambahRuang[2];
                                    for (int a = 0; a < tampilanData[1]; a++) {
                                        for (int b = 0; b < tampilanData[1]; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                tempMatkul = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = tempMatkul;
                                                for (int vv = 0; vv < tampilanData[0]; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tempNilai = tamNil[vv][a][z];
                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                        tamNil[vv][b][z] = tempNilai;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    for (int a = 0; a < tampilanData[1] - 1; a++) {
                                        for (int b = 0; b < tampilanData[1] - 1; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                tempMatkul = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = tempMatkul;
                                            }
                                        }
                                    }
                                    for (int t = 0; t < tampilanData[1] - 1; t++) {
                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                    }
                                    menambahRuang[2]--;
                                    tamMatKul[masMatKul.length + menambahRuang[2]] = "~";
                                    for (int vv = 0; vv < tampilanData[1]; vv++) {
                                        for (int z = 0; z < bagian.length; z++) {
                                            tamNil[masMatKul.length + menambahRuang[2]][vv][z] = 0;
                                        }
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar");
                                repeat[6] = scStr.nextLine();
                            } else if (choice[5].equalsIgnoreCase("3")) {
                                if (masMatKul.length + menambahRuang[2] == 0) {
                                    System.out.println("Mata Kuliah tidak tersedia");
                                } else {
                                    tampilanData[0] = masMaSis.length + menambahRuang[1];
                                    tampilanData[1] = masMatKul.length + menambahRuang[2];
                                    for (int a = 0; a < tampilanData[1]; a++) {
                                        for (int b = 0; b < tampilanData[1]; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                tempMatkul = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = tempMatkul;

                                                for (int vv = 0; vv < tampilanData[0]; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tempNilai = tamNil[vv][a][z];
                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                        tamNil[vv][b][z] = tempNilai;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    for (int t = 0; t < tampilanData[1]; t++) {
                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                    }
                                    System.out.println("Masukkan angka");
                                    penguranganInput = scInt.nextInt();
                                    penguranganInput -= 1;

                                    if (penguranganInput <= -2
                                            || masMatKul.length + menambahRuang[2] < penguranganInput + 1) {
                                        System.out.println("tidak valid");
                                    } else {
                                        for (int vv = 0; vv < tampilanData[0]; vv++) {
                                            for (int z = 0; z < bagian.length; z++) {
                                                tamNil[vv][penguranganInput][z] = 0;
                                            }
                                        }
                                        System.out.print("Masukkan Mata Kuliah : ");
                                        tamMatKul[penguranganInput] = scStr.nextLine();
                                        for (int a = 0; a < tampilanData[1]; a++) {
                                            for (int b = 0; b < tampilanData[1]; b++) {
                                                if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                    tempMatkul = tamMatKul[a];
                                                    tamMatKul[a] = tamMatKul[b];
                                                    tamMatKul[b] = tempMatkul;

                                                    for (int vv = 0; vv < tampilanData[0]; vv++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tempNilai = tamNil[vv][a][z];
                                                            tamNil[vv][a][z] = tamNil[vv][b][z];
                                                            tamNil[vv][b][z] = tempNilai;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        for (int t = 0; t < tampilanData[1]; t++) {
                                            System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                        }
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar");
                                repeat[6] = scStr.nextLine();
                            } else if (choice[5].equalsIgnoreCase("4")) {
                                if (masMatKul.length + menambahRuang[2] == 0) {
                                    System.out.println("!!!Input eror!!!");
                                    System.out.println("Mata Kuliah tidak tersedia");
                                } else {
                                    tampilanData[0] = masMaSis.length + menambahRuang[1];
                                    tampilanData[1] = masMatKul.length + menambahRuang[2];
                                    for (int a = 0; a < tampilanData[1]; a++) {
                                        for (int b = 0; b < tampilanData[1]; b++) {
                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                tempMatkul = tamMatKul[a];
                                                tamMatKul[a] = tamMatKul[b];
                                                tamMatKul[b] = tempMatkul;

                                                for (int vv = 0; vv < tampilanData[0]; vv++) {
                                                    for (int z = 0; z < bagian.length; z++) {
                                                        tempNilai = tamNil[vv][a][z];
                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                        tamNil[vv][b][z] = tempNilai;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    for (int t = 0; t < tampilanData[1]; t++) {
                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                    }
                                }
                                System.out.println("ketik t jika ingin keluar");
                                repeat[6] = scStr.nextLine();
                            }
                        } while (repeat[6].equalsIgnoreCase("t")
                                && !(choice[5].equalsIgnoreCase("1") || choice[5].equalsIgnoreCase("2")
                                        || choice[5].equalsIgnoreCase("3") || choice[5].equalsIgnoreCase("4"))
                                || !choice[5].equals("5"));
                    } else if (choice[2].equalsIgnoreCase("3") || choice[2].equalsIgnoreCase("Nilai")) {
                        do {
                            za = 0;
                            choice[4] = "";
                            repeat[4] = "";
                            System.out.println("1. Masukkan nilai\n2. Lihat nilai\n3. Lihat ranking\n4. Keluar");
                            choice[5] = scStr.nextLine();
                            if (choice[5].equalsIgnoreCase("1")) {
                                do {
                                    zi = 0;
                                    choice[3] = "";
                                    if (masMaSis.length + menambahRuang[1] == 0) {
                                        System.out.println("Biodata tidak tersedia");
                                        tampilanData[0] = masMaSis.length + menambahRuang[1];
                                        za = tampilanData[0] + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        choice[4] = scStr.nextLine();
                                    } else {
                                        tampilanData[0] = masMaSis.length + menambahRuang[1];
                                        tampilanData[1] = masMatKul.length + menambahRuang[2];
                                        for (int a = 0; a < tampilanData[0]; a++) {
                                            for (int b = 0; b < tampilanData[0]; b++)
                                                if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                    for (int v = 0; v < bio.length; v++) {
                                                        tempMhs = tamMaSis[a][v];
                                                        tamMaSis[a][v] = tamMaSis[b][v];
                                                        tamMaSis[b][v] = tempMhs;
                                                    }
                                                    for (int v = 0; v < tampilanData[1]; v++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tempNilai = tamNil[a][v][z];
                                                            tamNil[a][v][z] = tamNil[b][v][z];
                                                            tamNil[b][v][z] = tempNilai;
                                                        }
                                                    }
                                                }
                                        }
                                        for (int s = 0; s < tampilanData[0]; s++) {
                                            System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                                        }
                                        za = tampilanData[0] + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        choice[4] = scStr.nextLine();
                                        for (i4 = 0; i4 < tampilanData[0]; i4++) {
                                            if (choice[4].equals(tamMaSis[i4][0])) {
                                                ambilAngka[1] = i4;
                                            } else if (choice[4]
                                                    .equalsIgnoreCase(intToStr[1] = String.valueOf(i4 + 1))) {
                                                ambilAngka[1] = i4;
                                            }
                                        }
                                        System.out.println(ambilAngka[1]);
                                        if (choice[4].equalsIgnoreCase(tamMaSis[ambilAngka[1]][0])
                                                || choice[4].equalsIgnoreCase(
                                                        intToStr[1] = String.valueOf(ambilAngka[1] + 1))) {
                                            do {
                                                repeat[5] = "";
                                                if (masMatKul.length + menambahRuang[2] == 0) {
                                                    System.out.println("Biodata tidak tersedia");
                                                    zi = tampilanData[1] + 1;
                                                    System.out
                                                            .println(zi + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    choice[3] = scStr.nextLine();
                                                } else {
                                                    for (int a = 0; a < tampilanData[1]; a++) {
                                                        for (int b = 0; b < tampilanData[1]; b++) {
                                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                                tempMatkul = tamMatKul[a];
                                                                tamMatKul[a] = tamMatKul[b];
                                                                tamMatKul[b] = tempMatkul;

                                                                for (int vv = 0; vv < tampilanData[0]; vv++) {
                                                                    for (int z = 0; z < bagian.length; z++) {
                                                                        tempNilai = tamNil[vv][a][z];
                                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                                        tamNil[vv][b][z] = tempNilai;
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                    for (int t = 0; t < tampilanData[1]; t++) {
                                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                                    }
                                                    zi = tampilanData[1] + 1;
                                                    System.out.println(zi + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    choice[3] = scStr.nextLine();
                                                    for (i3 = 0; i3 < tampilanData[1]; i3++) {
                                                        if (choice[3].equals(tamMatKul[i3])) {
                                                            ambilAngka[1] = i3;
                                                        } else if (choice[3]
                                                                .equalsIgnoreCase(
                                                                        intToStr[0] = String.valueOf(i3 + 1))) {
                                                            ambilAngka[1] = i3;
                                                        }
                                                    }
                                                    System.out.println(ambilAngka[1]);
                                                    if (choice[3].equalsIgnoreCase(tamMatKul[ambilAngka[1]])
                                                            || choice[3]
                                                                    .equalsIgnoreCase(
                                                                            intToStr[0] = String
                                                                                    .valueOf(ambilAngka[1] + 1))) {
                                                        for (int z = 0; z < bagian.length - 1; z++) {
                                                            System.out.printf("Masukkan Nilai %s : ", bagian[z]);
                                                            tamNil[ambilAngka[1]][ambilAngka[1]][z] = scInt.nextInt();
                                                            tamNil[ambilAngka[1]][ambilAngka[1]][4] += tamNil[ambilAngka[1]][ambilAngka[1]][z];
                                                        }
                                                        System.out.printf("Nilai %s : %f\n", bagian[4],
                                                                tamNil[ambilAngka[1]][ambilAngka[1]][4]
                                                                        / (bagian.length - 1));
                                                        tamNil[ambilAngka[1]][ambilAngka[1]][4] = 0;
                                                        System.out.println("Ketik t jika ingin kembali");
                                                        repeat[5] = scStr.nextLine();
                                                    }
                                                }
                                            } while (repeat[5].equalsIgnoreCase("t") && !(choice[3]
                                                    .equalsIgnoreCase(tamMatKul[ambilAngka[1]])
                                                    || choice[3]
                                                            .equalsIgnoreCase(
                                                                    intToStr[0] = String.valueOf(ambilAngka[1] + 1)))
                                                    || !choice[3].equalsIgnoreCase(intToStr[3] = String.valueOf(zi)));
                                        }
                                    }
                                } while (choice[3].equalsIgnoreCase(intToStr[3] = String.valueOf(zi))
                                        && !(choice[4].equalsIgnoreCase(tamMaSis[ambilAngka[1]][0])
                                                || choice[4].equalsIgnoreCase(
                                                        intToStr[1] = String.valueOf(ambilAngka[1] + 1)))
                                        || !choice[4].equalsIgnoreCase(intToStr[2] = String.valueOf(za)));
                            } else if (choice[5].equalsIgnoreCase("2")) {
                                do {
                                    zi = 0;
                                    choice[3] = "";
                                    if (masMaSis.length + menambahRuang[1] == 0) {
                                        System.out.println("Biodata tidak tersedia");
                                        String parMaSis[][] = new String[masMaSis.length + menambahRuang[1]][3];
                                        za = parMaSis.length + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        choice[4] = scStr.nextLine();
                                    } else {
                                        tampilanData[0] = masMaSis.length + menambahRuang[1];
                                        tampilanData[1] = masMatKul.length + menambahRuang[2];
                                        for (int a = 0; a < tampilanData[0]; a++) {
                                            for (int b = 0; b < tampilanData[0]; b++)
                                                if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) < 0) {
                                                    for (int v = 0; v < bio.length; v++) {
                                                        tempMhs = tamMaSis[a][v];
                                                        tamMaSis[a][v] = tamMaSis[b][v];
                                                        tamMaSis[b][v] = tempMhs;
                                                    }
                                                    for (int vv = 0; vv < tampilanData[1]; vv++) {
                                                        for (int z = 0; z < bagian.length; z++) {
                                                            tempNilai = tamNil[a][vv][z];
                                                            tamNil[a][vv][z] = tamNil[b][vv][z];
                                                            tamNil[b][vv][z] = tempNilai;
                                                        }
                                                    }
                                                }
                                        }
                                        for (int s = 0; s < tampilanData[0]; s++) {
                                            System.out.printf("%d.\t: %s\n", s + 1, tamMaSis[s][0]);
                                        }
                                        za = tampilanData[0] + 1;
                                        System.out.println(za + ".\t: Keluar\nMasukkan Angka atau Nama");
                                        choice[4] = scStr.nextLine();
                                        for (i4 = 0; i4 < tampilanData[0]; i4++) {
                                            if (choice[4].equals(tamMaSis[i4][0])) {
                                                ambilAngka[1] = i4;
                                            } else if (choice[4]
                                                    .equalsIgnoreCase(intToStr[1] = String.valueOf(i4 + 1))) {
                                                ambilAngka[1] = i4;
                                            }
                                        }
                                        System.out.println(ambilAngka[1]);
                                        if (choice[4].equalsIgnoreCase(tamMaSis[ambilAngka[1]][0])
                                                || choice[4].equalsIgnoreCase(
                                                        intToStr[1] = String.valueOf(ambilAngka[1] + 1))) {
                                            do {
                                                repeat[5] = "";
                                                if (masMatKul.length + menambahRuang[2] == 0) {
                                                    System.out.println("Biodata tidak tersedia");
                                                    zi = tampilanData[1];
                                                    System.out
                                                            .println(zi + 1 + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    choice[3] = scStr.nextLine();
                                                } else {
                                                    for (int a = 0; a < tampilanData[1]; a++) {
                                                        for (int b = 0; b < tampilanData[1]; b++) {
                                                            if (tamMatKul[a].compareTo(tamMatKul[b]) < 0) {
                                                                tempMatkul = tamMatKul[a];
                                                                tamMatKul[a] = tamMatKul[b];
                                                                tamMatKul[b] = tempMatkul;

                                                                for (int vv = 0; vv < tampilanData[0]; vv++) {
                                                                    for (int z = 0; z < bagian.length; z++) {
                                                                        tempNilai = tamNil[vv][a][z];
                                                                        tamNil[vv][a][z] = tamNil[vv][b][z];
                                                                        tamNil[vv][b][z] = tempNilai;
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                    for (int t = 0; t < tampilanData[1]; t++) {
                                                        System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                                                    }
                                                    zi = tampilanData[1] + 1;
                                                    System.out.println(zi + ".\t: IPS");
                                                    System.out
                                                            .println(zi + 1 + ".\t: Keluar\nMasukkan Angka atau Nama");
                                                    choice[3] = scStr.nextLine();
                                                    for (i3 = 0; i3 < tampilanData[1]; i3++) {
                                                        if (choice[3].equals(tamMatKul[i3])) {
                                                            ambilAngka[1] = i3;
                                                        } else if (choice[3]
                                                                .equalsIgnoreCase(
                                                                        intToStr[0] = String.valueOf(i3 + 1))) {
                                                            ambilAngka[1] = i3;
                                                        }
                                                    }
                                                    System.out.println(ambilAngka[1]);
                                                    if (choice[3].equalsIgnoreCase(tamMatKul[ambilAngka[1]])
                                                            || choice[3]
                                                                    .equalsIgnoreCase(
                                                                            intToStr[0] = String
                                                                                    .valueOf(ambilAngka[1] + 1))) {
                                                        for (int z = 0; z < bagian.length - 1; z++) {
                                                            System.out.printf("Nilai %s %s : %f\n", bagian[z],
                                                                    tamMatKul[ambilAngka[1]],
                                                                    tamNil[ambilAngka[1]][ambilAngka[1]][z]);
                                                            tamNil[ambilAngka[1]][ambilAngka[1]][4] += tamNil[ambilAngka[1]][ambilAngka[1]][z];
                                                        }
                                                        System.out.printf("Nilai %s %s: %f\n", bagian[4],
                                                                tamMatKul[ambilAngka[1]],
                                                                tamNil[ambilAngka[1]][ambilAngka[1]][4]
                                                                        / (bagian.length - 1));
                                                        tamNil[ambilAngka[1]][ambilAngka[1]][4] = 0;
                                                        System.out.println("Ketik t jika ingin kembali");
                                                        repeat[5] = scStr.nextLine();
                                                    } else if (choice[3]
                                                            .equalsIgnoreCase(intToStr[0] = String.valueOf(zi))
                                                            || choice[3].equalsIgnoreCase("ips")) {

                                                        for (int zz = 0; zz < tampilanData[1]; zz++) {
                                                            for (int z = 0; z < bagian.length - 1; z++) {
                                                                tamNil[ambilAngka[1]][zz][4] += tamNil[ambilAngka[1]][zz][z];
                                                            }
                                                            System.out.printf("Nilai %s %s: %f\n", bagian[4],
                                                                    tamMatKul[zz],
                                                                    tamNil[ambilAngka[1]][zz][4] / (bagian.length - 1));
                                                            tamNil[ambilAngka[1]][zi][0] += (tamNil[ambilAngka[1]][zz][4]
                                                                    / (bagian.length - 1));
                                                        }
                                                        System.out.println(
                                                                tamNil[ambilAngka[1]][zi][0] / (tampilanData[1] * 25));
                                                        tamNil[ambilAngka[1]][ambilAngka[1]][4] = 0;
                                                        tamNil[ambilAngka[1]][zi][0] = 0;

                                                        System.out.println("Ketik t jika ingin kembali");
                                                        repeat[5] = scStr.nextLine();
                                                    } else if (choice[3]
                                                            .equalsIgnoreCase(intToStr[3] = String.valueOf(zi + 1))) {
                                                        tamNil[ambilAngka[1]][ambilAngka[1]][4] = 0;
                                                        tamNil[ambilAngka[1]][zi][0] = 0;
                                                    }
                                                }
                                            } while (repeat[5].equalsIgnoreCase("t") && !(choice[3]
                                                    .equalsIgnoreCase(tamMatKul[ambilAngka[1]])
                                                    || choice[3]
                                                            .equalsIgnoreCase(
                                                                    intToStr[0] = String.valueOf(ambilAngka[1] + 1)))
                                                    &&
                                                    !(choice[3].equalsIgnoreCase(intToStr[0] = String.valueOf(zi))
                                                            || choice[3].equalsIgnoreCase("ips"))
                                                    || !choice[3]
                                                            .equalsIgnoreCase(intToStr[3] = String.valueOf(zi + 1)));
                                        }
                                    }
                                } while (choice[3].equalsIgnoreCase(intToStr[3] = String.valueOf(zi + 1))
                                        && !(choice[4].equalsIgnoreCase(tamMaSis[ambilAngka[1]][0])
                                                || choice[4].equalsIgnoreCase(
                                                        intToStr[1] = String.valueOf(ambilAngka[1] + 1)))
                                        || !choice[4].equalsIgnoreCase(intToStr[2] = String.valueOf(za)));
                            } else if (choice[5].equalsIgnoreCase("3")) {
                                do {
                                    System.out.println("Ranking");

                                    String parMaSis[][] = new String[masMaSis.length + menambahRuang[1]][3];
                                    String parMatKul[] = new String[masMatKul.length + menambahRuang[2]];
                                    double parNil[][][] = new double[parMaSis.length][parMatKul.length
                                            + 2][bagian.length];
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
                                                tempNilai = parNil[a][zi][0];
                                                parNil[a][zi][0] = parNil[b][zi][0];
                                                parNil[b][zi][0] = tempNilai;

                                                tempMhs = parMaSis[a][0];
                                                parMaSis[a][0] = parMaSis[b][0];
                                                parMaSis[b][0] = tempMhs;
                                            } else if (parNil[a][zi][0] > parNil[b][zi][0]) {
                                                if (parMaSis[a][0].compareTo(parMaSis[b][0]) < 0) {
                                                    tempNilai = parNil[a][zi][0];
                                                    parNil[a][zi][0] = parNil[b][zi][0];
                                                    parNil[b][zi][0] = tempNilai;

                                                    tempMhs = parMaSis[a][0];
                                                    parMaSis[a][0] = parMaSis[b][0];
                                                    parMaSis[b][0] = tempMhs;
                                                }
                                            }

                                        }
                                    }
                                    for (int i = 0; i < parMaSis.length; i++) {
                                        System.out.printf(i + 1 + ". %s : %f\n", parMaSis[i][0], parNil[i][zi][0]);
                                    }
                                    System.out.println("Ketik t jika ingin kembali");
                                    repeat[4] = scStr.nextLine();
                                } while (!repeat[4].equalsIgnoreCase("t"));
                            }
                        } while (choice[4].equalsIgnoreCase(intToStr[2] = String.valueOf(za))
                                && repeat[4].equalsIgnoreCase("t")
                                && !(choice[5].equalsIgnoreCase("1") || choice[5].equalsIgnoreCase("2")
                                        || choice[5].equalsIgnoreCase("3"))
                                || !choice[5].equalsIgnoreCase("4"));
                    } else if (choice[2].equalsIgnoreCase("4") || choice[2].equalsIgnoreCase("Keluar")) {
                        System.out.println("Terimakasih");
                    } else {
                        System.out.println("Tidak Valid");
                    }
                } while ((choice[5].equalsIgnoreCase("5") || choice[5].equalsIgnoreCase("4"))
                        && !((choice[2].equalsIgnoreCase("1") || choice[2].equals("Mahasiswa"))
                                || !(choice[2].equalsIgnoreCase("2") || choice[2].equalsIgnoreCase("Mata Kuliah"))
                                || !(choice[2].equalsIgnoreCase("3") || choice[2].equalsIgnoreCase("Nilai")))
                        || !(choice[2].equalsIgnoreCase("4") || choice[2].equalsIgnoreCase("Keluar")));
            } else if (login[0][0].equals(tamMaSis[ambilAngka[0]][0])
                    && login[1][0].equalsIgnoreCase(tamMaSis[ambilAngka[0]][0])
                    && !choice[0].equalsIgnoreCase("3") && !repeat[1].equalsIgnoreCase("y")) {
                System.out.println("1. Biodata\n2. Nilai\n3. Cetak KHS\n4. Keluar");
                choice[2] = scStr.nextLine();
                if (choice[2].equalsIgnoreCase("1") || choice[2].equals("Mahasiswa")) {
                    for (int i = 0; i < bio.length; i++) {
                        System.out.println(tamMaSis[ambilAngka[0]][i]);
                    }
                }
            }
        } while (choice[2].equalsIgnoreCase("4") || !choice[0].equalsIgnoreCase("3")
                || repeat[1].equalsIgnoreCase("y"));
    }
}

// kembali ke main4
