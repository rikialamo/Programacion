package bucles3;

import java.util.Scanner;

public class ej_8 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el numero que quiere que se repita M: ");
        int m = scan.nextInt();

        System.out.print("Introduce el numero que quiere que se repita N: ");
        int n = scan.nextInt();

        for(int i =0; i<m; i++){
            System.out.print("M ");
        }

        for(int i =0; i<n; i++){
            System.out.print("N ");
        }

    }
}
