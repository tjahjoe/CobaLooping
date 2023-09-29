package WRI;

import java.util.Random;
import java.util.Scanner;

public class al {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        Random a = new Random();

        int b = 0, e = 3;
        String f = "";

        do {
            int d = a.nextInt(10);
            do {
                System.out.println("ANDA MEMILIKI " + e + " KESEMPATAN");
                b = scInt.nextInt();
                e--;
                if (b > d){
                    System.out.println("TERLALU BESAR");
                }else if(b < d){
                    System.out.println("TERLALU KECIL");
                }
            } while (b != d && e > 0);
            if (b != d) {
                System.out.println("ANDA KALAH");
                System.out.println("INGIN MAIN LAGI ??");
                System.out.println("y/n");
                f = scStr.nextLine();
            } else {
                System.out.println("ANDA BERHASIL");
                System.out.println("INGIN MAIN LAGI ??");
                System.out.println("y/n");
                f = scStr.nextLine();
            }
            if (f.equalsIgnoreCase("y")) {
                e = 3;
            }
        } while (f.equalsIgnoreCase("y"));

// percobaan input user dan pass
        String username = scStr.nextLine();
        String password = scStr.nextLine();

        System.out.print("Masukkan Nama Anda : ");
        String user = scStr.nextLine();
        System.out.print("Masukkan password Anda : ");
        String pass = scStr.nextLine();

        if ((user.equals(username)) && pass.equals(password)){
            System.out.println("ini jalan");
        }else{
            System.out.println("a");
        }

    }
}
