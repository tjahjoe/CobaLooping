package WRI;

import java.util.Arrays;
import java.util.Scanner;

public class c {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // Scanner input = new Scanner(System.in);
                // int number, factorial, i;
                // System.out.println("Enter a number: ");
                // number = input.nextInt();
                // factorial = 1;
                // i = 1;
                // do {
                // factorial = factorial * i;
                // i++;
                // }while(i <= number);
                // System.out.printf("The factorial of %d is %d\n", number, factorial);

                // 1
                // int [] bil = new int[4];
                // bil[0] = 5;
                // bil[1] = 13;
                // bil[2] = -7;
                // bil[3] = 17;
                // System.out.println(bil[0]);
                // System.out.println(bil[1]);
                // System.out.println(bil[2]);
                // System.out.println(bil[3]);

                // 1a akan terjadi eror karena tipe data intiger tidak bisa menampung angka
                // desimal
                // 1b
                // double [] bil = {5.0, 12867, 7.5, 2000000};
                // System.out.println(bil[0]);
                // System.out.println(bil[1]);
                // System.out.println(bil[2]);
                // System.out.println(bil[3]);
                // 1c
                // double [] bil = {5.0, 12867, 7.5, 2000000};
                // for (int i = 0; i < 4; i++) {
                // System.out.println(bil[i]);
                // }
                // 1d
                // double [] bil = {5.0, 12867, 7.5, 2000000};
                // for (int i = 0; i <= 4; i++) {
                // System.out.println(bil[i]);
                // } akan terjadi eror karena perulangan yang dilakukan melebihi dari panjang
                // arrray bil

                // 2
                // int [] nilaiAkhir = new int[10];
                // for (int i = 0; i < 10; i++) {
                // System.out.print("Masukkan nilai akhir ke-"+i+" : ");
                // nilaiAkhir[i] = sc.nextInt();
                // }
                // for (int i = 0; i < 10; i++) {
                // System.out.println("Nilai akhir ke "+i+" adalah "+ nilaiAkhir[i]);
                // }
                // 2a
                // int [] nilaiAkhir = new int[10];
                // for (int i = 0; i < nilaiAkhir.length; i++) {
                // System.out.print("Masukkan nilai akhir ke-"+i+" : ");
                // nilaiAkhir[i] = sc.nextInt();
                // }
                // for (int i = 0; i < nilaiAkhir.length; i++) {
                // System.out.println("Nilai akhir ke "+i+" adalah "+ nilaiAkhir[i]);
                // } tidak ada, karena nilaiAkhir.lenght = 10
                // 2b nilaiAkhir.length merupakan nilai banyaknaya elmenen pada array
                // nilaiAkhir, jadi i < nilaiAkhir.length jika kondisi nilai i kurang dari nilai
                // banyaknya elemen pada array nilaiAhir maka perukangan akan dilakukan
                // 2c
                // int [] nilaiAkhir = new int[10];
                // for (int i = 0; i < nilaiAkhir.length; i++) {
                // System.out.print("Masukkan nilai akhir ke-"+i+" : ");
                // nilaiAkhir[i] = sc.nextInt();
                // }
                // for (int i = 0; i < nilaiAkhir.length; i++) {
                // if(nilaiAkhir[i] > 70){
                // System.out.println("Mahasiswa ke-"+i+" lulus");
                // }
                // } program akan memberikan output Mahasiswa ke....lulus jika nilaiAkhir lebih
                // dari 70
                // 2d
                // int [] nilaiAkhir = new int[10];
                // for (int i = 0; i < nilaiAkhir.length; i++) {
                // System.out.print("Masukkan nilai akhir ke-"+i+" : ");
                // nilaiAkhir[i] = sc.nextInt();
                // }
                // for (int i = 0; i < nilaiAkhir.length; i++) {
                // if(nilaiAkhir[i] > 70){
                // System.out.println("Mahasiswa ke-"+i+" lulus");
                // } else {
                // System.out.println("Mahasiswa ke-"+i+" tidak lulus");
                // }
                // }

                // 3
                // int [] nilaiMhs = new int[10];
                // double total = 0;
                // double rata2;
                // for (int i = 0; i < nilaiMhs.length; i++) {
                // System.out.print("Masukkan nilai mahasiswa ke-"+i+1+" : ");
                // nilaiMhs[i] = sc.nextInt();
                // }
                // for (int i = 0; i < nilaiMhs.length; i++) {
                // total += nilaiMhs[i];
                // }
                // rata2 = total/nilaiMhs.length;
                // System.out.println("Rata-rata nilai : "+ rata2);

                // 3a
                // int [] nilaiMhs = new int[10];
                // double total = 0;
                // double rata2;
                // int lulus = 0;
                // for (int i = 0; i < nilaiMhs.length; i++) {
                // System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
                // nilaiMhs[i] = sc.nextInt();
                // }
                // for (int i = 0; i < nilaiMhs.length; i++) {
                // if (nilaiMhs[i] > 70){
                // lulus++;
                // }
                // total += nilaiMhs[i];
                // }
                // rata2 = total/nilaiMhs.length;
                // System.out.println("Rata-rata nilai : "+ rata2);
                // System.out.println("Banyaknya mahasiswa yang lulus : " + lulus);
                // 3b

                // System.out.print("Masukkan jumlah mahasiswa : ");
                // int jumlahMahasiswa = sc.nextInt();
                // double nilai []= new double[jumlahMahasiswa];
                // double nilaiLulus = 0;
                // double nilaiTidakLulus = 0;
                // double jumlahNilaiLulus = 0;
                // double jumlahNilaiTidakLulus = 0;
                // for (int i = 0; i < nilai.length; i++) {
                // System.out.printf("Masukkan nilai mahasiswa ke-%d : ", i+1);
                // nilai[i] = sc.nextInt();
                // if (nilai[i] > 70){
                // jumlahNilaiLulus += nilai[i];
                // nilaiLulus++;
                // } else {
                // jumlahNilaiTidakLulus += nilai[i];
                // nilaiTidakLulus++;
                // }
                // }
                // System.out.println("Rata-rata nilai lulus : " + jumlahNilaiLulus/nilaiLulus);
                // System.out.println("Rata-rata nilai tidak lulus : " +
                // jumlahNilaiTidakLulus/nilaiTidakLulus);

                // 4
                // int [] intData = {34, 18, 87, 72, 32, 54, 43};
                // int temp = 0;

                // for (int i = 0; i < intData.length; i++) {
                // for (int j = 1; j < intData.length-i; j++) {
                // if (intData[j-1] > intData[j]){
                // temp = intData[j];
                // intData[j] = intData[j-1];
                // intData[j-1] = temp;
                // }
                // }
                // }
                // System.out.println("Hasil pengurutan");
                // for (int i = 0; i < intData.length; i++) {
                // System.out.println(intData[i]);
                // }
                // 4a
                // int [] intData = {34, 18, 87, 72, 32, 54, 43};
                // int temp = 0;

                // for (int i = 0; i < intData.length; i++) {
                // for (int j = 1; j < intData.length-i; j++) {
                // if (intData[j-1] < intData[j]){
                // temp = intData[j];
                // intData[j] = intData[j-1];
                // intData[j-1] = temp;
                // }
                // }
                // }
                // System.out.println("Hasil pengurutan");
                // for (int i = 0; i < intData.length; i++) {
                // System.out.println(intData[i]);
                // }

                // int [] angka = {5, 2, 7, 9, 6};
                // int [] tem = new int[angka.length];

                // for (int i = 0; i < angka.length; i++) {
                // tem[i] = angka[i];
                // }
                // for (int i = 0, j = angka.length-1; i < tem.length; i++, j--) {
                // angka[j] = tem[i];
                // }
                // for (int i = 0; i < tem.length; i++) {
                // System.out.println(angka[i]);
                // }

                // for (int i = 0; i < 5; i++) {
                //         for (int index = 4; index >= i; index--) {
                //                 System.out.print("  ");
                //         }
                //         for (int j = 1; j < i * 2; j++) {
                //                 if (j > i) {
                //                         System.out.print((i * 2) - j + " ");
                //                 } else {
                //                         System.out.print(j + " ");
                //                 }
                //         }
                //         System.out.println("");
                // }
                // int alis[]={2, 5, 4};
                // int dio[]= {3, 4, 2};
                // int poinAlis = 0;
                // int poinDio = 0;
                // for (int i = 0; i < dio.length; i++) {
                //         if(alis[i] > dio[i]){
                //                 poinAlis++;
                //         }else if(alis[i] < dio[i]){
                //                 poinDio++;
                //         }else{

                //         }
                // } 
                // System.out.println(poinAlis + " " + poinDio);

                // int array [][] = {
                //         {1, 2, 3},
                //         {4, 5, 6},
                //         {7, 8, 9}
                // }; 
                // int hasil = 0;
                // for (int i = 0; i < array[0].length; i++) {
                //         for (int j = i; j <= i; j++) {
                //             hasil += array[i][j];    
                //         }
                // }System.out.println(hasil);
                String nama [][] = {{"Wahyu", "Rizky", "Cahyana"}};//Dimensi 1 Ada tapi isinya kosong, Dimensi 2 dari 1 "Wahyu"...
                String namaCopy [][] = new String[nama.length + 1][0]; //1+1
                String ab[][] = new String[1][];
                ab[0] = new String[]{nama[0][0]} ;
                System.out.println(ab[0][0]);
                //ab[1] = new String[] {name1, name2, name3, "a"};

                String inputName[] = new String[5];
                for (int i = 0; i < nama.length; i++) {
                        namaCopy[i] = nama[i];          
                }System.out.println(Arrays.toString(namaCopy[0]));

                // System.out.print("Nama 1 : ");
                // String name1 = sc.nextLine();
                // System.out.print("Nama 2 : ");
                // String name2 = sc.nextLine();
                // System.out.print("Nama 3 : ");
                // String name3 = sc.nextLine();
                for (int i = 0; i < inputName.length; i++) {
                        System.out.print("Masukkan nama " + (i+1) + " : ");
                        inputName[i] = sc.nextLine();
                        
                }namaCopy[1] = new String[] {inputName[0], inputName[1], inputName[2], inputName[3], inputName[4]};//-> tergantung panjang deklarasi
                System.out.println(namaCopy[1][1]);

               //namaCopy[1] = new String[] {name1, name2, name3, "a"};
                nama = namaCopy;
                System.out.println(nama.length);
// for (int i = 0; i < namaCopy.length; i++) {
//         for (int j = 0; j < namaCopy.length; j++) {
//                 System.out.println("Nama 1 "+ nama[i][j] +" ");
//         }
//}
                System.out.println("Nama 1 "+ nama[0][0] +" "+nama[0][1]+" "+nama[0][2]);
                System.out.println("Nama 1 "+ nama[1][0] +" "+nama[1][1]+" "+nama[1][2]+" "+nama[1][3]);
        }

}
