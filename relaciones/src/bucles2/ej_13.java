package bucles2;

import java.util.Scanner;

public class ej_13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        for(int i =1; i<=n; i++){
            for(int j =0; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
