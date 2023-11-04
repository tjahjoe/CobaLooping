import java.util.Scanner;

public class main8 {
    public static Scanner scStr = new Scanner(System.in);
    public static Scanner scInt = new Scanner(System.in);
    // login

    public static String choice[] = new String[6];
    public static String repeat[] = new String[7];
    public static String login[][] = new String[2][2];
    public static int ambilAngka[] = new int[3];
    public static String intToStr[] = new String[4];
    public static int menambahRuang[] = new int[3];
    public static String tempMatkul = "";
    public static String tempMhs = "";
    public static double tempNilai = 0;
    public static boolean valid = true;

    // tambah dosen
    public static String masDos[][] = { { "Zanuar", "12" }, { "Zaki", "23" } };
    public static String tamDos[][] = new String[100][2];
    // tambah mahasiswa
    public static String masMaSis[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" },
            { "Cahyana", "1234466", "1C" },
            { "Dizky", "1177334", "1C" } };
    public static String tamMaSis[][] = new String[100][3];
    public static String bio[] = { "Nama", "NIM", "kelas" };
    public static int penguranganInput = 0;

    public static int tampilanData[] = new int[2];

    // tambah mata kuliah
    public static String masMatKul[] = { "Bahasa Inggris 1", "Critical Thinking and Problem Solving",
            "Dasar Pemrograman",
            "Keselamtan Kesehatan Kerja", "Konsep Teknologi Informasi", "Matematika Dasar", "Pancasila",
            "Praktikum Dasar Pemrograman" };
    public static String tamMatKul[] = new String[100];

    // tambah nilai
    public static int i4 = 0;
    public static int i3 = 0;
    public static int za = 0;
    public static int zi = 0;
    public static String bagian[] = { "Tugas", "Kuis", "UTS", "UAS", "Akhir" };
    public static double masNil[][][] = { { { 100, 98, 100, 89 }, { 85, 83, 89, 81 } },
            { { 88, 87, 89, 82 }, { 90, 82, 84, 88 } },
            { { 90, 91, 89, 88 }, { 93, 85, 83, 89 } },
            { { 99, 86, 98, 85 }, { 88, 86, 86, 83 } } };
    public static double tamNil[][][] = new double[100][100][5];

    public static void main(String[] args) {
        for (int r = 0; r < masDos.length; r++) {
            for (int l = 0; l < masDos[0].length; l++) {
                tamDos[r][l] = masDos[r][l];
            }
        }
        for (int r = 0; r < masMaSis.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                tamMaSis[r][l] = masMaSis[r][l];
            }
        }
        for (int k = 0; k < masMatKul.length; k++) {
            tamMatKul[k] = masMatKul[k];
        }
        for (int k = 0; k < masNil.length; k++) {
            for (int c = 0; c < masNil[0].length; c++) {
                for (int z = 0; z < masNil[0][0].length; z++) {
                    tamNil[k][c][z] = masNil[k][c][z];
                }
            }
        }
        getRangkaDosen();
    }

    public static void getRangkaDosen() {
        System.out.println("1. Mahasiswa\n2. Mata Kuliah\n3. Nilai\n4. Keluar");
        choice[2] = scStr.nextLine();
        if (choice[2].equalsIgnoreCase("1")) {
            getBiodata();
        } else if (choice[2].equalsIgnoreCase("2")) {
            getMatkul();
        } else if (choice[2].equalsIgnoreCase("3")) {
            getNilai();
        } else if (choice[2].equalsIgnoreCase("4")) {
            System.out.println("terimakasih");
        }
    }

    public static void getBiodata() {
        System.out.println("1. Tambah Ruang\n2. Kurangi Ruang\n3. Ubah Biodata\n4. Lihat Biodata\n5. Keluar");
        choice[1] = scStr.nextLine();
        if (choice[1].equalsIgnoreCase("1")) {
            valid = true;
            // System.out.println("\033[H\033[2J");
            getTambahRuangMhs();
        } else if (choice[1].equalsIgnoreCase("2")) {
            valid = true;
            getKurangiRuangMhs();
        } else if (choice[1].equalsIgnoreCase("3")) {
            valid = true;
            getUbahMhs();
        } else if (choice[1].equalsIgnoreCase("4")) {
            valid = true;
            getLihatMhs();
        } else if (choice[1].equalsIgnoreCase("5")) {
            getRangkaDosen();
        } else {
            getBiodata();
        }
    }

    public static void getMatkul() {
        System.out
                .println("1. Tambah Ruang\n2. Kurangi Ruang\n3. Ubah Mata Kuliah\n4. Lihat Mata Kuliah\n5. Keluar");
        choice[1] = scStr.nextLine();
        if (choice[1].equalsIgnoreCase("1")) {
            valid = true;
            getTambahRuangMatkul();
        } else if (choice[1].equalsIgnoreCase("2")) {
            valid = true;
            getKurangiRuangMatkul();
        } else if (choice[1].equalsIgnoreCase("3")) {
            valid = true;
            getUbahMatkul();
        } else if (choice[1].equalsIgnoreCase("4")) {
            valid = true;
            getLihatMatkul();
        } else if (choice[1].equalsIgnoreCase("5")) {
            getRangkaDosen();
        } else {
            getMatkul();
        }
    }

    public static void getNilai() {
        System.out.println("1. Input Nilai\n2. Lihat Nilai\n3. Lihat Ranking\n4. Keluar");
        choice[1] = scStr.nextLine();
        if (choice[1].equalsIgnoreCase("1")) {

        } else if (choice[1].equalsIgnoreCase("2")) {

        } else if (choice[1].equalsIgnoreCase("3")) {

        }
    }

    public static void getTambahRuangMhs() {
        for (int j = 0; j < bio.length; j++) {
            System.out.printf("Masukkan %s : ", bio[j]);
            tamMaSis[masMaSis.length + menambahRuang[0]][j] = scStr.nextLine();
        }
        System.out.println(tamMaSis[masMaSis.length + menambahRuang[0]][0]);
        menambahRuang[0]++;
        tampilanData[0] = masMaSis.length + menambahRuang[0];
        tampilanData[1] = masMatKul.length + menambahRuang[1];
        getSortingMhs();
        for (int q = 0; q < tampilanData[0]; q++) {
            System.out.printf("%-3d|.\t|", q + 1);
            for (int t = 0; t < bio.length; t++) {
                System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
            }
            System.out.println("");
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
                ;
            }
        }
    }

    public static void getKurangiRuangMhs() {
        if (masMaSis.length - 1 + menambahRuang[0] == -1) {
            System.out.println("Biodata tidak tersedia");
        } else {
            tampilanData[0] = masMaSis.length + menambahRuang[0];
            tampilanData[1] = masMatKul.length + menambahRuang[1];
            getSortingMhs();
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
                    || masMaSis.length + menambahRuang[0] < penguranganInput + 1) {
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
                getSortingMhs();
                for (int q = 0; q < tampilanData[0] - 1; q++) {
                    System.out.printf("%-3d|.\t|", q + 1);
                    for (int t = 0; t < bio.length; t++) {
                        System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                    }
                    System.out.println("");
                }
                for (int xo = 0; xo < bio.length; xo++) {
                    tamMaSis[tampilanData[0] - 1][xo] = null;
                }
                menambahRuang[0]--;
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
            }
        }
    }

    public static void getUbahMhs() {
        if (masMaSis.length + menambahRuang[0] == 0) {
            System.out.println("Biodata tidak tersedia");
        } else {
            tampilanData[0] = masMaSis.length + menambahRuang[0];
            tampilanData[1] = masMatKul.length + menambahRuang[1];
            getSortingMhs();
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
                    || masMaSis.length + menambahRuang[0] < penguranganInput + 1) {
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
                getSortingMhs();
                for (int q = 0; q < tampilanData[0]; q++) {
                    System.out.printf("%-3d|.\t|", q + 1);
                    for (int t = 0; t < bio.length; t++) {
                        System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                    }
                    System.out.println("");
                }
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
            }
        }
    }

    public static void getLihatMhs() {
        if (masMaSis.length + menambahRuang[0] == 0) {
            System.out.println("Biodata tidak tersedia");
        } else {
            tampilanData[0] = masMaSis.length + menambahRuang[0];
            tampilanData[1] = masMatKul.length + menambahRuang[1];
            getSortingMhs();
            for (int q = 0; q < tampilanData[0]; q++) {
                System.out.printf("%-3d|.\t|", q + 1);
                for (int t = 0; t < bio.length; t++) {
                    System.out.printf(" %-6s|%-10s|", bio[t], tamMaSis[q][t]);
                }
                System.out.println("");
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
            }
        }
    }

    public static void getTambahRuangMatkul() {
        System.out.print("Masukkan Mata Kuliah : ");
        tamMatKul[masMatKul.length + menambahRuang[1]] = scStr.nextLine();
        menambahRuang[1]++;
        tampilanData[0] = masMaSis.length + menambahRuang[0];
        tampilanData[1] = masMatKul.length + menambahRuang[1];
        getSortingMatkul();
        for (int t = 0; t < tampilanData[1]; t++) {
            System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getKurangiRuangMatkul() {
        if (masMaSis.length - 1 + menambahRuang[0] == -1) {
            System.out.println("Biodata tidak tersedia");
        } else {
            tampilanData[0] = masMaSis.length + menambahRuang[0];
            tampilanData[1] = masMatKul.length + menambahRuang[1];
            getSortingMatkul();
            for (int t = 0; t < tampilanData[1]; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
            }
            System.out.print("Masukkan angka : ");
            penguranganInput = scInt.nextInt();
            penguranganInput -= 1;

            if (penguranganInput <= -2
                    || masMatKul.length + menambahRuang[1] < penguranganInput + 1) {
                System.out.println("tidak valid");
            } else {
                for (int vv = 0; vv < tampilanData[1]; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        tamNil[penguranganInput][vv][z] = 0;
                    }
                }
                tamMatKul[penguranganInput] = "~";
                getSortingMatkul();
                for (int t = 0; t < tampilanData[1] - 1; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                }
                tamMatKul[tampilanData[1] - 1] = null;
                menambahRuang[1]--;
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getUbahMatkul() {
        if (masMatKul.length + menambahRuang[1] == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
        } else {
            tampilanData[0] = masMaSis.length + menambahRuang[0];
            tampilanData[1] = masMatKul.length + menambahRuang[1];
            getSortingMatkul();
            for (int t = 0; t < tampilanData[1]; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
            }
            System.out.println("Masukkan angka");
            penguranganInput = scInt.nextInt();
            penguranganInput -= 1;

            if (penguranganInput <= -2
                    || masMatKul.length + menambahRuang[1] < penguranganInput + 1) {
                System.out.println("tidak valid");
            } else {
                for (int vv = 0; vv < tampilanData[0]; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        tamNil[vv][penguranganInput][z] = 0;
                    }
                }
                System.out.print("Masukkan Mata Kuliah : ");
                tamMatKul[penguranganInput] = scStr.nextLine();
                getSortingMatkul();
                for (int t = 0; t < tampilanData[1]; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
                }
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getLihatMatkul() {
        if (masMatKul.length + menambahRuang[1] == 0) {
            System.out.println("!!!Input eror!!!");
            System.out.println("Mata Kuliah tidak tersedia");
        } else {
            tampilanData[0] = masMaSis.length + menambahRuang[0];
            tampilanData[1] = masMatKul.length + menambahRuang[1];
            getSortingMatkul();
            for (int t = 0; t < tampilanData[1]; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, tamMatKul[t]);
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[6] = scStr.nextLine();
            if (repeat[6].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getSortingMhs() {
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
    }

    public static void getSortingMatkul() {
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
    }
}
