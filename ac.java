import java.util.Scanner;

public class ac {
    public static void main(String[] args) {

        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scDb = new Scanner(System.in);
        Scanner scflt = new Scanner(System.in);

        float tgBing1, tgCtps, tgDaspro, tgK3, tgKti, tgMatDas, tgPancasila, tgPrakDaspro;
        float qzBing1, qzCtps, qzDaspro, qzK3, qzKti, qzMatDas, qzPancasila, qzPrakDaspro;
        float utsBing1, utsCtps, utsDaspro, utsK3, utsKti, utsMatDas, utsPancasila, utsPrakDaspro;
        float uasBing1, uasCtps, uasDaspro, uasK3, uasKti, uasMatDas, uasPancasila, uasPrakDaspro;
        float nlAkhirBing1 = 0, nlAkhirCtps = 0, nlAkhirDaspro = 0, nlAkhirK3 = 0, nlAkhirKti = 0, nlAkhirMatDas = 0,
                nlAkhirPancasila = 0, nlAkhirPrakDaspro = 0;
        float t = 0.2f, qz = 0.2f, ut = 0.3f, ua = 0.3f, ips;
        int pNl, d;
        String back = "y";

        // SELAMAT DATANG
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                for (int a = 0; a < 65; a++) {
                    System.out.print("=");
                }
            } else if (i == 2) {
                for (int b = 0; b < 52; b++) {
                    if (b == 0 || b == 51) {
                        System.out.print("|");
                    } else if (b == 26) {
                        System.out.print("SELAMAT DATANG");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int c = 0; c < 65; c++) {
                    if (c == 0 || c == 64) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        // LOGIN
        System.out.print("MASUKKAN USERNAME : ");
        String userName = scInt.nextLine();
        System.out.print("MASUKKAN PASSWORD : ");
        String password = scInt.nextLine();
        String pilih2 = "";

        // PERCABANGAN 1
        if (userName.equalsIgnoreCase("Wahyu Rizky Cahyana") && password.equalsIgnoreCase("123456789")) {

            // PEMBATAS 1
            for (d = 0; d < 5; d++) {
                System.out.println(" ");
            }

            // BERANDA
            for (int e = 0; e < 23; e++) {
                if (e == 0 || e == 4 || e == 10 || e == 16 || e == 22) {
                    for (int f = 0; f < 65; f++) {
                        System.out.print("=");
                    }
                } else if (e == 2) {
                    for (int b = 0; b < 61; b++) {
                        if (b == 0 || b == 58) {
                            System.out.print("|");
                        } else if (b == 29) {
                            System.out.print("BERANDA");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else if (e == 1 || e == 3) {
                    for (int b = 0; b < 65; b++) {
                        if (b == 0 || b == 64) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else if (e == 7) {
                    for (int b = 0; b < 60; b++) {
                        if (b == 0 || b == 6 || b == 25 || b == 27 || b == 33 || b == 53) {
                            System.out.print("|");
                        } else if (b == 3) {
                            System.out.print("1");
                        } else if (b == 8) {
                            System.out.print("BIODATA");
                        } else if (b == 30) {
                            System.out.print("4");
                        } else if (b == 35) {
                            System.out.print("MATKUL");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else if (e == 13) {
                    for (int b = 0; b < 60; b++) {
                        if (b == 0 || b == 6 || b == 24 || b == 26 || b == 32 || b == 53) {
                            System.out.print("|");
                        } else if (b == 3) {
                            System.out.print("2");
                        } else if (b == 8) {
                            System.out.print("PRESENSI");
                        } else if (b == 29) {
                            System.out.print("5");
                        } else if (b == 34) {
                            System.out.print("NILAI");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else if (e == 19) {
                    for (int b = 0; b < 64; b++) {
                        if (b == 0 || b == 6 || b == 29 || b == 31 || b == 37 || b == 60) {
                            System.out.print("|");
                        } else if (b == 3) {
                            System.out.print("3");
                        } else if (b == 8) {
                            System.out.print("KRS");
                        } else if (b == 34) {
                            System.out.print("6");
                        } else if (b == 39) {
                            System.out.print("UKT");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    for (int g = 0; g < 65; g++) {
                        if (g == 0 || g == 6 || g == 31 || g == 33 || g == 39 || g == 64) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            }
            System.out.print("MASSUKKAN ANGKA : ");
            int pilihan1 = scInt.nextInt();

            switch (pilihan1) {

                // biodata
                case 1:
                    // tabel biodata
                    for (int e = 0; e < 17; e++) {
                        if (e == 0 || e == 4 || e == 10 || e == 16 || e == 22) {
                            for (int f = 0; f < 65; f++) {
                                System.out.print("=");
                            }
                        } else if (e == 2) {
                            for (int b = 0; b < 61; b++) {
                                if (b == 0 || b == 58) {
                                    System.out.print("|");
                                } else if (b == 29) {
                                    System.out.print("BIODATA");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 1 || e == 3) {
                            for (int b = 0; b < 65; b++) {
                                if (b == 0 || b == 64) {
                                    System.out.print("|");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 7) {
                            for (int b = 0; b < 60; b++) {
                                if (b == 0 || b == 6 || b == 16 || b == 18 || b == 24 || b == 37) {
                                    System.out.print("|");
                                } else if (b == 3) {
                                    System.out.print("1");
                                } else if (b == 8) {
                                    System.out.print("MASUKKAN BIODATA");
                                } else if (b == 21) {
                                    System.out.print("2");
                                } else if (b == 26) {
                                    System.out.print("LIHAT BIODATA");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 13) {
                            for (int b = 0; b < 60; b++) {
                                if (b == 0 || b == 6 || b == 59) {
                                    System.out.print("|");
                                } else if (b == 3) {
                                    System.out.print("3");
                                } else if (b == 29) {
                                    System.out.print("KELUAR");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 11 || e == 12 || e == 14 || e == 15) {
                            for (int b = 0; b < 65; b++) {
                                if (b == 0 || b == 6 || b == 64) {
                                    System.out.print("|");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else {
                            for (int g = 0; g < 65; g++) {
                                if (g == 0 || g == 6 || g == 31 || g == 33 || g == 39 || g == 64) {
                                    System.out.print("|");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println("");
                    }
                    System.out.print("MASUKKAN ANGKA : ");
                    int pilihBdt = scInt.nextInt();
                    switch (pilihBdt) {
                        case 1:
                            System.out.println("MASUKKAN BIODATA");
                            break;
                        case 2:
                            System.out.println("LIHAT BIODATA");
                            break;
                        case 3:
                            System.out.println("KEMBALI");
                            break;
                    }
                    break;

                // presensi
                case 2:
                    System.out.println("PRESENSI");
                    break;
                case 3:
                    System.out.println("KRS");
                    break;
                case 4:
                    System.out.println("MATKUL");
                    break;
                // nilai
                case 5:
                    // tabel nilai
                    for (int e = 0; e < 17; e++) {
                        if (e == 0 || e == 4 || e == 10 || e == 16 || e == 22) {
                            for (int f = 0; f < 65; f++) {
                                System.out.print("=");
                            }
                        } else if (e == 2) {
                            for (int b = 0; b < 61; b++) {
                                if (b == 0 || b == 58) {
                                    System.out.print("|");
                                } else if (b == 29) {
                                    System.out.print("BIODATA");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 1 || e == 3) {
                            for (int b = 0; b < 65; b++) {
                                if (b == 0 || b == 64) {
                                    System.out.print("|");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 7) {
                            for (int b = 0; b < 60; b++) {
                                if (b == 0 || b == 6 || b == 18 || b == 20 || b == 26 || b == 41) {
                                    System.out.print("|");
                                } else if (b == 3) {
                                    System.out.print("1");
                                } else if (b == 8) {
                                    System.out.print("MASUKKAN NILAI");
                                } else if (b == 23) {
                                    System.out.print("2");
                                } else if (b == 28) {
                                    System.out.print("LIHAT NILAI");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 13) {
                            for (int b = 0; b < 60; b++) {
                                if (b == 0 || b == 6 || b == 59) {
                                    System.out.print("|");
                                } else if (b == 3) {
                                    System.out.print("3");
                                } else if (b == 29) {
                                    System.out.print("KELUAR");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else if (e == 11 || e == 12 || e == 14 || e == 15) {
                            for (int b = 0; b < 65; b++) {
                                if (b == 0 || b == 6 || b == 64) {
                                    System.out.print("|");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        } else {
                            for (int g = 0; g < 65; g++) {
                                if (g == 0 || g == 6 || g == 31 || g == 33 || g == 39 || g == 64) {
                                    System.out.print("|");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println("");
                    }
                    System.out.print("MASUKKAN ANGKA : ");
                    int pilihNl = scInt.nextInt();
                    switch (pilihNl) {
                        case 1:
                            System.out.println("MASUKKAN NILAI");
                            do {
                                System.out.println(
                                        "1. Bahasa Inggris 1\n2. Critical Thingking and Problem Solving\n3. Dasar Pemrograman\n4. Keselamatan kesehatan Kerja\n5. Konsep Teknologi Informasi\n6. Matematika Dasar\n7. Pacasila\n8. Praktikum Dasar Pemrograman\n9. IPS");
                                System.out.println("Masukkan Angka : ");
                                pNl = scflt.nextInt();
                                switch (pNl) {
                                    case 1:
                                        System.out.println("Bahasa Inggris 1");
                                        System.out.print("Masukkan nilai rata-rata Tugas Bahasa Inggris 1 : ");
                                        tgBing1 = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ Bahasa Inggris 1 : ");
                                        qzBing1 = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS Bahasa Inggris 1 : ");
                                        utsBing1 = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS Bahasa Inggris 1 : ");
                                        uasBing1 = scflt.nextFloat();

                                        nlAkhirBing1 = (tgBing1 * t) + (qzBing1 * qz) + (utsBing1 * ut)
                                                + (uasBing1 * ua);

                                        System.out.printf("Nilai Akhir Bahasa Inggris : %.2f", nlAkhirBing1);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Critical Thinking and Problem Solving");
                                        System.out.print("Masukkan nilai rata-rata Tugas CTPS : ");
                                        tgCtps = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ CTPS : ");
                                        qzCtps = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS CTPS : ");
                                        uasCtps = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS CTPS : ");
                                        utsCtps = scflt.nextFloat();

                                        nlAkhirCtps = (tgCtps * t) + (qzCtps * qz) + (utsCtps * ut) + (uasCtps * ua);

                                        System.out.printf("Nilai Akhir Critical Thinking and Problem Solving : %.2f",
                                                nlAkhirCtps);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Dasar Pemrograman");
                                        System.out.print("Masukkan nilai rata-rata Tugas Daspro : ");
                                        tgDaspro = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ Daspro : ");
                                        qzDaspro = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS Daspro : ");
                                        utsDaspro = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS Daspro : ");
                                        uasDaspro = scflt.nextFloat();

                                        nlAkhirDaspro = (tgDaspro * t) + (qzDaspro * qz) + (utsDaspro * ut)
                                                + (uasDaspro * ua);

                                        System.out.printf("Nilai Akhir Dasar Pemrograman : %.2f", nlAkhirDaspro);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Keselamatan Kesehatan Kerja");
                                        System.out.print("Masukkan nilai rata-rata K3 : ");
                                        tgK3 = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ K3 : ");
                                        qzK3 = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS K3 : ");
                                        utsK3 = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS K3 : ");
                                        uasK3 = scflt.nextFloat();

                                        nlAkhirK3 = (tgK3 * t) + (qzK3 * qz) + (utsK3 * ut) + (uasK3 * ua);

                                        System.out.printf("Nilai Akhir Keselamatan Kesehatan Kerja : %.2f", nlAkhirK3);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Konsep Teknologi Informasi");
                                        System.out.print("Masukkan nilai rata-rata KTI : ");
                                        tgKti = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ KTI : ");
                                        qzKti = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS KTI : ");
                                        utsKti = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS KTI : ");
                                        uasKti = scflt.nextFloat();

                                        nlAkhirKti = (tgKti * t) + (qzKti * qz) + (utsKti * ut) + (uasKti * ua);

                                        System.out.printf("Nila Akhir Konsep Teknologi Informasi : %.2f", nlAkhirKti);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 6:
                                        System.out.println("Matematika Dasar");
                                        System.out.print("Masukkan nilai rata-rata Tugas Matdas : ");
                                        tgMatDas = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ Matdas : ");
                                        qzMatDas = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS Matdas : ");
                                        utsMatDas = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS Matdas : ");
                                        uasMatDas = scflt.nextFloat();

                                        nlAkhirMatDas = (tgMatDas * t) + (qzMatDas * qz) + (utsMatDas * ut)
                                                + (uasMatDas * ua);

                                        System.out.printf("Nilai Akhir Matematika Dasar : %.2f", nlAkhirMatDas);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 7:
                                        System.out.println("Pancasila");
                                        System.out.print("Masukkan nilai rata-rata Pancasila : ");
                                        tgPancasila = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ Pancasila : ");
                                        qzPancasila = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS Pancasila : ");
                                        utsPancasila = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS pancasila : ");
                                        uasPancasila = scflt.nextFloat();

                                        nlAkhirPancasila = (tgPancasila * t) + (qzPancasila * qz) + (utsPancasila * ut)
                                                + (uasPancasila * ua);

                                        System.out.printf("Nilai Akhir Pancasila : %.2f", nlAkhirPancasila);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 8:
                                        System.out.print("Praktikum Dasar Pemrograman");
                                        System.out.print("Masukkan nilai rata-rata PrakDaspro : ");
                                        tgPrakDaspro = scflt.nextFloat();
                                        System.out.print("Masukkan nilai QUIZ PrakDaspro : ");
                                        qzPrakDaspro = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UTS PrakDaspro : ");
                                        utsPrakDaspro = scflt.nextFloat();
                                        System.out.print("Masukkan nilai UAS PrakDaspro : ");
                                        uasPrakDaspro = scflt.nextFloat();

                                        nlAkhirPrakDaspro = (tgPrakDaspro * t) + (qzPrakDaspro * qz)
                                                + (utsPrakDaspro * ut)
                                                + (uasPrakDaspro * ua);

                                        System.out.printf("Nilai Akhir Praktikum Dasar Pemrograman : %.2f",
                                                nlAkhirPrakDaspro);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        break;
                                    case 9:
                                        System.out.println("Indeks Prestasi Semester");
                                        ips = (nlAkhirBing1 + nlAkhirCtps + nlAkhirDaspro + nlAkhirK3 + nlAkhirKti
                                                + nlAkhirMatDas
                                                + nlAkhirPancasila + nlAkhirPrakDaspro) / 20;
                                        System.out.printf("Indek Prestasi Semester : %.2f", ips);
                                        for (d = 0; d < 5; d++) {
                                            System.out.println(" ");
                                        }
                                        System.out.println("ketik Y jika ingin kembali");
                                        back = scStr.nextLine();
                                    default:
                                        break;
                                }
                            } while (nlAkhirBing1 >= 0 && nlAkhirCtps >= 0 && nlAkhirDaspro >= 0 && nlAkhirK3 >= 0
                                    && nlAkhirKti >= 0
                                    && nlAkhirMatDas >= 0 && nlAkhirPancasila >= 0 && nlAkhirPrakDaspro >= 0 && back.equalsIgnoreCase("y"));
                            break;
                        case 2:
                            System.out.println("LIHAT NILAI");
                            break;
                        case 3:
                            System.out.println("KEMBALI");
                    }
                    break;
                case 6:
                    System.out.println("UKT");
                    break;
                default:
                    break;
            }
        } else {
        }

        if (!userName.equalsIgnoreCase("Wahyu Rizky Cahyana")) {
            System.out.println("username salah");
        } else {
        }

        if (!password.equalsIgnoreCase("123456789")) {
            System.out.println("password salah");
        } else {
        }
    }

}
