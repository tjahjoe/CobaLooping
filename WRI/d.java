package WRI;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class d {

    public static int a = 0;
    public static int b = 0;
    public static int c = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // a = input.nextInt();
        b = 10;
        // rumus();
        System.out.println(c);
        // Scanner input = new Scanner(System.in);
        // int aku = input.nextInt();
        // if (aku == 1){
        // System.out.println("aaaa");
        // }else{
        // System.out.println("inputan salah");
        // }
        // }
        // Scanner input = new Scanner(System.in);
        // int number, b;
        // for (b = 0; true;){
        // System.out.println("Enter a number: ");
        // number = input.nextInt();
        // b += number;
        // if (b > 50) {
        // break;
        // }
        // }
        // public static void getname(){
        // String a = "aku";
        // getaku(a);;
        // // return;
        // }
        // public static void getaku(String a){
        // System.out.println(a);
        // }

        // String ar[] ={"Wahyu", "Rizky", "Cahyana"};
        // String copyAr[] = new String[ar.length+1];
        // System.out.println(ar.length);
        // for (int i = 0; i < copyAr.length-1; i++) {
        // copyAr[i] = ar[i];
        // }
        // copyAr[ar.length] = input.nextLine();
        // ar=copyAr;
        // System.out.println(ar.length);
        // for (int i = 0; i < copyAr.length; i++) {
        // System.out.println(ar[i]);
        // }
        String a = "";
        int n = 0;
        boolean valid = true;
        String nama[][] = { { "Wahyu", "Rizky", "Cahyana" } };
        String copyNama[][] = new String[nama.length + 1][];
        String biodata[] = { "Nama", "Jenis Kelamin", "Tempat Tanggal Lahir", "Agama", "Alamat", "NIM", "Ayah", "Ibu",
                "Pekerjaan Ayah", "Pekerjaan Ibu", "Alamat Orangtua", "Nomor Telepon", "Nomor Telepon Ayah",
                "Nomor Telepon Ibu" };
        String masterBiodata[][] = { { "Agnes Rahmania", "Perempuan", "Malang, 17 Agustus 2005", "Islam",
                "Jalan KH. Wachid Hasyim", "2541720001", "Suratno", "Siti", "Wirausaha", "Ibu rumah tangga",
                "Jalan KH. Wachid Hasyim", "087796996123", "081754637827", "081627127456" } };
        do {
            a = "";
            System.out.println("tambah mahasiswa");
            String penentuan = input.nextLine();
            switch (penentuan) {
                case "1":
                    n = masterBiodata.length + 1;
                    valid = true;
                    break;
                case "2":
                    n = masterBiodata.length - 1;
                    if (n == 0) {
                        masterBiodata = null;
                        System.out.println(Arrays.toString(masterBiodata));
                        System.out.println("t");
                        a = input.nextLine();
                    } else {
                        
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < biodata.length; j++) {
                                System.out.println(masterBiodata[i][j]);
                            }
                            System.out.println("\n\n\n");
                        }
                        valid = false;
                        System.out.println("t");
                        a = input.nextLine();
                    }
                    break;
                default:
                    break;
            }
            if (valid) {
                
            String inputBiodata[][] = new String[n][14];

            // for (int i = 0; i < n-1; i++) {
            // inputBiodata[i] = masterBiodata[i];
            // }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < biodata.length; j++) {
                    inputBiodata[i] = masterBiodata[i];
                }
            }

            for (int i = 0; i < biodata.length; i++) {
                System.out.printf("Masukkan %-25s : ", biodata[i]);
                inputBiodata[n - 1][i] = input.nextLine();
            }
            masterBiodata = inputBiodata;
            for (int i = 0; i < inputBiodata.length; i++) {
                for (int j = 0; j < biodata.length; j++) {
                    System.out.println(masterBiodata[i][j]);
                }
                System.out.println("\n\n\n");
            }
            System.out.println("t");
            a = input.nextLine();
        }
        } while (a.equalsIgnoreCase("t"));
    }

    // public static void rumus(){
    // c = a*b;
    // }

}
