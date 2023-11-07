package WRI;

import java.util.Scanner;

public class at {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String a = input.nextLine();
        String array[] = { "Wahyu", "Rizky", "Cahyana", "Anwar" };
        getTabel(array);

    }

    public static void getTabel(String array[]) {
        for (int j = 0; j < 65; j++) {
            System.out.print("=");
        }
        System.out.println("");
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 65; j++) {
                    if ((i == 3) && (j >= 0 && j <= 64)) {
                        System.out.print("=");
                    } else if ((i == 1 && (j == 0 || j == (65 - array[k].length())))
                            || (((i >= 0 && i <= 2) && i != 1) && (j == 0 || j == 64))) {
                        System.out.print("|");
                    } else if (i == 1 && j == ((64 / 2) - (array[k].length() / 2))) {
                        System.out.print(array[k]);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}