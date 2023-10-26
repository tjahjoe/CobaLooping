package WRI;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String a = "wahyu";
        // String b = "Rizky";
        // String c = "Cahyana";

        String yha = sc.nextLine();
        boolean oo = true;
        String herry[] = { "Wahyu", "Rizky", "Cahyana" };
        String ac = "Wahyu Rizky Cahyana";
        String ad = "";
        int i = yha.length();
        int o = 0;
        int z = 0;
        int k = 0;

        do {
            if (yha.equalsIgnoreCase(String.valueOf(ac.substring(o, i)))) {
                System.out.println("hoho");
                // z = ac.indexOf(yha);
                k = i;

                System.out.println(k);
            } else {
            }
            i++;
            o++;

        } while (i < ac.length());
        System.out.println();

        // for (int i = 0; i < herry.length; i++) {
        // if(yha.equals(herry[i])){
        // o = i;
        // }
        // }
        // System.out.println(herry[o]);
    }

}
