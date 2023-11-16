
import java.util.Scanner;

public class strukturAdmin {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scDbl = new Scanner(System.in);

        // tambahan
        String tempString = "";
        double tempDouble = 0;
        String ambilString[] = new String[2];
        int ambilAngka[] = new int[2];
        // dosen
        String bioDosen[] = { "Nama", "Password" };
        String masterDosen[][] = { { "Dimas Waicaksono", "1231231222" }, { "Bayu Samudra", "1235322321" },
                { "Endang Karisamwati", "1234231212" }, { "Naura Santika", "1231221231" } };
        // mahasiswa
        String masterMahasiswa[][] = {
                { "Agnes Rahmania", "Perempuan", "Malang, 17 Agustus 2005", "Islam", "2541720001",
                        "Jalan KH. Wachid Hasyim", "Suratno", "Siti", "Wirausaha", "Ibu rumah tangga", "081754637827",
                        "081627127456" }, // mahasiswa1
                { "Farhan Malik", "Laki-laki", "Surabaya, 28 Oktober 2004", "Islam", "2541720002",
                        "Jalan Cendana No. 45, RT 03 RW 07, Kelurahan Damai Sejahtera, Kota Sejati", "Budi Santoso",
                        "Rina Wati", "Wiraswasta", "Dokter", "081765357863", "082345165263" }, // mahasiswa2
                { "Aditya Pratama", "Laki-laki", "Bandung, 15 Agustus 2005", "Islam", "2541720003",
                        "Perumahan Harapan Baru Blok E2 No. 56, Kelurahan Indah, Kota Bahagia", "Eko Susanto",
                        "Maya Anggraini", "Insinyur", "Pengacara", "081767357863", "087683938232" }, // mahasiswa3
                { "Dinda Fitriani", "Perempuan", "Semarang, 12 Mei 1990", "Islam", "2541720022",
                        "Komplek Permata Indah Blok D3 No. 34, Kelurahan Sejahtera, Kota Damai", "Hendra Wijaya",
                        "Siti Fatimah", "Pengusaha", "Dosen", "085845112341", "089213421145" }, // mahasiswa4
                { "Faisal Cahyono", "Laki-laki", "Yogyakarta, 25 Maret 1988", "Islam", "2541720012",
                        "Jalan Dahlia No. 67, RT 08 RW 03, Kelurahan Indah, Kota Sejahtera", "Joko Santoso",
                        "Ani Wulandari", "Wiraswasta", "Pengacara", "085433163416", "081543235731" }, // mahasiswa5
                { "Indah Permata", "Perempuan", "Medan, 18 Juli 1994", "Islam", "2541720013",
                        "Jalan Mawar No. 45, RT 12 RW 05, Kelurahan Damai, Kota Bahagia", "Rudi Pratama",
                        "Dewi Safitri", "Arsitek", "Penyanyi", "081325233112", "087433211243" }// mahasiswa6
        };
        String[] biodata = { "Nama", "Jenis kelamin", "Tempat tanggal lahir", "Agama", "NIM",
                "Alamat", "Nama ayah", "Nama ibu", "Pekejaan ayah", "Pekerjaan ibu", "Telepon ayah",
                "Telepon ibu" };

        // nilai/ matakuliah
        String[] score = { "Tugas", "Kuis", "UTS", "UAS", "Akhir" };
        String scorePersentase[] = { "Tugas", "Kuis", "UTS", "UAS", "SKS" };
        boolean kondisi = true;

        double[] nlAkhir = new double[8];
        double ips = 0;
        String masterMatkul[] = { "Bahasa Inggris 1",
                "Critical Thinking and Problem Solving",
                "Dasar Pemrograman", "Keselamtan Kesehatan Kerja",
                "Konsep Teknologi Informasi",
                "Matematika Dasar", "Pancasila",
                "Praktikum Dasar Pemrograman" };
        double masterNilai[][][] = {
                { { 100, 98, 100, 89, 0 }, { 85, 83, 89, 81, 0 }, { 100, 98, 100, 89, 0 }, { 100, 98, 100, 89, 0 },
                        { 60, 60, 60, 60, 0 }, { 100, 98, 100, 89, 0 }, { 100, 98, 100, 89, 0 },
                        { 100, 98, 100, 89, 0 } },
                { { 88, 87, 89, 82, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 },
                        { 90, 82, 84, 88, 0 },
                        { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 } },
                { { 90, 91, 89, 88, 0 }, { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 },
                        { 93, 85, 83, 89, 0 },
                        { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 }, { 93, 85, 83, 89, 0 } },
                { { 99, 86, 98, 85, 0 }, { 88, 86, 86, 83, 0 }, { 99, 86, 98, 85, 0 }, { 99, 86, 98, 85, 0 },
                        { 99, 86, 98, 85, 0 },
                        { 99, 86, 98, 85, 0 }, { 99, 86, 98, 85, 0 }, { 99, 86, 98, 85, 0 } },
                { { 100, 98, 100, 89, 0 }, { 85, 83, 89, 81, 0 }, { 100, 98, 100, 89, 0 }, { 100, 98, 100, 89, 0 },
                        { 60, 60, 60, 60, 0 }, { 100, 98, 100, 89, 0 }, { 100, 98, 100, 89, 0 },
                        { 100, 98, 100, 89, 0 } },
                { { 88, 87, 89, 82, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 },
                        { 90, 82, 84, 88, 0 },
                        { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 }, { 90, 82, 84, 88, 0 } }, };

        double masterPersentase[][] = { { 0.1, 0.2, 0.3, 0.4, 2 }, { 0.2, 0.2, 0.3, 0.3, 3 },
                { 0.2, 0.1, 0.3, 0.4, 2 },
                { 0.3, 0.4, 0.1, 0.2, 2 }, { 0.1, 0.1, 0.4, 0.4, 2 }, { 0.2, 0.2, 0.3, 0.3, 2 },
                { 0.1, 0.1, 0.3, 0.5, 3 },
                { 0.2, 0.3, 0.2, 0.3, 2 } };
        double totalSks = 0;
        String grade[] = new String[9];
        double ip[] = new double[9];

        String pilih1 = "", pilih2 = "";
        System.out.println("1. Dosen\n2. Mahasiswa\n3. Mata Kuliah\n4. Nilai\n5. Keluar");
        pilih1 = scStr.nextLine();
        if (pilih1.equalsIgnoreCase("1")) {
            System.out.println(
                    "1. Tambah Dosen\n2. Kurangi Dosen\n3. Ubah Dosen\n4. Lihat Dosen\n5. Pengajar\n6. Keluar");
            pilih2 = scStr.nextLine();
            if (pilih2.equalsIgnoreCase("1")) {
                String tambahDosen[][] = new String[masterDosen.length + 1][bioDosen.length];
                for (int i = 0; i < masterDosen.length; i++) {
                    for (int j = i; j < masterDosen.length; j++) {
                        if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                            for (int j2 = 0; j2 < bioDosen.length; j2++) {
                                tempString = masterDosen[i][j2];
                                masterDosen[i][j2] = masterDosen[j][j2];
                                masterDosen[j][j2] = tempString;
                            }
                        }
                    }
                }
                for (int i = 0; i < masterDosen.length; i++) {
                    tambahDosen[i] = masterDosen[i];
                }
                for (int i = 0; i < masterDosen.length; i++) {
                    System.out.printf("|%-4s|%-5s|%-20s|\n", i + 1, biodata[0], masterDosen[i][0]);
                }
                for (int i = 0; i < bioDosen.length; i++) {
                    System.out.printf("%-22s: ", bioDosen[i]);
                    tambahDosen[masterDosen.length][i] = scStr.nextLine();
                }
                masterDosen = tambahDosen;
                for (int i = 0; i < masterDosen.length; i++) {
                    for (int j = i; j < masterDosen.length; j++) {
                        if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                            for (int j2 = 0; j2 < bioDosen.length; j2++) {
                                tempString = masterDosen[i][j2];
                                masterDosen[i][j2] = masterDosen[j][j2];
                                masterDosen[j][j2] = tempString;
                            }
                        }
                    }
                }
                for (int i = 0; i < masterDosen.length; i++) {
                    System.out.printf("|%-4s|%-5s|%-20s|\n", i + 1, biodata[0], masterDosen[i][0]);
                }
            } else if (pilih2.equalsIgnoreCase("2")) {
                if (masterDosen.length == 0) {
                    System.out.println("Dosen tidak tersedia");
                } else {
                    String kurangiDosen[][] = new String[masterDosen.length - 1][bioDosen.length];
                    for (int i = 0; i < masterDosen.length; i++) {
                        for (int j = i; j < masterDosen.length; j++) {
                            if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                                for (int j2 = 0; j2 < bioDosen.length; j2++) {
                                    tempString = masterDosen[i][j2];
                                    masterDosen[i][j2] = masterDosen[j][j2];
                                    masterDosen[j][j2] = tempString;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < masterDosen.length; i++) {
                        System.out.printf("|%-4s|%-5s|%-20s|\n", i + 1, biodata[0], masterDosen[i][0]);
                    }
                    System.out.println("Masukkan nama atau nim");
                    ambilString[0] = scStr.nextLine();
                    for (int i = 0; i < masterDosen.length; i++) {
                        if (ambilString[0].equalsIgnoreCase(masterDosen[i][0])) {
                            ambilAngka[0] = i;
                        }
                    }
                    for (int i = 0; i < bioDosen.length; i++) {
                        masterDosen[ambilAngka[0]][i] = "�";
                    }
                    for (int i = 0; i < masterDosen.length; i++) {
                        for (int j = i; j < masterDosen.length; j++) {
                            if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                                for (int j2 = 0; j2 < bioDosen.length; j2++) {
                                    tempString = masterDosen[i][j2];
                                    masterDosen[i][j2] = masterDosen[j][j2];
                                    masterDosen[j][j2] = tempString;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < kurangiDosen.length; i++) {
                        kurangiDosen[i] = masterDosen[i];
                    }
                    masterDosen = kurangiDosen;
                    for (int i = 0; i < masterDosen.length; i++) {
                        System.out.printf("|%-4s|%-5s|%-20s|\n", i + 1, biodata[0], masterDosen[i][0]);
                    }
                }
            } else if (pilih2.equalsIgnoreCase("3")) {
                if (masterDosen.length == 0) {
                    System.out.println("Dosen tidak tersedia");
                } else {
                    for (int i = 0; i < masterDosen.length; i++) {
                        for (int j = i; j < masterDosen.length; j++) {
                            if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                                for (int j2 = 0; j2 < bioDosen.length; j2++) {
                                    tempString = masterDosen[i][j2];
                                    masterDosen[i][j2] = masterDosen[j][j2];
                                    masterDosen[j][j2] = tempString;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < masterDosen.length; i++) {
                        System.out.printf("|%-4s|%-5s|%-20s|\n", i + 1, biodata[0], masterDosen[i][0]);
                    }
                    System.out.println("Masukkan nama atau nim");
                    ambilString[0] = scStr.nextLine();
                    for (int i = 0; i < masterDosen.length; i++) {
                        if (ambilString[0].equalsIgnoreCase(masterDosen[i][0])) {
                            ambilAngka[0] = i;
                        }
                    }
                    System.out.println("Masukkan : ");
                    for (int i = 0; i < bioDosen.length; i++) {
                        System.out.printf("%-22s: ", bioDosen[i]);
                        masterDosen[ambilAngka[0]][i] = scStr.nextLine();
                    }
                    for (int i = 0; i < masterDosen.length; i++) {
                        for (int j = i; j < masterDosen.length; j++) {
                            if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                                for (int j2 = 0; j2 < bioDosen.length; j2++) {
                                    tempString = masterDosen[i][j2];
                                    masterDosen[i][j2] = masterDosen[j][j2];
                                    masterDosen[j][j2] = tempString;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < masterDosen.length; i++) {
                        System.out.printf("|%-4s|%-5s|%-20s|\n", i + 1, biodata[0], masterDosen[i][0]);
                    }
                }

            } else if (pilih2.equalsIgnoreCase("4")) {
                if (masterDosen.length == 0) {
                    System.out.println("Dosen tidak tersedia");
                } else {
                    for (int i = 0; i < masterDosen.length; i++) {
                        for (int j = i; j < masterDosen.length; j++) {
                            if (masterDosen[i][0].compareToIgnoreCase(masterDosen[j][0]) > 0) {
                                for (int j2 = 0; j2 < bioDosen.length; j2++) {
                                    tempString = masterDosen[i][j2];
                                    masterDosen[i][j2] = masterDosen[j][j2];
                                    masterDosen[j][j2] = tempString;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < masterDosen.length; i++) {
                        System.out.printf("|%-4s|%-5s|%-20s|\n", i + 1, biodata[0], masterDosen[i][0]);
                    }
                }

            } else if (pilih2.equalsIgnoreCase("5")) {

            }
        } else if (pilih1.equalsIgnoreCase("2")) {
            System.out
                    .println(
                            "1. Tambah Mahasiswa\n2. Kurangi Mahasiswa\n3. Ubah Mahasiswa\n4. Lihat Mahasiswa\n5. Keluar");
            pilih2 = scStr.nextLine();
            if (pilih2.equalsIgnoreCase("1")) {
                String tambahMahasiswa[][] = new String[masterMahasiswa.length + 1][biodata.length];
                double tambahNilai[][][] = new double[masterMahasiswa.length + 1][masterMatkul.length][score.length];
                for (int i = 0; i < masterMahasiswa.length; i++) {
                    for (int j = i; j < masterMahasiswa.length; j++) {
                        if (masterMahasiswa[i][0].compareTo(masterMahasiswa[j][0]) > 0) {
                            for (int j2 = 0; j2 < biodata.length; j2++) {
                                tempString = masterMahasiswa[i][j2];
                                masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                                masterMahasiswa[j][j2] = tempString;
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
                for (int i = 0; i < masterMahasiswa.length; i++) {
                    tambahMahasiswa[i] = masterMahasiswa[i];
                    tambahNilai[i] = masterNilai[i];
                }
                for (int i = 0; i < masterMahasiswa.length; i++) {
                    System.out.printf("|%-4s|%-5s|%-15s|\n", i + 1, biodata[0], masterMahasiswa[i][0]);
                }
                System.out.println("Masukkan : ");
                for (int i = 0; i < biodata.length; i++) {
                    System.out.printf("%-22s: ", biodata[i]);
                    tambahMahasiswa[masterMahasiswa.length][i] = scStr.nextLine();
                }
                masterMahasiswa = tambahMahasiswa;
                masterNilai = tambahNilai;
                for (int i = 0; i < masterMahasiswa.length; i++) {
                    for (int j = i; j < masterMahasiswa.length; j++) {
                        if (masterMahasiswa[i][0].compareTo(masterMahasiswa[j][0]) > 0) {
                            for (int j2 = 0; j2 < biodata.length; j2++) {
                                tempString = masterMahasiswa[i][j2];
                                masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                                masterMahasiswa[j][j2] = tempString;
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
                for (int i = 0; i < masterMahasiswa.length; i++) {
                    System.out.printf("|%-4s|%-5s|%-15s|\n", i + 1, biodata[0], masterMahasiswa[i][0]);
                }
            } else if (pilih2.equalsIgnoreCase("2")) {
                while (kondisi) {
                    if (masterMahasiswa.length == 0) {
                        System.out.println("Mahasiswa tidak tersedia");
                        kondisi = false;
                    } else {
                        String kurangMahasiswa[][] = new String[masterMahasiswa.length - 1][biodata.length];
                        double kurangNilai[][][] = new double[masterMahasiswa.length
                                - 1][masterMatkul.length][score.length];
                        for (int i = 0; i < masterMahasiswa.length; i++) {
                            for (int j = i; j < masterMahasiswa.length; j++) {
                                if (masterMahasiswa[i][0].compareToIgnoreCase(masterMahasiswa[j][0]) > 0) {
                                    for (int j2 = 0; j2 < biodata.length; j2++) {
                                        tempString = masterMahasiswa[i][j2];
                                        masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                                        masterMahasiswa[j][j2] = tempString;
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
                        for (int i = 0; i < masterMahasiswa.length; i++) {
                            System.out.printf("|%-4s|%-5s|%-15s|%-5s|%-15s|\n", i + 1, biodata[0],
                                    masterMahasiswa[i][0],
                                    biodata[4], masterMahasiswa[i][4]);
                        }
                        System.out.println("Masukkan nama atau nim");
                        ambilString[0] = scStr.nextLine();
                        for (int i = 0; i < masterMahasiswa.length; i++) {
                            if (ambilString[0].equalsIgnoreCase(masterMahasiswa[i][0])
                                    || ambilString[0].equalsIgnoreCase(masterMahasiswa[i][4])) {
                                ambilAngka[0] = i;
                            }
                        }
                        for (int i = 0; i < biodata.length; i++) {
                            masterMahasiswa[ambilAngka[0]][i] = "�";
                        }
                        for (int i = 0; i < masterMahasiswa.length; i++) {
                            for (int j = i; j < masterMahasiswa.length; j++) {
                                if (masterMahasiswa[i][0].compareToIgnoreCase(masterMahasiswa[j][0]) > 0) {
                                    for (int j2 = 0; j2 < biodata.length; j2++) {
                                        tempString = masterMahasiswa[i][j2];
                                        masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                                        masterMahasiswa[j][j2] = tempString;
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
                        for (int i = 0; i < kurangMahasiswa.length; i++) {
                            kurangMahasiswa[i] = masterMahasiswa[i];
                            kurangNilai[i] = masterNilai[i];
                        }
                        masterMahasiswa = kurangMahasiswa;
                        masterNilai = kurangNilai;
                        for (int i = 0; i < masterMahasiswa.length; i++) {
                            System.out.printf("|%-4s|%-5s|%-15s|\n", i + 1, biodata[0], masterMahasiswa[i][0]);
                        }
                    }
                }

            } else if (pilih2.equalsIgnoreCase("3")) {
                if (masterMahasiswa.length == 0) {
                    System.out.println("Mahasiswa tidak tersedia");
                } else {
                    for (int i = 0; i < masterMahasiswa.length; i++) {
                        for (int j = i; j < masterMahasiswa.length; j++) {
                            if (masterMahasiswa[i][0].compareTo(masterMahasiswa[j][0]) > 0) {
                                for (int j2 = 0; j2 < biodata.length; j2++) {
                                    tempString = masterMahasiswa[i][j2];
                                    masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                                    masterMahasiswa[j][j2] = tempString;
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
                    for (int i = 0; i < masterMahasiswa.length; i++) {
                        System.out.printf("|%-4s|%-5s|%-15s|%-5s|%-15s|\n", i + 1, biodata[0], masterMahasiswa[i][0],
                                biodata[4], masterMahasiswa[i][4]);
                    }
                    System.out.println("Masukkan nama atau nim");
                    ambilString[0] = scStr.nextLine();
                    for (int i = 0; i < masterMahasiswa.length; i++) {
                        if (ambilString[0].equalsIgnoreCase(masterMahasiswa[i][0])
                                || ambilString[0].equalsIgnoreCase(masterMahasiswa[i][4])) {
                            ambilAngka[0] = i;
                        }
                    }
                    System.out.println("Masukkan : ");
                    for (int i = 0; i < biodata.length; i++) {
                        System.out.printf("%-22s: ", biodata[i]);
                        masterMahasiswa[ambilAngka[0]][i] = scStr.nextLine();
                    }
                    for (int i = 0; i < masterMatkul.length; i++) {
                        for (int j = 0; j < score.length; j++) {
                            masterNilai[ambilAngka[0]][i][j] = 0;
                        }
                    }
                }
                for (int i = 0; i < masterMahasiswa.length; i++) {
                    for (int j = i; j < masterMahasiswa.length; j++) {
                        if (masterMahasiswa[i][0].compareTo(masterMahasiswa[j][0]) > 0) {
                            for (int j2 = 0; j2 < biodata.length; j2++) {
                                tempString = masterMahasiswa[i][j2];
                                masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                                masterMahasiswa[j][j2] = tempString;
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
                for (int i = 0; i < masterMahasiswa.length; i++) {
                    System.out.printf("|%-4s|%-5s|%-15s|\n", i + 1, biodata[0], masterMahasiswa[i][0]);
                }
            } else if (pilih2.equalsIgnoreCase("4")) {
                if (masterMahasiswa.length == 0) {
                    System.out.println("Mahasiswa tidak tersedia");
                } else {
                    for (int i = 0; i < masterMahasiswa.length; i++) {
                        for (int j = i; j < masterMahasiswa.length; j++) {
                            if (masterMahasiswa[i][0].compareTo(masterMahasiswa[j][0]) > 0) {
                                for (int j2 = 0; j2 < biodata.length; j2++) {
                                    tempString = masterMahasiswa[i][j2];
                                    masterMahasiswa[i][j2] = masterMahasiswa[j][j2];
                                    masterMahasiswa[j][j2] = tempString;
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
                    for (int i = 0; i < masterMahasiswa.length; i++) {
                        System.out.printf("|%-4s|%-5s|%-15s|%-5s|%-15s|\n", i + 1, biodata[0], masterMahasiswa[i][0],
                                biodata[4], masterMahasiswa[i][4]);
                    }
                }
            }
        } else if (pilih1.equalsIgnoreCase("3")) {
            System.out
                    .println(
                            "1. Tambah Mata Kuliah\n2. Kurangi Mata Kuliah\n3. Ubah Mata Kuliah\n4. Lihat Mata Kuliah\n5. Keluar");
            pilih2 = scStr.nextLine();
            if (pilih2.equalsIgnoreCase("1")) {
                String tambahMatkul[] = new String[masterMatkul.length + 1];
                double tambahPersentase[][] = new double[masterMatkul.length + 1][scorePersentase.length];
                double tambahNilai[][][] = new double[masterMahasiswa.length][masterMatkul.length+1][score.length];
                for (int i = 0; i < masterMatkul.length; i++) {
                    for (int j = i; j < masterMatkul.length; j++) {
                        if (masterMatkul[i].compareToIgnoreCase(masterMatkul[j]) > 0) {
                            tempString = masterMatkul[i];
                            masterMatkul[i] = masterMatkul[j];
                            masterMatkul[j] = tempString;

                            for (int j2 = 0; j2 < scorePersentase.length; j2++) {
                                tempDouble = masterPersentase[i][j2];
                                masterPersentase[i][j2] = masterPersentase[j][j2];
                                masterPersentase[j][j2] = tempDouble;
                            }
                        }
                    }
                }
                for (int i = 0; i < masterMatkul.length; i++) {
                    tambahMatkul[i] = masterMatkul[i];
                }
                for (int i = 0; i < masterMatkul.length; i++) {
                    System.out.printf("|%-4s|Mata Kuliah|%-40s|\n", i + 1, masterMatkul[i]);
                }
                System.out.print("Masukkan :\nMata Kuliah : ");
                tambahMatkul[masterMatkul.length] = scStr.nextLine();
                for (int i = 0; i < scorePersentase.length; i++) {
                    System.out.printf("Persentase %-5s %-40s : ", scorePersentase[i],
                            tambahMatkul[masterMatkul.length]);
                    tambahPersentase[masterMatkul.length][i] = scDbl.nextDouble();
                }
                masterMatkul = tambahMatkul;
                for (int i = 0; i < masterMatkul.length; i++) {
                    for (int j = i; j < masterMatkul.length; j++) {
                        if (masterMatkul[i].compareToIgnoreCase(masterMatkul[j]) > 0) {
                            tempString = masterMatkul[i];
                            masterMatkul[i] = masterMatkul[j];
                            masterMatkul[j] = tempString;
                        }
                    }
                }
                for (int i = 0; i < masterMatkul.length; i++) {
                    System.out.printf("|%-4s|Mata Kuliah|%-40s|\n", i + 1, masterMatkul[i]);
                }
            } else if (pilih2.equalsIgnoreCase("2")) {

            } else if (pilih2.equalsIgnoreCase("3")) {

            } else if (pilih2.equalsIgnoreCase("4")) {

            }
        } else if (pilih1.equalsIgnoreCase("4")) {
            System.out.println("1. Input Nilai\n2. Lihat Nilai\n3. Lihat Ranking\n4. Keluar");
            pilih2 = scStr.nextLine();
            if (pilih2.equalsIgnoreCase("1")) {

            } else if (pilih2.equalsIgnoreCase("2")) {

            } else if (pilih2.equalsIgnoreCase("3")) {

            }
        } else if (pilih1.equalsIgnoreCase("4")) {
            System.out.println("terimakasih");
        }
    }
}
