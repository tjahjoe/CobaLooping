package WRI;

import java.util.Scanner;

public class bg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        // int kelipatan, jumlah = 0, counter = 0;
        // float rataRata;
        // System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        // kelipatan = input.nextInt();
        // for (int i = 1; i <= 50; i++) {
        //     if (i % kelipatan == 0) {
        //         jumlah += i;
        //         counter++;
        //     }
        // }
        // rataRata = (float) jumlah/counter;
        // System.out.printf(
        //         "Banyaknya bilangan %d dari 1 sampai 50 : %d\nTotal bilangan %d dari 1 sampai 50 : %d\nRata-rata total bilangan %d : %f",
        //         kelipatan, counter, kelipatan, jumlah, kelipatan, rataRata);

        // int kelipatan, i=1, jumlah = 0, counter = 0;
        // float rataRata;
        // System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        // kelipatan = input.nextInt();
        // while(i <= 50 ){
        //     if (i % kelipatan == 0){
        //         jumlah += i;
        //         counter++;
        //     }
        //     i++;
        // }
        // rataRata = (float) jumlah/counter;
        //  System.out.printf(
        //          "Banyaknya bilangan %d dari 1 sampai 50 : %d\nTotal bilangan %d dari 1 sampai 50 : %d\nRata-rata total bilangan %d : %f",
        //          kelipatan, counter, kelipatan, jumlah, kelipatan, rataRata);

        // int jumlahKaryawan, jumlahJamLembuur;
        // double gajiLembur = 0, totalGajiLembur = 0;
        // String jabatan;
        // System.out.print("Masukkan jumlah karyawan : ");
        // jumlahKaryawan = input.nextInt();
        // int i = 0;
        // while(i < jumlahKaryawan){
        //     System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        //     System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ":");
        //     jabatan = scInt.nextLine();
        //     i++;
        //     System.out.println("Masukkan jumlah jam lembur: ");
        //     jumlahJamLembuur = input.nextInt();
        //     if (jabatan.equalsIgnoreCase("direktur")){
        //         continue;
        //     } else if (jabatan.equalsIgnoreCase("manajer")){
        //         gajiLembur = 100000;
        //     } else if (jabatan.equalsIgnoreCase("karyawam")){
        //         gajiLembur = 75000;
        //     }
        //     totalGajiLembur += gajiLembur; 
            
        // }
        // System.out.println("Total gaji lembur: " + totalGajiLembur);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = input.nextInt();
        do{
            System.out.print("apakah anda ingin mengambil cuti (y/t) : ");
            konfirmasi = scInt.nextLine();

            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.print("jumlah hari: ");
                jumlahHari = input.nextInt();

                if(jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
        }while(jatahCuti > 0 && !konfirmasi.equalsIgnoreCase("t"));
       }
}
