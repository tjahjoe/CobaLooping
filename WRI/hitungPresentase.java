package WRI;

import java.util.Scanner;

public class hitungPresentase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String nama [] = {"Wahyu", "Rizky", "Cahyana"};
    int j = 0;
    String pencarian = input.nextLine();
    String temp[] = new String[nama.length];
    for (int i = 0; i < temp.length; i++) {
        if (nama[i].contains(pencarian)) {
            temp[j] = nama[i];
            j++;
        }
    }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
