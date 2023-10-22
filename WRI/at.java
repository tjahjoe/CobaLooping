package WRI;

import java.util.Scanner;

public class at {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 65; j++) {
                if ((i == 0 || i == 6) && (j >= 0 && j <= 64)) {
                    System.out.print("=");
                } else if ((i == 3 && (j == 0 || j == (65 - a.length())))
                        || (((i >= 1 && i <= 5) && i != 3) && (j == 0 || j == 64))) {
                    System.out.print("|");
                } else if (i == 3 && j == ((64 / 2) - (a.length() / 2))) {
                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}