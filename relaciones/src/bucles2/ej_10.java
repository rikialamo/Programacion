package bucles2;

import java.util.Scanner;

public class ej_10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        for(int i =0; i<n; i++){
            System.out.print("* ");
        }

    }
}
