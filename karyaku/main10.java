
import java.util.Scanner;

public class main10 {
    public static Scanner scStr = new Scanner(System.in);
    public static Scanner scInt = new Scanner(System.in);
    public static Scanner scDbl = new Scanner(System.in);
    // login

    public static String choice[] = new String[6];
    public static String repeat[] = new String[7];
    public static String login[][] = new String[2][2];
    public static int ambilAngka[] = new int[3];
    public static String intToStr[] = new String[4];
    public static String tempMatkul = "";
    public static String tempMhs = "";
    public static String tempDosen = "";
    public static double tempPersentase = 0;
    public static double tempNilai = 0;
    public static double indeks = 0;

    public static boolean valid = true;

    // tambah dosen
    public static String masDos[][] = { { "Zanuar", "12" }, { "Zaki", "23" } };
    // public static String tamDos[][] = new String[100][2];
    // tambah mahasiswa
    public static String masMaSis[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" },
            { "Cahyana", "1234466", "1C" },
            { "Dizky", "1177334", "1C" } };
    public static String bio[] = { "Nama", "NIM", "kelas" };
    public static String dataDosen[] = { "Nama", "Password" };
    // public static String tamMaSis[][] = new String[100][3];
    public static int penguranganInput = 0;
    public static double totalSks = 0;

    public static int tampilanData[] = new int[2];

    // tambah mata kuliah
    public static String masMatKul[][] = { { "Bahasa Inggris 1", "Qb2n873y" },
            { "Critical Thinking and Problem Solving", "Xe5l964a" },
            { "Dasar Pemrograman", "Mt3o17j8" }, { "Keselamtan Kesehatan Kerja", "Ps4q52b9" },
            { "Konsep Teknologi Informasi", "Kk6r73z8" },
            { "Matematika Dasar", "Jh5l92y7" }, { "Pancasila", "Ig4q52x9" },
            { "Praktikum Dasar Pemrograman", "Ff6r73w8" }
    };
    public static String bagianMatkul[] = { "Mata Kuliah", "Kode Mata Kuliah", "Persentase Nilai Tugas",
            "Persentase Nilai Kuis", "Persentase Nilai UTS", "Persentase Nilai UAS", "SKS" };

    public static double total = 0;
    // tambah nilai
    public static int i4 = 0;
    public static int i3 = 0;
    public static String bagian[] = { "Tugas", "Kuis", "UTS", "UAS", "Akhir" };
    public static double masPresentase[][] = { { 0.1, 0.2, 0.3, 0.4, 2 }, { 0.2, 0.2, 0.3, 0.3, 3 },
            { 0.2, 0.1, 0.3, 0.4, 2 },
            { 0.3, 0.4, 0.1, 0.2, 2 }, { 0.1, 0.1, 0.4, 0.4, 2 }, { 0.2, 0.2, 0.3, 0.3, 2 }, { 0.1, 0.1, 0.3, 0.5, 3 },
            { 0.2, 0.3, 0.2, 0.3, 2 } };
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

    // jika membuat fungsi sks akan lebih mudah untuk memperbaiki tetapi tidak
    // evisien karena akan menambah banyak fungsi dan array. jika dijadikan 1 dengan
    // presentase akan lebih simple akan tetapi jika ada tambahan persentasi seperti
    // tambahan nilai akan lebih ribet untuk memperbaiki
    public static void main(String[] args) {
        getRangkaDosen();
    }

    public static void getEnd() {
        System.out.println("terimakasih");
    }

    public static void getRangkaDosen() {
        System.out.println("1. Dosen\n2. Mahasiswa\n3. Mata Kuliah\n4. Nilai\n5. Keluar");
        choice[2] = scStr.nextLine();
        if (choice[2].equalsIgnoreCase("1")) {
            getDosen();
        } else if (choice[2].equalsIgnoreCase("2")) {
            getBiodata();
        } else if (choice[2].equalsIgnoreCase("3")) {
            getMatkul();
        } else if (choice[2].equalsIgnoreCase("4")) {
            getNilai();
        } else if (choice[2].equalsIgnoreCase("5")) {
            System.out.println("terimakasih");
        } else {
            getRangkaDosen();
        }
    }

    public static void getDosen() {
        System.out.println(
                "1. Tambah Dosen\n2. Kurangi Dosen\n3. Ubah Dosen\n4. Lihat Dosen\n5. Pemberian Mata Kuliah\n6. Keluar");
        choice[1] = scStr.nextLine();
        if (choice[1].equalsIgnoreCase("1")) {
            getTambahDosen();
        } else if (choice[1].equalsIgnoreCase("2")) {
            getKurangiDosen();
        } else if (choice[1].equalsIgnoreCase("3")) {
            getUbahDosen();
        } else if (choice[1].equalsIgnoreCase("4")) {
            getLihatDosen();
        } else if (choice[1].equalsIgnoreCase("5")) {
            getRangkaDosen();
        } else if (choice[1].equalsIgnoreCase("6")) {

        } else {
            getMatkul();
        }

    }

    public static void getBiodata() {
        System.out.println("1. Tambah Mahasiswa\n2. Kurangi Mahasiswa\n3. Ubah Biodata\n4. Lihat Biodata\n5. Keluar");
        choice[1] = scStr.nextLine();
        if (choice[1].equalsIgnoreCase("1")) {
            // System.out.println("\033[H\033[2J");
            getTambahMhs();
        } else if (choice[1].equalsIgnoreCase("2")) {
            getKurangiMhs();
        } else if (choice[1].equalsIgnoreCase("3")) {
            getUbahMhs();
        } else if (choice[1].equalsIgnoreCase("4")) {
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
            getLihatRanking();
        } else if (choice[1].equalsIgnoreCase("4")) {
            getRangkaDosen();
        } else {
            getNilai();
        }
    }

    public static void getTambahDosen() {
        String tamDosen[][] = new String[masDos.length + 1][masDos[0].length];
        for (int r = 0; r < masDos.length; r++) {
            for (int l = 0; l < masDos[0].length; l++) {
                tamDosen[r][l] = masDos[r][l];
            }
        }
        getSortingDosen();
        for (int q = 0; q < masDos.length; q++) {
            System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, dataDosen[0], masDos[q][0]);
        }
        for (int j = 0; j < masDos[0].length; j++) {
            System.out.printf("Masukkan %s : ", dataDosen[j]);
            tamDosen[masDos.length][j] = scStr.nextLine();
        }
        masDos = tamDosen;
        getSortingDosen();
        for (int q = 0; q < masDos.length; q++) {
            System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, dataDosen[0], masDos[q][0]);
        }
        valid = true;
        while (valid) {
            System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getDosen();
            } else if (repeat[0].equalsIgnoreCase("r")) {
                valid = false;
                getTambahDosen();
            }
        }
    }

    public static void getKurangiDosen() {
        if (masDos.length == 0) {
            System.out.println("Dosen tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getDosen();
                }
            }
        } else {
            String tamDosen[][] = new String[masDos.length - 1][masDos[0].length];
            getSortingDosen();
            for (int q = 0; q < masDos.length; q++) {
                System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, dataDosen[0], masDos[q][0]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masDos.length; i4++) {
                if (choice[3].equalsIgnoreCase(masDos[i4][0])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masDos[ambilAngka[0]][0]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {

                for (int xo = 0; xo < masDos[0].length; xo++) {
                    masDos[ambilAngka[0]][xo] = "�";
                }
                getSortingDosen();
                for (int r = 0; r < tamDosen.length; r++) {
                    for (int l = 0; l < masDos[0].length; l++) {
                        tamDosen[r][l] = masDos[r][l];
                    }
                }
                masDos = tamDosen;
                for (int q = 0; q < masDos.length; q++) {
                    System.out.printf("%-3d|.\t|", q + 1);
                    for (int t = 0; t < masDos[q].length; t++) {
                        System.out.printf(" %-6s|%-10s|", dataDosen[t], masDos[q][t]);
                    }
                    System.out.println("");
                }
                valid = true;
                while (valid) {
                    System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                    repeat[0] = scStr.nextLine();
                    if (repeat[0].equalsIgnoreCase("t")) {
                        valid = false;
                        getDosen();
                    } else if (repeat[0].equalsIgnoreCase("r")) {
                        valid = false;
                        getKurangiDosen();
                    }
                }
            } else if (choice[3].equalsIgnoreCase("t")) {
                getDosen();
            } else {
                System.out.println("tidak valid");
                getKurangiDosen();
            }

        }
    }

    public static void getUbahDosen() {
        if (masMaSis.length == 0) {
            System.out.println("Dosen tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getDosen();
                }
            }
        } else {
            getSortingDosen();
            for (int q = 0; q < masDos.length; q++) {
                System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, dataDosen[0], masDos[q][0]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masDos.length; i4++) {
                if (choice[3].equalsIgnoreCase(masDos[i4][0])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masDos[ambilAngka[0]][0]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                getUbahDosen1();
            } else if (choice[3].equalsIgnoreCase("t")) {
                getDosen();
            } else {
                System.out.println("tidak valid");
                getUbahDosen();
            }
        }
    }

    public static void getUbahDosen1() {
        for (int vv = 0; vv < masMatKul.length; vv++) {
            for (int z = 0; z < bagian.length; z++) {
                masNil[ambilAngka[0]][vv][z] = 0;
            }
        }
        for (int t = 0; t < dataDosen.length; t++) {
            System.out.printf("| %-5d| %-10s| %-10s|\n", t + 1, dataDosen[t], masDos[ambilAngka[0]][t]);
        }
        System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
        choice[4] = scStr.nextLine();
        for (i4 = 0; i4 < dataDosen.length; i4++) {
            if (choice[4].equalsIgnoreCase(dataDosen[i4])) {
                ambilAngka[1] = i4;
            } else if (choice[4]
                    .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                ambilAngka[1] = i4;
            }
        }
        if (choice[4].equalsIgnoreCase(dataDosen[ambilAngka[1]]) || choice[4].equalsIgnoreCase(
                intToStr[0] = String.valueOf(ambilAngka[1] + 1))) {
            System.out.printf("Masukkan %s : ", dataDosen[ambilAngka[1]]);
            masDos[ambilAngka[0]][ambilAngka[1]] = scStr.nextLine();
            for (int t = 0; t < dataDosen.length; t++) {
                System.out.printf("| %-5d| %-10s| %-10s|\n", t + 1, dataDosen[t], masDos[ambilAngka[0]][t]);
            }
            valid = true;// solusi pindah ke if
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getUbahDosen();
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getUbahDosen1();
                }
            }
        } else if (choice[4].equalsIgnoreCase("t")) {
            getUbahDosen();
        } else {
            System.out.println("tidak valid");
            getUbahDosen1();
        }
    }

    public static void getLihatDosen() {
        if (masMaSis.length == 0) {
            System.out.println("Biodata tidak tersedia");
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getDosen();
                }
            }
        } else {
            getSortingDosen();
            for (int q = 0; q < masDos.length; q++) {
                System.out.printf("| %-5d| %-10s| %-10s|\n", q + 1, dataDosen[0], masDos[q][0]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masDos.length; i4++) {
                if (choice[3].equalsIgnoreCase(masDos[i4][0])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masDos[ambilAngka[0]][0]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                for (int t = 0; t < dataDosen.length; t++) {
                    System.out.printf("| %-5d| %-10s| %-10s|\n", t + 1, dataDosen[t], masDos[ambilAngka[0]][t]);
                }
            } else if (choice[3].equalsIgnoreCase("t")) {
                getDosen();
            }
            valid = true;
            while (valid) {
                System.out.println("ketik\n(T) jika ingin keluar\n(R) jika ingin mengulang");
                repeat[0] = scStr.nextLine();
                if (repeat[0].equalsIgnoreCase("t")) {
                    valid = false;
                    getDosen();
                } else if (repeat[0].equalsIgnoreCase("r")) {
                    valid = false;
                    getLihatDosen();
                }
            }
        }
    }

    public static void getTambahMhs() {
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
                getTambahMhs();
            }
        }
    }

    public static void getKurangiMhs() {

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
                    masMaSis[ambilAngka[0]][xo] = "�";
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
                    getKurangiMhs();
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
            valid = true;// solusi pindah ke if
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
        } else if (choice[4].equalsIgnoreCase("t")) {
            getUbahMhs();
        } else {
            System.out.println("tidak valid");
            getUbahMhs1();
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
        String tamMatKul[][] = new String[masMatKul.length + 1][2];
        double tamNil[][][] = new double[masMaSis.length][masMatKul.length + 1][bagian.length];
        double tamPersentase[][] = new double[masPresentase.length + 1][bagian.length];
        for (int k = 0; k < masMatKul.length; k++) {
            for (int i = 0; i < masMatKul[k].length; i++) {// 3 diubah ke masmatkul[].lenght
                tamMatKul[k][i] = masMatKul[k][i];
            }
        }
        for (int i = 0; i < masPresentase.length; i++) {
            for (int j = 0; j < masPresentase[0].length; j++) {
                tamPersentase[i][j] = masPresentase[i][j];
            }
        }
        for (int vv = 0; vv < masMaSis.length; vv++) {
            for (int z = 0; z < masMatKul.length; z++) {
                for (int i = 0; i < bagian.length; i++) {
                    tamNil[vv][z][i] = masNil[vv][z][i];
                }
            }
        }
        getSortingMatkul();
        for (int t = 0; t < masMatKul.length; t++) {
            System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
        }

        for (int i = 0; i < bagianMatkul.length; i++) {
            System.out.printf("Masukkan %s : ", bagianMatkul[i]);
            if (i < masMatKul[0].length) {
                tamMatKul[masMatKul.length][i] = scStr.nextLine();
                if (tamMatKul[masMatKul.length][i].equalsIgnoreCase(tamMatKul[masMatKul.length][1])
                        && tamMatKul[masMatKul.length][1].length() != 8) {
                    i--;
                }
            } else {
                int j = i - masMatKul[0].length;
                tamPersentase[masPresentase.length][j] = scDbl.nextDouble();

            }
        } // logika eror
        masPresentase = tamPersentase;
        masMatKul = tamMatKul;
        masNil = tamNil;
        getSortingMatkul();
        for (int t = 0; t < masMatKul.length; t++) {
            System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
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
        if (masMatKul.length == 0) {
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
            String tamMatKul[][] = new String[masMatKul.length - 1][2];
            double tamNil[][][] = new double[masMaSis.length][masMatKul.length - 1][bagian.length];
            double tamPersentase[][] = new double[masPresentase.length - 1][bagian.length];
            getSortingMatkul();
            for (int t = 0; t < masMatKul.length; t++) {
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masMatKul.length; i4++) {
                if (choice[3].equalsIgnoreCase(masMatKul[i4][0])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masMatKul[ambilAngka[0]][0]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        masNil[vv][ambilAngka[0]][z] = 0;
                    }
                }
                for (int i = 0; i < masPresentase[0].length; i++) {
                    masPresentase[ambilAngka[0]][i] = 0;
                }
                for (int z = 0; z < 3; z++) {
                    masMatKul[ambilAngka[0]][z] = "�";
                }
                getSortingMatkul();

                for (int k = 0; k < tamMatKul.length; k++) {
                    tamMatKul[k] = masMatKul[k];
                }
                for (int i = 0; i < tamPersentase.length; i++) {
                    for (int j = 0; j < masPresentase[0].length; j++) {
                        tamPersentase[i][j] = masPresentase[i][j];
                    }
                }
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < tamMatKul.length; z++) {
                        for (int i = 0; i < bagian.length; i++) {
                            tamNil[vv][z][i] = masNil[vv][z][i];
                        }
                    }
                }
                masPresentase = tamPersentase;
                masMatKul = tamMatKul;
                masNil = tamNil;
                for (int t = 0; t < masMatKul.length; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
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
            } else if (choice[3].equalsIgnoreCase("t")) {
                getMatkul();
            } else {
                System.out.println("tidak valid");
                getKurangiRuangMatkul();
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
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
            }
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[3] = scStr.nextLine();
            for (i4 = 0; i4 < masMatKul.length; i4++) {
                if (choice[3].equalsIgnoreCase(masMatKul[i4][0])) {
                    ambilAngka[0] = i4;
                } else if (choice[3]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[0] = i4;
                }
            }
            if (choice[3].equalsIgnoreCase(masMatKul[ambilAngka[0]][0]) || choice[3].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[0] + 1))) {
                for (int vv = 0; vv < masMaSis.length; vv++) {
                    for (int z = 0; z < bagian.length; z++) {
                        masNil[vv][penguranganInput][z] = 0;
                    }
                }
                for (int i = 0; i < bagianMatkul.length; i++) {
                    System.out.printf("Masukkan %s : ", bagianMatkul[i]);
                    masMatKul[penguranganInput][i] = scStr.nextLine();
                    if (masMatKul[penguranganInput][i].equalsIgnoreCase(masMatKul[penguranganInput][1])
                            && masMatKul[penguranganInput][1].length() != 8) {
                        i--;
                    }
                }
                getSortingMatkul();
                for (int t = 0; t < masMatKul.length; t++) {
                    System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
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
            } else if (choice[3].equalsIgnoreCase("t")) {
                getMatkul();
            } else {
                System.out.println("tidak valid");
                getUbahMatkul();
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
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
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
                    getTambahNilai();
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
                if (choice[4].equalsIgnoreCase(masMatKul[i4][0])) {
                    ambilAngka[1] = i4;
                } else if (choice[4]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[1] = i4;
                }
            }
            if (choice[4].equalsIgnoreCase(masMatKul[ambilAngka[1]][0]) || choice[4].equalsIgnoreCase(
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
                    total = tamNil[ambilAngka[0]][ambilAngka[1]][z] * masPresentase[ambilAngka[1]][z];
                    tamNil[ambilAngka[0]][ambilAngka[1]][4] += total;// tamNil[ambilAngka[0]][ambilAngka[1]][z];
                }
                coba(tamNil[ambilAngka[0]][ambilAngka[1]][4]);
                System.out.println(indeks);
                System.out.printf("Nilai %s : %f\n", bagian[4], tamNil[ambilAngka[0]][ambilAngka[1]][4]);
                tamNil[ambilAngka[0]][ambilAngka[1]][4] = 0;
                total = 0;
                masNil = tamNil;
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
            } else if (choice[4].equalsIgnoreCase("t")) {
                getTambahNilai();
            } else {
                System.out.println("tidak valid");
                getTambahNilai1();
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
                getLihatNilai();
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
                System.out.printf("%d.\t: %s\n", t + 1, masMatKul[t][0]);
            }
            System.out.printf("%d.\t: IPS\n", masMatKul.length + 1);
            System.out.print("pilih angka atau nama\n(T) jika ingin keluar\nMasukkan : ");
            choice[4] = scStr.nextLine();
            for (i4 = 0; i4 < masMatKul.length; i4++) {
                if (choice[4].equalsIgnoreCase(masMatKul[i4][0])) {
                    ambilAngka[1] = i4;
                } else if (choice[4]
                        .equalsIgnoreCase(intToStr[0] = String.valueOf(i4 + 1))) {
                    ambilAngka[1] = i4;
                }
            }
            if (choice[4].equalsIgnoreCase(masMatKul[ambilAngka[1]][0]) || choice[4].equalsIgnoreCase(
                    intToStr[0] = String.valueOf(ambilAngka[1] + 1))) {
                for (int z = 0; z < bagian.length - 1; z++) {
                    System.out.printf("Nilai %s %s : %f\n", bagian[z],
                            masMatKul[ambilAngka[1]][0],
                            masNil[ambilAngka[0]][ambilAngka[1]][z]);
                    total = masNil[ambilAngka[0]][ambilAngka[1]][z] * masPresentase[ambilAngka[1]][z];
                    // disinin troublenya, masNil[ambilAngka[0]][ambilAngka[1]][z] *=
                    // masPresentase[ambilAngka[1]][z] ini harus di ubah total = masnil[][] +
                    // maspresentase
                    masNil[ambilAngka[0]][ambilAngka[1]][4] += total; // masNil[ambilAngka[0]][ambilAngka[1]][z];
                }
                coba(masNil[ambilAngka[0]][ambilAngka[1]][4]); // grade
                for (int i = 0; i < masPresentase.length; i++) {
                    totalSks += masPresentase[i][4];
                }
                indeks *= (masPresentase[ambilAngka[1]][4] / totalSks);
                System.out.printf("Nilai %s %s: %f\n", bagian[4],
                        masMatKul[ambilAngka[1]][0],
                        indeks);// perlu dicek lagi
                System.out.println(indeks);
                indeks = 0;
                totalSks = 0;
                masNil[ambilAngka[0]][ambilAngka[1]][4] = 0;
                total = 0;
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
                        total = tamNil[ambilAngka[0]][zz][z] * masPresentase[zz][z];
                        tamNil[ambilAngka[0]][zz][4] += total; // tamNil[ambilAngka[0]][zz][z];
                    }
                    coba(tamNil[ambilAngka[0]][zz][4]);
                    System.out.printf("Nilai %s %s: %.2f\n", bagian[4],
                            masMatKul[zz][0],
                            tamNil[ambilAngka[0]][zz][4]);
                    tamNil[ambilAngka[0]][masMatKul.length][0] += tamNil[ambilAngka[0]][zz][4];
                }
                System.out.printf("IPS : %.2f\n",
                        tamNil[ambilAngka[0]][masMatKul.length][0] / (masMatKul.length * 25));
                for (int i = 0; i < masMatKul.length; i++) {
                    tamNil[ambilAngka[0]][i][4] = 0;
                }
                // apakah bisa menggunakan fungsi??
                tamNil[ambilAngka[0]][masMatKul.length][0] = 0;
                total = 0;
                masNil = tamNil;
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
            } else if (choice[4].equalsIgnoreCase("t")) {
                getLihatNilai();
            } else {
                System.out.println("tidak valid");
                getTambahNilai1();
            }
        }
    }

    public static void getLihatRanking() {
        String tamMaSis[][] = new String[masMaSis.length][bio.length];
        double tamNil[][][] = new double[masMaSis.length][masMatKul.length + 1][bagian.length];
        double tamPersentase[][] = new double[masMatKul.length][masPresentase[0].length];
        getSortingMatkul();
        for (int r = 0; r < masMaSis.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                tamMaSis[r][l] = masMaSis[r][l];
            }
        }
        for (int i = 0; i < tamPersentase.length; i++) {
            for (int j = 0; j < masPresentase[0].length; j++) {
                tamPersentase[i][j] = masPresentase[i][j];
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
        for (int i = 0; i < masMaSis.length; i++) {
            for (int zz = 0; zz < masMatKul.length; zz++) {
                for (int z = 0; z < bagian.length - 1; z++) {
                    tamNil[i][zz][z] *= tamPersentase[zz][z];
                    tamNil[i][zz][4] += tamNil[i][zz][z];
                }
                tamNil[i][masMatKul.length][0] += (tamNil[i][zz][4]);
            }
            coba(tamNil[i][masMatKul.length][0]);
            tamNil[i][masMatKul.length][0] /= (masMatKul.length * 25);
        }
        for (int a = 0; a < masMaSis.length; a++) {
            for (int b = a; b < masMaSis.length; b++) {
                if (tamNil[a][masMatKul.length][0] < tamNil[b][masMatKul.length][0]) {

                    tempNilai = tamNil[a][masMatKul.length][0];
                    tamNil[a][masMatKul.length][0] = tamNil[b][masMatKul.length][0];
                    tamNil[b][masMatKul.length][0] = tempNilai;

                    tempMhs = tamMaSis[a][0];
                    tamMaSis[a][0] = tamMaSis[b][0];
                    tamMaSis[b][0] = tempMhs;
                } else if (tamNil[a][masMatKul.length][0] == tamNil[b][masMatKul.length][0]) {
                    if (tamMaSis[a][0].compareTo(tamMaSis[b][0]) > 0) {
                        tempNilai = tamNil[a][masMatKul.length][0];
                        tamNil[a][masMatKul.length][0] = tamNil[b][masMatKul.length][0];
                        tamNil[b][masMatKul.length][0] = tempNilai;

                        tempMhs = tamMaSis[a][0];
                        tamMaSis[a][0] = tamMaSis[b][0];
                        tamMaSis[b][0] = tempMhs;
                    }
                }
            }
        }

        for (int i = 0; i < masMaSis.length; i++) {
            System.out.printf(i + 1 + ". %s : %.2f\n", tamMaSis[i][0], tamNil[i][masMatKul.length][0]);
        }
        valid = true;
        while (valid) {
            System.out.println("ketik\n(T) jika ingin keluar");
            repeat[0] = scStr.nextLine();
            if (repeat[0].equalsIgnoreCase("t")) {
                valid = false;
                getNilai();
            } else {
                getLihatRanking();
            }
        }
    }

    public static void getSortingMhs() {
        for (int a = 0; a < masMaSis.length; a++) {
            for (int b = a; b < masMaSis.length; b++)
                if (masMaSis[a][0].compareTo(masMaSis[b][0]) > 0) {
                    for (int v = 0; v < bio.length; v++) {
                        tempMhs = masMaSis[a][v];
                        masMaSis[a][v] = masMaSis[b][v];
                        masMaSis[b][v] = tempMhs;
                    }
                    for (int i = 0; i < masPresentase[0].length; i++) {
                        tempPersentase = masPresentase[a][i];
                        masPresentase[a][i] = masPresentase[b][i];
                        masPresentase[b][i] = tempPersentase;
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

    public static void getSortingDosen() {
        for (int i = 0; i < masDos.length; i++) {
            for (int j = i; j < masDos[0].length; j++) {
                if (masDos[i][0].compareTo(masDos[j][0]) > 0) {
                    for (int k = 0; k < masDos[0].length; k++) {
                        tempDosen = masDos[i][k];
                        masDos[i][k] = masDos[j][k];
                        masDos[j][k] = tempDosen;
                    }
                }
            }
        }
    }

    public static void getSortingMatkul() {
        for (int a = 0; a < masMatKul.length; a++) {
            for (int b = a; b < masMatKul.length; b++) {
                if (masMatKul[a][0].compareTo(masMatKul[b][0]) > 0) {
                    for (int i = 0; i < 2; i++) {
                        tempMatkul = masMatKul[a][i];
                        masMatKul[a][i] = masMatKul[b][i];
                        masMatKul[b][i] = tempMatkul;
                    }
                    for (int i = 0; i < masPresentase[0].length; i++) {
                        tempPersentase = masPresentase[a][i];
                        masPresentase[a][i] = masPresentase[b][i];
                        masPresentase[b][i] = tempPersentase;
                    }
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

    public static void coba(double iniBisa) {
        if (iniBisa > 80
                && iniBisa <= 100) {
            indeks = 4;
        } else if (iniBisa > 73
                && iniBisa <= 80) {
            indeks = 3.5;
        } else if (iniBisa > 65
                && iniBisa <= 73) {
            indeks = 3;
        } else if (iniBisa > 60
                && iniBisa <= 65) {
            indeks = 2.5;
        } else if (iniBisa > 50
                && iniBisa <= 60) {
            indeks = 2;
        } else if (iniBisa > 39
                && iniBisa <= 50) {
            indeks = 1;
        } else if (iniBisa > 0
                && iniBisa <= 39) {
            indeks = 0;
        }
    }

    // public static void getSortingRanking() {
    // for (int a = 0; a < masMaSis.length; a++) {
    // for (int b = a; b < masMaSis.length; b++) {
    // if (masNil[a][masMatKul.length][0] < masNil[b][masMatKul.length][0]) {
    // tempNilai = masNil[a][masMatKul.length][0];
    // masNil[a][masMatKul.length][0] = masNil[b][masMatKul.length][0];
    // masNil[b][masMatKul.length][0] = tempNilai;

    // tempMhs = masMaSis[a][0];
    // masMaSis[a][0] = masMaSis[b][0];
    // masMaSis[b][0] = tempMhs;
    // } else if (masNil[a][masMatKul.length][0] == masNil[b][masMatKul.length][0])
    // {
    // if (masMaSis[a][0].compareTo(masMaSis[b][0]) > 0) {
    // tempNilai = masNil[a][masMatKul.length][0];
    // masNil[a][masMatKul.length][0] = masNil[b][masMatKul.length][0];
    // masNil[b][masMatKul.length][0] = tempNilai;

    // tempMhs = masMaSis[a][0];
    // masMaSis[a][0] = masMaSis[b][0];
    // masMaSis[b][0] = tempMhs;
    // }
    // }

    // }
    // }
    // }
}
