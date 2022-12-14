package relacion_3;

import java.util.Scanner;

public class relacion_3_ej_4 {

    public static void main(String[] args) {

        float altura, base;
        Scanner S = new Scanner(System.in);

        System.out.println("introduce la altura: ");
        altura = S.nextFloat();

        System.out.println("introduce la base: ");
        base = S.nextFloat();

        System.out.println("el area del rectangulo es: "+base*altura);

    }
}
