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
    public static double masNil[][][] = {
            { { 100, 98, 100, 89, 0 }, { 85, 83, 89, 81, 0 }, { 100, 98, 100, 89, 0 }, { 100, 98, 100, 89, 0 },
                    { 100, 98, 100, 89, 0 }, { 100, 98, 100, 89, 0 }, { 100, 98, 100, 89, 0 },
                    { 100, 98, 100, 89, 0 } },
            { { 88, 87, 89, 82, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 },
                    { 90, 82, 84, 88, 0 },
                    { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 } },
            { { 90, 91, 89, 88, 0 }, { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 },
                    { 93, 85, 83, 89, 0 },
                    { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 } },
            { { 99, 86, 98, 85, 0 }, { 88, 86, 86, 83, 0 }, { 99, 86, 98, 85, 0 }, { 99, 86, 98, 85, 0 },
                    { 99, 86, 98, 85, 0 },
                    { 99, 86, 98, 85, 0 }, { 99, 86, 98, 85, 0 }, { 99, 86, 98, 85, 0 } } };

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
        // for (int k = 0; k < masNil.length; k++) {
        // for (int c = 0; c < masNil[0].length; c++) {
        // for (int z = 0; z < masNil[0][0].length; z++) {
        // tamNil[k][c][z] = masNil[k][c][z];
        // }
        // }
        // }
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
            getTambahRuangMatkul();
        } else if (choice[1].equalsIgnoreCase("2")) {
            getKurangiRuangMatkul();
        } else if (choice[1].equalsIgnoreCase("3")) {
            getUbahMatkul();
        } else if (choice[1].equalsIgnoreCase("4")) {
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
            getTambahNilai();
        } else if (choice[1].equalsIgnoreCase("2")) {
            getLihatNilai();
        } else if (choice[1].equalsIgnoreCase("3")) {
            //getLihatRanking();
        } else if (choice[1].equalsIgnoreCase("4")) {
            getRangkaDosen();
        } else {
            getNilai();
        }
    }

    public static void getTambahRuangMhs() {
        String tamMaSis[][] = new String[masMaSis.length + 1][bio.length];
        double tamNil[][][] = new double[masMaSis.length + 1][masMatKul.length][bagian.length];
        for (int r = 0; r < masMaSis.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                tamMaSis[r][l] = masMaSis[r][l];
            }
        }
        for (int vv = 0; vv < masMaSis.length; vv++) {
            for (int z = 0; z < masMatKul.length; z++) {
                for (int i = 0; i < bagian.length; i++) {
                    tamNil[vv][z][i] = masNil[vv][z][i];
                }
            }
        }
        getSortingMhs();
        for (int q = 0; q < masMaSis.length; q++) {
            System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, bio[0], masMaSis[q][0]);
        }
        for (int j = 0; j < bio.length; j++) {
            System.out.printf("Masukkan %s : ", bio[j]);
            tamMaSis[masMaSis.length][j] = scStr.nextLine();
        }
        masMaSis = tamMaSis;
        masNil = tamNil;
        getSortingMhs();
        for (int q = 0; q < masMaSis.length; q++) {
            System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, bio[0], masMaSis[q][0]);
        }
        valid = true;
        while (valid) {
            System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getBiodata();
            } else if (repeat[0].equalsIgnoreCase("r")) {
                valid = false;
                getTambahRuangMhs();
            }
        }
    }

    public static void getKurangiRuangMhs() {

        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                }
            }
        } else {
            String tamMaSis[][] = new String[masMaSis.length - 1][bio.length];
            double tamNil[][][] = new double[masMaSis.length - 1][masMatKul.length][bagian.length];

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
                for (int vv = 0; vv < masMatKul.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        masNil[ambilAngka[0]][vv][z] = 0;
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
                for (int vv = 0; vv < tamMaSis.length; vv++) {
                    for (int z = 0; z < masMatKul.length; z++) {
                        for (int i = 0; i < bagian.length; i++) {
                            tamNil[vv][z][i] = masNil[vv][z][i];
                        }
                    }
                }
                masMaSis = tamMaSis;
                masNil = tamNil;
                for (int q = 0; q < masMaSis.length; q++) {
                    System.out.printf("%-3d|.\t|", q + 1);
                    for (int t = 0; t < bio.length; t++) {
                        System.out.printf(" %-6s|%-10s|", bio[t], masMaSis[q][t]);
                    }
                    System.out.println("");
                }
            } else if (choice[3].equalsIgnoreCase("t")) {
                getBiodata();
            } else {
                System.out.println("tidak valid");
            }
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getKurangiRuangMhs();
                }
            }
        }

    }

    public static void getUbahMhs() {
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                }
            }
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
                masNil[ambilAngka[0]][vv][z] = 0;
            }
        }
        for (int t = 0; t < bio.length; t++) {
            System.out.printf("| %-5d| %-10s| %-10s|\n", t + 1, bio[t], masMaSis[ambilAngka[0]][t]);
        }
        System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
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
            System.out.printf("Masukkan %s : ", bio[ambilAngka[1]]);
            masMaSis[ambilAngka[0]][ambilAngka[1]] = scStr.nextLine();
            for (int t = 0; t < bio.length; t++) {
                System.out.printf("| %-5d| %-10s| %-10s|\n", t + 1, bio[t], masMaSis[ambilAngka[0]][t]);
            }
        } else if (choice[4].equalsIgnoreCase("t")) {
            getUbahMhs();
        } else {
            System.out.println("tidak valid");
            getUbahMhs1();
        }
        valid = true;
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
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                }
            }
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
                for (int t = 0; t < bio.length; t++) {
                    System.out.printf("| %-5d| %-10s| %-10s|\n", t + 1, bio[t], masMaSis[ambilAngka[0]][t]);
                }
            } else if (choice[3].equalsIgnoreCase("t")) {
                getBiodata();
            }
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getLihatMhs();
                }
            }
        }

    }

    public static void getTambahRuangMatkul() {
        String tamMatKul[] = new String[masMatKul.length + 1];
        double tamNil[][][] = new double[masMaSis.length][masMatKul.length + 1][bagian.length];
        for (int k = 0; k < masMatKul.length; k++) {
            tamMatKul[k] = masMatKul[k];
        }
        for (int vv = 0; vv < masMaSis.length; vv++) {
            for (int z = 0; z < masMatKul.length; z++) {
                for (int i = 0; i < bagian.length; i++) {
                    tamNil[vv][z][i] = masNil[vv][z][i];
                }
            }
        }
        System.out.print("Masukkan Mata Kuliah : ");
        tamMatKul[masMatKul.length] = scStr.nextLine();
        masMatKul = tamMatKul;
        masNil = tamNil;
        getSortingMatkul();
        for (int t = 0; t < masMatKul.length; t++) {
            System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
        }
        valid = true;
        while (valid) {
            System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getMatkul();
            } else if (repeat[0].equalsIgnoreCase("r")) {
                valid = false;
                getTambahRuangMatkul();
            }
        }
    }

    public static void getKurangiRuangMatkul() {
        if (masMaSis.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getMatkul();
                }
            }
        } else {
            String tamMatKul[] = new String[masMatKul.length - 1];
            double tamNil[][][] = new double[masMaSis.length][masMatKul.length - 1][bagian.length];
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masMatKul.length; i4++) {
                if (choice[3].equalsIgnoreCase(masMatKul[i4])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masMatKul[ambilAngka[0]]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        masNil[vv][ambilAngka[0]][z] = 0;
                    }
                }
                masMatKul[ambilAngka[0]] = "~";
                getSortingMatkul();
                for (int k = 0; k < tamMatKul.length; k++) {
                    tamMatKul[k] = masMatKul[k];
                }
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < tamMatKul.length; z++) {
                        for (int i = 0; i < bagian.length; i++) {
                            tamNil[vv][z][i] = masNil[vv][z][i];
                        }
                    }
                }
                masMatKul = tamMatKul;
                masNil = tamNil;
                for (int t = 0; t < masMatKul.length; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
                }
            } else if (choice[3].equalsIgnoreCase("t")) {
                getBiodata();
            } else {
                System.out.println("tidak valid");
            }
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getMatkul();
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getKurangiRuangMatkul();
                }
            }
        }

    }

    public static void getUbahMatkul() {
        if (masMatKul.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                }
            }
        } else {
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masMatKul.length; i4++) {
                if (choice[3].equalsIgnoreCase(masMatKul[i4])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masMatKul[ambilAngka[0]]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        masNil[vv][penguranganInput][z] = 0;
                    }
                }
                System.out.print("Masukkan Mata Kuliah : ");
                masMatKul[penguranganInput] = scStr.nextLine();
                getSortingMatkul();
                for (int t = 0; t < masMatKul.length; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
                }
            } else if (choice[3].equalsIgnoreCase("t")) {
                getMatkul();
            } else {
                System.out.println("tidak valid");
            }
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getMatkul();
                    ;
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getUbahMatkul();
                }
            }
        }
    }

    public static void getLihatMatkul() {
        if (masMatKul.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                }
            }
        } else {
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
            valid = true;
            while (valid) {
                System.out.println("ketik t jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getMatkul();
                }
            }
        }
    }

    public static void getTambahNilai() {
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getNilai();
                }
            }
        } else {
            double tamNil[][][] = new double[masMaSis.length][masMatKul.length][bagian.length];
            for (int vv = 0; vv < masMaSis.length; vv++) {
                for (int z = 0; z < masMatKul.length; z++) {
                    for (int i = 0; i < bagian.length; i++) {
                        tamNil[vv][z][i] = masNil[vv][z][i];
                    }
                }
            }
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
                getTambahNilai1();
            } else if (choice[3].equalsIgnoreCase("t")) {
                getNilai();
            } else {
                System.out.println("tidak valid");
                getTambahNilai();
            }
        }
    }

    public static void getTambahNilai1() {
        if (masMatKul.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                }
            }
        } else {
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[4] = scStr.nextLine();
            for (i4 = 0; i4 < masMatKul.length; i4++) {
                if (choice[4].equalsIgnoreCase(masMatKul[i4])) {
                    ambilAngka[1] = i4;
                } else if (choice[4]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[1] = i4;
                }
            }
            if (choice[4].equalsIgnoreCase(masMatKul[ambilAngka[1]]) || choice[4].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[1] + 1))) {
                double tamNil[][][] = new double[masMaSis.length][masMatKul.length][bagian.length];
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < masMatKul.length; z++) {
                        for (int i = 0; i < bagian.length; i++) {
                            tamNil[vv][z][i] = masNil[vv][z][i];
                        }
                    }
                }
                for (int z = 0; z < bagian.length - 1; z++) {
                    System.out.printf("Masukkan Nilai %s : ", bagian[z]);
                    tamNil[ambilAngka[0]][ambilAngka[1]][z] = scInt.nextInt();
                    tamNil[ambilAngka[0]][ambilAngka[1]][4] += tamNil[ambilAngka[0]][ambilAngka[1]][z];
                }
                masNil = tamNil;
            } else if (choice[4].equalsIgnoreCase("t")) {
                getTambahNilai();
            } else {
                System.out.println("tidak valid");
                getTambahNilai1();
            }
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getTambahNilai();
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getTambahNilai1();
                }
            }
        }
    }

    public static void getLihatNilai() {
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getNilai();
                }
            }
        } else {
            double tamNil[][][] = new double[masMaSis.length][masMatKul.length][bagian.length];
            for (int vv = 0; vv < masMaSis.length; vv++) {
                for (int z = 0; z < masMatKul.length; z++) {
                    for (int i = 0; i < bagian.length; i++) {
                        tamNil[vv][z][i] = masNil[vv][z][i];
                    }
                }
            }
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
                getLihatNilai1();
            } else if (choice[3].equalsIgnoreCase("t")) {
                getNilai();
            } else {
                System.out.println("tidak valid");
                getTambahNilai();
            }
        }
    }

    public static void getLihatNilai1() {
        if (masMatKul.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getBiodata();
                }
            }
        } else {
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t]);
            }
            System.out.printf("%d.\t: IPS\n", masMatKul.length + 1);
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[4] = scStr.nextLine();
            for (i4 = 0; i4 < masMatKul.length; i4++) {
                if (choice[4].equalsIgnoreCase(masMatKul[i4])) {
                    ambilAngka[1] = i4;
                } else if (choice[4]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[1] = i4;
                }
            }
            if (choice[4].equalsIgnoreCase(masMatKul[ambilAngka[1]]) || choice[4].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[1] + 1))) {
                for (int z = 0; z < bagian.length - 1; z++) {
                    System.out.printf("Nilai %s %s : %f\n", bagian[z],
                            masMatKul[ambilAngka[1]],
                            masNil[ambilAngka[0]][ambilAngka[1]][z]);
                    masNil[ambilAngka[0]][ambilAngka[1]][4] += masNil[ambilAngka[0]][ambilAngka[1]][z];
                }
                System.out.printf("Nilai %s %s: %f\n", bagian[4],
                        masMatKul[ambilAngka[1]],
                        masNil[ambilAngka[0]][ambilAngka[1]][4]
                                / (bagian.length - 1));
                masNil[ambilAngka[0]][ambilAngka[1]][4] = 0;
            } else if (choice[4].equalsIgnoreCase("IPS")
                    || choice[4].equalsIgnoreCase(intToStr[1] = String.valueOf(masMatKul.length + 1))) {
                double tamNil[][][] = new double[masMaSis.length][masMatKul.length + 1][bagian.length];
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < masMatKul.length; z++) {
                        for (int i = 0; i < bagian.length; i++) {
                            tamNil[vv][z][i] = masNil[vv][z][i];
                        }
                    }
                }
                getSortingMhs();
                for (int zz = 0; zz < masMatKul.length; zz++) {
                    for (int z = 0; z < bagian.length - 1; z++) {
                        tamNil[ambilAngka[0]][zz][4] += tamNil[ambilAngka[0]][zz][z];
                    }
                    System.out.printf("Nilai %s %s: %f\n", bagian[4],
                            masMatKul[zz],
                            tamNil[ambilAngka[0]][zz][4] / (bagian.length - 1));
                    tamNil[ambilAngka[0]][masMatKul.length][0] += (tamNil[ambilAngka[0]][zz][4]
                            / (bagian.length - 1));
                }
                System.out.println(
                        tamNil[ambilAngka[0]][masMatKul.length][0] / (masMatKul.length * 25));
                for (int i = 0; i < masMatKul.length; i++) {
                    tamNil[ambilAngka[0]][i][4] = 0;
                }
                tamNil[ambilAngka[0]][masMatKul.length][0] = 0;
                masNil = tamNil;
            } else if (choice[4].equalsIgnoreCase("t")) {
                getTambahNilai();
            } else {
                System.out.println("tidak valid");
                getTambahNilai1();
            }
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getLihatNilai();
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getLihatNilai1();
                }
            }
        }
    }
    

    // public static void getLihatRanking() {
    //     double tamNil[][][] = new double[masMaSis.length][masMatKul.length + 1][bagian.length];
    //     for (int vv = 0; vv < masMaSis.length; vv++) {
    //         for (int z = 0; z < masMatKul.length; z++) {
    //             for (int i = 0; i < bagian.length; i++) {
    //                 tamNil[vv][z][i] = masNil[vv][z][i];
    //             }
    //         }
    //     }
    //     getSortingMhs();
    //     for (int zz = 0; zz < masMatKul.length; zz++) {
    //         for (int z = 0; z < bagian.length - 1; z++) {
    //             tamNil[ambilAngka[0]][zz][4] += tamNil[ambilAngka[0]][zz][z];
    //         }
    //         System.out.printf("Nilai %s %s: %f\n", bagian[4],
    //                 masMatKul[zz],
    //                 tamNil[ambilAngka[0]][zz][4] / (bagian.length - 1));
    //         tamNil[ambilAngka[0]][masMatKul.length][0] += (tamNil[ambilAngka[0]][zz][4]
    //                 / (bagian.length - 1));
    //     }
    //     masNil = tamNil;
    //     getSortingRanking();
    //     for (int i = 0; i < masMaSis.length; i++) {
    //         System.out.printf(i + 1 + ". %s : %f\n", masMaSis[i][0], masNil[i][zi][0]);
    //     }
    //     getSortingMhs();
    //     valid = true;
    //     while (valid) {
    //         System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
    //         repeat[0] = scStr.nextLine();
    //         if (repeat[0].equalsIgnoreCase("t")) {
    //             valid = false;
    //             getNilai();
    //         } else {
    //             getLihatRanking();
    //         }
    //     }
    // }

    public static void getSortingMhs() {
        for (int a = 0; a < masMaSis.length; a++) {
            for (int b = a; b < masMaSis.length; b++)
                if (masMaSis[a][0].compareTo(masMaSis[b][0]) > 0) {
                    for (int v = 0; v < bio.length; v++) {
                        tempMhs = masMaSis[a][v];
                        masMaSis[a][v] = masMaSis[b][v];
                        masMaSis[b][v] = tempMhs;
                    }
                    for (int vv = 0; vv < masMatKul.length; vv++) {
                        for (int z = 0; z < bagian.length; z++) {
                            tempNilai = masNil[a][vv][z];
                            masNil[a][vv][z] = masNil[b][vv][z];
                            masNil[b][vv][z] = tempNilai;
                        }
                    }
                }
        }
    }

    public static void getSortingMatkul() {
        for (int a = 0; a < masMatKul.length; a++) {
            for (int b = a; b < masMatKul.length; b++) {
                if (masMatKul[a].compareTo(masMatKul[b]) > 0) {
                    tempMatkul = masMatKul[a];
                    masMatKul[a] = masMatKul[b];
                    masMatKul[b] = tempMatkul;

                    for (int vv = 0; vv < masMaSis.length; vv++) {
                        for (int z = 0; z < bagian.length; z++) {
                            tempNilai = masNil[vv][a][z];
                            masNil[vv][a][z] = masNil[vv][b][z];
                            masNil[vv][b][z] = tempNilai;
                        }
                    }
                }
            }
        }
    }

    // public static void getSortingRanking() {
    //     for (int a = 0; a < masMaSis.length; a++) {
    //         for (int b = 0; b < masMaSis.length; b++) {
    //             if (masNil[a][zi][0] > masNil[b][zi][0]) {
    //                 tempNilai = masNil[a][zi][0];
    //                 masNil[a][zi][0] = masNil[b][zi][0];
    //                 masNil[b][zi][0] = tempNilai;

    //                 tempMhs = masMaSis[a][0];
    //                 masMaSis[a][0] = masMaSis[b][0];
    //                 masMaSis[b][0] = tempMhs;
    //             } else if (masNil[a][zi][0] > masNil[b][zi][0]) {
    //                 if (masMaSis[a][0].compareTo(masMaSis[b][0]) < 0) {
    //                     tempNilai = masNil[a][zi][0];
    //                     masNil[a][zi][0] = masNil[b][zi][0];
    //                     masNil[b][zi][0] = tempNilai;

    //                     tempMhs = masMaSis[a][0];
    //                     masMaSis[a][0] = masMaSis[b][0];
    //                     masMaSis[b][0] = tempMhs;
    //                 }
    //             }

    //         }
    //     }
    // }
}
