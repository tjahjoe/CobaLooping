import java.util.Scanner;

public class projek3 {
    public static void main(String[] args) {
        
        
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scDb = new Scanner(System.in);

        //SELAMAT DATANG
        System.out.println("============================================================================");
        System.out.println("|                                                                          |");
        System.out.println("|                              Selamat Datang                              |");
        System.out.println("|                                                                          |");
        System.out.println("============================================================================");

        //LOGIN
        System.out.print("MASUKKAN USERNAME : ");
        String userName = scInt.nextLine();
        System.out.print("MASUKKAN PASSWORD : ");
        String password = scInt.nextLine();

        //PERCABANGAN PERTAMA
        if (userName.equalsIgnoreCase("Wahyu Rizky Cahyana")&&password.equalsIgnoreCase("123456789")) {

        //BERANDA
        System.out.println("============================================================================");
        System.out.println("|                                                                          |");
        System.out.println("|                                 Beranda                                  |");
        System.out.println("|                                                                          |");
        System.out.println("============================================================================");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|  1  |  BIODATA                     ||  4  |  MATKUL                      |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|=====|==============================||=====|==============================|");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|  2  |  PRESENSI                    ||  5  |  NILAI                       |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|=====|==============================||=====|==============================|");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|  3  |  KRS                         ||  6  |  UKT                         |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("|     |                              ||     |                              |");
        System.out.println("============================================================================");
        } else {}

        if(!userName.equalsIgnoreCase("Wahyu Rizky Cahyana")) {
            System.out.println("username salah");
        }else{}

        if(!password.equalsIgnoreCase("123456789")) {
            System.out.println("password salah");
        }else{}
    }
}

