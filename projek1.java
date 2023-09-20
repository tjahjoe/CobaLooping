/**
 * projek1
 */
import java.util.*;
public class projek1 {

    public static void main(String[] args) {
         //Scanner userSc = new Scanner(System.in);
         //String usrO = userSc.next();
        System.out.println("========SELAMAT DATANG DI POLINEMA========");
        System.out.println("         ADA YANG BISA KAMI BANTU");
        System.out.println("           ketik iya atau tidak");
        Scanner userSc = new Scanner(System.in);
        String masuk = userSc.next();
         while (true) {
        do {

        if (masuk.equals("iya")){

            System.out.println("1. DATA DOSEN");
            System.out.println("2. DATA MAHASISWA");
            System.out.println("3. KHS");

                Scanner userI = new Scanner(System.in);
                String no = userI.next();
            
            do {
                Scanner userIya = new Scanner(System.in);
                String nom = userIya.next();

            if (nom.equals("1")) {
                System.out.println("Data Dosen");
            }
            else if (nom.equals("2")) {
                System.out.println("Data mahasiswa");
            }
        } while (false);
        }
        else if (masuk.equals("tidak")){
            System.out.println("terimakasih");
        }
    } while (masuk.equals("keluar")) ;
    }
}
}