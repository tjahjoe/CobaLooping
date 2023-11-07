
import java.util.Scanner;

public class ap {
    public static void main(String[] args) {

        // Mahasiswa0
        String nama = "";
        String jenisKelamin = "";
        String tempatTanggalLahir = "";
        String agama = "";
        String alamat = "";
        String ayah = "";
        String ibu = "";
        String pekerjaanAyah = "";
        String pekerjaanIbu = "";
        String alamatOrtu = "";
        String nomorTelepon = "";
        String nomorTeleponAyah = "";
        String nomorTeleponIbu = "";
        String NIM = "";
        String biodata[] = { "Nama", "Jenis Kelamin", "Tempat Tanggal Lahir", "Agama", "Alamat", "Ayah", "Ibu",
                "Pekerjaan Ayah", "Pekerjaan Ibu", "Alamat Orangtuaa", "Nomor Telepon", "Nomor Telepon Ayah",
                "Nomor Telepon Ibu", "NIM" };

        String mahasiswa[][] = { { "Agnes Rahmania", "Perempuan", "Malang, 17 Agustus 2005", "Islam",
                "Jalan KH. Wachid Hasyim", "Suratno", "Siti", "Wirausaha", "Ibu rumah tangga",
                "Jalan KH. Wachid Hasyim", "087796996123", "081754637827", "081627127456", "2541720001" },
                { "Farhan Malik", "Laki-laki", "Surabaya, 28 Oktober 2004", "Islam",
                        "Jalan Cendana No. 45, RT 03 RW 07, Kelurahan Damai Sejahtera, Kota Sejati", "Budi Santoso",
                        "Rina Wati", "Wiraswasta", "Dokter",
                        "Jalan Cendana No. 45, RT 03 RW 07, Kelurahan Damai Sejahtera, Kota Sejati", "081765357863",
                        "082345165263", "2541720002" },
                { "Aditya Pratama", "Laki-laki", "Bandung, 15 Agustus 2005", "Islam",
                        "Perumahan Harapan Baru Blok E2 No. 56, Kelurahan Indah, Kota Bahagia", "Eko Susanto",
                        "Maya Anggraini", "Insinyur", "Pengacara",
                        "Perumahan Harapan Baru Blok E2 No. 56, Kelurahan Indah, Kota Bahagia", "081767357863",
                        "087683938232", "2541720003" },
                { "Dinda Fitriani", "Perempuan", "Semarang, 12 Mei 1990", "Islam",
                        "Komplek Permata Indah Blok D3 No. 34, Kelurahan Sejahtera, Kota Damai", "Hendra Wijaya",
                        "Siti Fatimah", "Pengusaha", "Dosen",
                        "Komplek Permata Indah Blok D3 No. 34, Kelurahan Sejahtera, Kota Damai", "085845112341",
                        "089213421145", "2541720022" } };

        // mahasiswa4
        String nama4 = "Faisal Cahyono";
        String jenisKelamin4 = "Laki-laki";
        String tempatTanggalLahir4 = "Yogyakarta, 25 Maret 1988";
        String agama4 = "Islam";
        String alamat4 = "Jalan Dahlia No. 67, RT 08 RW 03, Kelurahan Indah, Kota Sejahtera";
        String ayah4 = "Joko Santoso";
        String ibu4 = "Ani Wulandari";
        String pekerjaanAyah4 = "Wiraswasta";
        String pekerjaanibu4 = "Pengacara";
        String alamatOrtu4 = "Jalan Dahlia No. 67, RT 08 RW 03, Kelurahan Indah, Kota Sejahtera";
        String nomorTeleponAyah4 = "085433163416";
        String nomorTeleponIbu4 = "081543235731";
        String NIM4 = "2541720012";

        // mahasiswa5
        String nama5 = "Indah Permata";
        String jenisKelamin5 = "Perempuan";
        String tempatTanggalLahir5 = "Medan, 18 Juli 1994";
        String agama5 = "Islam";
        String alamat5 = "Jalan Mawar No. 45, RT 12 RW 05, Kelurahan Damai, Kota Bahagia";
        String ayah5 = "Rudi Pratama";
        String ibu5 = " Dewi Safitri";
        String pekerjaanAyah5 = "Arsitek";
        String pekerjaanibu5 = "Penyanyi";
        String alamatOrtu5 = "Jalan Mawar No. 45, RT 12 RW 05, Kelurahan Damai, Kota Bahagia";
        String nomorTeleponAyah5 = "081325233112";
        String nomorTeleponIbu5 = "087433211243";
        String NIM5 = "2541720013";

        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        System.out.print("Nama:");
        nama = scStr.nextLine();
        System.out.print("NIM: ");
        NIM = scInt.nextLine();
        System.out.print("Tempat tanggal lahir: ");
        tempatTanggalLahir = scStr.nextLine();
        System.out.print("Agama: ");
        agama = scStr.nextLine();
        System.out.print("jenis kelamin: (L/P)");
        jenisKelamin = scStr.nextLine();
        System.out.print("nomor telepon: ");
        nomorTelepon = scStr.nextLine();
        System.out.print("alamat: ");
        alamat = scStr.nextLine();

        // data keluarga
        System.out.print("Nama ayah:");
        ayah = scStr.nextLine();
        System.out.print("Nama ibu:");
        ibu = scStr.nextLine();
        System.out.print("Pekerjaan ayah: ");
        pekerjaanAyah = scStr.nextLine();
        System.out.print("Pekerjaan ibu:");
        pekerjaanIbu = scStr.nextLine();
        System.out.print("Alamat ortu:");
        alamatOrtu = scStr.nextLine();
        System.out.print("Nomor telepon ayah:");
        nomorTeleponAyah = scStr.nextLine();
        System.out.print("Nomor telepon ibu:");
        nomorTeleponIbu = scStr.nextLine();

        System.out.println("================================");
        System.out.println("|            BIODATA           |");
        System.out.println("================================");
        System.out.println("|Nama                : " + nama);
        System.out.println("|NIM                 : " + NIM);
        System.out.println("|Tempat tanggal lahir: " + tempatTanggalLahir);
        System.out.println("|Agama               : " + agama);
        System.out.println("|jenis kelamin       : " + jenisKelamin);
        System.out.println("|nomor telepon       : " + nomorTelepon);
        System.out.println("|alamat              : " + alamat);
        System.out.println("|Nama ayah           : " + ayah);
        System.out.println("|Nama ibu            : " + ibu);
        System.out.println("|Pekerjaan ayah      : " + pekerjaanAyah);
        System.out.println("|Pekerjaan ibu       : " + pekerjaanIbu);
        System.out.println("|Alamat ortu         : " + alamatOrtu);
        System.out.println("|Nomor telepon ayah  : " + nomorTeleponAyah);
        System.out.println("|Nomor telepon ibu   : " + nomorTeleponIbu);

    }

}
