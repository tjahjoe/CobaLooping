// packagekaryaku;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String back = "";
        int n = 0, j, c, xi = 0, m = 0, d;

        // menyesuaikan nilai
        String bio[] = { "Nama", "NIM", "kelas" };
        String nilaiKul[] = { "Tugas", "Kuiz", "UTS", "UAS" };
        String mhsn[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" }, { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        int nilai[] = { 100, 98, 100, 89 };
        String aa[][] = new String[100][3];
        int nil[] = new int[100];
        String ab[] = new String[3];
        for (int r = 0; r < mhsn.length; r++) {
            for (int l = 0; l < bio.length; l++) {
                aa[r][l] = mhsn[r][l];
            }
        }
        for (int k = 0; k < nilai.length; k++) {
            nil[k] = nilai[k];
        }

        do {

            System.out.println("Ingin tambah mahasiswa");
            String pilih = scStr.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                m++;
                String mhs[][] = new String[mhsn.length + m][3];

                int nila[] = new int[nilai.length + m];
                for (int x = 0; x < mhs.length; x++) {
                    nila[x] = 0;
                    for (int w = 0; w < bio.length; w++) {
                        mhs[x][w] = "null";
                    }
                }
                do {
                    for (int r = 0; r < mhsn.length; r++) {
                        for (int l = 0; l < bio.length; l++) {
                            mhs[r][l] = aa[r][l];
                            mhs[n][l] = aa[n][l];
                        }
                    }
                    for (int k = 0; k < nilai.length; k++) {
                        nila[k] = nil[k];
                    }
                    nila[n] = nil[n];
                    for (int s = 0; s < mhs.length; s++) {
                        System.out.printf("%d.\t: %s\n", s + 1, aa[s][0]);
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
                    }
                    System.out.println(aa[4][0]);
                    for (int s = 0; s < mhs.length; s++) {
                        System.out.printf("%d.\t: %s\n", s + 1, aa[s][0]);
                    }
                    System.out.println("ingin ubah mahasiswa y");
                    back = scStr.nextLine();
                } while (back.equalsIgnoreCase("y"));
            } else if (pilih.equalsIgnoreCase("t")) {
                String mhs[][] = new String[mhsn.length + m][3];

                int nila[] = new int[nilai.length + m];
                System.out.println(aa[4][0]);

                System.out.println(mhs.length);
                for (int x = 0; x < mhs.length; x++) {
                    nila[x] = 0;
                    for (int w = 0; w < bio.length; w++) {
                        mhs[x][w] = "null";
                    }
                }
                for (int r = 0; r < mhsn.length; r++) {
                    for (int l = 0; l < bio.length; l++) {
                        mhs[r][l] = aa[r][l];
                        mhs[n][l] = aa[n][l];
                    }
                }
                for (int r = mhsn.length; r < mhs.length; r++) {
                    for (int l = 0; l < bio.length; l++) {
                        mhs[r][l] = aa[r][l];
                        mhs[n][l] = aa[n][l];
                    }
                }
                for (int k = 0; k < nilai.length; k++) {
                    nila[k] = nil[k];
                }
                for (int k = nilai.length; k < nila.length; k++) {
                    nila[k] = nil[k];
                }
                nila[n] = nil[n];

                for (int s = 0; s < mhs.length; s++) {
                    System.out.printf("%d.\t: %s\n", s + 1, aa[s][0]);
                }
                // System.out.println("Masukkan angka");
                // n = scInt.nextInt();
                // n -= 1;
                // for (j = 0; j < bio.length; j++) {
                // System.out.printf("Masukkan %s : ", bio[j]);
                // aa[n][j] = scStr.nextLine();
                // mhs[n][j] = aa[n][j];
                // }
                // System.out.print("Masukkan nilai : ");
                // nil[n] = scInt.nextInt();
                // nila[n] = nil[n];
                // System.out.println(aa[4][0]);
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

                System.out.println("");

                for (int q = 0; q < mhs.length; q++) {
                    System.out.printf("%-3d|.\t|", q + 1);
                    for (int t = 0; t < bio.length; t++) {
                        System.out.printf(" %-6s|%-10s|", bio[t], mhs[q][t]);
                    }
                    System.out.printf("\t%d\n", nila[q]);
                }
                System.out.println(aa[4][0]);
                for (int s = 0; s < mhs.length; s++) {
                    System.out.printf("%d.\t: %s\n", s + 1, aa[s][0]);
                }
                System.out.println("ketik t");
                back = scStr.nextLine();
                // if(back.equalsIgnoreCase("a")){
                // xi++;
                // }
            }
        } while (back.equalsIgnoreCase("t"));
    }
}