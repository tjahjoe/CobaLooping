package WRI;

import java.util.Scanner;

public class bd {
    public static void main(String[] args) {
        // Scanner scStr = new Scanner(System.in);
        // System.out.print("kata kata hari ini : ");
        // int w = 0;
        // String absen = scStr.nextLine();
        // byte[] c = absen.getBytes();
        // for (int i = 0; i < absen.length(); i++) {
        // w = c[i] - (97 / absen.length());
        // }
        // String n[] = new String[1000];
        // System.out.println(w);

        // Scanner scan = new Scanner(System.in);

        // int i = scan.nextInt();
        // double d = scan.nextDouble();
        // String s = scan.next();

        // // Write your code here.

        // System.out.println("String: " + s);
        // System.out.println("Double: " + d);
        // System.out.println("Int: " + i);

        // Scanner sc=new Scanner(System.in);
        // System.out.println("================================");
        // for(int i=0;i<3;i++){
        // String s1=sc.next();
        // int x=sc.nextInt();
        // if(x == 0){
        // System.out.printf("%s\t%d%d",s1,00,x);
        // } else if(x < 100){
        // System.out.printf("%s\t%d%d",s1,0,x);
        // } else{
        // System.out.printf("%s\t%d",s1,x);
        // }System.out.println("");
        // //Complete this line
        // }
        // System.out.println("================================");

        // String penonton [][] = new String[4][2];
        // penonton[0][0] = "Amin";
        // penonton[0][1] = "Bena";
        // penonton[1][0] = "Candra";
        // penonton[1][1] = "Dela";
        // penonton[2][0] = "Eka";
        // penonton[2][1] = "Farhan";
        // penonton[3][0] = "Gisel";

        // System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        // System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        // System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        // System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        // 1 pengisian array bisa diawali darimana saja, akan tetapi indeks tidak boleh
        // melebihi batas
        // 2 nilai awal array adalah null, yaitu tidak memiliki nilai, karena array
        // hanya instansiasi hanya menyiapkan ruang, jika ruangan tersebut tidak diberi
        // nilai maka maka nilainya akan tetap null null
        // 3 penonton[0][0] = "Amin";
        // penonton[0][1] = "Bena";
        // penonton[1][0] = "Candra";
        // penonton[1][1] = "Dela";
        // penonton[2][0] = "Eka";
        // penonton[2][1] = "Farhan";
        // penonton[3][0] = "Gisel";
        // penonton[3][1] = "Hana";
        // 4 penonton.length berfungi untuk mengiting banyaknya baris,
        // penonton[0].length berfungi untuk menghitung banyaknya kolom pada baris ke-0,
        // sama karan pada saat instansiasi bayaknya kolom sudah ditentukan
        // 5 System.out.println(penonton.length);
        // for (int i = 0; i < penonton.length; i++) {
        // System.out.println("panjang beris ke-" + (i+1) + " : " + penonton[i].length);
        // }
        // 6 System.out.println(penonton.length);
        // for (String[] strings : penonton) {
        // System.out.println("panjang baris : " + strings.length);
        // }
        // 7 kelebihan lebih singkat daripada menggunakan for loop karena tidak ada
        // inisialisasi, kondisi, update
        // hanya bisa digunakan di array
        // 8 3
        // 9 1
        // 10 System.out.println("Penonoton pada baris ke-3");
        // for (int i = 0; i < penonton[2].length; i++) {
        // System.out.println(penonton[2][i]);
        // }
        // 11 System.out.println("Penonton pada baris ke-3");
        // for (String i : penonton[2]) {
        // System.out.println(i);
        // }
        // 12 for (int i = 0; i < penonton.length; i++) {
        // System.out.println("Penonoton pada baris ke-" + (i+1)+ " : " +
        // String.join(",",penonton[i]));
        // }
        // 13 untuk menampilkan nilai pada indeks ke i, dan memberikan tanda baca
        // sebagai pembatas pada setiap kolomnya, jika tidak dikasih String.join maka
        // yang keluar hanya addresnya

        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        int baris = 0;
        int kolom = 0;
        String nama = "";
        String back = "";
String penonton[][] = new String[4][2];
        // System.out.println(penonton[0][0]);
        
        
        do {
            System.out.println("pilih");
            String pemiliihan = scStr.nextLine();
            switch (pemiliihan) {
                case "1":
                    System.out.println("Masukkan nama : ");
                    nama = scStr.nextLine();
                    System.out.println("Masukkan baris : ");
                    baris = scInt.nextInt();
                    if (baris < penonton.length && baris >= 0) {
                        System.out.println("Masukkan kolom : ");
                        kolom = scInt.nextInt();
                        if (kolom < penonton[baris].length && kolom >= 0) {
                            penonton[baris][kolom] = nama;
                            System.out.println(penonton[baris][kolom]);
                            System.out.println("ketik t jika ingin kembali");
                            back = scStr.nextLine();
                        } else {
                            System.out.println("Slot tidak terpenuhi");
                        }
                    } else {
                        System.out.println("slot tidak terpenuhi");
                    }
                    break;
                case "2":
                    System.out.println("Masukkan baris : ");
                    baris = scInt.nextInt();
                    if (baris < penonton.length && baris >= 0) {
                        System.out.println("Masukkan kolom : ");
                        kolom = scInt.nextInt();
                        if (kolom < penonton[baris].length && kolom >= 0) {
                            if (penonton[baris][kolom] == null) {
                                System.out.println("kursi kosong");
                            } else {
                                System.out.println(penonton[baris][kolom]);
                            }
                        } else {
                            System.out.println("Slot tidak terpenuhi");
                        }
                    } else {
                        System.out.println("slot tidak terpenuhi");
                    }
                    break;
                case "3":
                    System.out.println("Terimakasih");
                    break;
                default:
                    break;
            }
        } while (back.equalsIgnoreCase("t"));
    }

}
