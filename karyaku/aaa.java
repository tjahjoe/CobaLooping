import java.util.Scanner;

public class aaa {

    public static Scanner scStr = new Scanner(System.in);
    public static Scanner scInt = new Scanner(System.in);
    public static Scanner scDbl = new Scanner(System.in);

    // tambahan
    public static String tempString[] = new String[1];
    public static double tempDouble = 0;
    public static String pilih[] = new String[10];
    public static String kembali[] = new String[3];
    public static int ambilAngka[] = new int[4];
    public static String intToStr = "";// tidak dibuat array
    public static int tempPengurangan = 0;
    public static int tempint[][] = new int[1][];
    public static int angkaSementara[][] = new int[1][1];
    public static int angkaSemu = 0;
    public static String atribut[] = { "MATA KULIAH", "NILAI ANGKA", "NILAI HURUF", "NILAI SETARA", " ", "IPS", "NAMA",
            "NOMOR", "NIP" };

    // dosen
    public static String bioDosenInput[] = { "Nama (MAX 30 digit)", "NIP (10 digit angka)", "Password" };
    public static String bioDosen[] = { "Nama", "NIP", "Pass" };
    public static String masterDosen[][] = { { "Dimas Waicaksono", "1231231222", "1231231222" },
            { "Bayu Samudra", "1235322321", "1235322321" },
            { "Endang Karisamwati", "1234231212", "1234231212" }, { "Naura Santika", "1231221231", "1231221231" } };
    // mahasiswa
    public static String masterMahasiswa[][] = {
            { "Agnes Rahmania", "2541720001", "Perempuan", "Malang, 17 Agustus 2005", "Islam",
                    "Jalan KH. Wachid Hasyim", "Suratno", "Siti", "Wirausaha", "Ibu rumah tangga", "081754637827",
                    "081627127456", "Mania99" }, // mahasiswa1
            { "Farhan Malik", "2541720002", "Laki-laki", "Surabaya, 28 Oktober 2004", "Islam",
                    "Jalan Cendana No. 45, RT 03 RW 07, Kelurahan Damai Sejahtera, Kota Sejati", "Budi Santoso",
                    "Rina Wati", "Wiraswasta", "Dokter", "081765357863", "082345165263", "Mania99" }, // mahasiswa2
            { "Aditya Pratama", "2541720003", "Laki-laki", "Bandung, 15 Agustus 2005", "Islam",
                    "Perumahan Harapan Baru Blok E2 No. 56, Kelurahan Indah, Kota Bahagia", "Eko Susanto",
                    "Maya Anggraini", "Insinyur", "Pengacara", "081767357863", "087683938232", "Mania99" }, // mahasiswa3
            { "Dinda Fitriani", "2541720022", "Perempuan", "Semarang, 12 Mei 1990", "Islam",
                    "Komplek Permata Indah Blok D3 No. 34, Kelurahan Sejahtera, Kota Damai", "Hendra Wijaya",
                    "Siti Fatimah", "Pengusaha", "Dosen", "085845112341", "089213421145", "Mania99" }, // mahasiswa4
            { "Faisal Cahyono", "2541720012", "Laki-laki", "Yogyakarta, 25 Maret 1988", "Islam",
                    "Jalan Dahlia No. 67, RT 08 RW 03, Kelurahan Indah, Kota Sejahtera", "Joko Santoso",
                    "Ani Wulandari", "Wiraswasta", "Pengacara", "085433163416", "081543235731", "Mania99" }, // mahasiswa5
            { "Indah Permata", "2541720013", "Perempuan", "Medan, 18 Juli 1994", "Islam",
                    "Jalan Mawar No. 45, RT 12 RW 05, Kelurahan Damai, Kota Bahagia", "Rudi Pratama",
                    "Dewi Safitri", "Arsitek", "Penyanyi", "081325233112", "087433211243", "Mania99" }// mahasiswa6
    };
    public static String[] biodataMahasiswa = { "Nama", "NIM", "Jenis kelamin", "Tempat tanggal lahir", "Agama",
            "Alamat", "Nama ayah", "Nama ibu", "Pekejaan ayah", "Pekerjaan ibu", "Telepon ayah",
            "Telepon ibu", "Pass" };// penambahan username dan password, apakah akun dibuat di array
                                    // yang berbeda
    public static String[] biodataMahasiswaInput = { "Nama                  (MAX 30 digit)",
            "NIM                   (10 digit angka)",
            "Jenis kelamin ([Laki-laki] atau [Perempuan])",
            "Tempat tanggal lahir  (MAX 70 digit)",
            "Agama                 (MAX 70 digit)",
            "Alamat                (MAX 70 digit)",
            "Nama ayah             (MAX 30 digit)",
            "Nama ibu              (MAX 30 digit)",
            "Pekejaan ayah         (MAX 70 digit)",
            "Pekerjaan ibu         (MAX 70 digit)",
            "Telepon ayah          (MAX 20 digit)",
            "Telepon ibu           (MAX 20 digit)",
            "Password              (MAX 20 digit)" };
    // nilai/ matakuliah
    public static String[] score = { "Tugas", "Kuis", "UTS", "UAS", "Akhir" };
    public static String scorePersentase[] = { "Tugas", "Kuis", "UTS", "UAS", "SKS" };
    public static String namaMatkul[] = { "Mata Kuliah", "Singkatan (max 4 digit)" };
    public static boolean kondisi = true;

    public static String masterMatkul[][][] = {
            { { "Bahasa Inggris 1", "BIG1" }, { "1231231222", "1235322321", "1231221231" } },
            { { "Critical Thinking and Problem Solving", "CTPS" }, { "1234231212" } },
            { { "Dasar Pemrograman", "DASP" }, { "1231221231" } },
            { { "Keselamtan Kesehatan Kerja", "K3" }, { "1231231222" } },
            { { "Konsep Teknologi Informasi", "KTI" }, { "1235322321" } },
            { { "Matematika Dasar", "MATD" }, { "1235322321" } }, { { "Pancasila", "PANC" }, { "1231231222" } },
            { { "Praktikum Dasar Pemrograman", "PDAP" }, { "1235322321" } } };
    public static double masterNilai[][][] = {
            { { 100, 98, 100, 89, 0, 0 }, { 85, 83, 89, 81, 0, 0 }, { 100, 98, 100, 89, 0, 0, },
                    { 100, 98, 100, 89, 0, 0 },
                    { 60, 60, 60, 60, 0, 0 }, { 100, 98, 100, 89, 0, 0 }, { 100, 98, 100, 89, 0, 0 },
                    { 100, 98, 100, 89, 0, 0 } },
            { { 88, 87, 89, 82, 0, 0 }, { 90, 82, 84, 88, 0, 0 }, { 90, 82, 84, 88, 0, 0 },
                    { 90, 82, 84, 88, 0, 0 },
                    { 90, 82, 84, 88, 0, 0 },
                    { 90, 82, 84, 88, 0, 0 }, { 90, 82, 84, 88, 0, 0 }, { 90, 82, 84, 88, 0, 0 } },
            { { 90, 91, 89, 88, 0, 0 }, { 93, 85, 83, 89, 0, 0 }, { 93, 85, 83, 89, 0, 0 },
                    { 93, 85, 83, 89, 0, 0 },
                    { 93, 85, 83, 89, 0, 0 },
                    { 93, 85, 83, 89, 0, 0 }, { 93, 85, 83, 89, 0, 0 }, { 93, 85, 83, 89, 0, 0 } },
            { { 99, 86, 98, 85, 0, 0 }, { 88, 86, 86, 83, 0, 0 }, { 99, 86, 98, 85, 0, 0 },
                    { 99, 86, 98, 85, 0, 0 },
                    { 99, 86, 98, 85, 0, 0 },
                    { 99, 86, 98, 85, 0, 0 }, { 99, 86, 98, 85, 0, 0 }, { 99, 86, 98, 85, 0, 0 } },
            { { 100, 98, 100, 89, 0, 0 }, { 85, 83, 89, 81, 0, 0 }, { 100, 98, 100, 89, 0, 0 },
                    { 100, 98, 100, 89, 0, 0 },
                    { 60, 60, 60, 60, 0, 0 }, { 100, 98, 100, 89, 0, 0 }, { 100, 98, 100, 89, 0, 0 },
                    { 100, 98, 100, 89, 0, 0 } },
            { { 88, 87, 89, 82, 0, 0 }, { 90, 82, 84, 88, 0, 0 }, { 90, 82, 84, 88, 0, 0 },
                    { 90, 82, 84, 88, 0, 0 },
                    { 90, 82, 84, 88, 0, 0 },
                    { 90, 82, 84, 88, 0, 0 }, { 90, 82, 84, 88, 0, 0 }, { 90, 82, 84, 88, 0, 0 } } };

    public static double masterPersentase[][] = { { 0.1, 0.2, 0.3, 0.4, 2 }, { 0.2, 0.2, 0.3, 0.3, 3 },
            { 0.2, 0.1, 0.3, 0.4, 2 },
            { 0.3, 0.4, 0.1, 0.2, 2 }, { 0.1, 0.1, 0.4, 0.4, 2 }, { 0.2, 0.2, 0.3, 0.3, 2 },
            { 0.1, 0.1, 0.3, 0.5, 3 },
            { 0.2, 0.3, 0.2, 0.3, 2 } };
    public static double totalSks = 0;

    public static void main(String[] args) {
        // sorting
        sortingDosen();
        sortingMahasiswa();
        sortingMatkul();
        berandaAdmin();

    }

    public static void berandaAdmin() {
        System.out.println("1. Dosen\n2. Mahasiswa\n3. Mata Kuliah\n4. Nilai\n5. Keluar");
        System.out.print("Pilih: ");
        pilih[1] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        System.out.println();
        if (pilih[1].equalsIgnoreCase("1")) {
            fBioDosen();
        } else if (pilih[1].equalsIgnoreCase("2")) {
            fBioMahasiswa();
        } else if (pilih[1].equalsIgnoreCase("3")) {
            fMatkul();
        } else if (pilih[1].equalsIgnoreCase("4")) {
            fNilai();
        } else if (pilih[1].equalsIgnoreCase("5")) {

        } else {

        }
    }

    public static void fBioDosen() {
        System.out.println(
                "1. Tambah Dosen\n2. Kurangi Dosen\n3. Ubah Dosen\n4. Lihat Dosen\n5. Pengajar\n6. Keluar");
        pilih[2] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        if (pilih[2].equalsIgnoreCase("1")) {
            fTambahDosen();
        } else if (pilih[2].equalsIgnoreCase("2")) {
            fKurangDosen();
        } else if (pilih[2].equalsIgnoreCase("3")) {
            fUbahDosen();
        } else if (pilih[2].equalsIgnoreCase("4")) {
            fLihatDosen();
        } else if (pilih[2].equalsIgnoreCase("5")) {
            fPengajar();
        } else if (pilih[2].equalsIgnoreCase("6")) {
            berandaAdmin();
        } else {
            fBioDosen();

        }
    }

    public static void fTambahDosen() {
        String tambahDosen[][] = new String[masterDosen.length + 1][bioDosen.length];
        for (int i = 0; i < masterDosen.length; i++) {
            tambahDosen[i] = masterDosen[i];
        }
        if (masterDosen.length == 0) {
            for (int i = 0; i < bioDosen.length; i++) {
                System.out.printf("%-22s: ", bioDosenInput[i]);
                tambahDosen[masterDosen.length][i] = scStr.nextLine();
                if ((tambahDosen[masterDosen.length][i].equalsIgnoreCase(tambahDosen[masterDosen.length][0])
                        && tambahDosen[masterDosen.length][0].length() > 30)
                        || (tambahDosen[masterDosen.length][i].equalsIgnoreCase(tambahDosen[masterDosen.length][1])
                                && tambahDosen[masterDosen.length][1].length() != 10)) {
                    i--;
                }
            }
        } else {

            tabelDosenMahasiswa(masterDosen, bioDosen[1]);
            String tampung[] = new String[bioDosenInput.length];
            System.out.println(
                    "                          !Catatan!\nJika NIP ada yang sama maka akan mengulang memasukkan NIP\n\nMasukkan :");
            for (int i = 0; i < bioDosen.length; i++) {
                System.out.printf("%-22s: ", bioDosenInput[i]);
                tampung[i] = scStr.nextLine();
                fKetentuanInputDosen(tampung, i, masterDosen.length, tambahDosen);
                if (!tampung[i].equalsIgnoreCase(tambahDosen[masterDosen.length][i])) {
                    i--;
                }
            }
        }
        masterDosen = tambahDosen;
        sortingDosen();
        tabelDosenMahasiswa(masterDosen, bioDosen[1]);
        fKembaliFBioDosen();
    }

    public static void fKurangDosen() {
        validasiDosen();
        tabelDosenMahasiswa(masterDosen, bioDosen[1]);
        System.out.print("Masukkan : \n[NIP] untuk memilih dosen\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterDosen.length, 3, 0, masterDosen);
        if (pilih[3].equalsIgnoreCase(masterDosen[ambilAngka[0]][1])) {
            String kurangdosen[][] = new String[masterDosen.length - 1][bioDosen.length];
            String kurangPengajar[][][] = new String[masterMatkul.length][2][];
            for (int i = 0; i < masterMatkul.length; i++) {
                for (int j = 0; j < 2; j++) {
                    kurangPengajar[i][j] = new String[masterMatkul[i][j].length];
                }
            }
            for (int i = 0; i < masterMatkul.length; i++) {
                for (int j = 0; j < masterMatkul[i][1].length; j++) {
                    if (masterDosen[ambilAngka[0]][1].equalsIgnoreCase(masterMatkul[i][1][j])) {
                        kurangPengajar[i][1] = new String[masterMatkul[i][1].length - 1];
                        break;
                    } else {
                        kurangPengajar[i][1] = new String[masterMatkul[i][1].length];
                    }
                }
            }
            for (int i = 0; i < masterMatkul.length; i++) {
                tempPengurangan = 0;
                for (int j = 0; j < masterMatkul[i][1].length; j++) {
                    masterMatkul[i][1][tempPengurangan] = masterMatkul[i][1][j];
                    if (!masterDosen[ambilAngka[0]][1].equalsIgnoreCase(masterMatkul[i][1][j])) {
                        tempPengurangan++;
                    }
                }
            }
            tempPengurangan = 0;
            for (int i = 0; i < masterDosen.length; i++) {
                for (int j = 0; j < bioDosen.length; j++) {
                    masterDosen[tempPengurangan][j] = masterDosen[i][j];
                }
                if (!pilih[3].equalsIgnoreCase(masterDosen[i][1])) {
                    tempPengurangan++;
                }
            }
            for (int i = 0; i < kurangPengajar.length; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int j2 = 0; j2 < kurangPengajar[i][j].length; j2++) {
                        kurangPengajar[i][j][j2] = masterMatkul[i][j][j2];
                    }
                }
            }
            for (int i = 0; i < kurangdosen.length; i++) {
                kurangdosen[i] = masterDosen[i];
            }
            masterDosen = kurangdosen;
            masterMatkul = kurangPengajar;
            fKurangDosen();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fBioDosen();
        } else {
            System.out.println("Dosen tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioDosen();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fKurangDosen();
                    kondisi = false;
                }
            }
        }
    }

    public static void fUbahDosen() {
        validasiDosen();
        tabelDosenMahasiswa(masterDosen, bioDosen[1]);
        System.out.print("Masukkan : \n[NIP] untuk memilih dosen\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterDosen.length, 3, 0, masterDosen);
        if (pilih[3].equalsIgnoreCase(masterDosen[ambilAngka[0]][1])) {
            cfUbahDosen1();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fBioDosen();
        } else {
            System.out.println("Dosen tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioDosen();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fUbahDosen();
                    kondisi = false;
                }
            }
        }
    }

    public static void cfUbahDosen1() {
        tabelBioDosen();
        System.out.print("Masukkan : \n[Angka]   untuk mengubah\n[T]       untuk keluar\npilih -->  : ");
        pilih[4] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        for (int i = 0; i < bioDosen.length; i++) {
            if (pilih[4].equalsIgnoreCase(bioDosen[i]) || pilih[4].equalsIgnoreCase(intToStr = String.valueOf(i + 1))) {
                ambilAngka[1] = i;
                break;
            }
        }
        if (pilih[4].equalsIgnoreCase(bioDosen[ambilAngka[1]])
                || pilih[4].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[1] + 1))) {
            System.out.println("Masukkan : ");
            String tampung[] = new String[bioDosenInput.length];
            for (int i = 0; i < 1; i++) {
                System.out.printf("%-50s: ", bioDosenInput[ambilAngka[1]]);
                tampung[ambilAngka[1]] = scStr.nextLine();
                fKetentuanInputDosen(tampung, ambilAngka[1], ambilAngka[0], masterDosen);
                if (!tampung[ambilAngka[1]].equalsIgnoreCase(masterDosen[ambilAngka[0]][ambilAngka[1]])) {
                    i--;
                }
            }
            sortingDosen();
            cfUbahDosen1();
        } else if (pilih[4].equalsIgnoreCase("t")) {
            fUbahDosen();
        } else {
            System.out.println("Tidak valid");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioDosen();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    cfUbahDosen1();
                    kondisi = false;
                }
            }
        }
    }

    public static void fLihatDosen() {
        validasiDosen();
        tabelDosenMahasiswa(masterDosen, bioDosen[1]);
        System.out.print("Masukkan : \n[NIP] untuk memilih dosen\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterDosen.length, 3, 0, masterDosen);
        if (pilih[3].equalsIgnoreCase(masterDosen[ambilAngka[0]][1])) {
            int tampungInt = 0;
            for (int i = 0; i < masterMatkul.length; i++) {
                for (int j = 0; j < masterMatkul[i][1].length; j++) {
                    if (masterDosen[ambilAngka[0]][1].equalsIgnoreCase(masterMatkul[i][1][j])
                            && angkaSemu < 1) {
                        tempint[0] = new int[tampungInt + 1];
                        for (int j2 = 0; j2 < tempint[0].length; j2++) {
                            tempint[0][j2] = angkaSementara[0][j2];
                        }
                        tempint[0][tampungInt] = i;
                        tampungInt++;
                        angkaSementara[0] = new int[tampungInt + 1];
                        for (int j2 = 0; j2 < tempint[0].length; j2++) {
                            angkaSementara[0][j2] = tempint[0][j2];
                        }
                        break;
                    }
                }
            } // dicopy
            tabelBioDosen();
            if (tempint[0] == null) {
                System.out.println("Belum ada Mata Kuliah yang diajar");
                fUlangLihatDosen();
            } else {
                for (int i = 0; i < tempint[0].length; i++) {
                    System.out.printf("|  %-5s|  %-46s  |\n", i + 1, masterMatkul[tempint[0][i]][0][0]);
                    if (i < tempint[0].length - 1) {
                        System.out.println(
                                "------------------------------------------------------------");
                    }
                }
                System.out.println(
                        "============================================================");
                fUlangLihatDosen();
            }
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fBioDosen();
        } else {
            System.out.println("Dosen tidak terdaftar");
            fUlangLihatDosen();
        }
    }

    public static void fUlangLihatDosen() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fBioDosen();
                kondisi = false;
            } else if (kembali[0].equalsIgnoreCase("r")) {
                fLihatDosen();
                kondisi = false;
            }
        }
    }

    public static void fPengajar() {
        if (masterMatkul.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
            fKembaliFBioDosen();
        } else {
            tabelMatkul();
            System.out.print("Masukkan : \n[ANGKA] untuk memilih Mata Kuliah\n[T]     untuk keluar\npilih -->  : ");
            pilih[3] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            searchingDenganAngka(3, 0);
            // System.out.println("\033[H\033[2J");
            for (int i = 0; i < masterMatkul.length; i++) {
                if (pilih[3].equalsIgnoreCase(masterMatkul[i][0][0])
                        || pilih[3].equalsIgnoreCase(intToStr = String.valueOf(i + 1))) {
                    ambilAngka[0] = i;
                    break;
                }
            }
            if (pilih[3].equalsIgnoreCase(masterMatkul[ambilAngka[0]][0][0])
                    || pilih[3].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[0] + 1))) {
                fBioPengajar();
            } else if (pilih[3].equalsIgnoreCase("t")) {
                fBioDosen();
            } else {
                System.out.println("Mata Kuliah tidak terdaftar");
                kondisi = true;
                while (kondisi) {
                    System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                    kembali[0] = scStr.nextLine();
                    System.out.println("\033[H\033[2J");
                    if (kembali[0].equalsIgnoreCase("t")) {
                        fBioDosen();
                        kondisi = false;
                    } else if (kembali[0].equalsIgnoreCase("r")) {
                        fPengajar();
                        kondisi = false;
                    }
                }
            }
        }
    }

    public static void fBioPengajar() {
        System.out.println(
                "1. Tambah Pengajar\n2. Kurangi Pengajar\n3. Ubah Pengajar\n4. Lihat Pengajar\n5. Keluar");
        pilih[4] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        if (pilih[4].equalsIgnoreCase("1")) {
            fTambahPengajar();
        } else if (pilih[4].equalsIgnoreCase("2")) {
            fKurangPengajar();
        } else if (pilih[4].equalsIgnoreCase("3")) {
            fUbahPengajar();
        } else if (pilih[4].equalsIgnoreCase("4")) {
            fLihatPengajar();
        } else if (pilih[4].equalsIgnoreCase("5")) {
            fPengajar();
        } else {
            fBioPengajar();
        }
    }

    public static void fTambahPengajar() {
        validasiDosen();
        String tambahPengajar[][][] = new String[masterMatkul.length][2][];
        for (int i = 0; i < masterMatkul.length; i++) {
            for (int j = 0; j < 2; j++) {
                tambahPengajar[i][j] = new String[masterMatkul[i][j].length];
            }
        }
        tambahPengajar[ambilAngka[0]][1] = new String[masterMatkul[ambilAngka[0]][1].length + 1];
        for (int i = 0; i < masterMatkul.length; i++) {
            for (int j = 0; j < 2; j++) {
                for (int j2 = 0; j2 < masterMatkul[i][j].length; j2++) {
                    tambahPengajar[i][j][j2] = masterMatkul[i][j][j2];
                }
            }
        }
        tabelPengajar();
        for (int i = 0; i < 1; i++) {
            System.out.printf("%-22s: ", bioDosenInput[1]);
            tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length] = scStr.nextLine();
            if (tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length].length() != 10) {
                i--;
            }
        }
        ambilAngka[1] = 0;
        for (int i = 0; i < masterDosen.length; i++) {
            if (tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length]
                    .equalsIgnoreCase(masterDosen[i][1])) {
                ambilAngka[1] = i;
                break;
            }
        }
        ambilAngka[2] = 0;
        for (int i = 0; i < masterMatkul[ambilAngka[0]][1].length; i++) {
            if (tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length]
                    .equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][i])) {
                ambilAngka[2] = i;
                break;
            }
        }
        if (masterMatkul[ambilAngka[0]][1].length == 0) {
            if (tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length]
                    .equalsIgnoreCase(masterDosen[ambilAngka[1]][1])) {
                masterMatkul = tambahPengajar;
                tabelPengajar();
                fKembaliFBioPengajar();
            } else {
                System.out.println("Dosen tidak terdaftar");
                kondisi = true;
                while (kondisi) {
                    System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                    kembali[0] = scStr.nextLine();
                    System.out.println("\033[H\033[2J");
                    if (kembali[0].equalsIgnoreCase("t")) {
                        fBioPengajar();
                        kondisi = false;
                    } else if (kembali[0].equalsIgnoreCase("r")) {
                        fTambahPengajar();
                        kondisi = false;
                    }
                }
            }
        } else {
            if (tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length]
                    .equalsIgnoreCase(masterDosen[ambilAngka[1]][1])
                    && !tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length]
                            .equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][ambilAngka[2]])) {
                masterMatkul = tambahPengajar;
                tabelPengajar();
                fKembaliFBioPengajar();
            } else if (tambahPengajar[ambilAngka[0]][1][masterMatkul[ambilAngka[0]][1].length]
                    .equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][ambilAngka[2]])) {
                System.out.println("Dosen sudah masuk ke pengajar");
                fKembaliFBioPengajar();
            } else {
                System.out.println("Dosen tidak terdaftar");
                kondisi = true;
                while (kondisi) {
                    System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                    kembali[0] = scStr.nextLine();
                    System.out.println("\033[H\033[2J");
                    if (kembali[0].equalsIgnoreCase("t")) {
                        fBioPengajar();
                        kondisi = false;
                    } else if (kembali[0].equalsIgnoreCase("r")) {
                        fTambahPengajar();
                        kondisi = false;
                    }
                }
            }
        }
    }

    public static void fKurangPengajar() {
        validasiDosen();
        validasiPengajar();
        String kurangPengajar[][][] = new String[masterMatkul.length][2][];
        for (int i = 0; i < masterMatkul.length; i++) {
            for (int j = 0; j < 2; j++) {
                kurangPengajar[i][j] = new String[masterMatkul[i][j].length];
            }
        }
        kurangPengajar[ambilAngka[0]][1] = new String[masterMatkul[ambilAngka[0]][1].length
                - 1];
        tabelPengajar();
        System.out.print("Masukkan : \n[NIP] untuk memilih dosen\n[T]   untuk keluar\npilih -->  : ");
        pilih[5] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        ambilAngka[1] = 0;
        for (int i = 0; i < masterMatkul[ambilAngka[0]][1].length; i++) {
            if (pilih[5].equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][i])) {
                ambilAngka[1] = i;
                break;
            }
        }
        // System.out.println("\033[H\033[2J");
        if (pilih[5].equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][ambilAngka[1]])) {
            tempPengurangan = 0;
            for (int i = 0; i < masterMatkul[ambilAngka[0]][1].length; i++) {
                masterMatkul[ambilAngka[0]][1][tempPengurangan] = masterMatkul[ambilAngka[0]][1][i];
                if (!pilih[5].equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][i])) {
                    tempPengurangan++;
                }
            }
            for (int i = 0; i < masterMatkul.length; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int j2 = 0; j2 < kurangPengajar[i][j].length; j2++) {
                        kurangPengajar[i][j][j2] = masterMatkul[i][j][j2];
                    }
                }
            }
            masterMatkul = kurangPengajar;
            fKurangPengajar();
        } else if (pilih[5].equalsIgnoreCase("t")) {
            fBioPengajar();
        } else {
            System.out.println("Dosen tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioPengajar();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fKurangPengajar();
                    kondisi = false;
                }
            }
        }
    }

    public static void fUbahPengajar() {
        validasiDosen();
        validasiPengajar();
        tabelPengajar();
        System.out.print("Masukkan : \n[NIP] untuk memilih dosen\n[T]   untuk keluar\npilih -->  : ");
        pilih[5] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        ambilAngka[1] = 0;
        for (int i = 0; i < masterMatkul[ambilAngka[0]][1].length; i++) {
            if (pilih[5].equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][i])) {
                ambilAngka[1] = i;
                break;
            }
        }
        if (pilih[5].equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][ambilAngka[1]])) {
            cfUbahPengajar1();
        } else if (pilih[5].equalsIgnoreCase("t")) {
            fBioPengajar();
        } else {
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioPengajar();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fUbahPengajar();
                    kondisi = false;
                }
            }
        }
    }

    public static void cfUbahPengajar1() {
        String tampung = "";
        for (int i = 0; i < 1; i++) {
            System.out.printf("%-22s: ", bioDosenInput[1]);
            tampung = scStr.nextLine();
            for (int j = 0; j < masterDosen.length; j++) {
                if (tampung.length() == 10) {
                    kondisi = false;
                    break;
                } else {
                    kondisi = true;
                }
            }
            if (kondisi) {
                i--;
            }
        }
        ambilAngka[2] = 0;
        for (int i = 0; i < masterMatkul[ambilAngka[0]][1].length; i++) {
            if (tampung.equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][i])) {
                ambilAngka[2] = i;
                break;
            }
        }
        ambilAngka[3] = 0;
        for (int i = 0; i < masterDosen.length; i++) {
            if (tampung.equalsIgnoreCase(masterDosen[i][1])) {
                ambilAngka[3] = i;
                break;
            }
        }
        if (tampung.equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][ambilAngka[2]])
                && !tampung.equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][ambilAngka[2]])) {
            masterMatkul[ambilAngka[0]][1][ambilAngka[1]] = tampung;
            tabelPengajar();
            fKembaliFBioPengajar();
        } else if (tampung.equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][ambilAngka[2]])) {
            System.out.println("Dosen sudah masuk ke pengajar");
            fKembaliFBioPengajarUlangCFUbahPengajar1();
        } else {
            System.out.println("Dosen tidak terdaftar");
            fKembaliFBioPengajarUlangCFUbahPengajar1();
        }
    }

    public static void fLihatPengajar() {
        validasiDosen();
        validasiPengajar();
        tabelPengajar();
        fKembaliFBioPengajar();
    }

    public static void fBioMahasiswa() {
        System.out.println(
                "1. Tambah Mahasiswa\n2. Kurangi Mahasiswa\n3. Ubah Mahasiswa\n4. Lihat Mahasiswa\n5. Keluar");
        pilih[2] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        if (pilih[2].equalsIgnoreCase("1")) {
            fTambahMahasiswa();
        } else if (pilih[2].equalsIgnoreCase("2")) {
            fKurangMahasiswa();
        } else if (pilih[2].equalsIgnoreCase("3")) {
            fUbahMahasiswa();
        } else if (pilih[2].equalsIgnoreCase("4")) {
            fLihatMahasiswa();
        } else if (pilih[2].equalsIgnoreCase("5")) {
            berandaAdmin();
        } else {
            fBioMahasiswa();
        }
    }

    public static void fTambahMahasiswa() {
        String tambahMahasiswa[][] = new String[masterMahasiswa.length + 1][biodataMahasiswa.length];
        double tambahNilai[][][] = new double[masterMahasiswa.length + 1][masterMatkul.length][6];
        for (int i = 0; i < masterMahasiswa.length; i++) {
            tambahMahasiswa[i] = masterMahasiswa[i];
            tambahNilai[i] = masterNilai[i];
        }
        if (masterMahasiswa.length == 0) {
            for (int i = 0; i < biodataMahasiswaInput.length; i++) {
                System.out.printf("%-50s: ", biodataMahasiswaInput[i]);
                tambahMahasiswa[masterMahasiswa.length][i] = scStr.nextLine();
                if ((tambahMahasiswa[masterMahasiswa.length][i]
                        .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][0])
                        && tambahMahasiswa[masterMahasiswa.length][0].length() > 30)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][1])
                                && (tambahMahasiswa[masterMahasiswa.length][1].length() != 10))
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][2])
                                && (!tambahMahasiswa[masterMahasiswa.length][2].equalsIgnoreCase("laki-laki")
                                        && !tambahMahasiswa[masterMahasiswa.length][2].equalsIgnoreCase("perempuan")))
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][3])
                                && tambahMahasiswa[masterMahasiswa.length][3].length() > 70)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][4])
                                && tambahMahasiswa[masterMahasiswa.length][4].length() > 70)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][5])
                                && tambahMahasiswa[masterMahasiswa.length][5].length() > 70)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][6])
                                && tambahMahasiswa[masterMahasiswa.length][6].length() > 30)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][7])
                                && tambahMahasiswa[masterMahasiswa.length][7].length() > 30)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][8])
                                && tambahMahasiswa[masterMahasiswa.length][8].length() > 70)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][9])
                                && tambahMahasiswa[masterMahasiswa.length][9].length() > 70)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][10])
                                && tambahMahasiswa[masterMahasiswa.length][10].length() > 20)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][11])
                                && tambahMahasiswa[masterMahasiswa.length][11].length() > 20)
                        || (tambahMahasiswa[masterMahasiswa.length][i]
                                .equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][12])
                                && tambahMahasiswa[masterMahasiswa.length][12].length() > 20)) {
                    i--;
                }

            }
        } else {
            tabelDosenMahasiswa(masterMahasiswa, biodataMahasiswa[1]);
            System.out.println(
                    "                          !Catatan!\nJika NIM ada yang sama maka akan mengulang memasukkan NIM\n\nMasukkan :");
            String tampung[] = new String[13];
            for (int i = 0; i < biodataMahasiswaInput.length; i++) {
                System.out.printf("%-50s: ", biodataMahasiswaInput[i]);
                tampung[i] = scStr.nextLine();
                fKetentuanInputMahasiswa(tampung, i, masterMahasiswa.length, tambahMahasiswa);
                if (!tampung[i].equalsIgnoreCase(tambahMahasiswa[masterMahasiswa.length][i])) {
                    i--;
                }

            }
        }
        masterMahasiswa = tambahMahasiswa;
        masterNilai = tambahNilai;
        sortingMahasiswa();
        tabelDosenMahasiswa(masterMahasiswa, biodataMahasiswa[1]);
        fKembaliFBioMahasiswa();
    }

    public static void fKurangMahasiswa() {
        validasiMahasiswa();
        String kurangMahasiswa[][] = new String[masterMahasiswa.length - 1][biodataMahasiswa.length];
        double kurangNilai[][][] = new double[masterMahasiswa.length
                - 1][masterMatkul.length][6];
        tabelDosenMahasiswa(masterMahasiswa, biodataMahasiswa[1]);
        System.out.print("Masukkan : \n[NIM] untuk memilih Mahasiswa\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterMahasiswa.length, 3, 0, masterMahasiswa);
        if (pilih[3].equalsIgnoreCase(masterMahasiswa[ambilAngka[0]][1])) {
            tempPengurangan = 0;
            String tampungan = masterMahasiswa[ambilAngka[0]][1];
            for (int i = 0; i < masterMahasiswa.length; i++) {
                for (int j = 0; j < masterMatkul.length; j++) {
                    for (int j2 = 0; j2 < score.length; j2++) {
                        masterNilai[tempPengurangan][j][j2] = masterNilai[i][j][j2];
                    }
                }
                for (int j = 0; j < biodataMahasiswa.length; j++) {
                    masterMahasiswa[tempPengurangan][j] = masterMahasiswa[i][j];
                }
                if (!tampungan.equalsIgnoreCase(masterMahasiswa[i][1])) {
                    tempPengurangan++;
                }
            }
            for (int i = 0; i < kurangMahasiswa.length; i++) {
                kurangMahasiswa[i] = masterMahasiswa[i];
                kurangNilai[i] = masterNilai[i];
            }
            masterMahasiswa = kurangMahasiswa;
            masterNilai = kurangNilai;
            sortingMahasiswa();
            fKurangMahasiswa();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fBioMahasiswa();
        } else {
            System.out.println("Mahasiswa tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioMahasiswa();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fKurangMahasiswa();
                    kondisi = false;
                }
            }
        }
    }

    public static void fUbahMahasiswa() {
        validasiMahasiswa();
        tabelDosenMahasiswa(masterMahasiswa, biodataMahasiswa[1]);
        System.out.print("Masukkan : \n[NIM] untuk memilih Mahasiswa\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterMahasiswa.length, 3, 0, masterMahasiswa);
        if (pilih[3].equalsIgnoreCase(masterMahasiswa[ambilAngka[0]][1])) {
            cfUbahMahasiswa1();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fBioMahasiswa();
        } else {
            System.out.println("Mahasiswa tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioMahasiswa();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fUbahMahasiswa();
                    kondisi = false;
                }
            }
        }
    }

    public static void cfUbahMahasiswa1() {
        for (int i = 0; i < biodataMahasiswa.length; i++) {
            System.out.printf("|%-4s|%-21s|%-70s|\n", i + 1, biodataMahasiswa[i],
                    masterMahasiswa[ambilAngka[0]][i]);
        }
        System.out.print("Masukkan : \n[Angka]   untuk mengubah\n[T]       untuk keluar\npilih -->  : ");
        pilih[4] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        for (int i = 0; i < biodataMahasiswa.length; i++) {
            if (pilih[4].equalsIgnoreCase(biodataMahasiswa[i])
                    || pilih[4].equalsIgnoreCase(intToStr = String.valueOf(i + 1))) {
                ambilAngka[1] = i;
                break;
            }
        }
        if (pilih[4].equalsIgnoreCase(biodataMahasiswa[ambilAngka[1]])
                || pilih[4].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[1] + 1))) {
            System.out.println("Masukkan : ");
            String tampung[] = new String[13];
            for (int i = 0; i < 1; i++) {
                System.out.printf("%-50s: ", biodataMahasiswaInput[ambilAngka[1]]);
                tampung[ambilAngka[1]] = scStr.nextLine();
                fKetentuanInputMahasiswa(tampung, ambilAngka[1], ambilAngka[0], masterMahasiswa);
                if (!tampung[ambilAngka[1]].equalsIgnoreCase(masterMahasiswa[ambilAngka[0]][ambilAngka[1]])) {
                    i--;
                }
            }
            cfUbahMahasiswa1();
        } else if (pilih[4].equalsIgnoreCase("t")) {
            sortingMahasiswa();
            fUbahMahasiswa();
        } else {
            System.out.println("Tidak valid");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fUbahMahasiswa();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    cfUbahMahasiswa1();
                    kondisi = false;
                }
            }
        }
    }

    public static void fLihatMahasiswa() {
        validasiMahasiswa();
        tabelDosenMahasiswa(masterMahasiswa, biodataMahasiswa[1]);
        System.out.print("Masukkan : \n[NIM] untuk memilih Mahasiswa\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterMahasiswa.length, 3, 0, masterMahasiswa);
        if (pilih[3].equalsIgnoreCase(masterMahasiswa[ambilAngka[0]][1])) {
            cfLihatMahasiswa11();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fBioMahasiswa();
        } else {
            System.out.println("Mahasiswa tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fBioMahasiswa();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fLihatMahasiswa();
                    kondisi = false;
                }
            }
        }
    }

    public static void cfLihatMahasiswa11() {
        System.out.println(
                "1. Biodata\n2. Password\nMasukkan : \n[Angka]   untuk mengubah\n[T]       untuk keluar\npilih -->  : ");
        pilih[4] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        if (pilih[4].equalsIgnoreCase("1") || pilih[4].equalsIgnoreCase("biodata")) {
            for (int i = 0; i < biodataMahasiswa.length - 1; i++) {
                System.out.printf("|%-4s|%-21s|%-70s|\n", i + 1, biodataMahasiswa[i],
                        masterMahasiswa[ambilAngka[0]][i]);
            }
            fUlangLihatMahasiswa();
        } else if (pilih[4].equalsIgnoreCase("2") || pilih[4].equalsIgnoreCase("akun")) {
            System.out.printf("|%-4s|%-21s|%-70s|\n|%-4s|%-21s|%-70s|\n", 1, biodataMahasiswa[1],
                    masterMahasiswa[ambilAngka[0]][1], 2, biodataMahasiswa[12],
                    masterMahasiswa[ambilAngka[0]][12]);// username dan password
            fUlangLihatMahasiswa();
        } else if (pilih[4].equalsIgnoreCase("t")) {
            fLihatMahasiswa();
        } else {
            fUlangLihatMahasiswa();
        }
    }

    public static void fMatkul() {
        System.out.println(
                "1. Tambah Mata Kuliah\n2. Kurangi Mata Kuliah\n3. Ubah Mata Kuliah\n4. Lihat Mata Kuliah\n5. Keluar");
        pilih[2] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        if (pilih[2].equalsIgnoreCase("1")) {
            fTambahMatkul();
        } else if (pilih[2].equalsIgnoreCase("2")) {
            fKurangMatkul();
        } else if (pilih[2].equalsIgnoreCase("3")) {
            fUbahMatkul();
        } else if (pilih[2].equalsIgnoreCase("4")) {
            fLihatMatkul();
        } else if (pilih[2].equalsIgnoreCase("5")) {
            berandaAdmin();
        } else {
            fMatkul();
        }
    }

    public static void fTambahMatkul() {
        String tambahMatkul[][][] = new String[masterMatkul.length + 1][2][];
        for (int i = 0; i < masterMatkul.length; i++) {
            for (int j = 0; j < 2; j++) {
                tambahMatkul[i][j] = new String[masterMatkul[i][j].length];
            }
        }
        tambahMatkul[masterMatkul.length][0] = new String[2];
        tambahMatkul[masterMatkul.length][1] = new String[0];
        double tambahPersentase[][] = new double[masterMatkul.length + 1][scorePersentase.length];
        double tambahNilai[][][] = new double[masterMahasiswa.length][masterMatkul.length + 1][6];
        // harus mempelajari sifat array
        for (int j = 0; j < masterMatkul.length; j++) {
            for (int i = 0; i < masterMahasiswa.length; i++) {
                tambahNilai[i][j] = masterNilai[i][j];
            }
            tambahMatkul[j] = masterMatkul[j];
            tambahPersentase[j] = masterPersentase[j];
        }
        if (masterMatkul.length != 0) {
            tabelMatkul();
        }
        System.out.println("Masukkan : ");
        for (int i = 0; i < tambahMatkul[ambilAngka[0]][0].length; i++) {
            System.out.printf("%-57s : ", namaMatkul[i]);
            tambahMatkul[masterMatkul.length][0][i] = scStr.nextLine();
            if (tambahMatkul[masterMatkul.length][0][i]
                    .equalsIgnoreCase(tambahMatkul[masterMatkul.length][0][1])
                    && tambahMatkul[masterMatkul.length][0][1].length() > 4) {
                i--;
            }
        }
        double tampung = 0;
        for (int i = 0; i < 1; i++) {
            System.out.println("!Total persentase = 1!");
            tampung = 0;
            for (int j = 0; j < scorePersentase.length - 1; j++) {
                System.out.printf("Persentase %-5s %-40s : ", scorePersentase[j],
                        tambahMatkul[masterMatkul.length][0][0]);
                tambahPersentase[masterMatkul.length][j] = scDbl.nextDouble();
                tampung += tambahPersentase[masterMatkul.length][j];
            }
            if (tampung != 1) {
                i--;
            }
        }
        System.out.printf("%-5s %-40s             : ", scorePersentase[scorePersentase.length - 1],
                tambahMatkul[masterMatkul.length][0][0]);
        tambahPersentase[masterMatkul.length][scorePersentase.length - 1] = scDbl.nextDouble();
        masterMatkul = tambahMatkul;
        masterPersentase = tambahPersentase;
        masterNilai = tambahNilai;
        sortingMatkul();
        tabelMatkul();
        fKembaliFMatkul();
    }

    public static void fKurangMatkul() {
        validasiMatkul();
        String kurangMatkul[][][] = new String[masterMatkul.length - 1][2][];
        double kurangPersentase[][] = new double[masterMatkul.length -
                1][scorePersentase.length];
        double kurangNilai[][][] = new double[masterMahasiswa.length][masterMatkul.length
                - 1][score.length];
        tabelMatkul();
        System.out.print("Masukkan : \n[ANGKA] untuk memilih Mata Kuliah\n[T]     untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingDenganAngka(3, 0);
        if (pilih[3].equalsIgnoreCase(masterMatkul[ambilAngka[0]][0][0])
                || pilih[3].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[0] + 1))) {
            String tampung = masterMatkul[ambilAngka[0]][0][0];
            tempPengurangan = 0;
            for (int i = 0; i < masterMatkul.length; i++) {
                for (int j = 0; j < score.length; j++) {
                    for (int j2 = 0; j2 < masterMahasiswa.length; j2++) {
                        masterNilai[j2][tempPengurangan][j] = masterNilai[j2][i][j];
                    }
                    masterPersentase[tempPengurangan][j] = masterPersentase[i][j];
                }
                masterMatkul[tempPengurangan] = masterMatkul[i];
                if (!tampung.equalsIgnoreCase(masterMatkul[i][0][0])) {
                    tempPengurangan++;
                }
            }
            for (int i = 0; i < kurangMatkul.length; i++) {
                for (int j = 0; j < masterMahasiswa.length; j++) {
                    kurangNilai[j][i] = masterNilai[j][i];
                }
                kurangMatkul[i] = masterMatkul[i];
                kurangPersentase[i] = masterPersentase[i];
            }
            masterMatkul = kurangMatkul;
            masterNilai = kurangNilai;
            masterPersentase = kurangPersentase;
            fKurangMatkul();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fMatkul();
        } else {
            System.out.println("Mata Kuliah tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fMatkul();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fKurangMatkul();
                    kondisi = false;
                }
            }
        }

    }

    public static void fUbahMatkul() {
        validasiMatkul();
        tabelMatkul();
        System.out.print("Masukkan : \n[ANGKA] untuk memilih Mata Kuliah\n[T]     untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingDenganAngka(3, 0);
        if (pilih[3].equalsIgnoreCase(masterMatkul[ambilAngka[0]][0][0])
                || pilih[3].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[0] + 1))) {
            cfUbahMatkul1();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fMatkul();
        } else {
            System.out.println("Mata Kuliah tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fMatkul();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fUbahMatkul();
                    kondisi = false;
                }
            }
        }
    }

    public static void cfUbahMatkul1() {
        System.out.printf("%-40s\n",
                masterMatkul[ambilAngka[0]][0][0]);
        for (int i = 0; i < scorePersentase.length; i++) {
            System.out.printf("|%-4s|Persentase %-5s %-31s|%.1f|\n", i + 2,
                    scorePersentase[i],
                    masterMatkul[ambilAngka[0]][0][0], masterPersentase[ambilAngka[0]][i]);
        }
        System.out.println(
                "1. Mata Kuliah\n2. Persentase\n3. SKS\nMasukkan : \n[Angka]   untuk mengubah\n[T]       untuk keluar\npilih -->  : ");
        pilih[4] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        if (pilih[4].equalsIgnoreCase("1") || pilih[4].equalsIgnoreCase("mata kuliah")) {
            for (int i = 0; i < masterMatkul[ambilAngka[0]][0].length; i++) {
                System.out.printf("%-57s : ", namaMatkul[i]);
                masterMatkul[ambilAngka[0]][0][i] = scStr.nextLine();
                if (masterMatkul[ambilAngka[0]][0][i]
                        .equalsIgnoreCase(masterMatkul[ambilAngka[0]][0][1])
                        && masterMatkul[ambilAngka[0]][0][1].length() > 4) {
                    i--;
                }
            }
            masterMatkul[ambilAngka[0]][1] = new String[0];
            sortingMatkul();
            fUlangCfUbahMatkul1();
        } else if (pilih[4].equalsIgnoreCase("2") || pilih[4].equalsIgnoreCase("persentase")) {
            double tampung = 0;
            for (int i = 0; i < 1; i++) {
                System.out.println("!Total persentase = 1!");
                tampung = 0;
                for (int j = 0; j < scorePersentase.length - 1; j++) {
                    System.out.printf("Persentase %-5s %-40s : ", scorePersentase[j],
                            masterMatkul[ambilAngka[0]][0][0]);
                    masterPersentase[ambilAngka[0]][j] = scDbl.nextDouble();
                    tampung += masterPersentase[ambilAngka[0]][j];
                }
                if (tampung != 1) {
                    i--;
                }
            }
            fUlangCfUbahMatkul1();
        } else if (pilih[4].equalsIgnoreCase("3") || pilih[4].equalsIgnoreCase("sks")) {
            System.out.printf("%-5s %-40s             : ", scorePersentase[scorePersentase.length - 1],
                    masterMatkul[ambilAngka[0]][0][0]);
            masterPersentase[ambilAngka[0]][scorePersentase.length - 1] = scDbl.nextDouble();
            fUlangCfUbahMatkul1();
        } else {
            System.out.println("Tidak Valid");
            fUlangCfUbahMatkul1();
        }
    }

    public static void fLihatMatkul() {
        validasiMatkul();
        tabelMatkul();
        System.out.print("Masukkan : \n[ANGKA] untuk memilih Mata Kuliah\n[T]     untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingDenganAngka(3, 0);
        if (pilih[3].equalsIgnoreCase(masterMatkul[ambilAngka[0]][0][0])
                || pilih[3].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[0] + 1))) {
            System.out.printf("%-40s\n",
                    masterMatkul[ambilAngka[0]][0][0]);
            for (int i = 0; i < scorePersentase.length; i++) {
                System.out.printf("|%-4s|Persentase %-5s %-31s|%.1f|\n", i + 2,
                        scorePersentase[i],
                        masterMatkul[ambilAngka[0]][0][0], masterPersentase[ambilAngka[0]][i]);
            } // di perbaiki
            fKembaliFLihatMatkul();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fMatkul();
        } else {
            System.out.println("Mata Kuliah tidak terdaftar");
            fKembaliFLihatMatkul();
        }
    }

    public static void fNilai() {
        System.out.println(
                "1. Input Nilai\n2. Lihat Nilai\n3. Laporan\n4. Ranking\n5. Keluar");
        pilih[2] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        if (pilih[2].equalsIgnoreCase("1")) {
            fInputNilai();
        } else if (pilih[2].equalsIgnoreCase("2")) {
            fLihatNilai();
        } else if (pilih[2].equalsIgnoreCase("3")) {
            fLaporan();
        } else if (pilih[2].equalsIgnoreCase("4")) {
            fRanking();
        } else if (pilih[2].equalsIgnoreCase("5")) {
            berandaAdmin();
        } else {
            fNilai();
        }
    }

    public static void fInputNilai() {
        validasiMahasiswa();
        tabelDosenMahasiswa(masterMahasiswa, biodataMahasiswa[1]);
        System.out.print("Masukkan : \n[NIM] untuk memilih Mahasiswa\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterMahasiswa.length, 3, 0, masterMahasiswa);
        if (pilih[3].equalsIgnoreCase(masterMahasiswa[ambilAngka[0]][1])) {
            cfInputNilai1();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fNilai();
        } else {
            System.out.println("Mahasiswa tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                System.out.println("\033[H\033[2J");
                if (kembali[0].equalsIgnoreCase("t")) {
                    fNilai();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fInputNilai();
                    kondisi = false;
                }
            }
        }
    }

    public static void cfInputNilai1() {
        validasiMatkul();
        tabelMatkul();
        System.out.print("Masukkan : \n[ANGKA] untuk memilih Mata Kuliah\n[T]     untuk keluar\npilih -->  : ");
        pilih[4] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingDenganAngka(4, 1);
        if (pilih[4].equalsIgnoreCase(masterMatkul[ambilAngka[1]][0][0])
                || pilih[4].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[1] + 1))) {
            System.out.println("Nilai 0 sampai 100");
            for (int i = 0; i < score.length - 1; i++) {
                System.out.printf("Masukkan nilai %-5s %-15s : ", score[i],
                        masterMatkul[ambilAngka[1]][0][0]);
                masterNilai[ambilAngka[0]][ambilAngka[1]][i] = scDbl.nextDouble();
                if ((masterNilai[ambilAngka[0]][ambilAngka[1]][i] == masterNilai[ambilAngka[0]][ambilAngka[1]][0]
                        && (masterNilai[ambilAngka[0]][ambilAngka[1]][0] > 100
                                || masterNilai[ambilAngka[0]][ambilAngka[1]][0] < 0))
                        || (masterNilai[ambilAngka[0]][ambilAngka[1]][i] == masterNilai[ambilAngka[0]][ambilAngka[1]][1]
                                && (masterNilai[ambilAngka[0]][ambilAngka[1]][1] > 100
                                        || masterNilai[ambilAngka[0]][ambilAngka[1]][1] < 0))
                        || (masterNilai[ambilAngka[0]][ambilAngka[1]][i] == masterNilai[ambilAngka[0]][ambilAngka[1]][2]
                                && (masterNilai[ambilAngka[0]][ambilAngka[1]][2] > 100
                                        || masterNilai[ambilAngka[0]][ambilAngka[1]][2] < 0))
                        || (masterNilai[ambilAngka[0]][ambilAngka[1]][i] == masterNilai[ambilAngka[0]][ambilAngka[1]][3]
                                && (masterNilai[ambilAngka[0]][ambilAngka[1]][3] > 100
                                        || masterNilai[ambilAngka[0]][ambilAngka[1]][3] < 0))) {
                    i--;
                }
            }
            for (int i = 0; i < score.length - 1; i++) {
                masterNilai[ambilAngka[0]][ambilAngka[1]][4] += masterNilai[ambilAngka[0]][ambilAngka[1]][i]
                        * masterPersentase[ambilAngka[1]][i];
            }
            System.out.printf("Nilai Akhir %-15s : %.2f\n", masterMatkul[ambilAngka[1]][0][0],
                    masterNilai[ambilAngka[0]][ambilAngka[1]][4]);
            masterNilai[ambilAngka[0]][ambilAngka[1]][4] = 0;
            fKembaliFInputNilai();
        } else if (pilih[4].equalsIgnoreCase("t")) {
            fInputNilai();
        } else {
            System.out.println("Mata Kuliah tidak terdaftar");
            fKembaliFInputNilai();
        }
    }

    public static void fLihatNilai() {
        validasiMahasiswa();
        tabelDosenMahasiswa(masterMahasiswa, biodataMahasiswa[1]);
        System.out.print("Masukkan : \n[NIM] untuk memilih Mahasiswa\n[T]   untuk keluar\npilih -->  : ");
        pilih[3] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingTanpaAngka(masterMahasiswa.length, 3, 0, masterMahasiswa);
        if (pilih[3].equalsIgnoreCase(masterMahasiswa[ambilAngka[0]][1])) {
            cfLihatNilai1();
        } else if (pilih[3].equalsIgnoreCase("t")) {
            fNilai();
        } else {
            System.out.println("Mahasiswa tidak terdaftar");
            kondisi = true;
            while (kondisi) {
                System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
                kembali[0] = scStr.nextLine();
                if (kembali[0].equalsIgnoreCase("t")) {
                    fNilai();
                    kondisi = false;
                } else if (kembali[0].equalsIgnoreCase("r")) {
                    fLihatNilai();
                    kondisi = false;
                }
            }
        }
    }

    public static void cfLihatNilai1() {
        validasiMatkul();
            System.out.println(
                    "============================================================");
            System.out.printf("| %s  |%-19s%s%-19s|\n", atribut[7], atribut[4], atribut[0],
                    atribut[4]);
            System.out.println(
                    "============================================================");
            for (int i = 0; i < masterMatkul.length; i++) {
                System.out.printf("|   %-5s|%-2s%-45s%-2s|\n", i + 1, atribut[4],
                        masterMatkul[i][0][0], atribut[4]);
                if (i < masterMatkul.length) {
                    System.out.println(
                            "------------------------------------------------------------");
                }
            }
            System.out.printf("|   %-5s|  IPS%-44s|\n", masterMatkul.length + 1, atribut[4]);
            System.out.println(
                    "============================================================");
            System.out.print("Masukkan : \n[ANGKA] untuk memilih Mata Kuliah\n[T]     untuk keluar\npilih -->  : ");
        pilih[4] = scStr.nextLine();
        System.out.println("\033[H\033[2J");
        searchingDenganAngka(4, 1);
        if (pilih[4].equalsIgnoreCase(masterMatkul[ambilAngka[1]][0][0])
                || pilih[4].equalsIgnoreCase(intToStr = String.valueOf(ambilAngka[1] + 1))) {
            for (int i = 0; i < score.length - 1; i++) {
                System.out.printf("nilai %-5s %-15s : %.2f\n", score[i],
                        masterMatkul[ambilAngka[1]][0][0],
                        masterNilai[ambilAngka[0]][ambilAngka[1]][i]);

                masterNilai[ambilAngka[0]][ambilAngka[1]][4] += masterNilai[ambilAngka[0]][ambilAngka[1]][i]
                        * masterPersentase[ambilAngka[1]][i];
            }
            System.out.printf("Nilai Akhir %-15s : %.2f\n", masterMatkul[ambilAngka[1]][0][0],
                    masterNilai[ambilAngka[0]][ambilAngka[1]][4]);
            masterNilai[ambilAngka[0]][ambilAngka[1]][4] = 0;
            fKembaliFLihatNilai();
        } else if (pilih[4].equalsIgnoreCase("ips")
                || pilih[4].equalsIgnoreCase(intToStr = String.valueOf(masterMatkul.length + 1))) {
            String grade[] = new String[masterMatkul.length];
            double ips = 0;
            fTotalSKS();
            System.out.println(
                    "========================================================================================");
            System.out.printf("|%-22s%s%-21s|  %s  |  %s  |\n", atribut[4], atribut[0], atribut[4], atribut[1],
                    atribut[2]);
            System.out.println(
                    "========================================================================================");

            for (int i = 0; i < masterMatkul.length; i++) {
                for (int j = 0; j < score.length - 1; j++) {
                    masterNilai[ambilAngka[0]][i][4] += masterNilai[ambilAngka[0]][i][j]
                            * masterPersentase[i][j];
                }
                fGrade(ambilAngka[0], i, grade);
                if (masterNilai[ambilAngka[0]][i][4] < 10) {
                    System.out.printf("|  %-50s  |     %.2f      |       %s       |\n", masterMatkul[i][0][0],
                            masterNilai[ambilAngka[0]][i][4], grade[i]);
                } else {
                    System.out.printf("|  %-50s  |     %.2f     |       %s       |\n", masterMatkul[i][0][0],
                            masterNilai[ambilAngka[0]][i][4], grade[i]);
                }
                System.out.println(
                        "----------------------------------------------------------------------------------------");
                masterNilai[ambilAngka[0]][i][5] *= masterPersentase[i][4]
                        / totalSks;
                ips += masterNilai[ambilAngka[0]][i][5];
                masterNilai[ambilAngka[0]][i][5] = 0;
                masterNilai[ambilAngka[0]][i][4] = 0;
            }
            System.out.printf("|  %-52s|%-14s%.2f%-13s|\n", atribut[5], atribut[4],
                    ips, atribut[4]);
            System.out.println(
                    "========================================================================================");
            for (int i = 0; i < masterMatkul.length; i++) {
                grade[i] = null;
            }
            totalSks = 0;
            ips = 0;
            fKembaliFLihatNilai();
        } else if (pilih[4].equalsIgnoreCase("t")) {
            fLihatNilai();
        } else {
            System.out.println("Mata Kuliah tidak terdaftar");
            fKembaliFLihatNilai();
        }
    }

    public static void fLaporan() {
        validasiMahasiswa();
        validasiMatkul();
        double ips[] = new double[masterMahasiswa.length];
        String grade[] = new String[masterMatkul.length];
        fTotalSKS();
        fIps(ips, grade);
        tabelLaporan(ips);
        fReset(ips, grade);
        fKembaliNilai();
    }

    public static void fRanking() {
        validasiMahasiswa();
        validasiMatkul();
        double ips[] = new double[masterMahasiswa.length];
        String grade[] = new String[masterMatkul.length];
        fTotalSKS();
        fIps(ips, grade);
        sortingRanking(ips);
        tabelLaporan(ips);
        fReset(ips, grade);
        sortingMahasiswa();
        fKembaliNilai();
    }

    public static void fReset(double ips[], String grade[]) {
        for (int i = 0; i < masterMatkul.length; i++) {
            grade[i] = null;
        }
        for (int i = 0; i < masterMahasiswa.length; i++) {
            for (int j = 0; j < masterMatkul.length; j++) {
                masterNilai[i][j][4] = 0;
                masterNilai[i][j][5] = 0;
            }
            ips[i] = 0;
        }
        totalSks = 0;
    }

    public static void fIps(double ips[], String grade[]) {
        for (int i = 0; i < masterMahasiswa.length; i++) {
            for (int j = 0; j < masterMatkul.length; j++) {
                for (int j2 = 0; j2 < score.length - 1; j2++) {
                    masterNilai[i][j][4] += masterNilai[i][j][j2]
                            * masterPersentase[j][j2];
                }
                fGrade(i, j, grade);
                masterNilai[i][j][5] *= masterPersentase[j][4]
                        / totalSks;
                ips[i] += masterNilai[i][j][5];

            }
        }
    }

    public static double fTotalSKS() {
        for (int j = 0; j < masterPersentase.length; j++) {
            totalSks += masterPersentase[j][4];
        }
        return totalSks;
    }

    public static void fKetentuanInputDosen(String tampung[], int a, int b, String tampungDosen[][]) {
        for (int j = 0; j < masterDosen.length; j++) {
            if ((tampung[a].equalsIgnoreCase(tampung[0])
                    && tampung[0].length() > 30)
                    || (tampung[a].equalsIgnoreCase(tampung[1])
                            && (tampung[1].equalsIgnoreCase(masterDosen[j][a]) || tampung[1].length() != 10))) {
                kondisi = true;
                break;
            } else {
                kondisi = false;
            }
        }
        if (!kondisi) {
            tampungDosen[b][a] = tampung[a];
        }
    }

    public static void fKetentuanInputMahasiswa(String tampung[], int a, int b, String tampungMahasiswa[][]) {
        for (int j = 0; j < masterMahasiswa.length; j++) {
            if ((tampung[a].equalsIgnoreCase(tampung[0]) && tampung[0].length() > 30)
                    || (tampung[a].equalsIgnoreCase(tampung[1]) && (tampung[1].length() != 10
                            || tampung[1].equalsIgnoreCase(masterMahasiswa[j][1])))
                    || (tampung[a].equalsIgnoreCase(tampung[2])
                            && (!tampung[2].equalsIgnoreCase("laki-laki")
                                    && !tampung[2].equalsIgnoreCase("perempuan")))
                    || (tampung[a].equalsIgnoreCase(tampung[3]) && tampung[3].length() > 70)
                    || (tampung[a].equalsIgnoreCase(tampung[4]) && tampung[4].length() > 70)
                    || (tampung[a].equalsIgnoreCase(tampung[5]) && tampung[5].length() > 70)
                    || (tampung[a].equalsIgnoreCase(tampung[6]) && tampung[6].length() > 30)
                    || (tampung[a].equalsIgnoreCase(tampung[7]) && tampung[7].length() > 30)
                    || (tampung[a].equalsIgnoreCase(tampung[8]) && tampung[8].length() > 70)
                    || (tampung[a].equalsIgnoreCase(tampung[9]) && tampung[9].length() > 70)
                    || (tampung[a].equalsIgnoreCase(tampung[10]) && tampung[10].length() > 20)
                    || (tampung[a].equalsIgnoreCase(tampung[11]) && tampung[11].length() > 20)
                    || (tampung[a].equalsIgnoreCase(tampung[12]) && tampung[12].length() > 20)) {
                kondisi = true;
                break;
            } else {
                kondisi = false;
            }
        }
        if (!kondisi) {
            tampungMahasiswa[b][a] = tampung[a];
        }
    }

    public static void fGrade(int a, int b, String c[]) {
        if (masterNilai[a][b][4] > 80
                && masterNilai[a][b][4] <= 100) {
            c[b] = "A";
            masterNilai[a][b][5] = 4;
        } else if (masterNilai[a][b][4] > 73
                && masterNilai[a][b][4] <= 80) {
            c[b] = "B+";
            masterNilai[a][b][5] = 3.5;
        } else if (masterNilai[a][b][4] > 65
                && masterNilai[a][b][4] <= 73) {
            c[b] = "B";
            masterNilai[a][b][5] = 3;
        } else if (masterNilai[a][b][4] > 60
                && masterNilai[a][b][4] <= 65) {
            c[b] = "C+";
            masterNilai[a][b][5] = 2.5;
        } else if (masterNilai[a][b][4] > 50
                && masterNilai[a][b][4] <= 60) {
            c[b] = "C";
            masterNilai[a][b][5] = 2;
        } else if (masterNilai[a][b][4] > 39
                && masterNilai[a][b][4] <= 50) {
            c[b] = "D";
            masterNilai[a][b][5] = 1;
        } else if (masterNilai[a][b][4] <= 39) {
            c[b] = "E";
            masterNilai[a][b][5] = 0;
        }
    }

    // validasi
    public static void validasiDosen() {
        if (masterDosen.length == 0) {
            System.out.println("Dosen tidak tersedia");
            fKembaliFBioDosen();
        }
    }

    public static void validasiPengajar() {
        if (masterMatkul[ambilAngka[0]][1].length == 0) {
            System.out.println("Pengajar tidak tersedia");
            fKembaliFBioPengajar();
        }
    }

    public static void validasiMahasiswa() {
        if (masterMahasiswa.length == 0) {
            System.out.println("Mahasiswa tidak tersedia");
            kondisi = false;
            fKembaliFBioMahasiswa();
        }
    }

    public static void validasiMatkul() {
        if (masterMatkul.length == 0) {
            System.out.println("Mata Kuliah tidak tersedia");
            kondisi = false;
            fKembaliFMatkul();
        }
    }

    // tabel
    public static void tabelDosenMahasiswa(String tampung[][], String nomor) {
        System.out.println(
                "============================================================");
        System.out.printf("| %s  |%-15s%s%-15s|     %s      |\n", atribut[7], atribut[4],
                atribut[6], atribut[4], nomor);
        System.out.println(
                "============================================================");
        for (int i = 0; i < tampung.length; i++) {
            System.out.printf("|   %-5s|  %-30s  |  %-10s  |\n", i + 1,
                    tampung[i][0], tampung[i][1]);
            if (i < tampung.length - 1) {
                System.out.println(
                        "------------------------------------------------------------");
            }
        }
        System.out.println(
                "============================================================");
    }

    public static void tabelPengajar() {
        if (masterMatkul[ambilAngka[0]][1].length == 0) {
            System.out.println("Tidak ada Pengajar");
        } else {
            int tampungInt = 0;
            for (int i = 0; i < masterDosen.length; i++) {
                for (int j = 0; j < masterMatkul[ambilAngka[0]][1].length; j++) {
                    if (masterDosen[i][1].equalsIgnoreCase(masterMatkul[ambilAngka[0]][1][j])) {
                        tempint[0] = new int[tampungInt + 1];
                        for (int j2 = 0; j2 < tempint[0].length; j2++) {
                            tempint[0][j2] = angkaSementara[0][j2];
                        }
                        tempint[0][tampungInt] = i;
                        tampungInt++;
                        angkaSementara[0] = new int[tampungInt + 1];
                        for (int j2 = 0; j2 < tempint[0].length; j2++) {
                            angkaSementara[0][j2] = tempint[0][j2];
                        }
                        break;
                    }
                }
            }
            System.out.println(
                    "============================================================");
            System.out.printf("| %s  |%-15s%s%-15s|     %s      |\n", atribut[7], atribut[4],
                    atribut[6], atribut[4], atribut[8]);
            System.out.println(
                    "============================================================");
            for (int i = 0; i < tempint[0].length; i++) {
                System.out.printf("|   %-5s|  %-30s  |  %-10s  |\n", i + 1,
                        masterDosen[tempint[0][i]][0], masterDosen[tempint[0][i]][1]);
                if (i < tempint[0].length - 1) {
                    System.out.println(
                            "------------------------------------------------------------");
                }
            }
            System.out.println(
                    "============================================================");
        }
    }

    public static void tabelBioDosen() {
        System.out.println(
                "============================================================");
        for (int i = 0; i < bioDosen.length; i++) {
            System.out.printf("| %-5s |  %-30s%-18s|\n", bioDosen[i],
                    masterDosen[ambilAngka[0]][i], atribut[4]);
            if (i < bioDosen.length - 1) {
                System.out.println(
                        "------------------------------------------------------------");
            }
        }
        System.out.println(
                "============================================================");

    }

    public static void tabelMatkul() {
        System.out.println(
                "============================================================");
        System.out.printf("| %s  |%-19s%s%-19s|\n", atribut[7], atribut[4], atribut[0],
                atribut[4]);
        System.out.println(
                "============================================================");
        for (int i = 0; i < masterMatkul.length; i++) {
            System.out.printf("|   %-5s|  %-45s  |\n", i + 1, masterMatkul[i][0][0]);
            if (i < masterMatkul.length - 1) {
                System.out.println(
                        "------------------------------------------------------------");
            }
        }
        System.out.println(
                "============================================================");
    }

    public static void tabelLaporan(double a[]) {
        for (int i = 0; i < 45 + (11 * (masterMatkul.length + 1)); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("|  %s |  %-30s  |", atribut[7], atribut[6]);
        for (int i = 0; i < masterMatkul.length; i++) {
            System.out.printf("  %-4s    |", masterMatkul[i][0][1]);
        }
        System.out.printf("  %-4s    |\n", atribut[5]);
        for (int i = 0; i < 45 + (11 * (masterMatkul.length + 1)); i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < masterMahasiswa.length; i++) {
            System.out.printf("|  %-5s |  %-30s  |", i + 1, masterMahasiswa[i][0]);
            for (int j = 0; j < masterMatkul.length; j++) {
                if (masterNilai[i][j][4] < 10) {
                    System.out.printf("  %.2f    |", masterNilai[i][j][4]);
                } else if (masterNilai[i][j][4] == 100) {
                    System.out.printf("  %.2f  |", masterNilai[i][j][4]);
                } else {
                    System.out.printf("  %.2f   |", masterNilai[i][j][4]);
                }
            }
            System.out.printf("  %.2f    |\n", a[i]);
            for (int k = 0; k < 45 + (11 * (masterMatkul.length + 1)); k++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    // sorting
    public static void sortingDosen() {
        for (int i = 0; i < masterDosen.length; i++) {
            for (int j = i; j < masterDosen.length; j++) {
                if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                    for (int j2 = 0; j2 < bioDosen.length; j2++) {
                        tempString[0] = masterDosen[i][j2];
                        masterDosen[i][j2] = masterDosen[j][j2];
                        masterDosen[j][j2] = tempString[0];
                    }
                }
            }
        }
    }

    public static void sortingMatkul() {
        for (int i = 0; i < masterMatkul.length; i++) {
            for (int j = i; j < masterMatkul.length; j++) {
                if (masterMatkul[i][0][0].compareToIgnoreCase(masterMatkul[j][0][0]) > 0) {
                    for (int k = 0; k < 2; k++) {
                        tempString = masterMatkul[i][k];
                        masterMatkul[i][k] = masterMatkul[j][k];
                        masterMatkul[j][k] = tempString;
                    }
                    for (int j2 = 0; j2 < scorePersentase.length; j2++) {
                        tempDouble = masterPersentase[i][j2];
                        masterPersentase[i][j2] = masterPersentase[j][j2];
                        masterPersentase[j][j2] = tempDouble;
                    }
                    for (int j2 = 0; j2 < masterNilai.length; j2++) {
                        for (int k = 0; k < score.length; k++) {
                            tempDouble = masterNilai[j2][i][k];
                            masterNilai[j2][i][k] = masterNilai[j2][j][k];
                            masterNilai[j2][j][k] = tempDouble;
                        }
                    }
                }
            }
        }
    }

    public static void sortingMahasiswa() {
        for (int i = 0; i < masterMahasiswa.length; i++) {
            for (int j = i; j < masterMahasiswa.length; j++) {
                if (masterMahasiswa[i][0].compareToIgnoreCase(masterMahasiswa[j][0]) > 0) {
                    for (int j2 = 0; j2 < biodataMahasiswa.length; j2++) {
                        tempString[0] = masterMahasiswa[i][j2];
                        masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                        masterMahasiswa[j][j2] = tempString[0];
                    }
                    for (int j2 = 0; j2 < masterMatkul.length; j2++) {
                        for (int k = 0; k < score.length; k++) {
                            tempDouble = masterNilai[i][j2][k];
                            masterNilai[i][j2][k] = masterNilai[j][j2][k];
                            masterNilai[j][j2][k] = tempDouble;
                        }
                    }
                }
            }
        }
    }

    public static void sortingRanking(double ips[]) {
        for (int i = 0; i < ips.length; i++) {
            for (int j = i; j < ips.length; j++) {
                if (ips[i] < ips[j]) {
                    tempDouble = ips[i];
                    ips[i] = ips[j];
                    ips[j] = tempDouble;

                    for (int j2 = 0; j2 < biodataMahasiswa.length; j2++) {
                        tempString[0] = masterMahasiswa[i][j2];
                        masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                        masterMahasiswa[j][j2] = tempString[0];
                    }
                } else if (ips[i] == ips[j]) {
                    if (masterMahasiswa[i][0].compareTo(masterMahasiswa[j][0]) > 0) {
                        tempDouble = ips[i];
                        ips[i] = ips[j];
                        ips[j] = tempDouble;

                        for (int j2 = 0; j2 < biodataMahasiswa.length; j2++) {
                            tempString[0] = masterMahasiswa[i][j2];
                            masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                            masterMahasiswa[j][j2] = tempString[0];
                        }
                    }
                }
            }
        }
    }

    // kembali
    public static void fKembaliFBioDosen() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fBioDosen();
                kondisi = false;
            }
        }
    }

    public static void fKembaliFBioPengajar() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fBioPengajar();
                kondisi = false;
            }
        }
    }

    public static void fKembaliFBioPengajarUlangCFUbahPengajar1() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fBioPengajar();
                kondisi = false;
            } else if (kembali[0].equalsIgnoreCase("r")) {
                cfUbahPengajar1();
                kondisi = false;
            }
        }
    }

    public static void fKembaliFBioMahasiswa() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fBioMahasiswa();
                kondisi = false;
            }
        }
    }

    public static void fUlangLihatMahasiswa() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fLihatMahasiswa();
                kondisi = false;
            } else if (kembali[0].equalsIgnoreCase("r")) {
                cfLihatMahasiswa11();
                kondisi = false;
            }
        }
    }

    public static void fKembaliFMatkul() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fMatkul();
                kondisi = false;
            }
        }
    }

    public static void fUlangCfUbahMatkul1() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fUbahMatkul();
                kondisi = false;
            } else if (kembali[0].equalsIgnoreCase("r")) {
                cfUbahMatkul1();
                kondisi = false;
            }
        }
    }

    public static void fKembaliFLihatMatkul() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fMatkul();
                kondisi = false;
            } else if (kembali[0].equalsIgnoreCase("r")) {
                fLihatMatkul();
                kondisi = false;
            }
        }
    }

    public static void fKembaliFInputNilai() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fInputNilai();
                kondisi = false;
            } else if (kembali[0].equalsIgnoreCase("r")) {
                cfInputNilai1();
                kondisi = false;
            }
        }
    }

    public static void fKembaliFLihatNilai() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\n[R]   untuk mengulang\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fLihatNilai();
                kondisi = false;
            } else if (kembali[0].equalsIgnoreCase("r")) {
                cfLihatNilai1();
                kondisi = false;
            }
        }
    }

    public static void fKembaliNilai() {
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan :\n[T]   untuk keluar\npilih -->  : ");
            kembali[0] = scStr.nextLine();
            System.out.println("\033[H\033[2J");
            if (kembali[0].equalsIgnoreCase("t")) {
                fNilai();
                kondisi = false;
            }
        }
    }

    public static void searchingTanpaAngka(int a, int b, int c, String tampung[][]) {
        ambilAngka[c] = 0;
        for (int i = 0; i < a; i++) {
            if (pilih[b].equalsIgnoreCase(tampung[i][1])) {
                ambilAngka[c] = i;
                break;
            }
        }
    }

    public static void searchingDenganAngka(int a, int b) {
        ambilAngka[b] = 0;
        for (int i = 0; i < masterMatkul.length; i++) {
            if (pilih[a].equalsIgnoreCase(masterMatkul[i][0][0])
                    || pilih[a].equalsIgnoreCase(intToStr = String.valueOf(i + 1))) {
                ambilAngka[b] = i;
                break;
            }
        }
    }
}

// validasi lihat mahasiswa
// validasi jika panjang mahasiswa = 0
// validasi jika panjang mata kuliah = 0
// validasi back nilai pada lihat nilai dan input nilai

// reset ambilAngka