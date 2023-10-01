import java.util.Scanner;

public class au {
    public static void main(String[] args) {
        Scanner scfloat = new Scanner(System.in);

        String [] matkul = {"Bahasa Inggris 1", "CTPS", "Daspro", "K3", "KTI", "Matdas", "Pancasila", "Prak Daspro"};
        String [] nilai = {"Tugas", "Kuis", "UTS", "UAS"};
        float [] nlAkhir = new float[8];

        float[][] n = new float[8][4];

        float[] nBing1 = new float[4];
        float[] nCTPS = new float[4];
        float[] nDaspro = new float[4];
        float[] nK3 = new float[4];
        float[] nKTI = new float[4];
        float[] nMatdas = new float[4];
        float[] nPancasila = new float[4];
        float[] nPrakDaspro = new float[4];

        n[0] = nBing1;
        n[1] = nCTPS;
        n[2] = nDaspro;
        n[3] = nK3;
        n[4] = nKTI;
        n[5] = nMatdas;
        n[6] = nPancasila;
        n[7] = nPrakDaspro;

        float[] presen = {0.2f, 0.2f, 0.3f, 0.3f,};



        //float [] nBing1 = new float[4];

        System.out.println(n[1][2]);

        // for (float i = 0; i < nilai.length; i++){
        //     System.out.prfloatf("Masukkan nilai %s %s : ", nilai[i], matkul[0]);
        //     n[0][i] = scfloat.nextfloat();
        // }
        for (int i = 0; i < nilai.length; i++){
            System.out.printf("Masukkan nilai %s %-30s : ", nilai[i], matkul[1]);
            n[1][i] = scfloat.nextFloat();
        }
        nlAkhir[0] = (n[0][0] * presen[0]) + (n[0][1]*presen[1]) + (n[0][2]*presen[2]) + (n[0][3]*presen[3]);
        System.out.println(nlAkhir[0]);


        for (int j = 0; j < nilai.length; j++){
            System.out.printf("Nilai %s : %s\n", nilai[j], n[0][j]);
        }
    }
}
