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

//menyesuaikan nilai
        String bio[] = { "Nama", "NIM", "kelas" };
        String nilaiKul[] = {"Tugas", "Kuiz", "UTS", "UAS"};
        String mhsn[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" }, { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        int nilai[] = { 100, 98, 100, 89};
        String ab[] = new String[3];
        do {
            System.out.println("Bayak siswa");
            int d = scInt.nextInt();
            String aa[][] = new String[d][3];
            String mhs[][] = new String[d][3];
            int nil[] = new int[d];
            int nila[] =  new int[d];

            System.out.println(mhs.length);
            for (int x = 0; x < mhs.length; x++) {
                    nil[x] = 0;
                    nila[x] = 0;
                for (int w = 0; w < bio.length; w++) {
                    mhs[x][w] = "__";
                    aa[x][w] = "__";
                    
                }
            }
            for (int r = 0; r < mhsn.length; r++) {
                for (int l = 0; l < bio.length; l++) {
                    aa[r][l] = mhsn[r][l];
                    mhs[r][l] = aa[r][l];
                }
                
            }for (int k = 0; k < nilai.length; k++){
                    nil[k] = nilai[k];
                    nila[k] = nil[k];
                }
            // }for (int r = 0; r < mhsn.length; r++) {
            //     for (int l = 0; l < bio.length; l++) {
            //         mhs[r][l] = aa[r][l];
            //     }
            // }
            do {
                for (int s = 0; s < mhs.length; s++) {
                    System.out.printf("%d.\t: %s\n", s + 1, mhs[s][0]);
                }
                System.out.println("Masukkan angka");
                n = scInt.nextInt();
                n -= 1;
                for (j = 0; j < bio.length; j++) {
                    System.out.printf("Masukkan %s : ", bio[j]);
                    aa[n][j] = scStr.nextLine();
                    mhs[n][j] = aa[n][j];
                }
                System.out.print("Masukkan nilai : ");
                    nil[n] = scInt.nextInt();
                    nila[n] = nil[n]; 
                System.out.println(aa[4][0]);
                for (int a = 0; a < mhs.length; a++) {
                    for (int b = 0; b < mhs.length; b++) {
                        if (nila[a] > nila[b]) {
                            c = nila[a];
                            nila[a] = nila[b];
                            nila[b] = c;

                            for (int v = 0; v < bio.length; v++) {
                                ab[v] = mhs[a][v];
                                mhs[a][v] = mhs[b][v];
                                mhs[b][v] = ab[v];
                            }
                        } else if (nila[a] == nila[b]) {
                            if (mhs[a][0].compareTo(mhs[b][0]) < 0) {
                                c = nila[a];
                                nila[a] = nila[b];
                                nila[b] = c;

                                for (int v = 0; v < bio.length; v++) {
                                    ab[v] = mhs[a][v];
                                    mhs[a][v] = mhs[b][v];
                                    mhs[b][v] = ab[v];
                                }
                            }
                        }
                    }
                }
                
                for (int q = 0; q < mhs.length; q++) {
                    System.out.printf("%-3d|.\t|", q + 1);
                    for (int t = 0; t < bio.length; t++) {
                        System.out.printf(" %-6s|%-10s|", bio[t], mhs[q][t]);
                    }
                    System.out.printf("\t%d\n", nila[q]);
                }System.out.println(aa[4][0]);
                for (int s = 0; s < mhs.length; s++) {
                    System.out.printf("%d.\t: %s\n", s + 1, aa[s][0]);
                }
                System.out.println("ketik y");
                back = scStr.nextLine();
            } while (back.equalsIgnoreCase("y"));
        } while (back.equalsIgnoreCase("a"));
    }
}