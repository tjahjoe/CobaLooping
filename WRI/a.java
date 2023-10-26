package WRI;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // Scanner scInt = new Scanner(System.in);
        // int bil1 = 70, bil2 = 70, bil3 = 70;
        // if (bil1 > bil2) {
        // if (bil2 > bil3) {
        // System.out.println(bil1);
        // } else if (bil1 > bil3) {
        // System.out.println(bil1);
        // } else {
        // System.out.println(bil3);
        // }
        // } else {
        // if (bil2 > bil3) {
        // System.out.println(bil2);
        // } else if (bil1 > bil3) {
        // System.out.println(bil2);
        // } else {
        // System.out.println(bil3);

        // }
        // }
        // double diskon = 0;
        // String hari = input.nextLine();
        // String buku = input.nextLine();
        // int total = scInt.nextInt();
        // if (hari.equalsIgnoreCase("rabu") && buku.equalsIgnoreCase("kamus")) {
        // diskon = 0.1;
        // if(total > 2){
        // diskon += 0.02;
        // }
        // } else if (hari.equalsIgnoreCase("rabu") && buku.equalsIgnoreCase("novel")) {
        // diskon = 0.07;
        // if(total > 3){
        // diskon += 0.02;
        // }else {
        // diskon += 0.01;
        // }
        // } else {
        // if(total > 3){
        // diskon = 0.05;
        // }
        // }
        // System.out.println(diskon);

        // Scanner scStr = new Scanner(System.in);
        // String nama, jenisKelamin;
        // for (int n = 1; n <= 30; n++){
        // System.out.print("masukkan nama\t: ");
        // nama = scStr.nextLine();
        // System.out.print("Jenis Kelamin\t: ");
        // jenisKelamin = scStr.nextLine();
        // if (jenisKelamin.equalsIgnoreCase("perempuan")){
        // System.out.printf("Nama\t\t: %s\nJenis Kelamin\t: %s\n", nama, jenisKelamin);
        // }

        // }

        // int n = 1, number = 0;
        // while (n <= 25){
        // number = number + n;
        // n++;
        // }
        // System.out.println(number);

        // int n = 1;
        // do{
        // if ((n % 3) != 0){
        // System.out.println(n);
        // }
        // n++;
        // }while(n <= 50);
        Scanner sc = new Scanner(System.in);
        // String bulan[] = {"januari", "februari", "maret", "april", "mei", "juni",
        // "juli", "agustus", "september", "oktober", "november", "desember"};
        // int angka = sc.nextInt();
        // angka -= 1;
        // if (angka <= 11){
        // System.out.println(bulan[angka]);
        // }else{
        // System.out.println("tidak valid");
        // }
        // int nilai[] = new int[8];
        // int nilaiAkhir = 0;
        // for (int i = 0; i < nilai.length; i++) {
        // nilai[i] = sc.nextInt();
        // nilaiAkhir += nilai[i];
        // }
        // System.out.println(nilaiAkhir/nilai.length);

        // for (int i = 1; i <= 50; i++) {
        // if (i == 2 || i == 3){
        // System.out.println(i);
        // }
        // else if(i % 2 != 0 && i % 3 != 0){
        // System.out.println(i);
        // }

        //

        // Scanner sc04 = new Scanner(System.in);

        // System.out.print("Masukkan jumlah mahasiswa : ");
        // int n = sc04.nextInt();

        // int[] nilaiMhs = new int[n];

        // double rata2, total = 0;
        // int banyakLulus = 0;
        // int banyakTidakLulus = 0;
        // double rata2Lulus = 0;
        // double rata2TidakLulus = 0;

        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
        //     nilaiMhs[i] = sc04.nextInt();

        //     if (nilaiMhs[i] > 70) {
        //         banyakLulus++;
        //         rata2Lulus += nilaiMhs[i];
        //     } else {
        //         banyakTidakLulus++;
        //         rata2TidakLulus += nilaiMhs[i];
        //     }
        // }

        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     total += nilaiMhs[i];
        // }
        // System.out.println(total);

        // rata2 = total / nilaiMhs.length;
        // // System.out.println("Rata-rata nilai : "+rata2);
        // // System.out.println("Banyak mahasiswa yang lulus : "+banyakLulus);
        // System.out.println("Rata-rata nilai lulus : " + rata2Lulus / banyakLulus);
        // // System.out.println("Banyak mahasiswa yang tidak lulus : "+banyakTidakLulus);
        // System.out.println("Rata-rata nilai tidak lulus : " + rata2TidakLulus / banyakTidakLulus);
String nama = "1";

    //   for (int i = 0; i < 5; i++) {
    //     String ana = String.valueOf(i);
    //     System.out.println(ana);
    //   }
// int haha = 1;
//      String ana;
//      System.out.println(nama.equalsIgnoreCase(ana= String.valueOf(haha)));
//      if (nama.equalsIgnoreCase(ana= String.valueOf(haha))){
//         System.out.println("sasa");
//      }

//      int nilai[][][] = {{{}},{{}},{{}},};
int masNil[][][] = { {{100, 98, 100, 89}},{{88, 87, 89, 82}},{{90, 91, 89, 88}},{{99, 86, 98, 85}}};
        int tamNil[][][] = new int[100][100][4];
        for (int k = 0; k < masNil.length; k++) {
            for(int c = 0; c < masNil[0].length; c++){
                for(int z = 0; z < masNil[0][0].length; z++){
                    tamNil[k][c][z] = masNil[k][c][z];
                    System.out.print(tamNil[k][c][z]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
