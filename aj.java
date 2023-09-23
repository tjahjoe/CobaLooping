import java.util.Scanner;

public class aj {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                for (int a = 0; a < 65; a++) {
                    System.out.print("=");
                }
            } else if (i == 2) {
                for (int b = 0; b < 49; b++) {
                    if (b == 0 || b == 48) {
                        System.out.print("|");
                    } else if (b == 24) {
                        System.out.print("DASAR PEMROGRAMAN");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int c = 0; c < 65; c++) {
                    if (c == 0 || c == 64) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
