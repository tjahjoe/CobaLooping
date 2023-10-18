import java.util.Scanner;

/**
 * big
 */
public class big {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        for (int a = 1; a <= angka; a++ ){
            // for (int b = 1; b < angka; b++){
            //     if (angka % b == 0){
            //         System.out.println(b);
            //     }
            // }
            if (a ==2 || a == 3){
                System.out.println(a);
            }
            else{
                if
                ((a % 2 != 0) && (a % 3 != 0)){
                System.out.println(a);
            } 
            }
            
        }
    }
}