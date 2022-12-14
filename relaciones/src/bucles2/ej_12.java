package bucles2;

import java.util.Scanner;

public class ej_12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        for(int j =0; j<n; j++) {
            System.out.print("*  ");
        }
        System.out.println();

        for(int i =0; i<n-2; i++){
            System.out.print("*  ");
            for(int j =0; j<n-2; j++) {
                System.out.print("   ");
            }
            System.out.println("*");
        }

        for(int j =0; j<n; j++) {
            System.out.print("*  ");
        }
        System.out.println();

    }
}
