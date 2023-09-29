package WRI;

import java.util.Scanner;

public class ao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nilai = "";

        System.out.println("Nilai uas :");
        float uas = input.nextFloat();
        System.out.println("Nilai uts  :");
        float uts = input.nextFloat();
        System.out.println("Nilai kuis : ");
        float kuis = input.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total <= 100 && total > 80){
            nilai = "A";
        }else if (total <= 80 && total > 73){
            nilai = "B+";
        }else if (total <= 73 && total > 65){
            nilai = "B";
        }else if (total <= 65 && total > 60){
            nilai = "C+";
        }else if (total <= 60 && total > 50){
            nilai = "C";
        }else if (total <= 50 && total > 39){
            nilai = "D";
        }else if (total <= 39){
            nilai = "E";
        }

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total +" "+ nilai + " sehingga " + message);
    }
    
}
