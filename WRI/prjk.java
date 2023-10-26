package WRI;

import java.util.Scanner;

public class prjk {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        // nanti kita masukkan di pencarian
        String masMaSis[][][] = { { 
                { "Wahyu", "1212" }, 
                { "Rizky", "2233" },
                { "Cahyana", "3446" },
                { "Dizky", "1773" } 
            },
                { 
                { "Anwar", "1122" },
                { "Boi", "2313" },
                { "Za", "2231" },
                { "Ki", "2131" } 
            } };
        String a = scStr.nextLine();
        String b = scStr.nextLine();
        int o = 0;
        for (int k = 0; k < masMaSis.length; k++) {
            for (int l = 0; l < masMaSis[0].length; l++) {
                if (a.equals(masMaSis[k][l][0]) && b.equals(masMaSis[k][l][1])) {
                    o = l;
                }
            }
        }
        if (a.equals(masMaSis[0][o][0]) && b.equals(masMaSis[0][o][1])) {
            System.out.println("a");
        } else if (a.equals(masMaSis[1][o][0]) && b.equals(masMaSis[1][o][1])) {
            System.out.println("b");
        }
        // System.out.println(masMaSis[o][1]);
    }

}
