import java.util.Arrays;
import java.util.Scanner;

/**
 * big
 */
public class big {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int angka = input.nextInt();
        // for (int a = 1; a <= angka; a++ ){
        // // for (int b = 1; b < angka; b++){
        // // if (angka % b == 0){
        // // System.out.println(b);
        // // }
        // // }
        // if (a ==2 || a == 3){
        // System.out.println(a);
        // }
        // else{
        // if
        // ((a % 2 != 0) && (a % 3 != 0)){
        // System.out.println(a);
        // }
        // }

        // }
        int array[] = { 3, 4, 6, 2, 1, 5 };
        System.out.println(Arrays.toString(array));
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    System.out.print(Arrays.toString(array));
                    
                }
            }System.out.println("*");
        }
        for (int i = 0; i < array.length; i++) {
            
        }
    }
}