/**
 * belajarLooping
 */
public class belajarLooping {

    public static void main(String[] args) {
        int a,b,c,d,e,f,g,h,i,j,k,l,m;
        for (a = 0 ; a < 34 ; a++) {
            if (a <= 10) {
                for (b = 10 ; b > a ; b--) {
                    System.out.print(" ");
                }
                for (c = 0 ; c <= a ; c++) {
                    System.out.print("*");
                }
                for (d = 0 ; d < a ; d++) {
                    System.out.print("*");
                }
        }    else if (a <= 14) {
                for (e = 11 ; e <= a ; e++) {
                    System.out.print(" ");
                }
                for (f = 14 ;  f > a  ; f--) {
                    System.out.print("*");
                }
                for (g = 26 ; g >= a ; g--) {
                    System.out.print("*");
                }   
        }   else if (a <= 22) {
                for (h = 16 ; h <= a ; h++) {
                    System.out.print(" ");
                }
                for (i = 22 ;  i > a  ; i--) {
                    System.out.print("*");
                }
                for (j = 29 ; j >= a ; j--) {
                    System.out.print("*");
                }
        }    else {
                for (k = 0 ; k < 8 ; k++) {
                    System.out.print("*");
                }
                for (l = 0 ; l < 6  ; l++) {
                    System.out.print(" ");
                }
                for (m = 0 ; m < 8 ; m++) {
                    System.out.print("*");
                }
        }    System.out.println(" ");
        }
}
}