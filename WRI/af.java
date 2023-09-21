package WRI;

import java.util.Scanner;

public class af {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);

        float tgBing1, tgCtps, tgDaspro, tgK3, tgKti, tgMatDas, tgPancasila, tgPrakDaspro;
        float qzBing1, qzCtps, qzDaspro, qzK3, qzKti, qzMatDas, qzPancasila, qzPrakDaspro;
        float utsBing1, utsCtps, utsDaspro, utsK3, utsKti, utsMatDas, utsPancasila, utsPrakDaspro;
        float uasBing1, uasCtps, uasDaspro, uasK3, uasKti, uasMatDas, uasPancasila, uasPrakDaspro;
        float nlAkhirBing1, nlAkhirCtps, nlAkhirDaspro, nlAkhirK3, nlAkhirKti, nlAkhirMatDas, nlAkhirPancasila,
                nlAkhirPrakDaspro;
        float t = 0.2f, qz = 0.2f, ut = 0.3f, ua = 0.3f, ips;

        System.out.println("Masukkan nilai rata-rata Tugas Bahasa Inggris 1");
        tgBing1 = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ Bahasa Inggris 1");
        qzBing1 = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS Bahasa Inggris 1");
        utsBing1 = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS Bahasa Inggris 1");
        uasBing1 = nilai.nextFloat();
        System.out.println("Masukkan nilai rata-rata Tugas CTPS");
        tgCtps = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ CTPS");
        qzCtps = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS CTPS");
        uasCtps = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS CTPS");
        utsCtps = nilai.nextFloat();
        System.out.println("Masukkan nilai rata-rata Tugas Daspro");
        tgDaspro = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ Daspro");
        qzDaspro = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS Daspro");
        utsDaspro = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS Daspro");
        uasDaspro = nilai.nextFloat();
        System.out.println("Masukkan nilai rata-rata K3");
        tgK3 = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ K3");
        qzK3 = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS K3");
        utsK3 = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS K3");
        uasK3 = nilai.nextFloat();
        System.out.println("Masukkan nilai rata-rata KTI");
        tgKti = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ KTI");
        qzKti = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS KTI");
        utsKti = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS KTI");
        uasKti = nilai.nextFloat();
        System.out.println("Masukkan nilai rata-rata Tugas Matdas");
        tgMatDas = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ Matdas");
        qzMatDas = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS Matdas");
        utsMatDas = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS Matdas");
        uasMatDas = nilai.nextFloat();
        System.out.println("Masukkan nilai rata-rata Pancasila");
        tgPancasila = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ Pancasila");
        qzPancasila = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS Pancasila");
        utsPancasila = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS pancasila");
        uasPancasila = nilai.nextFloat();
        System.out.println("Masukkan nilai rata-rata PrakDaspro");
        tgPrakDaspro = nilai.nextFloat();
        System.out.println("Masukkan nilai QUIZ PrakDaspro");
        qzPrakDaspro = nilai.nextFloat();
        System.out.println("Masukkan nilai UTS PrakDaspro");
        utsPrakDaspro = nilai.nextFloat();
        System.out.println("Masukkan nilai UAS PrakDaspro");
        uasPrakDaspro = nilai.nextFloat();

        nlAkhirBing1 = (tgBing1 * t) + (qzBing1 * qz) + (utsBing1 * ut) + (uasBing1 * ua);
        nlAkhirCtps = (tgCtps * t) + (qzCtps * qz) + (utsCtps * ut) + (uasCtps * ua);
        nlAkhirDaspro = (tgDaspro * t) + (qzDaspro * qz) + (utsDaspro * ut) + (uasDaspro * ua);
        nlAkhirK3 = (tgK3 * t) + (qzK3 * qz) + (utsK3 * ut) + (uasK3 * ua);
        nlAkhirKti = (tgKti * t) + (qzKti * qz) + (utsKti * ut) + (uasKti * ua);
        nlAkhirMatDas = (tgMatDas * t) + (qzMatDas * qz) + (utsMatDas * ut) + (uasMatDas * ua);
        nlAkhirPancasila = (tgPancasila * t) + (qzPancasila * qz) + (utsPancasila * ut) + (uasPancasila * ua);
        nlAkhirPrakDaspro = (tgPrakDaspro * t) + (qzPrakDaspro * qz) + (utsPrakDaspro * ut) + (uasPrakDaspro * ua);

        ips = (nlAkhirBing1 + nlAkhirCtps + nlAkhirDaspro + nlAkhirK3 + nlAkhirKti + nlAkhirMatDas + nlAkhirPancasila
                + nlAkhirPrakDaspro) / 8;

        System.out.println(nlAkhirBing1);
        System.out.println(nlAkhirCtps);
        System.out.println(nlAkhirDaspro);
        System.out.println(nlAkhirK3);
        System.out.println(nlAkhirKti);
        System.out.println(nlAkhirMatDas);
        System.out.println(nlAkhirPancasila);
        System.out.println(nlAkhirPrakDaspro);

        System.out.println(ips);

    }

}
