package bucles;

import java.util.Scanner;

public class ej_24 {

    public static void main(String[] args) {

        int n, cont=2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();

        for (int i =0; i<n; i++){
            System.out.println(cont);
            cont+=2;
        }

    }
}
