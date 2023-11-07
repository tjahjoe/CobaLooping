package WRI;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int number, factorial, i;
        // System.out.println("Enter a number: ");
        // number = input.nextInt();
        // factorial = 1;
        // i = 1;
        // while (i <= number) {
        // factorial = factorial * i;
        // i++;
        // }

        // System.out.printf("The factorial of %d is %d\n", number, factorial);
        String sArray[] = { "Wahyu", "Rizky", "Cahyana" };
        int iArray[] = { 5, 5, 5 };
        int max = iArray[0];
        String big = sArray[0];
        int index = 0;
        for (int i = 0; i < iArray.length; i++) {
            if (max < iArray[i]) {
                max = iArray[i];
                index = i;
            } else if (max == iArray[i]) {
                if (big.compareTo(sArray[i]) > 0) {
                    max = iArray[i];
                    index = i;
                }
            }
        }
        System.out.println(max);
        System.out.println(sArray[index]);
        System.out.println(sArray[0]);
        System.out.println(iArray[0]);

        String namaMhs[] = {"Wahyu", "Rizky", "Cahyana", "Anwar", "Zaki"};
        String namaDsn[] = {"Sasa", "Nana", "Nani"};
        Scanner input = new Scanner(System.in);
        int ambilAngka = 0;
        String nama = input.nextLine();
        for (int i = 0; i < namaMhs.length; i++) {
            if(nama.equalsIgnoreCase(namaMhs[i])){
                ambilAngka = i;
            }
        }
        for (int i = 0; i < namaDsn.length; i++) {
            if(nama.equalsIgnoreCase(namaDsn[i])){
                ambilAngka = i;
            }
        }
        if(nama.equalsIgnoreCase(namaMhs[ambilAngka])){
            System.out.println(namaMhs[ambilAngka]);
        } else if (nama.equalsIgnoreCase(namaDsn[ambilAngka])){
            System.out.println(namaDsn[ambilAngka]);
        }
    }
}
