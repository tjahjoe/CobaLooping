import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        int bil1, bil2, bil3;
        Scanner input = new Scanner(System.in);
        bil1=input.nextInt();
        bil2=input.nextInt();
        bil3=input.nextInt();
        if (bil1>=bil2) {
            if (bil1>bil2) {
               if (bil1>bil3) {
                System.out.println("bila terbesar"+bil1);
            } else{
                System.out.println(bil3);
            } 
            }
            if (bil1==bil2) {
                System.out.println(+bil1);
            }
 
        }else if (bil2>=bil1) {
            if (bil2>bil3) {
                System.out.println("blangan terbesar"+bil2);
            }
            if (bil3>bil2) {
                System.out.println(bil3);
            }
            if (bil2==bil3) {
                System.out.println(+bil2);
            }
        }
    }
}
