package WRI;

import java.util.Scanner;

public class wriday1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, factorial, i;
        System.out.println("Enter a number: ");
        number = input.nextInt();

        factorial = 1;
        
        for (i = 1; 1<= number; i++) {
            factorial = factorial * i;
        }
        System.out.printf("The factorial of %d is %d\n", number , factorial);
    }
    
}
