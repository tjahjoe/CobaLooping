package WRI;

import java.util.Arrays;

public class be {
    public static void main(String[] args) {
        // String lala[] = {"aa", "bb", "cc" };
        // //System.out.println(lala[0]);
        // String nana[][] = {
        // {"aa", "bb", "cc"},
        // {"dd", "ee", "ff"},
        // {"gg", "hh", "ii"}
        // };
        // String anan [][] = new String[3][3];
        // for (int i = 0; i < nana.length; i++){
        // System.out.print(lala[i]+ " ");
        // }
        // System.out.println("\n==================================");
        // for (int j = 0 ; j < nana.length; j++){
        // for (int k = 0 ; k < nana.length; k++){
        // System.out.print(nana[j][k] + " ");
        // }
        // System.out.println("");
        // }
        String a;

        String aku[] = { "wahyu", "rizky", "cahyana", "wwwwwww" };
        for (int i = 0; i < aku.length; i++) {
            for (int j = 0; j < aku.length; j++) {
                if (aku[i].charAt(0) > aku[j].charAt(0)) {
                    a = aku[i];
                    aku[i] = aku[j];
                    aku[j] = a;

                } else if (aku[i].charAt(0) == aku[j].charAt(0)) {
                    if (aku[i].charAt(1) > aku[j].charAt(1)) {
                        a = aku[i];
                        aku[i] = aku[j];
                        aku[j] = a;
                    }
                }
            }
        }
        System.out.println(aku[0]);
        System.out.println(Arrays.toString(aku));
        // }

    }
}
