package WRI;

import java.util.Arrays;
import java.util.Scanner;

public class bf {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);

// nilai to int
// mahasiswa mengikuti
        String mahasiswa[][] = {{"wahyu"}, { "rizky"}, { "cahyana"}};
        int nilai[][] = {{100},{100},{100}};
        // for (int d = 0; d < mahasiswa.length; d++) {
        //     nilai[d][1] = Integer.parseInt(mahasiswa[d][1]);
        // }
        int c;
        String f;
        for (int a = 0; a < mahasiswa.length; a++) {
            for (int b = 0; b < mahasiswa.length; b++) {
                if (nilai[a][0] > nilai[b][0]) {
                    c = nilai[a][0];
                    nilai[a][0] = nilai[b][0];
                    nilai[b][0] = c;
// mahasiswa mengikuti
                    f = mahasiswa[a][0];
                    mahasiswa[a][0] = mahasiswa[b][0];
                    mahasiswa[b][0] = f;

                }else if (nilai[a][0] == nilai[b][0]) {
                    if(mahasiswa[a][0].charAt(0) < mahasiswa[b][0].charAt(0)){

                    c = nilai[a][0];
                    nilai[a][0] = nilai[b][0];
                    nilai[b][0] = c;
// mahasiswa mengikuti
                    f = mahasiswa[a][0];
                    mahasiswa[a][0] = mahasiswa[b][0];
                    mahasiswa[b][0] = f;
                    }
                }
            }
        }
        for(int u = 0; u < nilai.length; u++){
            System.out.printf("%-10s : %d\n",mahasiswa[u][0], nilai[u][0]);
        }
        
        // for (int[] h : nilai) {
        //     System.out.println(h[0]);
        // }for (String[] o : mahasiswa) {
        //     System.out.println(o[0]);
        // }

    }
}
