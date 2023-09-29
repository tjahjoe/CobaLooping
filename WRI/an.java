package WRI;

import java.util.Scanner;

public class an {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hasil;

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        // if(angka % 2 == 0){
        //     System.out.println("Angka "+angka+" bilangan genap");
        // }else{
        //     System.out.println("Angka "+angka+" bilangan ganjil");
        // }
        hasil = (angka % 2 == 0) ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilanagan ganjil";
        System.out.println(hasil);
    }
    
}
