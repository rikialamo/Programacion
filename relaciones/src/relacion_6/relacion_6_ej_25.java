package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_25 {

    public static void main(String[] args) {

        Scanner scan  =new Scanner(System.in);

        int n, r1, r2;

        System.out.println("introduce un número de 3 cifras");
        n= scan.nextInt();

        r1 = n%10;

        n = n/10;

        r2 = n%10;

        n = n/10;

        System.out.println(n);
        System.out.println(r2);
        System.out.println(r1);

    }
}
