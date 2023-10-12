package WRI;

import java.util.Arrays;
import java.util.Scanner;;

public class bc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputstr = new Scanner(System.in);

        String data[] = { "asal", "kelas", "nim", };
        String bb;
        int cc = 0, d=3, a;
        boolean y = true;
        // int c;

        // System.out.println("jumlah siswa");
        // int b = input.nextInt();
        // String [] ini = new String[b+1];

        // do{System.out.println("nomor absen");
        // int a = input.nextInt();
        // try {
        // ini [1] ="wahyu";
        // ini [2] ="rizky";
        // ini [3] ="cahyana";
        // System.out.println(ini[a]);
        // ini [a] =inputstr.nextLine();
        // System.out.println(ini[a]);
        // } catch (Exception e) {
        // System.out.println("tidak valid");
        // }System.out.println("y");
        // c = input.nextInt();
        // }while(c == 1);

        // String cc = inputstr.nextLine();

        // String [][] bb= new String[1][2];
        String[][] n = new String[8][3];
        do {

            n[1][2] = "wahyu";
            System.out.print("nama : ");
            String aa = inputstr.nextLine();
            if (aa.equalsIgnoreCase("wahyu")) {
                cc = 0;
            } else if (aa.equalsIgnoreCase("rizky")) {
                cc = 1;
            } else if (aa.equalsIgnoreCase("cahyana")) {
                cc = 2;
            } else if (aa.equalsIgnoreCase("why")) {
                cc = 3;
            } else {
                cc += d++;
            }
            try {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("Masukkan %s : ", data[j]);
                    n[cc][j] = inputstr.nextLine();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println(n[cc][2]);
            System.out.println(Arrays.toString(n[cc]));
            System.out.println(Arrays.toString(n[0]));
            System.out.println(Arrays.toString(n[1]));
            System.out.println(Arrays.toString(n[2]));
            System.out.println(Arrays.toString(n[3]));
            System.out.println(Arrays.toString(n[4]));
            System.out.println(Arrays.toString(n[5]));
            System.out.println(Arrays.toString(n[6]));
            System.out.println(Arrays.toString(n[7]));
            System.out.println("Masukkan nama : ");
            String ff = inputstr.nextLine();
            if (n[cc][2].equals(ff)){
                System.out.println(n[cc][3]);
            }
            System.out.println("y");
            bb = inputstr.nextLine();
            if (bb.equalsIgnoreCase("y")) {
                cc = 1;
            }
        } while (bb.equalsIgnoreCase("y"));

    }
}
