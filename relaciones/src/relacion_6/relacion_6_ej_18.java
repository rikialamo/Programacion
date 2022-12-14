package relacion_6;

import java.util.Scanner;

public class relacion_6_ej_18 {

    public static void main(String[] args) {

        int n1, n2, n3, n4;

        Scanner scan  =new Scanner(System.in);

        System.out.println("Introduce la 1º nota: ");
        n1 = scan.nextInt();
        System.out.println("Introduce la 2º nota: ");
        n2 = scan.nextInt();
        System.out.println("Introduce la 3º nota: ");
        n3 = scan.nextInt();
        System.out.println("Introduce la 4º nota: ");
        n4 = scan.nextInt();

        System.out.println("El promedio es: "+(n1*0.2+n2*0.2+n3*0.3+n4*0.3));

    }
}
