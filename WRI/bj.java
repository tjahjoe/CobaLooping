package WRI;

import java.util.Scanner;

public class bj {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String mahasiswa [] = {"wahyu", "lala", "nana", "hihi"};
        String umur [] = {"12", "13", "12", "11"};
        int nilai[] = {100, 90, 95, 89};
        
        
        String bio [][] = new String[4][3];
        do{
        System.out.println(mahasiswa[0]);
        for(int i = 0 ; i < bio.length; i++){
            for(int j = 0 ; j < 2; j++){
                if(j % 2 == 0){
                    bio[i][j] = mahasiswa[i];
                }else{
                    bio[i][j] = umur[i];
                }
            }
        }
        bio[0][0] = scStr.nextLine();
        System.out.println(bio[0][0]);
    }while(bio[0][0].equalsIgnoreCase("aa"));
        
    }
    
}
