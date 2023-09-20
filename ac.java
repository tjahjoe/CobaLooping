import java.util.Scanner;

public class ac {
   public static void main(String[] args) {
    
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scDb = new Scanner(System.in);
        Scanner scflt = new Scanner(System.in);

// SELAMAT DATANG
    for (int i = 0 ; i < 5 ; i++) {
        if(i == 0 || i == 4){
        for (int a = 0 ; a < 65 ; a++) {
            System.out.print("=");
        }
        }else if (i == 2) {
            for (int b = 0 ; b < 52 ; b++){
            if (b == 0 || b == 51) {
                System.out.print("|");
            }else if (b == 26) {
                System.out.print("SELAMAT DATANG");
            }else {
                System.out.print(" ");
            }
        }
        }else {
            for (int c = 0 ; c < 65 ; c++){
            if (c == 0 || c == 64){
                System.out.print("|");
            }else {
                System.out.print(" ");
            }
        }
    }
        System.out.println("");
    }
// LOGIN
        System.out.print("MASUKKAN USERNAME : ");
        String userName = scInt.nextLine();
        System.out.print("MASUKKAN PASSWORD : ");
        String password = scInt.nextLine();
        String pilih2 = "";


// PERCABANGAN 1
    if (userName.equalsIgnoreCase("Wahyu Rizky Cahyana")&&password.equalsIgnoreCase("123456789")) {

// PEMBATAS 1
    for(int d = 0 ; d < 5 ; d++) {
        System.out.println(" ");
    }
    
// BERANDA
    for (int e = 0 ; e < 23 ; e++) {
        if (e == 0 || e == 4 || e == 10 || e == 16 || e == 22) {
            for (int f = 0 ; f < 65 ; f++) {
                System.out.print("=");
            }
        }else if (e == 2) {
            for (int b = 0 ; b < 61 ; b++){
            if (b == 0 || b == 58) {
                System.out.print("|");
            }else if (b == 29) {
                System.out.print("BERANDA");
            }else {
                System.out.print(" ");
            }
            }
        }else if (e == 1 || e == 3 ) {
            for (int b = 0 ; b < 65 ; b++){
            if (b == 0 || b == 64) {
                System.out.print("|");
            }else {
                System.out.print(" ");
            }
            }
        }else if (e == 7) {
            for (int b = 0 ; b < 60 ; b++){
                if (b == 0 || b == 6 || b == 25 || b == 27 || b == 33 || b == 53) {
                    System.out.print("|");
                }else if (b == 3){
                    System.out.print("1");
                }else if (b == 8) {
                    System.out.print("BIODATA");
                }else if (b == 30){
                    System.out.print("4");
                }else if (b == 35) {
                    System.out.print("MATKUL");
                }else {
                System.out.print(" ");
                }
            }
        }else if (e == 13) {
            for (int b = 0 ; b < 60 ; b++){
                if (b == 0 || b == 6 || b == 24 || b == 26 || b == 32 || b == 53) {
                    System.out.print("|");
                }else if (b == 3){
                    System.out.print("2");
                }else if (b == 8) {
                    System.out.print("PRESENSI");
                }else if (b == 29){
                    System.out.print("5");
                }else if (b == 34) {
                    System.out.print("NILAI");
                }else {
                System.out.print(" ");
                }
            }
        }else if (e == 19) {
            for (int b = 0 ; b < 64 ; b++){
                if (b == 0 || b == 6 || b == 29 || b == 31 || b == 37 || b == 60) {
                    System.out.print("|");
                }else if (b == 3){
                    System.out.print("3");
                }else if (b == 8) {
                    System.out.print("KRS");
                }else if (b == 34){
                    System.out.print("6");
                }else if (b == 39) {
                    System.out.print("UKT");
                }else {
                System.out.print(" ");
                }
            }
        }else {
            for (int g = 0 ; g < 65 ; g++){
                if (g == 0 || g == 6 || g == 31 || g == 33 || g == 39|| g == 64){
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("");
    }
    System.out.print("MASSUKKAN ANGKA : ");
    int pilihan1 = scInt.nextInt();


    switch (pilihan1) {

//biodata
        case 1:
        //tabel biodata
        for (int e = 0 ; e < 17 ; e++) {
            if (e == 0 || e == 4 || e == 10 || e == 16 || e == 22) {
                for (int f = 0 ; f < 65 ; f++) {
                    System.out.print("=");
                }
            }else if (e == 2) {
                for (int b = 0 ; b < 61 ; b++){
                if (b == 0 || b == 58) {
                    System.out.print("|");
                }else if (b == 29) {
                    System.out.print("BIODATA");
                }else {
                    System.out.print(" ");
                }
                }
            }else if (e == 1 || e == 3 ) {
                for (int b = 0 ; b < 65 ; b++){
                if (b == 0 || b == 64) {
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }
                }
            }else if (e == 7) {
                for (int b = 0 ; b < 60 ; b++){
                    if (b == 0 || b == 6 || b == 16 || b == 18 || b == 24 || b == 37) {
                        System.out.print("|");
                    }else if (b == 3){
                        System.out.print("1");
                    }else if (b == 8) {
                        System.out.print("MASUKKAN BIODATA");
                    }else if (b == 21){
                        System.out.print("2");
                    }else if (b == 26) {
                        System.out.print("LIHAT BIODATA");
                    }else {
                    System.out.print(" ");
                    }
                }
            }else if (e == 13) {
                for (int b = 0 ; b < 60 ; b++){
                    if (b == 0 || b == 6 || b == 59) {
                        System.out.print("|");
                    }else if (b == 3){
                        System.out.print("3");
                    }else if (b == 29) {
                        System.out.print("KELUAR");
                    }else {
                    System.out.print(" ");
                    }
                }
            }else if (e == 11 || e == 12 ||e == 14 || e == 15) {
                for (int b = 0 ; b < 65 ; b++){
                if (b == 0 || b == 6 || b == 64) {
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }
                }
            }else {
                for (int g = 0 ; g < 65 ; g++){
                    if (g == 0 || g == 6 || g == 31 || g == 33 || g == 39|| g == 64){
                        System.out.print("|");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.print("MASUKKAN ANGKA : ");
        int pilihBdt = scInt.nextInt();
        switch (pilihBdt) {
            case 1:
            System.out.println("MASUKKAN BIODATA ATAU UBAH BIODATA");
            break;
            case 2:
            System.out.println("LIHAT BIODATA");
            break;
            case 3:
            System.out.println("KEMBALI");
            break;
        }
        break;

//presensi
        case 2:
        System.out.println("PRESENSI");
        break;
        case 3:
        System.out.println("KRS");
        break;
        case 4:
        System.out.println("MATKUL");
        break;
//nilai
        case 5:
        //tabel nilai
        for (int e = 0 ; e < 17 ; e++) {
            if (e == 0 || e == 4 || e == 10 || e == 16 || e == 22) {
                for (int f = 0 ; f < 65 ; f++) {
                    System.out.print("=");
                }
            }else if (e == 2) {
                for (int b = 0 ; b < 61 ; b++){
                if (b == 0 || b == 58) {
                    System.out.print("|");
                }else if (b == 29) {
                    System.out.print("BIODATA");
                }else {
                    System.out.print(" ");
                }
                }
            }else if (e == 1 || e == 3 ) {
                for (int b = 0 ; b < 65 ; b++){
                if (b == 0 || b == 64) {
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }
                }
            }else if (e == 7) {
                for (int b = 0 ; b < 60 ; b++){
                    if (b == 0 || b == 6 || b == 18 || b == 20 || b == 26 || b == 41) {
                        System.out.print("|");
                    }else if (b == 3){
                        System.out.print("1");
                    }else if (b == 8) {
                        System.out.print("MASUKKAN NILAI");
                    }else if (b == 23){
                        System.out.print("2");
                    }else if (b == 28) {
                        System.out.print("LIHAT NILAI");
                    }else {
                    System.out.print(" ");
                    }
                }
            }else if (e == 13) {
                for (int b = 0 ; b < 60 ; b++){
                    if (b == 0 || b == 6 || b == 59) {
                        System.out.print("|");
                    }else if (b == 3){
                        System.out.print("3");
                    }else if (b == 29) {
                        System.out.print("KELUAR");
                    }else {
                    System.out.print(" ");
                    }
                }
            }else if (e == 11 || e == 12 ||e == 14 || e == 15) {
                for (int b = 0 ; b < 65 ; b++){
                if (b == 0 || b == 6 || b == 64) {
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }
                }
            }else {
                for (int g = 0 ; g < 65 ; g++){
                    if (g == 0 || g == 6 || g == 31 || g == 33 || g == 39|| g == 64){
                        System.out.print("|");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }System.out.print("MASUKKAN ANGKA : ");
        int pilihNl = scInt.nextInt();
        switch (pilihNl) {
            case 1:
            System.out.println("MASUKKAN BIODATA ATAU UBAH BIODATA");
            break;
            case 2:
            System.out.println("LIHAT BIODATA");
            break;
            case 3:
            System.out.println("KEMBALI");
        }
        break;
        case 6:
        System.out.println("UKT");
        break;
        default:
            break;
    }
    }  else {}

    if(!userName.equalsIgnoreCase("Wahyu Rizky Cahyana")) {
        System.out.println("username salah");
    }else{}

    if(!password.equalsIgnoreCase("123456789")) {
        System.out.println("password salah");
    }else{}
   } 
   
} 
