import java.util.Arrays;
import java.util.Scanner;

/**
 * big
 */
public class big {

        public static void main(String[] args) {
                // Scanner input = new Scanner(System.in);
                // Scanner inputStr = new Scanner(System.in);
                // int angka = input.nextInt();
                // for (int a = 1; a <= angka; a++) {
                // for (int b = 1; b < angka; b++) {
                // if (angka % b == 0) {
                // System.out.println(b);
                // }
                // }
                // if (a == 2 || a == 3) {
                // System.out.println(a);
                // } else {
                // if ((a % 2 != 0) && (a % 3 != 0)) {
                // System.out.println(a);
                // }
                // }

                // }
                // int array[] = { 3, 4, 6, 2, 1, 5 };
                // System.out.println(Arrays.toString(array));
                // int temp = 0;
                // for (int i = 0; i < array.length; i++) {
                // for (int j = i; j < array.length; j++) {
                // if (array[i] > array[j]) {
                // temp = array[i];
                // array[i] = array[j];
                // array[j] = temp;
                // System.out.print(Arrays.toString(array));

                // }
                // }
                // System.out.println("*");
                // }
                // for (int i = 0; i < array.length; i++) {

                // }
                // System.out.println("masukkan angka");
                // int k = input.nextInt();
                // for (int j = 1; j <= k; j++) {
                // for (int j2 = 1; j2 <= k; j2++) {
                // if ((j == 1 || j == k) || (j > 1 && j < k) && (j2 == 1 || j2 == k)) {
                // System.out.print(k + " ");
                // } else {
                // System.out.print(" ");
                // }
                // }
                // System.out.println("");
                // }
                // for (int i = 0; i <= k; i++) {
                // for (int index = k - 1; index >= i; index--) {
                // System.out.print(" ");
                // }
                // for (int j = 1; j < i * 2; j++) {
                // if (j > i) {
                // System.out.print((i * 2) - j + " ");
                // } else {
                // System.out.print(j + " ");
                // }
                // }
                // System.out.println("");
                // }
                // for (int i = 0; i <= k; i++) {
                // for (int index = k - 1; index >= i; index--) {
                // System.out.print(" ");
                // }
                // for (int j = 1; j <= i; j++) {

                // System.out.print(j + " ");

                // }
                // System.out.println("");
                // }
                int o = 0;
                int p = 0;
                char nama[] = { 'W', 'a', 'h', 'y', 'u', 'R', 'i', 'z', 'k', 'y', 'C', 'a',
                                'h', 'y', 'a', 'n', 'a' };
                char nama2[][] = new char[8][5];
                for (int i = 0; i < nama2.length; i++) {
                        for (int j = 0; j < nama2[i].length; j++) {
                                if (o >= nama.length) {
                                        o = 0;
                                }
                                nama2[i][j] = nama[o];
                                o++;
                                System.out.print(nama2[i][j]);
                        }
                        System.out.println();
                }
                // int o = 0;
                // char nama[] = { 'W', 'a', 'h', 'y', 'u', 'R', 'i', 'z', 'k', 'y', 'C', 'a',
                // 'h', 'y', 'a', 'n', 'a' };
                // for (int i = 0; i < nama2.length; i++) {
                // for (int j = (5 * i) + 0; j < 5 * (i + 1); j++) {
                // nama2[i][o] = nama[j];
                // o++;
                // }
                // o = 0;
                // }

                // System.out.println("");
                // }
                // String mahasiswa[][] = { { "Wahyu", "29" }, { "Rizky", "14" } };
                // System.out.print("Masukkan baris : ");
                // int baris = input.nextInt();
                // System.out.print("Masukkan kolom : ");
                // int kolom = input.nextInt();
                // String tempMahasiswa[][] = new String[baris][kolom];
                // if (baris < mahasiswa.length) {
                // if (kolom < mahasiswa[0].length) {
                // for (int i = 0; i < baris; i++) {
                // for (int j = 0; j < kolom; j++) {
                // tempMahasiswa[i][j] = mahasiswa[i][j];
                // }
                // }
                // } else {
                // for (int i = 0; i < baris; i++) {
                // for (int j = 0; j < mahasiswa[i].length; j++) {
                // tempMahasiswa[i][j] = mahasiswa[i][j];
                // }
                // }
                // }
                // } else {
                // if (kolom < mahasiswa[0].length) {
                // for (int i = 0; i < mahasiswa.length; i++) {
                // for (int j = 0; j < kolom; j++) {
                // tempMahasiswa[i][j] = mahasiswa[i][j];
                // }
                // }
                // } else {
                // for (int i = 0; i < mahasiswa.length; i++) {
                // for (int j = 0; j < mahasiswa[i].length; j++) {
                // tempMahasiswa[i][j] = mahasiswa[i][j];
                // }
                // }
                // }
                // }
                // mahasiswa = tempMahasiswa;
                // //System.out.println(suhu[4][0]);
                // System.out.println(tempMahasiswa[0][0]);
                // //System.out.println(cuaca[4][0]);
                // System.out.print("Masukkan banyak baris : ");
                // int baris = input.nextInt();
                // System.out.print("Masukkan banyak kolom : ");
                // int kolom = input.nextInt();
                // String kursi[][] = new String[baris][kolom];
                // for (int i = 0; i < baris; i++) {
                // for (int j = 0; j < kolom; j++) {
                // System.out.print("Masukkan angka : ");
                // kursi[i][j] = inputStr.nextLine();
                // }
                // }
                // for (int i = 0; i < baris; i++) {
                // for (int j = 0; j < kolom; j++) {
                // System.out.print(kursi[i][j] + " ");
                // }
                // System.out.println("");
                // }

        }
}