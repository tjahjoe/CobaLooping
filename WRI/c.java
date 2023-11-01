package WRI;

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
        //     factorial = factorial * i;
        //     i++;
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

//1a akan terjadi eror karena tipe data intiger tidak bisa menampung angka desimal
//1b 
        // double [] bil = {5.0, 12867, 7.5, 2000000};
        // System.out.println(bil[0]);
        // System.out.println(bil[1]);
        // System.out.println(bil[2]);
        // System.out.println(bil[3]);
//1c
        // double [] bil = {5.0, 12867, 7.5, 2000000};
        // for (int i = 0; i < 4; i++) {
        //     System.out.println(bil[i]);
        // }
//1d 
        // double [] bil = {5.0, 12867, 7.5, 2000000};
        // for (int i = 0; i <= 4; i++) {
        //     System.out.println(bil[i]);
        // } akan terjadi eror karena perulangan yang dilakukan melebihi dari panjang arrray bil


//2     
        // int [] nilaiAkhir = new int[10];
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        //     nilaiAkhir[i] = sc.nextInt();
        // } 
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Nilai akhir ke "+i+" adalah "+ nilaiAkhir[i]);
        // }
//2a 
        // int [] nilaiAkhir = new int[10];
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        //     nilaiAkhir[i] = sc.nextInt();
        // } 
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.println("Nilai akhir ke "+i+" adalah "+ nilaiAkhir[i]);
        // } tidak ada, karena nilaiAkhir.lenght = 10
//2b nilaiAkhir.length merupakan nilai banyaknaya elmenen pada array nilaiAkhir, jadi i < nilaiAkhir.length jika kondisi nilai i kurang dari nilai banyaknya elemen pada array nilaiAhir maka perukangan akan dilakukan
//2c    
        // int [] nilaiAkhir = new int[10];
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        //     nilaiAkhir[i] = sc.nextInt();
        // } 
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     if(nilaiAkhir[i] > 70){
        //     System.out.println("Mahasiswa ke-"+i+" lulus");
        //     }
        // } program akan memberikan output Mahasiswa ke....lulus jika nilaiAkhir lebih dari 70
//2d
        //  int [] nilaiAkhir = new int[10];
        //  for (int i = 0; i < nilaiAkhir.length; i++) {
        //      System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        //      nilaiAkhir[i] = sc.nextInt();
        //  } 
        //  for (int i = 0; i < nilaiAkhir.length; i++) {
        //      if(nilaiAkhir[i] > 70){
        //      System.out.println("Mahasiswa ke-"+i+" lulus");
        //      } else {
        //         System.out.println("Mahasiswa ke-"+i+" tidak lulus");
        //      }
        //  }


//3    
        // int [] nilaiMhs = new int[10];
        // double total = 0;
        // double rata2;
        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-"+i+1+" : ");
        //     nilaiMhs[i] = sc.nextInt();
        // }
        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     total += nilaiMhs[i];
        // }
        // rata2 = total/nilaiMhs.length;
        // System.out.println("Rata-rata nilai : "+ rata2);

//3a
        // int [] nilaiMhs = new int[10];
        // double total = 0;
        // double rata2;
        // int lulus = 0;
        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        //     nilaiMhs[i] = sc.nextInt();
        // }
        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     if (nilaiMhs[i] > 70){
        //         lulus++;
        //     }
        //     total += nilaiMhs[i];
        // }
        // rata2 = total/nilaiMhs.length;
        // System.out.println("Rata-rata nilai : "+ rata2);
        // System.out.println("Banyaknya mahasiswa yang lulus : " + lulus);
//3b
        
        // System.out.print("Masukkan jumlah mahasiswa : ");
        // int jumlahMahasiswa = sc.nextInt();
        // double nilai []= new double[jumlahMahasiswa];
        // double nilaiLulus = 0;
        // double nilaiTidakLulus = 0;
        // double jumlahNilaiLulus = 0;
        // double jumlahNilaiTidakLulus = 0;
        // for (int i = 0; i < nilai.length; i++) {
        //     System.out.printf("Masukkan nilai mahasiswa ke-%d : ", i+1);
        //     nilai[i] = sc.nextInt();
        //     if (nilai[i] > 70){
        //         jumlahNilaiLulus += nilai[i];
        //         nilaiLulus++;
        //     } else {
        //         jumlahNilaiTidakLulus += nilai[i];
        //         nilaiTidakLulus++;
        //     }
        // }
        // System.out.println("Rata-rata nilai lulus : " + jumlahNilaiLulus/nilaiLulus);
        // System.out.println("Rata-rata nilai tidak lulus : " + jumlahNilaiTidakLulus/nilaiTidakLulus);

//4
        // int [] intData = {34, 18, 87, 72, 32, 54, 43};
        // int temp = 0;

        // for (int i = 0; i < intData.length; i++) {
        //     for (int j = 1; j < intData.length-i; j++) {
        //         if (intData[j-1] > intData[j]){
        //             temp = intData[j];
        //             intData[j] = intData[j-1];
        //             intData[j-1] = temp;
        //         }
        //     }
        // }
        // System.out.println("Hasil pengurutan");
        // for (int i = 0; i < intData.length; i++) {
        //     System.out.println(intData[i]);
        // }
//4a
        // int [] intData = {34, 18, 87, 72, 32, 54, 43};
        // int temp = 0;

        // for (int i = 0; i < intData.length; i++) {
        //     for (int j = 1; j < intData.length-i; j++) {
        //         if (intData[j-1] < intData[j]){
        //             temp = intData[j];
        //             intData[j] = intData[j-1];
        //             intData[j-1] = temp;
        //         }
        //     }
        // }
        // System.out.println("Hasil pengurutan");
        // for (int i = 0; i < intData.length; i++) {
        //     System.out.println(intData[i]);
        // }

        int [] angka = {5, 2, 7, 9, 6};
        int [] tem = new int[angka.length];

        for (int i = 0; i < angka.length; i++) {
                tem[i] = angka[i];
        }
        for (int i = 0, j = angka.length-1; i < tem.length; i++, j--) {
                angka[j] = tem[i];
        }
        for (int i = 0; i < tem.length; i++) {
                System.out.println(angka[i]);
        }

    }
    
}
