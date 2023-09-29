import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner scflt = new Scanner(System.in);
        float tgBing1, tgCtps, tgDaspro, tgK3, tgKti, tgMatDas, tgPancasila, tgPrakDaspro;
        float qzBing1, qzCtps, qzDaspro, qzK3, qzKti, qzMatDas, qzPancasila, qzPrakDaspro;
        float utsBing1, utsCtps, utsDaspro, utsK3, utsKti, utsMatDas, utsPancasila, utsPrakDaspro;
        float uasBing1, uasCtps, uasDaspro, uasK3, uasKti, uasMatDas, uasPancasila, uasPrakDaspro;
        float nlAkhirBing1 = 0, nlAkhirCtps = 0, nlAkhirDaspro = 0, nlAkhirK3 = 0, nlAkhirKti = 0, nlAkhirMatDas = 0,
                nlAkhirPancasila = 0, nlAkhirPrakDaspro = 0;
        float t = 0.2f, qz = 0.2f, ut = 0.3f, ua = 0.3f, ips;
        int pNl = scflt.nextInt();
        switch (pNl) {
            case 1:
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
                break;
            case 2:
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
                break;
            case 3:
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
                break;
            case 9:
                System.out.println("Indeks Prestasi Semester");
                ips = (nlAkhirBing1 + nlAkhirCtps + nlAkhirDaspro + nlAkhirK3 + nlAkhirKti
                        + nlAkhirMatDas
                        + nlAkhirPancasila + nlAkhirPrakDaspro) / 20;
                System.out.printf("Indek Prestasi Semester : %.2f", ips);
            default:
                break;
        }
    }
}
