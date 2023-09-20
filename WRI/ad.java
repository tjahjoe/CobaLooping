package WRI;

public class ad {
    public static void main(String[] args) {
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
}
}
