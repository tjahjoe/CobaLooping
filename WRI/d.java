package WRI;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, b;
        for (b = 0; true;){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            b += number;
            if (b > 50) {
                break;
            }
        }
    }
}
