import java.util.Scanner;

/**
 * prj
 */
public class prj {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        String you[] = {"i", "love", "u"};
        String a = scStr.nextLine();
        for (int i = 0; i < you.length; i++){
            if(a.equals(you[i])){
                System.out.println(you[i]);
                System.out.println(i);
            }
        }
    }
}