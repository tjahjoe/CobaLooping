package WRI;

import java.util.Scanner;

public class ag {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);

        float tgBing1, tgCtps, tgDaspro, tgK3, tgKti, tgMatDas, tgPancasila, tgPrakDaspro;
        float qzBing1, qzCtps, qzDaspro, qzK3, qzKti, qzMatDas, qzPancasila, qzPrakDaspro;
        float utsBing1, utsCtps, utsDaspro, utsK3, utsKti, utsMatDas, utsPancasila, utsPrakDaspro;
        float uasBing1, uasCtps, uasDaspro, uasK3, uasKti, uasMatDas, uasPancasila, uasPrakDaspro;
        float nlAkhirBing1 = 0, nlAkhirCtps = 0, nlAkhirDaspro = 0, nlAkhirK3 = 0, nlAkhirKti = 0, nlAkhirMatDas = 0,
                nlAkhirPancasila = 0, nlAkhirPrakDaspro = 0;
        float t = 0.2f, qz = 0.2f, ut = 0.3f, ua = 0.3f, ips;
        int pNl, d;// pNlBing1, pNlCtps, pNlDaspro, pNlK3, pNlKti, PNlMatDas, pNlPancasila,
                   // pNlPrakDaspro;
        // int bBing1, bCtps, bDaspro, bK3, bKti, bMatDas, bPancasila, bPrakDaspro;
        do {
            System.out.println(
                    "1. Bahasa Inggris 1\n2. Critical Thingking and Problem Solving\n3. Dasar Pemrograman\n4. Keselamatan kesehatan Kerja\n5. Konsep Teknologi Informasi\n6. Matematika Dasar\n7. Pacasila\n8. Praktikum Dasar Pemrograman\n9. IPS");
            System.out.println("Masukkan Angka : ");
            pNl = nilai.nextInt();
            switch (pNl) {
                case 1:
                for (int i = 0; i < 5; i++) {
                    if (i == 0 || i == 4) {
                        for (int a = 0; a < 65; a++) {
                            System.out.print("=");
                        }
                    } else if (i == 2) {
                        for (int b = 0; b < 50; b++) {
                            if (b == 0 || b == 49) {
                                System.out.print("|");
                            } else if (b == 26) {
                                System.out.print("BAHASA INGGRIS 1");
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
                    System.out.print("Masukkan nilai rata-rata Tugas Bahasa Inggris 1 : ");
                    tgBing1 = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ Bahasa Inggris 1 : ");
                    qzBing1 = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS Bahasa Inggris 1 : ");
                    utsBing1 = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS Bahasa Inggris 1 : ");
                    uasBing1 = nilai.nextFloat();

                    nlAkhirBing1 = (tgBing1 * t) + (qzBing1 * qz) + (utsBing1 * ut) + (uasBing1 * ua);

                    System.out.printf("Nilai Akhir Bahasa Inggris : %.2f", nlAkhirBing1);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Critical Thinking and Problem Solving");
                    System.out.print("Masukkan nilai rata-rata Tugas CTPS : ");
                    tgCtps = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ CTPS : ");
                    qzCtps = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS CTPS : ");
                    uasCtps = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS CTPS : ");
                    utsCtps = nilai.nextFloat();

                    nlAkhirCtps = (tgCtps * t) + (qzCtps * qz) + (utsCtps * ut) + (uasCtps * ua);

                    System.out.printf("Nilai Akhir Critical Thinking and Problem Solving : %.2f", nlAkhirCtps);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("Dasar Pemrograman");
                    System.out.print("Masukkan nilai rata-rata Tugas Daspro : ");
                    tgDaspro = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ Daspro : ");
                    qzDaspro = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS Daspro : ");
                    utsDaspro = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS Daspro : ");
                    uasDaspro = nilai.nextFloat();

                    nlAkhirDaspro = (tgDaspro * t) + (qzDaspro * qz) + (utsDaspro * ut) + (uasDaspro * ua);

                    System.out.printf("Nilai Akhir Dasar Pemrograman : %.2f", nlAkhirDaspro);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("Keselamatan Kesehatan Kerja");
                    System.out.print("Masukkan nilai rata-rata K3 : ");
                    tgK3 = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ K3 : ");
                    qzK3 = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS K3 : ");
                    utsK3 = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS K3 : ");
                    uasK3 = nilai.nextFloat();

                    nlAkhirK3 = (tgK3 * t) + (qzK3 * qz) + (utsK3 * ut) + (uasK3 * ua);

                    System.out.printf("Nilai Akhir Keselamatan Kesehatan Kerja : %.2f", nlAkhirK3);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                    break;
                case 5:
                    System.out.println("Konsep Teknologi Informasi");
                    System.out.print("Masukkan nilai rata-rata KTI : ");
                    tgKti = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ KTI : ");
                    qzKti = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS KTI : ");
                    utsKti = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS KTI : ");
                    uasKti = nilai.nextFloat();

                    nlAkhirKti = (tgKti * t) + (qzKti * qz) + (utsKti * ut) + (uasKti * ua);

                    System.out.printf("Nila Akhir Konsep Teknologi Informasi : %.2f", nlAkhirKti);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                    break;
                case 6:
                    System.out.println("Matematika Dasar");
                    System.out.print("Masukkan nilai rata-rata Tugas Matdas : ");
                    tgMatDas = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ Matdas : ");
                    qzMatDas = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS Matdas : ");
                    utsMatDas = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS Matdas : ");
                    uasMatDas = nilai.nextFloat();

                    nlAkhirMatDas = (tgMatDas * t) + (qzMatDas * qz) + (utsMatDas * ut) + (uasMatDas * ua);

                    System.out.printf("Nilai Akhir Matematika Dasar : %.2f", nlAkhirMatDas);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                    break;
                case 7:
                    System.out.println("Pancasila");
                    System.out.print("Masukkan nilai rata-rata Pancasila : ");
                    tgPancasila = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ Pancasila : ");
                    qzPancasila = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS Pancasila : ");
                    utsPancasila = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS pancasila : ");
                    uasPancasila = nilai.nextFloat();

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
                    tgPrakDaspro = nilai.nextFloat();
                    System.out.print("Masukkan nilai QUIZ PrakDaspro : ");
                    qzPrakDaspro = nilai.nextFloat();
                    System.out.print("Masukkan nilai UTS PrakDaspro : ");
                    utsPrakDaspro = nilai.nextFloat();
                    System.out.print("Masukkan nilai UAS PrakDaspro : ");
                    uasPrakDaspro = nilai.nextFloat();

                    nlAkhirPrakDaspro = (tgPrakDaspro * t) + (qzPrakDaspro * qz) + (utsPrakDaspro * ut)
                            + (uasPrakDaspro * ua);

                    System.out.printf("Nilai Akhir Praktikum Dasar Pemrograman : %.2f", nlAkhirPrakDaspro);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                    break;
                case 9:
                    System.out.println("Indeks Prestasi Semester");
                    ips = (nlAkhirBing1 + nlAkhirCtps + nlAkhirDaspro + nlAkhirK3 + nlAkhirKti + nlAkhirMatDas
                            + nlAkhirPancasila + nlAkhirPrakDaspro) / 20;
                    System.out.printf("Indek Prestasi Semester : %.2f", ips);
                    for (d = 0; d < 5; d++) {
                        System.out.println(" ");
                    }
                default:
                    break;
            }
        } while (nlAkhirBing1 >= 0 && nlAkhirCtps >= 0 && nlAkhirDaspro >= 0 && nlAkhirK3 >= 0 && nlAkhirKti >= 0
                && nlAkhirMatDas >= 0 && nlAkhirPancasila >= 0 && nlAkhirPrakDaspro >= 0);
    }

}
