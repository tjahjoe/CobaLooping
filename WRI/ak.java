package WRI;

public class ak {
    public static void main(String[] args) {
        
    for (int i = 0; i < 5; i++) {
        for (int e = 0; e < 10; e++){
            if (i == 0 || i == 4 || ((i > 0 || i < 4) && e == 0 || e == 9)){
                System.out.print("=");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
}
