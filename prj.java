import java.util.Arrays;
import java.util.Scanner;

/**
 * prj
 */
public class prj {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        // String you[] = {"i", "love", "u"};
        // String a = scStr.nextLine();
        // for (int i = 0; i < you.length; i++){
        //     if(a.equals(you[i])){
        //         System.out.println(you[i]);
        //         System.out.println(i);
        //     }
        // }
        String data[][][] = {
            {
                {"Wahyu", "Rizky", "Cahyana", "Yu", "Ki", "Na"},{"5","6","3","4","2","1"}
            }, {
                {"Aman", "Anwar", "Zaki"}
            }
        };
        String tmb= "";
        // for (int i = 0; i<2;i++){
        // Arrays.sort(data[0][i]);
        // }
        
        for (int j = 0; j<data[0][0].length;j++){
            for(int k = 0;k<data[0][0].length;k++){
                
                if(data[0][0][j].compareTo(data[0][0][k])<0){
                    for(int l = 0; l <data[0].length;l++){
                tmb = data[0][l][j];
                data[0][l][j] = data[0][l][k];
                data[0][l][k] = tmb;
                
                // tmb[l][k] = data[0][1][j];
                // data[0][1][j] = data[0][1][k];
                // data[0][1][k] = tmb[l][k];
                
            }
            }
        }
        }
        for (int o = 0; o<data[0][0].length;o++)
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 65; j++) {
                if ((i == 0 || i == 6) && (j >= 0 && j <= 64)) {
                    System.out.print("=");
                } else if ((i == 3 && (j == 0 || j == (65 - data[0][0][o].length())))
                        || (((i >= 1 && i <= 5) && i != 3) && (j == 0 || j == 64))) {
                    System.out.print("|");
                } else if (i == 3 && j == ((64 / 2) - (data[0][0][o].length() / 2))) {
                    System.out.print(data[0][0][o]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < data[0][0].length;i++){
            System.out.println(data[0][0][i] +", NIM : "+ data[0][1][i]);
    }}
}