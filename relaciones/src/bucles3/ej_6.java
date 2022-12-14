package bucles3;

import java.util.Scanner;

public class ej_6 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el numero que quiere que se repita: ");
        int m = scan.nextInt();

        System.out.print("Introduce el numero de veces que se va a repetir: ");
        int n = scan.nextInt();

        for(int i =0; i<n; i++){
            System.out.print(m+" ");
        }

    }
}
