package bucles;

import java.util.Scanner;

public class ej_18 {

    public static void main(String[] args) {

        int n, n2, cont=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = scan.nextInt();
        System.out.print("Introduce otro numero: ");
        n2 = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(cont+" ");
                cont++;
            }
            System.out.println();
        }

    }

}
