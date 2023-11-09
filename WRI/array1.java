package WRI;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String a = "wahyu";
        // String b = "Rizky";
        // String c = "Cahyana";
        String matkul[][] = { { "pancasila", "D4se2813", "2" }, { "bahasa", "Eda312Rs", "3" },
                { "matematika", "Sda23rT4", "2" } };
                int total = 0;
                for (int i = 0; i < matkul.length; i++) {
                    total += Integer.valueOf(matkul[i][2]);
                }
                System.out.println(total);
    }

}
