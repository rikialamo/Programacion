package bucles;

import java.util.Scanner;

public class ej_16 {

    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();

        for(int i = 0; i<n; i++){
            for (int j = 0 ; j<n; j++){
                if(i!=j){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }



    }

}
