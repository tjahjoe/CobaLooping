import java.util.*;

public class projek {
    public static void main(String[] args) {
// untuk percabangan 1
        String open[] = {"SELAMAT DATANG DI ELCO STORE","ADA YANG BISA KAMI BANTU","KETIK 'IYA' ATAU 'TIDAK"} ;
// untuk percabangan 2
        String lanjutan[] = {"KAOS","KEMEJA","CELANA","KOLOR"};

        Scanner userName = new Scanner(System.in) ;
        Scanner password = new Scanner(System.in) ;
        Scanner percabangan1 = new Scanner(System.in) ;

        System.out.print("MASUKKAN USERNAME ANDA : ");
        String name = userName.next() ;
        System.out.print("MASUKKAN PASSWORD ANDA : ");
        String login = password.next() ;

// percabangan 1
        if ((name.equals("123") && login.equals("123"))||(name.equals("234") && login.equals("234"))) {

            for (int a = 0 ; a < open.length ; a++) {
                System.out.println(open[a]) ;}

                String branch1 = percabangan1.next();


            if (branch1.equals("kaos")) {
                System.out.println("kaos");
            Scanner percabangan2 = new Scanner(System.in) ;
            String branch2 = percabangan2.next();

            }
            else if (branch1.equalsIgnoreCase("kemeja")) {

            }
            else if (branch1.equalsIgnoreCase("celana")) {

            }
            else if (branch1.equalsIgnoreCase("kolor")) {

            }
        }else if((name.equals("123")||name.equals("234"))||(name.equals("123")||name.equals("234"))) {
            System.out.println("USERNAME SALAH");
        }else if((login.equals("123")||login.equals("234"))||(login.equals("123")||login.equals("234"))) {
            System.out.println("PASSWORD SALAH");
        }else{};
    }
    
}
