package bucles;

import java.util.Scanner;

public class ej_15 {

    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();

        for (int i = 0; i<n;i++){
            System.out.print("1 ");
        }
        System.out.println();

        for(int i = 0; i<n-2; i++){
            System.out.print("1 ");
            for (int j = 0 ; j<n-2; j++){
                System.out.print("0 ");
            }
            System.out.print("1 ");
            System.out.println();
        }

        for (int i = 0; i<n;i++){
            System.out.print("1 ");
        }
        System.out.println();

    }

}
