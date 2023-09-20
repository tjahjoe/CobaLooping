import java.util.*;
public class projek2 {
        public static void main(String[] args) {
    // untuk percabangan 1
            String open[] = {"SELAMAT DATANG DI ELCO STORE","ADA YANG BISA KAMI BANTU","KETIK 'IYA' ATAU 'TIDAK"} ;
    // untuk percabangan 2
            String lanjutan[] = {"KAOS","KEMEJA","CELANA","KOLOR"};
    
            Scanner userName = new Scanner(System.in) ;
    
            System.out.print("MASUKKAN USERNAME ANDA : ");
            String name = userName.next() ;
            System.out.print("MASUKKAN PASSWORD ANDA : ");
            String login = userName.next() ;
    
    // percabangan 1
        if (name.equals("123") && login.equals("123")) {
    
                for (int a = 0 ; a < open.length ; a++) {
                    System.out.println(open[a]) ;}
    
                    String branch1 = userName.next();
                if (branch1.equals("kaos")) {
                    System.out.println("kaos");

                String branch2 = userName.next();
    
                }
                else if (branch1.equalsIgnoreCase("kemeja")) {
    
                }
                else if (branch1.equalsIgnoreCase("celana")) {
    
                }
                else if (branch1.equalsIgnoreCase("kolor")) {
    
                }else{
                    System.out.println("kldd;osd;");
                }
            }
            else{
                System.out.println("TIDAK VALID");
        }    
        }
}
