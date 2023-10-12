package WRI;

import java.util.Scanner;

public class bi {
    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        String mahasiswa[][] = { { "wahyu", "1234", "aa" }, { "rizky", "3456", "bb" }, { "cahyana", "4657", "cc" } };
        int nilai[][] = { { 2 }, { 1 }, { 5 } };

        int c;
        String f, back;
        String aa[] = new String[3];
        do {

            System.out.println(mahasiswa[0][2]);
            System.out.println(mahasiswa[1][2]);
            System.out.println(mahasiswa[2][2]);

            System.out.println(nilai[0][0]);
            System.out.println(nilai[1][0]);
            System.out.println(nilai[2][0]);

            for (int a = 0; a < mahasiswa.length; a++) {
                for (int b = 0; b < mahasiswa.length; b++) {
                    if (mahasiswa[a][0].charAt(0) < mahasiswa[b][0].charAt(0)) {

                        c = nilai[a][0];
                        nilai[a][0] = nilai[b][0];
                        nilai[b][0] = c;
                        // menggunakan array
                        for (int v = 0; v < aa.length; v++) {
                            aa[v] = mahasiswa[a][v];
                            mahasiswa[a][v] = mahasiswa[b][v];
                            mahasiswa[b][v] = aa[v];
                        }
                    } else if (mahasiswa[a][0].charAt(0) == mahasiswa[b][0].charAt(0)) {
                        if (mahasiswa[a][0].charAt(1) < mahasiswa[b][0].charAt(1)) {

                            c = nilai[a][0];
                            nilai[a][0] = nilai[b][0];
                            nilai[b][0] = c;
                            // menggunakan array
                            for (int v = 0; v < aa.length; v++) {
                                aa[v] = mahasiswa[a][v];
                                mahasiswa[a][v] = mahasiswa[b][v];
                                mahasiswa[b][v] = aa[v];
                            }

                        }
                    }
                }
            }

            System.out.println(mahasiswa[0][2]);
            System.out.println(mahasiswa[1][2]);
            System.out.println(mahasiswa[2][2]);

            System.out.println(nilai[0][0]);
            System.out.println(nilai[1][0]);
            System.out.println(nilai[2][0]);

            for (int a = 0; a < mahasiswa.length; a++) {
                for (int b = 0; b < mahasiswa.length; b++) {
                    if (nilai[a][0] > nilai[b][0]) {
                        c = nilai[a][0];
                        nilai[a][0] = nilai[b][0];
                        nilai[b][0] = c;

                        for (int v = 0; v < aa.length; v++) {
                            aa[v] = mahasiswa[a][v];
                            mahasiswa[a][v] = mahasiswa[b][v];
                            mahasiswa[b][v] = aa[v];
                        }

                    } else if (nilai[a][0] == nilai[b][0]) {
                        if (mahasiswa[a][0].charAt(0) < mahasiswa[b][0].charAt(0)) {

                            c = nilai[a][0];
                            nilai[a][0] = nilai[b][0];
                            nilai[b][0] = c;
                            // menggunakan array
                            for (int v = 0; v < aa.length; v++) {
                                aa[v] = mahasiswa[a][v];
                                mahasiswa[a][v] = mahasiswa[b][v];
                                mahasiswa[b][v] = aa[v];
                            }
                        } else if (mahasiswa[a][0].charAt(0) == mahasiswa[b][0].charAt(0)) {
                            if (mahasiswa[a][0].charAt(1) < mahasiswa[b][0].charAt(1)) {

                                c = nilai[a][0];
                                nilai[a][0] = nilai[b][0];
                                nilai[b][0] = c;
                                // menggunakan array
                                for (int v = 0; v < aa.length; v++) {
                                    aa[v] = mahasiswa[a][v];
                                    mahasiswa[a][v] = mahasiswa[b][v];
                                    mahasiswa[b][v] = aa[v];
                                }

                            }
                        }
                    }
                }

            }
            for (int u = 0; u < nilai.length; u++) {
                System.out.printf("%-10s : %d\n", mahasiswa[u][0], nilai[u][0]);
            }
            System.out.println(mahasiswa[0][2]);
            System.out.println(mahasiswa[1][2]);
            System.out.println(mahasiswa[2][2]);
            System.out.println("y");
            back = scStr.nextLine();
            if (back.equalsIgnoreCase("y")) {
                for (int a = 0; a < mahasiswa.length; a++) {
                    for (int b = 0; b < mahasiswa.length; b++) {
                        if (mahasiswa[a][0].charAt(0) < mahasiswa[b][0].charAt(0)) {

                            c = nilai[a][0];
                            nilai[a][0] = nilai[b][0];
                            nilai[b][0] = c;
                            // menggunakan array
                            for (int v = 0; v < aa.length; v++) {
                                aa[v] = mahasiswa[a][v];
                                mahasiswa[a][v] = mahasiswa[b][v];
                                mahasiswa[b][v] = aa[v];
                            }
                        } else if (mahasiswa[a][0].charAt(0) == mahasiswa[b][0].charAt(0)) {
                            if (mahasiswa[a][0].charAt(1) < mahasiswa[b][0].charAt(1)) {

                                c = nilai[a][0];
                                nilai[a][0] = nilai[b][0];
                                nilai[b][0] = c;
                                // menggunakan array
                                for (int v = 0; v < aa.length; v++) {
                                    aa[v] = mahasiswa[a][v];
                                    mahasiswa[a][v] = mahasiswa[b][v];
                                    mahasiswa[b][v] = aa[v];
                                }

                            }
                        }
                    }
                }

            }
        } while (back.equalsIgnoreCase("y"));

        // for (int[] h : nilai) {
        // System.out.println(h[0]);
        // }for (String[] o : mahasiswa) {
        // System.out.println(o[0]);
        // }

    }
}
