package WRI.prakdasprolatihan;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);

        String mahasiswa [] = {"Wahyu", "Rizky", "Cahyana", "Anwar", "Zaki", "Zani", "Yahya"};
        int nilai [] = new int[7];

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.printf("Nama : %-10s| Nilai : ", mahasiswa[i]);
            nilai[i] = scInt.nextInt(); 
            
        }
    }
}

// String mahasiswa1 = "Wahyu";
        // String mahasiswa2 = "Rizky";
        // String mahasiswa3 = "Cahyana";
        // String mahasiswa4 = "Anwar";
        // String mahasiswa5 = "Zaki";

        // System.out.println(mahasiswa1);
        // System.out.println(mahasiswa2);
        // System.out.println(mahasiswa3);
        // System.out.println(mahasiswa4);
        // System.out.println(mahasiswa5);
        // mahasiswa[0] = "Wahyu";
        // mahasiswa[1] = "Rizky";
        // mahasiswa[2] = "Cahyana";
        // mahasiswa[3] = "Anwar";
        // mahasiswa[4] = "Zaki";
        // mahasiswa[5] = "Zani";
        // mahasiswa[6] = "Yahya";
        
        
        // mahasiswa[0] = "Yana";
        
        // nilai[0] = 89;
        // nilai[1] = 90;
        // nilai[2] = 88;
        // nilai[3] = 82;
        // nilai[4] = 85;
        // nilai[5] = 87;
        // nilai[6] = 91;

        // int nilai [] = {89, 90, 88, 82, 85, 87, 91};