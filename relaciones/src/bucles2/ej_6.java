package bucles2;

import java.util.Scanner;

public class ej_6 {

    public static void main(String[] args) {

        int n = 0, cont = -1;

        Scanner scan = new Scanner(System.in);


        while (n <= 0) {
            System.out.print("Introduce un numero superior de 0: ");
            n = scan.nextInt();
            cont++;
        }

        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        if (cont != 0) {
            System.out.println("Has fallado " + cont + " veces");
        }

    }
}
