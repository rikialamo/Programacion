package bucles;

import java.util.Scanner;

public class ej_26 {
    public static void main(String[] args) {

        int n, cont=2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();

        System.out.println("pares");

        for (int i =0; i<n; i++){
            System.out.print(cont+", ");
            cont+=2;
        }

        System.out.println();
        System.out.println("-----------------------------------------------------");

        //impares

        System.out.println("impares");

        cont=1;


        for (int i =0; i<n; i++){
            System.out.print(cont+", ");
            cont+=2;
        }

}


}
