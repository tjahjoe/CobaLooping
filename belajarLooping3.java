/**
 * belajarLooping3
 */
// Apakah if bisa pake String
import java.util.*;
 public class belajarLooping3 {

    public static void main(String[] args) {
        int kosong,a,b,c,d,e;
        Scanner bisa = new Scanner(System.in) ;
        System.out.println("======== SIAPA NAMANYA ========");
        String masuk = bisa.next() ;
        for (kosong = 0; kosong <= 3; kosong++) {
            System.out.println(" ");
        }
        if (masuk.equals("liha")) {
            for (a = 1 ; a <= 150 ; a++) {
                // I
                if (a <= 20) {
                    for (b = 1 ; b <= 4 ; b++) {
                        System.out.print("* ");
                }
                }
                //
                if (a <= 28) {
                        System.out.print(" ");
                }
                // L
                else if (a <= 44) {
                    for (d = 1 ; d <= 4 ; d++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 48) {
                    for (e = 1 ; e <= 12 ; e++) {
                        System.out.print("* ");
                    }
                }
                //
                else if (a <= 52) {
                        System.out.print(" ");
                }
                // O
                else if (a <= 56) {
                    for (e = 1 ; e <= 12 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 68) {
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("  ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 72) {
                    for (e = 1 ; e <= 12 ; e++) {
                        System.out.print("* ");
                    }
                }
                //
                else if (a <= 76) {
                        System.out.print(" ");
                }
                // V
                else if (a <= 80) {
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("  ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 84) {
                    for (e = 1 ; e <= 1 ; e++) {
                        System.out.print("  ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                    for (e = 1 ; e <= 2 ; e++) {
                        System.out.print("  ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 88) {
                    for (e = 1 ; e <= 2 ; e++) {
                        System.out.print("  ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 92) {
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("  ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                //
                else if (a <= 96) {
                        System.out.print(" ");
                }
                // O
                else if (a <= 100) {
                    for (e = 1 ; e <= 12 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 104) {
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 108) {
                    for (e = 1 ; e <= 12 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 112) {
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 116) {
                    for (e = 1 ; e <= 12 ; e++) {
                        System.out.print("* ");
                    }
                }
                //
                else if (a <= 124) {
                        System.out.print(" ");
                }
                // U
                else if (a <= 140) {
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("  ");
                    }
                    for (e = 1 ; e <= 4 ; e++) {
                        System.out.print("* ");
                    }
                }
                else if (a <= 144) {
                    for (e = 1 ; e <= 12 ; e++) {
                        System.out.print("* ");
                    }
                }System.out.println(" ");
            }
        }
        else {
            System.out.println("BUKAN DIA");
            }
    }
}