// packagekaryaku;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String back = "";
        int n = 0, j, c;

        String mhs[][] = new String[1][3];
        String bio[] = { "Nama", "NIM", "kelas" };
        String mhsn[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" }, { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        String ab[] = new String[3];
        do {
            System.out.println("Bayak siswa");
            int d = scInt.nextInt();
            String aa[][] = new String[d][3];
            mhs = aa;

            System.out.println(mhs.length);
            for (int x = 0; x < mhs.length; x++) {
                for (int w = 0; w < bio.length; w++) {
                    mhs[x][w] = "__";
                }
            }
            for (int r = 0; r < mhsn.length; r++) {
                for (int l = 0; l < bio.length; l++) {
                    mhs[r][l] = mhsn[r][l];
                }
            }
            do {
                for (int a = 0; a < mhs.length; a++) {
                    for (int b = 0; b < mhs.length; b++) {
                            if (mhs[a][0].compareTo(mhs[b][0]) < 0) {

                                for (int v = 0; v < bio.length; v++) {
                                    ab[v] = mhs[a][v];
                                    mhs[a][v] = mhs[b][v];
                                    mhs[b][v] = ab[v];
                                }
                        }
                    }
                }
                for (int s = 0; s < mhs.length; s++) {
                    System.out.printf("%d.\t: %s\n", s + 1, mhs[s][0]);
                }
                System.out.println("Masukkan angka");
                n = scInt.nextInt();
                n -= 1;
                for (j = 0; j < bio.length; j++) {
                    System.out.printf("Masukkan %s : ", bio[j]);
                    mhs[n][j] = scStr.nextLine();
                }
                for (int q = 0 ; q < mhs.length; q++){
                    System.out.printf("%-3d|.\t|", q+1);
                    for(int t = 0 ; t < bio.length; t++){
                        System.out.printf(" %-6s|%-10s|", bio[t], mhs[q][t]);
                    }
                    System.out.println("");
                }

                System.out.println("ketik y");
                back = scStr.nextLine();
            } while (back.equalsIgnoreCase("y"));
        } while (back.equalsIgnoreCase("a"));
    }
}
// {"wahyu", "123", "1c"},
// {"", "", ""},
// {"", "", ""},