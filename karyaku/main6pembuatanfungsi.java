import java.util.Scanner;

public class main6pembuatanfungsi {
    public static Scanner scStr = new Scanner(System.in);
    public static Scanner scInt = new Scanner(System.in);
    // login

    public static String choice[] = new String[6];
    public static String repeat[] = new String[7];
    public static String login[][] = new String[2][2];
    public static int ambilAngka[] = new int[3];
    public static String intToStr[] = new String[4];
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
    public static String bio[] = { "Nama", "NIM", "kelas" };
    // public static String tamMaSis[][] = new String[100][3];
    public static int penguranganInput = 0;

    public static int tampilanData[] = new int[2];

    // tambah mata kuliah
    public static String masMatKul[] = { "Bahasa Inggris 1", "Critical Thinking and Problem Solving",
            "Dasar Pemrograman",
            "Keselamtan Kesehatan Kerja", "Konsep Teknologi Informasi", "Matematika Dasar", "Pancasila",
            "Praktikum Dasar Pemrograman" };

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
        // for (int r = 0; r < masMaSis.length; r++) {
        // for (int l = 0; l < bio.length; l++) {
        // tamMaSis[r][l] = masMaSis[r][l];
        // }
        // }
        // for (int k = 0; k < masMatKul.length; k++) {
        // tamMatKul[k] = masMatKul[k];
        // }
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
            // System.out.println("\033[H\033[2J");
            getTambahRuangMhs();
        } else if (choice[1].equalsIgnoreCase("2")) {
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
        String tamMaSis[][] = new String[masMaSis.length + 1][3];
        for (int r = 0; r < masMaSis.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                tamMaSis[r][l] = masMaSis[r][l];
            }
        }
        for (int j = 0; j < bio.length; j++) {
            System.out.printf("Masukkan %s : ", bio[j]);
            tamMaSis[masMaSis.length][j] = scStr.nextLine();
        }
        masMaSis = tamMaSis;
        getSortingMhs();
        for (int q = 0; q < masMaSis.length; q++) {
            System.out.printf("%-3d|.\t|", q + 1);
            for (int t = 0; t < bio.length; t++) {
                System.out.printf(" %-6s|%-10s|", bio[t], masMaSis[q][t]);
            }
            System.out.println("");
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
                ;
            }
        }
    }

    public static void getKurangiRuangMhs() {
        
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
        } else {
            String tamMaSis[][] = new String[masMaSis.length - 1][3];
            getSortingMhs();

            for (int q = 0; q < masMaSis.length; q++) {
                System.out.printf("%-3d|.\t|", q + 1);
                for (int t = 0; t < bio.length; t++) {
                    System.out.printf(" %-6s|%-10s|", bio[t], masMaSis[q][t]);
                }
                System.out.println("");
            }
            System.out.print("Masukkan angka atau nama : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masMaSis.length; i4++) {
                if (choice[3].equalsIgnoreCase(masMaSis[i4][0])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masMaSis[ambilAngka[0]][0]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                for (int vv = 0; vv < masMatKul.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        tamNil[ambilAngka[0]][vv][z] = 0;
                    }
                }
                for (int xo = 0; xo < bio.length; xo++) {
                    masMaSis[ambilAngka[0]][xo] = "~";
                }
                getSortingMhs();
                for (int r = 0; r < tamMaSis.length; r++) {
                    for (int l = 0; l < bio.length; l++) {
                        tamMaSis[r][l] = masMaSis[r][l];
                    }
                }
                masMaSis = tamMaSis;
                for (int q = 0; q < masMaSis.length; q++) {
                    System.out.printf("%-3d|.\t|", q + 1);
                    for (int t = 0; t < bio.length; t++) {
                        System.out.printf(" %-6s|%-10s|", bio[t], masMaSis[q][t]);
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("tidak valid");
            }
        }
        valid = true;
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
            }
        }
    }

    public static void getUbahMhs() {
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
        } else {
            getSortingMhs();
            for (int q = 0; q < masMaSis.length; q++) {
                System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, bio[0], masMaSis[q][0]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masMaSis.length; i4++) {
                if (choice[3].equalsIgnoreCase(masMaSis[i4][0])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masMaSis[ambilAngka[0]][0]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                getUbahMhs1();
            } else if (choice[3].equalsIgnoreCase("t")) {
                getBiodata();
            } else {
                System.out.println("tidak valid");
                getUbahMhs();
            }
        }
    }

    public static void getUbahMhs1() {
        for (int vv = 0; vv < masMatKul.length; vv++) {
            for (int z = 0; z < bagian.length; z++) {
                tamNil[ambilAngka[0]][vv][z] = 0;
            }
        }
        for (int t = 0; t < bio.length; t++) {
            System.out.printf("| %-5d| %-10s| %-10s|\n", t + 1, bio[t], masMaSis[ambilAngka[0]][t]);
        }
        System.out.print("pilih angka atau nama\n" +
                "(T) jika ingin keluar\n" +
                "Masukkan : ");
        choice[4] = scStr.nextLine();
        for (i4 = 0; i4 < bio.length; i4++) {
            if (choice[4].equalsIgnoreCase(bio[i4])) {
                ambilAngka[1] = i4;
            } else if (choice[4]
                    .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                ambilAngka[1] = i4;
            }
        }
        if (choice[4].equalsIgnoreCase(bio[ambilAngka[1]]) || choice[4].equalsIgnoreCase(
                intToStr[0] = String.valueOf(ambilAngka[1] + 1))) {
            getUbahMhs2();
        } else if (choice[4].equalsIgnoreCase("t")) {
            getUbahMhs();
        } else {
            System.out.println("tidak valid");
            getUbahMhs1();
        }
    }

    public static void getUbahMhs2() {
        System.out.printf("Masukkan %s : ", bio[ambilAngka[1]]);
        masMaSis[ambilAngka[0]][ambilAngka[1]] = scStr.nextLine();
        getSortingMhs();
        for (int q = 0; q < masMaSis.length; q++) {
            System.out.printf("%-3d|.\t|", q + 1);
            for (int t = 0; t < bio.length; t++) {
                System.out.printf(" %-6s|%-10s|", bio[t], masMaSis[q][t]);
            }
            System.out.println("");
        }
        while (valid) {
            System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getUbahMhs();
            } else if (repeat[0].equalsIgnoreCase("r")) {
                valid = false;
                getUbahMhs1();
            }
        }
    }

    public static void getLihatMhs() {
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
        } else {
            getSortingMhs();
            for (int q = 0; q < masMaSis.length; q++) {
                System.out.printf("%-3d|.\t|", q + 1);
                for (int t = 0; t < bio.length; t++) {
                    System.out.printf(" %-6s|%-10s|", bio[t], masMaSis[q][t]);
                }
                System.out.println("");
            }
        }
        valid = true;
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
            }
        }
    }

    public static void getTambahRuangMatkul() {
        String tamMatKul[] = new String[masMatKul.length + 1];
        for (int k = 0; k < masMatKul.length; k++) {
            tamMatKul[k] = masMatKul[k];
        }
        System.out.print("Masukkan Mata Kuliah : ");
        tamMatKul[masMatKul.length] = scStr.nextLine();
        masMatKul = tamMatKul;
        getSortingMatkul();
        for (int t = 0; t < masMatKul.length; t++) {
            System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getKurangiRuangMatkul() {
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
        } else {
            String tamMatKul[] = new String[masMatKul.length - 1];
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
            System.out.print("Masukkan angka : ");
            penguranganInput = scInt.nextInt();
            penguranganInput -= 1;

            if (penguranganInput < 0
                    || masMatKul.length < penguranganInput + 1) {
                System.out.println("tidak valid");
            } else {
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        tamNil[vv][penguranganInput][z] = 0;
                    }
                }
                masMatKul[penguranganInput] = "~";
                getSortingMatkul();
                for (int k = 0; k < tamMatKul.length; k++) {
                    tamMatKul[k] = masMatKul[k];
                }
                masMatKul = tamMatKul;
                for (int t = 0; t < masMatKul.length; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
                }
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getUbahMatkul() {
        if (masMatKul.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
        } else {
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
            System.out.println("Masukkan angka");
            penguranganInput = scInt.nextInt();
            penguranganInput -= 1;

            if (penguranganInput <= -2
                    || masMatKul.length < penguranganInput + 1) {
                System.out.println("tidak valid");
            } else {
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        tamNil[vv][penguranganInput][z] = 0;
                    }
                }
                System.out.print("Masukkan Mata Kuliah : ");
                masMatKul[penguranganInput] = scStr.nextLine();
                getSortingMatkul();
                for (int t = 0; t < masMatKul.length; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
                }
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getLihatMatkul() {
        if (masMatKul.length == 0) {
            System.out.println("!!!Input eror!!!");
            System.out.println("Mata Kuliah tidak tersedia");
        } else {
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
        }
        while (valid) {
            System.out.println("ketik t jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            }
        }
    }

    public static void getSortingMhs() {
        for (int a = 0; a < masMaSis.length; a++) {
            for (int b = 0; b < masMaSis.length; b++)
                if (masMaSis[a][0].compareTo(masMaSis[b][0]) < 0) {
                    for (int v = 0; v < bio.length; v++) {
                        tempMhs = masMaSis[a][v];
                        masMaSis[a][v] = masMaSis[b][v];
                        masMaSis[b][v] = tempMhs;
                    }
                    for (int vv = 0; vv < masMatKul.length; vv++) {
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
        for (int a = 0; a < masMatKul.length; a++) {
            for (int b = 0; b < masMatKul.length; b++) {
                if (masMatKul[a].compareTo(masMatKul[b]) < 0) {
                    tempMatkul = masMatKul[a];
                    masMatKul[a] = masMatKul[b];
                    masMatKul[b] = tempMatkul;

                    for (int vv = 0; vv < masMaSis.length; vv++) {
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
