import java.util.Scanner;

public class main6pembuatanfungsi {
   public static Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        // login
        public static String choice[] = new String[3];
        public static String repeat[] = new String[4];

        String username = "", password = "", password2 = "", user = "", pass = "";
        int yahaa = 0;
        String yahoo = "", pilih = "";

        // tambah dosen
        String masDos[][] = { { "Zanuar", "12" }, { "Zaki", "23" } };
        String tamDos[][] = new String[100][2];
        int u = 0;
        

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

        // tambah mata kuliah
        String masMatKul[] = { "Bahasa Inggris 1", "Critical Thinking and Problem Solving", "Dasar Pemrograman",
                "Keselamtan Kesehatan Kerja", "Konsep Teknologi Informasi", "Matematika Dasar", "Pancasila",
                "Praktikum Dasar Pemrograman" };
        String tamMatKul[] = new String[100];
        String o;
        int g = 0;
        
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
        public static double masNil[][][] = { { { 100, 98, 100, 89 }, { 85, 83, 89, 81 } },
                { { 88, 87, 89, 82 }, { 90, 82, 84, 88 } },
                { { 90, 91, 89, 88 }, { 93, 85, 83, 89 } },
                { { 99, 86, 98, 85 }, { 88, 86, 86, 83 } } };
        double tamNil[][][] = new double[100][100][5];
        
    public static void main(String[] args) {
        //System.out.println(masNil[0][0][0]);
        getRangkaDosen();
    }
    public static void getRangkaDosen(){
        System.out.println("1. Mahasiswa\n2. Mata Kuliah\n3. Nilai\n4. Keluar");
        choice[2] = scStr.nextLine();
        if (choice[2].equalsIgnoreCase("1")) {
            System.out.println("1. Tambah Ruang\n2. Kurangi Ruang\n3. Ubah Biodata\n4. Lihat Biodata\n5. Keluar");
            choice[1] = scStr.nextLine();
            if (choice[1].equalsIgnoreCase("1")) {

            } else if (choice[1].equalsIgnoreCase("2")) {

            } else if (choice[1].equalsIgnoreCase("3")) {

            } else if (choice[1].equalsIgnoreCase("4")) {

            }
        } else if (choice[2].equalsIgnoreCase("2")) {
            System.out
                    .println("1. Tambah Ruang\n2. Kurangi Ruang\n3. Ubah Mata Kuliah\n4. Lihat Mata Kuliah\n5. Keluar");
            choice[1] = scStr.nextLine();
            if (choice[1].equalsIgnoreCase("1")) {

            } else if (choice[1].equalsIgnoreCase("2")) {

            } else if (choice[1].equalsIgnoreCase("3")) {

            } else if (choice[1].equalsIgnoreCase("4")) {

            }
        } else if (choice[2].equalsIgnoreCase("3")) {
            System.out.println("1. Input Nilai\n2. Lihat Nilai\n3. Lihat Ranking\n4. Keluar");
            choice[1] = scStr.nextLine();
            if (choice[1].equalsIgnoreCase("1")) {

            } else if (choice[1].equalsIgnoreCase("2")) {

            } else if (choice[1].equalsIgnoreCase("3")) {

            }
        } else if (choice[2].equalsIgnoreCase("4")) {
            System.out.println("terimakasih");
        }
        return;
    }
}
