package WRI;

import java.util.Scanner;
import java.util.InputMismatchException;


public class d {

    public static int a = 0;
    public static int b = 0;
    public static int c = 0;

    public static void rumus(){
        c = a*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        a = 5;
        b = 10;
        rumus();
        System.out.println(c);
//         Scanner input = new Scanner(System.in);
//         int aku = input.nextInt();
//         if (aku == 1){
// System.out.println("aaaa");
//         }else{
//             System.out.println("inputan salah");
//         }
//     }
        // Scanner input = new Scanner(System.in);
        // int number, b;
        // for (b = 0; true;){
        //     System.out.println("Enter a number: ");
        //     number = input.nextInt();
        //     b += number;
        //     if (b > 50) {
        //         break;
        //     }
        // }
// public static void getname(){
//     String a = "aku";
//     getaku(a);;
//    // return;
//     }
// public static void getaku(String a){
// System.out.println(a);
// }

// String ar[] ={"Wahyu", "Rizky", "Cahyana"};
// String copyAr[] = new String[ar.length+1];
// System.out.println(ar.length);
// for (int i = 0; i < copyAr.length-1; i++) {
//     copyAr[i] = ar[i];
// }
// copyAr[ar.length] = input.nextLine();
// ar=copyAr;
// System.out.println(ar.length);
// for (int i = 0; i < copyAr.length; i++) {
//     System.out.println(ar[i]);
// }


    }


}

