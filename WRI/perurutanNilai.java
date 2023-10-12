package WRI;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class perurutanNilai {
    public static void main(String[] args) {
        int [] s = new int[] {1};
        // int []s = new int{1};
        int[] a = new int[] {s[0], 6, 3, 5, 9, 6};
        int b;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b = a[i];
                    a[i]=a[j];
                    a[j]=b;
                    
                }
            }
            //System.out.println(Arrays.toString(a));
        } for(int k : a){
            System.out.println(k);
        }
    }

}
