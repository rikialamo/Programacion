package bucles2;

import java.util.Scanner;

public class ej_8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scan.nextInt();

        int copia = n;

        for(int i = 0; i<4; i++){
            n=n*copia;
        }

        System.out.println(n);

    }
}
